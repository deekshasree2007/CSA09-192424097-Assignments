# TASK 9 – Java Packages and Code Organization

## 1. Meaning of Packages

A package in Java is a group of related classes and interfaces. Packages help organize code and avoid naming conflicts.

Java provides built-in packages such as:
- java.util
- java.time
- java.io

Programmers can also create their own packages.

## 2. Creating a Custom Package

Example folder structure:

```text
ParkingSystem/
    parking/
        Vehicle.java
    Main.java
```

### Vehicle.java

```java
package parking;

public class Vehicle {
    public void display() {
        System.out.println("Vehicle is parked");
    }
}
```

### Main.java

```java
import parking.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
    }
}
```

## 3. Compiling and Running

Open the terminal inside the `ParkingSystem` folder and execute:

```bash
javac -d . parking/Vehicle.java Main.java
java Main
```

Output:

```text
Vehicle is parked
```

## 4. Advantages of Packages

1. Organizes related classes.
2. Avoids naming conflicts.
3. Improves code reusability.
4. Makes maintenance easier.
5. Supports access control.

## 5. Conclusion

Packages help organize the Campus Smart-Parking System into separate modules. For example, vehicle-related classes, ticket-related classes and payment-related classes can be grouped into different packages.