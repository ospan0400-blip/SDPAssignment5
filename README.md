# Strategy Pattern Calculator

## Overview

This project is a simple Java calculator that demonstrates the
**Strategy design pattern**. It supports addition, subtraction, and
multiplication. Instead of using a chain of `if/else` statements to
choose an operation, the calculator delegates the calculation to a
selected strategy object.

## Features

-   Addition using `AddStrategy`
-   Subtraction using `SubtractStrategy`
-   Multiplication using `MultiplyStrategy`
-   Switch operations at runtime using `setStrategy()`
-   A common interface that makes strategies interchangeable

## Project Structure

``` text
SDPAssignment5-main/
└── src/
    ├── AddStrategy.java
    ├── CalculationStrategy.java
    ├── Calculator.java
    ├── Main.java
    ├── MultiplyStrategy.java
    └── SubtractStrategy.java
```

### Class Responsibilities

-   **`CalculationStrategy`** --- interface declaring
    `execute(double a, double b)`.
-   **`AddStrategy`** --- implements the interface and adds two numbers.
-   **`SubtractStrategy`** --- implements the interface and subtracts
    the second number from the first.
-   **`MultiplyStrategy`** --- implements the interface and multiplies
    two numbers.
-   **`Calculator`** --- the Context; stores the selected strategy,
    delegates calculations to it, and allows the strategy to be changed
    using `setStrategy()`.
-   **`Main`** --- the Client; creates the calculator and demonstrates
    switching between strategies.

## How It Works

1.  `Main` creates a `Calculator` with an `AddStrategy`.
2.  The calculator's `calculate(a, b)` method calls
    `strategy.execute(a, b)`.
3.  The client changes the strategy using `setStrategy()`.
4.  The same calculator can then perform multiplication or subtraction
    without changing the `Calculator` class.

For example:

``` java
Calculator calculator = new Calculator(new AddStrategy());
System.out.println(calculator.calculate(5, 7)); // 12.0

calculator.setStrategy(new MultiplyStrategy());
System.out.println(calculator.calculate(4, 9)); // 36.0
```


## Why Use the Strategy Pattern?

The Strategy pattern separates each arithmetic operation into its own
class. This makes the operations interchangeable and allows new
operations to be added by implementing `CalculationStrategy`, without
adding more conditional branches to `Calculator`. The trade-off is
having a separate class for each operation.

