# TASK 5 – Inheritance and Class Relationships

## 1. Meaning of Inheritance

Inheritance is an Object-Oriented Programming concept in which one class acquires the properties and methods of another class.

It helps in code reusability and reduces code duplication.

## 2. Inheritance in the Parking System

The Vehicle class acts as the parent class. TwoWheeler, Car and ElectricCar act as child classes.

Example:

```java
class Vehicle {
    String registrationNumber;

    Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    void displayDetails() {
        System.out.println("Vehicle: " + registrationNumber);
    }
}

class TwoWheeler extends Vehicle {
    TwoWheeler(String registrationNumber) {
        super(registrationNumber);
    }
}

class Car extends Vehicle {
    Car(String registrationNumber) {
        super(registrationNumber);
    }
}

class ElectricCar extends Car {
    ElectricCar(String registrationNumber) {
        super(registrationNumber);
    }
}
```

## 3. Explanation

- Vehicle is the parent class.
- TwoWheeler inherits from Vehicle.
- Car inherits from Vehicle.
- ElectricCar inherits from Car.
- The `extends` keyword is used to establish inheritance.
- The `super()` keyword calls the parent class constructor.

## 4. Advantages of Inheritance

1. Code reusability.
2. Reduces duplicate code.
3. Makes the program easier to maintain.
4. Supports method overriding and runtime polymorphism.
5. Makes it easier to add new vehicle types.

## 5. Conclusion

Inheritance helps organize different vehicle types under a common Vehicle class. It makes the Campus Smart-Parking System reusable, extensible and easier to maintain.