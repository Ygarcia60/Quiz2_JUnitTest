# Quiz 2

A Java project built using Test-Driven Development (Red-Green-Refactor). It contains:

- `Calculator` with `sum`, `subtract`, `multiply`, `divide`, and `isEven`
- `DateChecker` with `has31Days(Month)` and a `Month` enum


## How to run the tests

1. Clone the repository and open the project folder:

   ```
   git clone <your-repo-url>
   cd <your-repo-folder>
   ```

2. Run all tests:

   ```
   mvn test
   ```

3. A successful run ends with `BUILD SUCCESS` and a summary like
   `Tests run: 22, Failures: 0, Errors: 0, Skipped: 0`.

To run a single test class:

```
mvn -Dtest=CalculatorTest test
mvn -Dtest=DateCheckerTest test
```

You can also open the project in IntelliJ IDEA or Eclipse and run the test classes directly.



## Behavior notes

- `Calculator.divide` throws `ArithmeticException` when dividing by zero.
- `DateChecker.has31Days(Month.FEBRUARY)` returns `false` (February never has 31 days).
- `DateChecker.has31Days(null)` throws `IllegalArgumentException`.
