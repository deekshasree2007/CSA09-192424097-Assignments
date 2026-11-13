# TASK 7 – Abstraction in Java

## 1. Meaning of Abstraction

Abstraction is an Object-Oriented Programming concept that hides implementation details and shows only essential features to the user.

Java supports abstraction using:
1. Abstract classes.
2. Interfaces.

## 2. Abstract Class

An abstract class is declared using the `abstract` keyword. It can contain abstract methods and normal methods.

Example:

```java
abstract class Vehicle {
    abstract double calculateFee(int hours);

    void displayMessage() {
        System.out.println("Parking system");
    }
}
```

## 3. Implementing Abstraction

```java
class Car extends Vehicle {
    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}

class TwoWheeler extends Vehicle {
    @Override
    double calculateFee(int hours) {
        return hours * 10;
    }
}
```

The child classes provide their own implementation of `calculateFee()`.

## 4. Interface

An interface defines a contract that implementing classes must follow.

Example:

```java
interface Chargeable {
    double calculateChargingFee(int units);
}

class ElectricCar implements Chargeable {
    @Override
    public double calculateChargingFee(int units) {
        return units * 12;
    }
}
```

The `Chargeable` interface is useful for vehicles that need charging facilities.

## 5. Advantages of Abstraction

1. Hides unnecessary implementation details.
2. Reduces complexity.
3. Improves security and maintainability.
4. Encourages code reusability.
5. Makes the system easier to extend.

## 6. Conclusion

Abstraction helps the Campus Smart-Parking System hide internal operations while exposing essential methods. Abstract classes and interfaces make the design flexible and organized.