# Console-Based Student Management System (Java MVP)

## Description

This is a console-based Java application that demonstrates Object-Oriented Programming concepts such as:

- Classes and Objects
- Encapsulation
- Inheritance
- Polymorphism
- Method Overloading
- Method Overriding

The system allows users to:
- Register students
- Register teachers
- View registered people
- Search people
- Delete people
- Enroll students into courses

---

# How to Compile

```bash
cd src
javac *.java
```

# How to Run

```bash
java Main
```

---

# OOP Concepts Demonstrated

## 1. Classes and Objects
Files:
- Student.java
- Teacher.java
- Main.java

Objects are created dynamically using user input.

---

## 2. Encapsulation
File:
- Person.java

Private fields with getters and setters are used.

---

## 3. Inheritance
Files:
- Student.java
- Teacher.java

Both classes inherit from Person.java using the extends keyword.

---

## 4. Polymorphism

### Method Overriding
Files:
- Student.java
- Teacher.java

displayInfo() method overridden.

### Method Overloading
File:
- Course.java

enrollStudent() method overloaded.

### Runtime Polymorphism
File:
- ManagementSystem.java

Superclass references are used:
```java
ArrayList<Person>
```

This allows Student and Teacher objects to be handled dynamically.