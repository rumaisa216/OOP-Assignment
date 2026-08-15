# Java OOP Week 3 Lab

Student Name: Romaisa Javed  
Seat No.:** 130  
Course:** Object-Oriented Programming (OOP)  
Lab:** Week 3

## Introduction

This project contains the Week 3 Java OOP lab exercises. The lab focuses on fundamental object-oriented programming concepts using simple, beginner-friendly Java programs.

The main topics covered are:

- Classes and objects
- Encapsulation using private attributes
- Default and parameterized constructors
- Copy constructors
- Getters and setters
- Instance methods
- `this` keyword
- `toString()` method
- Object creation and object references
- Composition / has-a relationship
- Basic mathematical object modeling
- Stack and heap visualization
- Input validation and exception handling
- Private helper methods

## Project Structure

```text
Week 3 OOP Romaisa javed 130/
│
├── Point Triangle/
│   ├── Point.java
│   ├── Triangle.java
│   ├── Main.java
│   ├── Point UML.png
│   ├── Triangle UML.png
│   └── Sample Output.txt
│
├── Rational Complex Numbers/
│   ├── ComplexNumber.java
│   ├── RationalNumber.java
│   ├── Main.java
│   ├── ComplexNumber UML.png
│   ├── RationalNumber UML.png
│   └── Sample Output.txt
│
└── Stack and Heap/
    └── Point stack and heap.jpeg
```

## Part 1 — Point and Triangle

### Point.java

The `Point` class represents a two-dimensional point with two private attributes:

- `x`
- `y`

It demonstrates:

- Default constructor
- Parameterized constructor
- Copy constructor
- Getters and setters
- Point addition
- Point subtraction
- Distance calculation
- `toString()`

The `add()` and `subtract()` methods return new `Point` objects rather than changing the original points.

### Triangle.java

The `Triangle` class contains three `Point` objects: `p1`, `p2`, and `p3`.

It demonstrates the **has-a/composition relationship**, because a Triangle has Point objects.

The class includes:

- Default constructor
- Parameterized constructor
- Copy constructor
- Getters and setters
- Perimeter calculation
- Area calculation
- Triangle type detection
- `toString()`

The triangle area is calculated using **Heron's formula**.

### Main.java

The main program demonstrates:

1. Creating Point objects.
2. Adding two Point objects.
3. Subtracting two Point objects.
4. Creating a Point using the copy constructor.
5. Changing the copied Point to show that it is independent of the original.
6. Creating a Triangle using Point objects.
7. Displaying the triangle's perimeter, area, type, and string representation.

## Part 2 — Complex and Rational Numbers

### ComplexNumber.java

The `ComplexNumber` class represents a complex number using:

- `real`
- `imaginary`

It demonstrates:

- Default constructor
- Parameterized constructor
- Copy constructor
- Getters and setters
- Addition
- Subtraction
- Multiplication
- `toString()`

### RationalNumber.java

The `RationalNumber` class represents a fraction using:

- `numerator`
- `denominator`

It demonstrates:

- Default constructor
- Parameterized constructor
- Copy constructor
- Getters and setters
- Fraction simplification
- Addition
- Subtraction
- Negative sign handling
- Zero numerator handling
- Zero denominator validation
- `toString()`

A private `gcd(int a, int b)` helper method is used to simplify fractions.

### Main.java

The main program demonstrates object creation and operations for both ComplexNumber and RationalNumber classes, including copy constructors, setters, arithmetic operations, simplification, and validation.

## Part 3 — Stack and Heap Visualization

The `Stack and Heap` folder contains the screenshot demonstrating Point object creation and Point addition.

The visualization is intended to show the difference between:

### Stack

The main stack frame contains references such as:

- `first`
- `second`
- `sum`

### Heap

The heap contains the actual Point objects referenced by those variables.

For example:

```text
first  -> Point(3, 2)
second -> Point(5, 5)
sum    -> Point(8, 7)
```

This demonstrates that object variables hold references to objects stored in the heap.

## How to Compile and Run

The project contains two different `Main.java` files in separate folders. Therefore, compile and run each folder separately.

### Point Triangle

Open a terminal inside the `Point Triangle` folder and run:

```bash
javac Point.java Triangle.java Main.java
java Main
```

### Rational Complex Numbers

Open a terminal inside the `Rational Complex Numbers` folder and run:

```bash
javac ComplexNumber.java RationalNumber.java Main.java
java Main
```

## OOP Concepts Covered

| Concept | Demonstrated In |
|---|---|
| Class | All Java classes |
| Object | Main programs |
| Encapsulation | Private attributes |
| Constructor | All classes |
| Parameterized constructor | All classes |
| Copy constructor | All classes |
| Getter | Point, Triangle, ComplexNumber, RationalNumber |
| Setter | Point, Triangle, ComplexNumber, RationalNumber |
| Method | All classes |
| `this` keyword | Constructors and setters |
| `toString()` | All main classes |
| Composition / has-a | Triangle and Point |
| Object references | Stack and heap visualization |
| Validation | RationalNumber |
| Private helper method | `gcd()` in RationalNumber |
| Exception handling | Zero denominator validation |

## Expected Learning Outcomes

After completing this lab, a student should be able to:

1. Create and use Java classes and objects.
2. Apply encapsulation using private attributes.
3. Use different types of constructors.
4. Write and use copy constructors.
5. Understand how objects are referenced in memory.
6. Create methods that return new objects.
7. Model relationships between classes.
8. Perform arithmetic operations using objects.
9. Validate invalid input using exceptions.
10. Explain basic stack and heap behavior in a Java program.

## Notes

- The code is intentionally written using basic Java features suitable for a first-year BSCS student.
- No advanced Java frameworks or unnecessary features are used.
- The UML diagrams correspond to the classes included in this project.
- Sample output files contain representative console output for the programs.

## Conclusion

This Week 3 lab provides practical experience with core Java OOP concepts. The Point and Triangle exercises introduce object relationships and copy constructors, while the ComplexNumber and RationalNumber exercises provide additional practice with encapsulation, constructors, methods, and object-based calculations. The stack and heap visualization reinforces how Java stores object references and objects in memory.
