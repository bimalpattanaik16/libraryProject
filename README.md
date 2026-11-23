# Library Project

## Overview
A Java-based Library Management System structured as a Maven project (`libraryproject`). It models core library entities and workflows—including book cataloging, physical shelf/tray organization, student records, book search, and book issue/return tracking.

> **Note:** Several classes in `src/com/library` are currently early-stage skeleton/draft implementations under development.

## Key Features
- **Book & Catalog Modeling** (`Book`, `BookCell`, `Tray`): Represents books (ID, name, subject, registration number, publisher, author) and organizes them into cells and trays.
- **Inventory & Library Management** (`Library`, `BookManager`, `Mapper`): Coordinates adding books, tracking book counts/availability, and managing tray mappings.
- **Book Search** (`BookSearch`): Maps book names to `Book` records for lookup.
- **Issue & Return Tracking** (`Student`, `IssueDetails`, `IssueMap`): Models student details and tracks issued and returned books.

## Project Structure
```text
libraryProject/
├── pom.xml
└── src/
    └── com/
        └── library/
            ├── Book.java
            ├── BookCell.java
            ├── BookManager.java
            ├── BookSearch.java
            ├── IssueDetails.java
            ├── IssueMap.java
            ├── Library.java
            ├── Mapper.java
            ├── Student.java
            └── Tray.java
```

## Tech Stack
- **Language:** Java 8 (`1.8`)
- **Build Tool:** Apache Maven (`pom.xml` with `maven-compiler-plugin` 3.7.0, no external dependencies)

## How to Run Locally
1. **Prerequisites:** Ensure you have **JDK 8+** and **Apache Maven** installed.
2. **Clone the repository:**
   ```bash
   git clone https://github.com/bimalpattanaik16/libraryProject.git
   cd libraryProject
   ```
3. **Build with Maven:**
   ```bash
   mvn compile
   ```
   *(Note: Because `Library.java`, `BookManager.java`, and `BookSearch.java` currently contain draft/incomplete method definitions and no `main` entry point yet, those classes will need to be completed before the project compiles and runs.)*
