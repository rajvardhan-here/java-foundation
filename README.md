# Java Foundation

A hands-on repository documenting my journey through **Core Java and Data Structures & Algorithms**. Each topic contains practice code, examples, and notes for revision.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA](https://img.shields.io/badge/DSA-Practice-blue?style=for-the-badge)
![GitHub](https://img.shields.io/badge/Learning-In_Public-181717?style=for-the-badge&logo=github)

## Repository structure

```text
java-foundation/
├── docs/
│   ├── arrays-part-2.md
│   ├── arrays-part-2-practice.md
│   ├── binary-search.md
│   ├── binary-search-test-cases.md
│   ├── linear-search.md
│   └── linear-search-test-cases.md
└── src/
    ├── 01_variables_datatypes/
    ├── 02_operators/
    ├── 03_conditionals/
    ├── 04_loops/
    ├── 05_patterns/
    ├── 06_functions/
    ├── 07_arrays/
    ├── 07_arrays_part2/
    └── Practice/
```

## Topics practised

| Topic | Coverage |
|---|---|
| Variables & data types | Declarations, primitive types, input/output |
| Operators | Arithmetic, relational, and logical operations |
| Conditionals | `if`, `else`, and decision-making exercises |
| Loops | `for`, `while`, and `do-while` |
| Patterns | Nested-loop pattern exercises |
| Functions | Methods, parameters, and number problems |
| Arrays | Traversal, searching, reversing, and subarrays |
| Arrays Part 2 | Brute force, prefix sums, and Kadane's algorithm |

## Run the Arrays Part 2 examples

Compile from the repository root:

```bash
javac src/07_arrays_part2/*.java
java -cp src/07_arrays_part2 SubarrayExamples
```

Run the lightweight regression checks with assertions enabled:

```bash
java -ea -cp src/07_arrays_part2 SubarrayAlgorithmTests
```

See the [Arrays Part 2 notes](docs/arrays-part-2.md) and [practice set](docs/arrays-part-2-practice.md).

## Learning workflow

1. Understand the concept before memorising the code.
2. Write a basic solution and test it with small inputs.
3. Check edge cases and analyse time and space complexity.
4. Improve the approach when a better solution exists.
5. Keep notes and examples close to the topic they explain.

## Tools

- Java
- IntelliJ IDEA
- Git and GitHub
- LeetCode for problem practice

---

**Maintained by Rajvardhan Singh** · Learning Java and DSA one concept at a time.
