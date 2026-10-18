<div align="center">

# GeeksforGeeks Solutions

### Data Structures and Algorithms practice in Java, Python, and C++

[![GeeksforGeeks](https://img.shields.io/badge/Platform-GeeksforGeeks-2F8D46?style=flat-square)](https://www.geeksforgeeks.org/)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Python](https://img.shields.io/badge/Python-3776AB?style=flat-square&logo=python&logoColor=white)](https://www.python.org/)
[![C++](https://img.shields.io/badge/C%2B%2B-00599C?style=flat-square&logo=cplusplus&logoColor=white)](https://isocpp.org/)
[![Repository](https://img.shields.io/badge/Repository-GFGsolution-181717?style=flat-square&logo=github)](https://github.com/rahulsinghkushwaha232/GFGsolution)

**[Browse the solutions](https://github.com/rahulsinghkushwaha232/GFGsolution/tree/main/GeeksforGeeks)**

</div>

---

## About

This repository documents my GeeksforGeeks problem-solving practice. It contains solutions in **Java**, **Python**, and **C++**, organized by language and problem topic. I focus on readable implementations, sound data-structure choices, and notes that make each solution easier to revisit.

## Solutions

### Common Elements

The current implementations find values that occur in both input arrays, preserve duplicate values up to the lower frequency shared by the arrays, and return the result in ascending order.

| Language | Implementation approach |
| --- | --- |
| Java | `TreeMap` frequency maps; ordered traversal produces sorted output. |
| Python | `collections.Counter` frequency maps; the shared values are sorted before returning. |
| C++ | `std::unordered_map` frequency counting; shared values are sorted before returning. |

Each solution follows the GeeksforGeeks `Solution` class interface and is intended to run with the platform’s driver code.

## Repository structure

```text
GeeksforGeeks/
├── Cpp/
│   └── Easy/Common Elements/Solution.cpp
├── Java/
│   └── Easy/Common Elements/Solution.java
├── Python/
│   └── Easy/Common Elements/Solution.py
└── Patterns/
    └── Java/Common Elements/
```

Problem folders may include a solution file and a `README.md` with problem notes. New solutions will be added under their language directory and topic difficulty as the collection grows.

## Focus areas

- Arrays, strings, and hashing
- Searching and sorting
- Linked lists, stacks, and queues
- Trees, graphs, and recursion
- Greedy algorithms and dynamic programming

## Practice principles

- Keep solutions straightforward and easy to review.
- Use the data structure that fits the problem’s requirements.
- Compare approaches across languages where useful.
- Add problem notes and complexity details as the collection develops.

## Feedback

This is a personal learning repository. Suggestions and corrections are welcome through GitHub issues or pull requests.

## About me

**Rahul Singh Kushwaha** · B.Tech Computer Science and Engineering student

[GitHub](https://github.com/rahulsinghkushwaha232) · [LinkedIn](https://www.linkedin.com/in/rahulsinghkushwaha10/)

---

If you find the solutions useful, you can star the repository.
