# TASK 6 – Polymorphism in Java

## 1. Meaning of Polymorphism

Polymorphism means "one name, many forms". It allows the same method to perform different operations depending on the object.

Java supports two types of polymorphism:

1. Compile-time polymorphism (Method Overloading).
2. Runtime polymorphism (Method Overriding).

## 2. Method Overloading

Method overloading means defining multiple methods with the same name but different parameters.

Example:

```java
class ParkingFee {
    double calculateFee(int hours) {
        return hours * 30;
    }

    double calculateFee(int hours, double rate) {
        return hours * rate;
    }
}
```

The method name is the same, but the parameters are different.

## 3. Method Overriding

Method overriding occurs when a child class provides its own implementation of a method inherited from the parent class.

Example:

```java
class Vehicle {
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

class Car extends Vehicle {
    @Override
    double calculateFee(int hours) {
        return hours * 30;
    }
}
```

## 4. Runtime Polymorphism in the Parking System

```java
Vehicle v1 = new TwoWheeler();
Vehicle v2 = new Car();

System.out.println(v1.calculateFee(2));
System.out.println(v2.calculateFee(2));
```

The same `calculateFee()` method produces different results depending on the actual object.

## 5. Advantages

1. Improves flexibility.
2. Supports code reusability.
3. Reduces repeated code.
4. Makes it easier to add new vehicle types.
5. Improves maintainability.

## 6. Conclusion

Polymorphism allows different vehicle classes to calculate parking fees in their own way using a common method name. It makes the parking system flexible and extensible.