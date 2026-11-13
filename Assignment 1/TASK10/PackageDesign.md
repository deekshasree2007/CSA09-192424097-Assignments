# TASK 10 – Enforce Encapsulation through Packages and Access Modifiers

## 1. Meaning of Encapsulation

Encapsulation is an Object-Oriented Programming concept that combines data and methods into a single class and protects data from direct access.

In the Smart Parking System, important details such as vehicle registration number, ticket number, parking fee and slot occupancy should be protected.

## 2. Package Structure

Packages help organise related classes and avoid naming conflicts.

Proposed package structure:

```text
src/
└── parking/
    ├── model/
    │   ├── Vehicle.java
    │   ├── Car.java
    │   ├── TwoWheeler.java
    │   ├── ParkingTicket.java
    │   └── ParkingSlot.java
    ├── service/
    │   ├── ParkingService.java
    │   └── PricingRule.java
    └── app/
        └── Main.java
```

## 3. Access Modifiers

Java provides four main access levels:

| Modifier | Accessibility |
|---|---|
| private | Only within the same class |
| default | Within the same package |
| protected | Within the same package and subclasses |
| public | Accessible from anywhere |

Examples in the parking system:

- `private`: Vehicle registration number and ticket details.
- `protected`: Methods that subclasses need to override.
- `public`: Constructors and methods that other packages need to access.
- Default: Internal helper methods used within the same package.

## 4. Example of Encapsulation

```java
class ParkingTicket {
    private final String ticketNo;
    private double fee;

    public ParkingTicket(String ticketNo) {
        this.ticketNo = ticketNo;
        this.fee = 0.0;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if (fee >= 0) {
            this.fee = fee;
        }
    }
}
```

Here, the fields are private. Other classes cannot directly modify them. The fee can be updated only through a method that checks whether the value is valid.

The ticket number is final because it should not change after creation.

## 5. Wrapper Classes and Autoboxing

Wrapper classes convert primitive data types into objects.

Examples:

| Primitive Type | Wrapper Class |
|---|---|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |

Autoboxing automatically converts a primitive into its wrapper object.

Example:

```java
int count = 10;
Integer total = count;
```

Unboxing converts a wrapper object into its primitive value.

Example:

```java
Integer slots = 20;
int availableSlots = slots;
```

Wrapper objects should generally be compared using `equals()` or comparison methods rather than `==`, because `==` may compare object references. Unboxing a null wrapper can cause a NullPointerException.

## 6. Alternative Design

If all fields were declared public, any class could modify them directly. This could result in invalid values, such as a negative parking fee.

Encapsulation prevents this by allowing access through controlled methods. Validation is performed in one place, making the program easier to maintain.

## 7. Conclusion

Packages organise the Smart Parking System into logical groups. Access modifiers control visibility, while encapsulation protects important data and ensures that only valid operations are performed.