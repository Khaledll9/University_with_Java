# AGENTS.md

## Project overview

Console-based university management system in Java. No build tool, no tests, no CI.

## Build & run

```powershell
# Compile all sources
javac -d out *.java

# Run
java -cp out Unvirsety.Main
```

## Key facts

- **Package**: `Unvirsety` (note the spelling — all sources use this)
- **Entrypoint**: `Main.main()` in `Main.java`
- **No build system**: raw `javac` compilation, no Maven/Gradle
- **No tests**: no test framework, no test directory
- **No linter/formatter/CI**
- **Data**: all in-memory, seeded via `static` initializers in `Student`, `Teacher`, `Department`
- **Input**: `Scanner(System.in)` — console-driven menu loops
- **Inheritance**: `Person` → `Student`, `Person` → `Teacher`; `Department` is standalone

## Code quirks (verified from source)

- `Student.subject` is a raw `ArrayList` storing mixed types (subject names as `String`, grades as `Integer`) at alternating indices
- `Student.removeStudent()` always removes the last student (no search by name)
- `Department` constructor call `new Department(name, numberOfStudent, numberOfTeacher)` mismatches the parameter order: constructor is `(name, numberOfTeacher, numberOfStudent)`
- The static `id` field in `Student` is incremented but never reset; used as a sequential ID counter
- Many typos in method/field names are part of the existing API (e.g., `dispalyError`, `statrPoint`, `studentiInformation`)
