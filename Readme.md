# Construction for Reuse: Interfaces, Generics, and Contracts

## Lab Overview

This project demonstrates important software engineering principles used to develop reusable, maintainable, and type-safe Java applications. It covers interface-based composition, generic classes, the Liskov Substitution Principle (LSP), and reusable sorting algorithms.

## Objectives

- Understand black-box reuse through interfaces and composition.
- Apply constructor dependency injection to reduce coupling.
- Use Java generics to create reusable, type-safe data containers.
- Understand and demonstrate the Liskov Substitution Principle.
- Compare `Comparable` and `Comparator` for sorting objects using different rules.

## Lab Tasks

### Task 1: Black-Box Reuse — Composition via Interfaces

**Objective:** Demonstrate how interfaces and composition allow components to be reused without depending on specific implementations.

**Implementation:**
- `PaymentMethod` defines the payment contract through `boolean pay(double amount)`.
- `CreditCardPayment` implements credit card payment behavior.
- `JazzCashPayment` implements JazzCash payment behavior.
- `EcommerceCart` receives a `PaymentMethod` through constructor dependency injection.
- `Main` demonstrates checkout using both payment methods.

**Key Concept:** The cart depends on the `PaymentMethod` interface rather than a specific payment class, allowing different implementations to be supplied without modifying the cart.

### Task 2: Generic Data Containers — Generics and Type Safety

**Objective:** Create a reusable data container that stores values of different types while preserving compile-time type safety.

**Implementation:**
- `DataBox<T>` is a generic class containing a private field, a constructor, and a getter.
- `DataBox<String>` stores a student's name.
- `DataBox<Integer>` stores a student's ID.
- An incompatible generic assignment demonstrates how Java prevents type mismatches at compile time.

**Key Concept:** Generics allow code reuse while helping prevent invalid type assignments.

### Task 3: Liskov Substitution Principle — Contract Integrity

**Objective:** Demonstrate a violation of the Liskov Substitution Principle and correct the design using a common interface.

**Implementation:**
- The initial `Rectangle` class allows independent width and height values.
- The initial `Square` subclass rejects unequal dimensions, causing an exception when used where a general rectangle is expected.
- The corrected design introduces a common `Shape` interface.
- `Rectangle` and `Square` implement `Shape` independently and calculate their own areas.

**Key Concept:** Subtypes should preserve the behavior expected by their clients. A shared interface provides a better design when the inheritance relationship does not preserve the expected contract.

### Task 4: Reusable Ordering Algorithms — Comparable and Comparator

**Objective:** Demonstrate how Java supports natural ordering and alternative sorting rules.

**Implementation:**
- `Student` stores a roll number and CGPA.
- `Comparable<Student>` defines natural ordering by roll number in ascending order.
- `CgpaComparator` implements `Comparator<Student>` to sort by CGPA in descending order.
- An `ArrayList<Student>` containing three students is sorted using both methods.

**Key Concept:** `Comparable` defines a class's natural ordering, while `Comparator` provides an external comparison rule.

## Project Structure

```text
ConstructionForReuse/
├── README.md
├── pom.xml
└── src/
    └── main/
        └── java/
            ├── lab/
            │   ├── task1/
            │   │   ├── PaymentMethod.java
            │   │   ├── CreditCardPayment.java
            │   │   ├── JazzCashPayment.java
            │   │   ├── EcommerceCart.java
            │   │   └── Main.java
            │   ├── task2/
            │   │   ├── DataBox.java
            │   │   └── Main.java
            │   ├── task3/
            │   │   ├── Shape.java
            │   │   ├── Rectangle.java
            │   │   ├── Square.java
            │   │   └── Main.java
            │   └── task4/
            │       ├── Student.java
            │       ├── CgpaComparator.java
            │       └── Main.java
```

## Requirements

- Java Development Kit (JDK)
- Apache NetBeans IDE or another Java IDE
- Apache Maven, if using the Maven project configuration

No external libraries are required for the lab implementations.

## How to Run

1. Clone or download this repository.
2. Open the `ConstructionForReuse` project in NetBeans.
3. Ensure that the installed JDK is configured correctly.
4. Expand **Source Packages** and open the `Main.java` file for the desired task.
5. Right-click the file and select **Run File**.

Run each task using its corresponding main class:

| Task | Main class |
|---|---|
| Task 1 — Payment Methods | `lab.task1.Main` |
| Task 2 — Generic DataBox | `lab.task2.Main` |
| Task 3 — Shape and LSP | `lab.task3.Main` |
| Task 4 — Student Sorting | `lab.task4.Main` |

Alternatively, from the project root, run a task using Maven:

```bash
mvn compile exec:java -Dexec.mainClass="lab.task1.Main"
```

Replace `lab.task1.Main` with the desired main class. This Maven command requires the Maven Exec plugin to be configured in the project; running the main files directly in NetBeans does not require that plugin.

## Expected Results

- **Task 1:** The cart successfully processes payments using credit card and JazzCash implementations.
- **Task 2:** The student's name and ID are displayed, while incompatible generic types produce a compile-time error.
- **Task 3:** The original inheritance design demonstrates the LSP problem, while the corrected `Shape` design calculates rectangle and square areas without the exception.
- **Task 4:** Students are sorted first by roll number in ascending order and then by CGPA in descending order.

## Conclusion

This lab demonstrates how interface-based composition, generics, contract integrity, and reusable comparison strategies contribute to better object-oriented software design. These techniques help reduce coupling, improve type safety, and make Java components easier to maintain and extend.
