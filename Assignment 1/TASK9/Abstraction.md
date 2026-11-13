# TASK 9 – Introduce Abstraction

## 1. Meaning of Abstraction

Abstraction is an Object-Oriented Programming concept that hides implementation details and displays only essential features to the user.

In the Smart Parking System, abstraction helps define common vehicle behaviour without specifying every detail in the parent class.

## 2. Abstract Class – Vehicle

The `Vehicle` class can be declared as an abstract class.

It contains:
- Common vehicle information such as registration number.
- A constructor to initialise vehicle details.
- A common method to calculate parking fees.
- An abstract method `ratePerHour()` that subclasses must implement.

Example:

```java
abstract class Vehicle {
    private String regNo;

    Vehicle(String regNo) {
        this.regNo = regNo;
    }

    public String getRegNo() {
        return regNo;
    }

    abstract double ratePerHour();
}
```

## 3. Interface – Chargeable

An interface is used to define a capability that can be implemented by different classes.

In this system, only electric vehicles require charging. Therefore, we can create a `Chargeable` interface.

Example:

```java
interface Chargeable {
    double chargingFee(int kWh);
}
```

An electric car can extend the `Car` class and implement the `Chargeable` interface.

```java
class ElectricCar extends Car implements Chargeable {
    ElectricCar(String regNo) {
        super(regNo);
    }

    public double chargingFee(int kWh) {
        return kWh * 12;
    }
}
```

## 4. Difference Between Abstract Class and Interface

| Abstract Class | Interface |
|---|---|
| Can contain instance variables. | Cannot contain ordinary instance fields. |
| Can have constructors. | Cannot have constructors. |
| Can contain abstract and concrete methods. | Can contain abstract, default and static methods. |
| A class can extend only one class. | A class can implement multiple interfaces. |
| Represents common identity and behaviour. | Represents a capability or contract. |

## 5. Alternative Design

We could use an interface for `Vehicle` instead of an abstract class. However, an interface cannot provide ordinary instance fields and constructors for common vehicle state in the same way as an abstract class.

We could also use an abstract class for `Chargeable`. However, Java allows a class to extend only one class. Since `ElectricCar` already extends `Car`, implementing an interface is more suitable.

## 6. Conclusion

Abstraction makes the Smart Parking System easier to maintain and extend. The abstract `Vehicle` class provides common vehicle behaviour, while the `Chargeable` interface defines charging functionality for electric vehicles.