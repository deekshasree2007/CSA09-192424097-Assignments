# TASK 7 – Override and Specialise Behaviour

## 1. Method Overriding

Method overriding occurs when a subclass provides its own implementation of a method already defined in its parent class.

In the Smart Parking System, different vehicle types have different parking charges. Therefore, each vehicle subclass can override the `ratePerHour()` method.

The `@Override` annotation tells the compiler that a method is intended to override a parent-class method.

## 2. Rules of Method Overriding

- The method name and parameters must match.
- The return type must be the same or compatible.
- The access level cannot be more restrictive than the parent method.
- A final method cannot be overridden.
- A final class cannot be extended.

## 3. Example

```java
abstract class Vehicle {
    protected abstract double ratePerHour();
}

class TwoWheeler extends Vehicle {
    @Override
    protected double ratePerHour() {
        return 10;
    }
}

class Car extends Vehicle {
    @Override
    protected double ratePerHour() {
        return 30;
    }
}
```

Here, `TwoWheeler` charges Rs. 10 per hour, while `Car` charges Rs. 30 per hour.

## 4. Overriding Object Class Methods

Java provides methods such as `equals()`, `hashCode()` and `toString()` in the Object class. These can be overridden to provide meaningful behaviour.

Example:

```java
@Override
public boolean equals(Object other) {
    if (this == other) return true;

    if (!(other instanceof Vehicle)) return false;

    Vehicle v = (Vehicle) other;
    return regNo.equals(v.regNo);
}

@Override
public int hashCode() {
    return regNo.hashCode();
}

@Override
public String toString() {
    return getClass().getSimpleName() + "[" + regNo + "]";
}
```

In this example, two vehicle objects are considered equal when they have the same registration number. Equal objects must also have the same hash code.

## 5. Use of final Keyword

- A final variable cannot be reassigned.
- A final method cannot be overridden.
- A final class cannot be inherited.

For example, the vehicle registration number can be declared final because it should not change after object creation.

## 6. Alternative Approach

Instead of method overriding, we can use conditional statements such as `if-else` or `switch` to calculate charges based on vehicle type.

However, when new vehicle types are introduced, the conditional statements must be modified. Method overriding allows each subclass to provide its own behaviour, making the design easier to extend.

## 7. Conclusion

Method overriding helps the Smart Parking System calculate charges according to vehicle type. It supports runtime polymorphism, improves code reusability and makes the system easier to maintain and extend.