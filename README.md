<div align="center">

# 🎓 University Management System (Java)

**A console-based university management system built in pure Java for managing students, teachers, and departments through an interactive command-line interface.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-Console-blue?style=for-the-badge)
![Version](https://img.shields.io/badge/Version-1.0.0-purple?style=for-the-badge)

</div>

---

## 📖 About The Project

Managing university records manually is error-prone and time-consuming. This system provides a streamlined, menu-driven console application that centralizes the management of students, teachers, and departments — all in memory with zero external dependencies.

**Who it's for:**
- 🎯 University administrators looking for a lightweight digital record system
- 🎯 Computer science students learning OOP concepts in Java (real-world inheritance, polymorphism, collections)
- 🎯 Developers seeking a clean, hackable foundation to extend with databases, GUIs, or web APIs

---

## ✨ Key Features

### 👨‍🎓 Student Management
| Feature | Description |
|---|---|
| **Add / Remove** | Register new students or remove existing ones |
| **Search by Name** | Look up a student's personal info and ID |
| **Grade Management** | View and modify grades for Math, Java, and Data Structure |
| **List All** | Display all registered students at a glance |

### 👨‍🏫 Teacher Management
| Feature | Description |
|---|---|
| **Add / Remove** | Hire or dismiss teachers (by index) |
| **Modify Info** | Update name, phone, age, level, working hours, and bonus |
| **Salary Calculator** | Compute salary dynamically from working hours × bonus × base rate |
| **List All** | Display all teachers on record |

### 🏛️ Department Management
| Feature | Description |
|---|---|
| **Add / Remove** | Create or remove academic departments |
| **List All** | View all departments in the faculty |
| **Quick View** | Access all students or all teachers within a department section |

---

## 🏗️ Architecture & Tech Stack

### Tech Stack

| Layer | Technology |
|---|---|
| **Language** | Java (JDK 8+) |
| **Build** | None — raw `javac` compilation |
| **Dependencies** | Zero (pure JDK) |
| **Data Storage** | In-memory via `ArrayList` |

### Architecture

```
┌──────────────────────────────────────────────────────┐
│                    Main.java                         │
│            (Menu dispatcher / entry point)           │
└──────────────┬──────────────────────┬────────────────┘
               │                      │
        ┌──────▼──────┐        ┌─────▼──────┐
        │  Student    │        │  Teacher   │
        │  section    │        │  section   │
        └──────┬──────┘        └─────┬──────┘
               │                     │
        ┌──────▼─────────────────────▼──────┐
        │          Person.java               │
        │  (Base class: name, phone, age,   │
        │            level)                  │
        └────────────────────────────────────┘

        ┌────────────────────────────────────┐
        │        Department.java             │
        │  (Standalone — no inheritance)     │
        └────────────────────────────────────┘
```

- **Inheritance**: `Person` → `Student`, `Person` → `Teacher` (shared fields: name, phone, age, level)
- **Encapsulation**: Private fields with public getters/setters
- **Static seed data**: Each entity class populates itself via `static` blocks on startup
- **Menu-driven**: Nested `do-while` loops with `switch` cases dispatch user choices

---

## 🚀 Getting Started

### Prerequisites

- **Java JDK 8+** installed on your machine
- Verify with:

```bash
java -version
javac -version
```

### Installation & Run

```bash
# 1. Clone the repository
git clone https://github.com/your-username/university-management-system.git
cd university-management-system

# 2. Compile all sources
javac -d out *.java

# 3. Run the application
java -cp out Unvirsety.Main
```

> **Note:** The package name is `Unvirsety` (as declared in source). Use this exact spelling when running.

---

## 📸 Screenshots / Demo

```
     Welcome to our unvirsety management system.
You are in faculty of Applied Science, computer science deparment
========================================================================


press 1 to go to the student secion
press 2 to go to the teacher secion
press 3 to go to the department secion
press 4 to exit form the program
============================================
```

*(Add actual screenshots or a screen recording here.)*

---

## 📄 License

Distributed under the MIT License. See `LICENSE` for more information.

---

## 📬 Contact & Support

- **Email**: your.email@example.com
- **LinkedIn**: [Your Name](https://linkedin.com/in/your-profile)
- **GitHub Issues**: [Open an issue](https://github.com/your-username/university-management-system/issues)

---

<div align="center">
  <sub>Built with ❤️ using pure Java — no frameworks, no bloat.</sub>
</div>
