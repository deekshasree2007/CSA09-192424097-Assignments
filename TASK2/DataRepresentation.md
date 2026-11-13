# TASK 2 – Choose the Data Representation

## 1. Data Types Used

| Field | Java Data Type | Reason |
|---|---|---|
| Slot number | int | Stores whole-number slot identifiers. |
| Vehicle registration number | String | Stores letters and numbers. |
| Vehicle type | String or enum | Represents vehicle categories. |
| Entry time | LocalDateTime | Stores date and time accurately. |
| Exit time | LocalDateTime | Stores the vehicle exit date and time. |
| Parking duration | long | Stores duration in minutes. |
| Parking fee | double | Stores decimal fee values. |
| Ticket number | long | Stores unique ticket identifiers. |
| Charging energy | double | Stores electricity consumption in kWh. |
| Pass validity | boolean | Indicates whether a pass is valid. |

## 2. Representation of Floors and Slots

A jagged two-dimensional array is suitable because different floors may have different numbers of parking slots.

Example:

```java
String[][] slots = new String[3][];

slots[0] = new String[20];
slots[1] = new String[30];
slots[2] = new String[50];
```

Here:
- The first index represents the floor.
- The second index represents the slot number.
- A null value indicates that the slot is empty.
- A non-null value stores the vehicle registration number.

A jagged array is useful because each floor can have a different number of slots.

## 3. Type Conversion and Casting

Parking duration is calculated in minutes and converted into hours for billing.

Example:

```java
int minutes = 130;
int hours = (minutes + 59) / 60;
```

Output:

```text
3
```

This calculation rounds up incomplete hours. For example, 130 minutes is charged as 3 hours.

For accurate decimal calculations, the parking fee should use double rather than int.

Example:

```java
double ratePerHour = 30.0;
double totalFee = hours * ratePerHour;
```

Using integer division directly for decimal calculations can cause precision loss.

## 4. Reading Input

The Scanner class can be used to receive input from the user.

Example:

```java
import java.util.Scanner;

public class ParkingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter parking duration in minutes: ");
        int minutes = sc.nextInt();

        System.out.println("Vehicle: " + regNo);
        System.out.println("Duration: " + minutes + " minutes");

        sc.close();
    }
}
```

## Conclusion

The system uses suitable Java data types and a jagged two-dimensional array to represent parking floors and slots. Scanner is used for user input. These choices make the system easy to understand, maintain and extend.