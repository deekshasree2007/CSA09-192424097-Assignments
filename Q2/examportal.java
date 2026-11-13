
import java.io.IOException;

// Custom checked exceptions
class ExamClosedException extends Exception {
    ExamClosedException(String message) {
        super(message);
    }
}

class StudentNotRegisteredException extends Exception {
    StudentNotRegisteredException(String message) {
        super(message);
    }
}

class StorageException extends Exception {
    StorageException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Storage layer
class ExamStorage {
    void saveAnswer(String answer) throws StorageException {
        try {
            if (answer.equals("STORAGE_ERROR")) {
                throw new IOException("Database storage is unavailable");
            }

            System.out.println("Answer saved successfully.");

        } catch (IOException e) {
            throw new StorageException(
                "Unable to save examination answer", e
            );
        }
    }
}

// Service layer
class ExamService {
    ExamStorage storage = new ExamStorage();

    void submitExam(boolean examOpen, boolean registered, String answer)
            throws ExamClosedException,
                   StudentNotRegisteredException,
                   StorageException {

        if (!examOpen) {
            throw new ExamClosedException("The examination is closed.");
        }

        if (!registered) {
            throw new StudentNotRegisteredException(
                "Student is not registered."
            );
        }

        storage.saveAnswer(answer);
    }
}

// Controller layer
public class ExamPortal {

    static void runScenario(String scenario, boolean examOpen,
                            boolean registered, String answer) {

        ExamService service = new ExamService();

        System.out.println("\nScenario: " + scenario);

        try {
            service.submitExam(examOpen, registered, answer);

        } catch (ExamClosedException |
                 StudentNotRegisteredException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (StorageException e) {

            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }

    public static void main(String[] args) {

        runScenario("Exam Closed", false, true, "Java Answer");

        runScenario("Student Not Registered", true, false, "Java Answer");

        runScenario("Storage Failure", true, true, "STORAGE_ERROR");

        runScenario("Successful Submission", true, true, "Java Answer");
    }
}
