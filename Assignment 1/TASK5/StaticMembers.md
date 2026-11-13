# TASK 5 – Static Members in Java

## 1. Meaning of Static Members

Static members belong to the class rather than individual objects. They can be accessed using the class name without creating an object.

Java supports:
- Static variables
- Static methods
- Static blocks

## 2. Static Variable

A static variable is shared by all objects of a class.

Example:

```java
class ParkingTicket {
    static int ticketCount = 0;

    ParkingTicket() {
        ticketCount++;
    }
}
```

Here, `ticketCount` is shared by every ParkingTicket object.

## 3. Static Method

A static method can be called using the class name.

```java
class ParkingTicket {
    static int ticketCount = 0;

    static void displayCount() {
        System.out.println("Total tickets: " + ticketCount);
    }
}
```

Calling the method:

```java
ParkingTicket.displayCount();
```

## 4. Static Block

A static block is executed once when the class is loaded. It is generally used to initialize static variables.

```java
class ParkingSystem {
    static String systemName;

    static {
        systemName = "Campus Smart Parking";
    }
}
```

## 5. Application in the Parking System

A static ticket counter can generate unique ticket numbers. Every new ticket increases the shared counter.

Example:

```java
class ParkingTicket {
    private static int nextTicketNumber = 1000;
    private final int ticketNumber;

    ParkingTicket() {
        ticketNumber = ++nextTicketNumber;
    }

    int getTicketNumber() {
        return ticketNumber;
    }
}
```

Each new ticket receives a different number.

## 6. Advantages

1. Avoids creating duplicate shared variables.
2. Helps maintain a common ticket counter.
3. Allows utility methods to be called using the class name.
4. Saves memory when one shared value is sufficient.

## Conclusion

Static members are useful in the Campus Smart-Parking System for maintaining shared information such as ticket counters and system-wide constants.