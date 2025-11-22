<div align="center">

<br/>

<img src="https://img.icons8.com/fluency/96/book-shelf.png" width="80"/>

<br/>

# Quantum Bookstore

<br/>

[![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![License](https://img.shields.io/badge/License-MIT-3DA639?style=for-the-badge)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Complete-5865F2?style=for-the-badge)](/)

<br/>

*A simple yet elegant Java application simulating a bookstore*
*with support for paper books, eBooks, and online books.*

<br/>

[Features](#-features) · [Architecture](#-architecture) · [Quick Start](#-quick-start) · [Usage](#-usage)

<br/>

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

</div>

<br/>

## ✦ Features

<br/>

<div align="center">
<table>
<tr>
<td align="center" width="260">
<br/>
<img src="https://img.icons8.com/fluency/48/book.png" width="32"/>
<br/><br/>
<b>Multiple Book Types</b>
<br/>
<sub>Paper, eBook, and<br/>Online formats</sub>
<br/><br/>
</td>
<td align="center" width="260">
<br/>
<img src="https://img.icons8.com/fluency/48/shopping-cart.png" width="32"/>
<br/><br/>
<b>Smart Purchasing</b>
<br/>
<sub>Stock management &<br/>delivery handling</sub>
<br/><br/>
</td>
<td align="center" width="260">
<br/>
<img src="https://img.icons8.com/fluency/48/maintenance.png" width="32"/>
<br/><br/>
<b>Inventory Control</b>
<br/>
<sub>Add, remove, and<br/>manage catalog</sub>
<br/><br/>
</td>
</tr>
</table>
</div>

<br/>

**Core Capabilities**

| Feature | Description |
|:--------|:------------|
| **Add Books** | Register different book types to the store inventory |
| **Purchase Books** | Handle stock for paper books, email delivery for eBooks |
| **Remove Old Books** | Clean up catalog by filtering books by publication year |
| **Factory Pattern** | Create book instances dynamically based on type |

<br/>

---

## ✦ Architecture

<br/>

### Class Hierarchy

<div align="center">

```
                          ┌─────────────────────┐
                          │   «interface»       │
                          │   BookServices      │
                          │   ─────────────     │
                          │   + add()           │
                          │   + remove()        │
                          │   + buy()           │
                          └──────────┬──────────┘
                                     │ implements
                                     ▼
┌─────────────────────────────────────────────────────────────────┐
│                         BookStore                               │
│   ─────────────────────────────────────────────────────────     │
│   - books: List<Book>                                           │
│   + addBook() · buyBook() · removeOldBooks()                    │
└─────────────────────────────────────────────────────────────────┘
                                     │
                                     │ manages
                                     ▼
                    ┌─────────────────────────────────┐
                    │       «abstract» Book           │
                    │       ───────────────           │
                    │   - title: String               │
                    │   - price: double               │
                    │   - year: int                   │
                    │   - ISBN: String                │
                    └─────────────┬───────────────────┘
                                  │
            ┌─────────────────────┼─────────────────────┐
            │                     │                     │
            ▼                     ▼                     ▼
   ┌─────────────────┐   ┌─────────────────┐   ┌─────────────────┐
   │   PaperBook     │   │     EBook       │   │   OnlineBook    │
   │   ──────────    │   │   ──────────    │   │   ──────────    │
   │   + stock       │   │   + fileType    │   │   (online-only) │
   │   + shipping    │   │   + emailDelivery│  │                 │
   └─────────────────┘   └─────────────────┘   └─────────────────┘
```

</div>

<br/>

### Project Structure

```
quantum-bookstore/
│
├── 📄 Book.java              Abstract base class for all book types
├── 📄 PaperBook.java         Physical books with stock & shipping
├── 📄 EBook.java             Digital books with email delivery
├── 📄 OnlineBook.java        Online-only accessible books
├── 📄 BookFactory.java       Factory for creating book instances
├── 📄 BookServices.java      Interface defining store operations
├── 📄 BookStore.java         Main store implementation
└── 📄 Runner.java            Application entry point
```

<br/>

### Component Details

<br/>

<table>
<tr>
<th width="160">Component</th>
<th>Responsibility</th>
</tr>
<tr>
<td><code>Book</code></td>
<td>Abstract base class containing common properties: <b>title</b>, <b>price</b>, <b>year</b>, <b>ISBN</b></td>
</tr>
<tr>
<td><code>PaperBook</code></td>
<td>Extends Book with <b>stock management</b> and <b>shipping</b> capabilities</td>
</tr>
<tr>
<td><code>EBook</code></td>
<td>Extends Book with <b>file type</b> specification and <b>email delivery</b></td>
</tr>
<tr>
<td><code>OnlineBook</code></td>
<td>Extends Book for titles available <b>exclusively online</b></td>
</tr>
<tr>
<td><code>BookFactory</code></td>
<td>Factory pattern implementation for <b>dynamic book creation</b></td>
</tr>
<tr>
<td><code>BookServices</code></td>
<td>Interface defining <b>add</b>, <b>remove</b>, and <b>buy</b> operations</td>
</tr>
<tr>
<td><code>BookStore</code></td>
<td>Concrete implementation managing the <b>book collection</b></td>
</tr>
<tr>
<td><code>Runner</code></td>
<td>Main class for <b>testing</b> and <b>demonstration</b></td>
</tr>
</table>

<br/>

---

## ✦ Quick Start

<br/>

### Prerequisites

```
Java 17 or higher
```

<br/>

### Installation

```bash
# Clone the repository
git clone https://github.com/username/quantum-bookstore.git

# Navigate to project directory
cd quantum-bookstore

# Compile all Java files
javac *.java

# Run the application
java Runner
```

<br/>

---

## ✦ Usage

<br/>

### Basic Operations

```java
// Initialize the bookstore
BookStore store = new BookStore();

// Add a paper book
Book paperBook = BookFactory.createBook("paper", "The Great Novel", 29.99, 2023, "978-0-123456-78-9");
store.addBook(paperBook);

// Add an eBook
Book eBook = BookFactory.createBook("ebook", "Digital Dreams", 14.99, 2024, "978-0-987654-32-1");
store.addBook(eBook);

// Purchase a book
store.buyBook(paperBook);

// Remove books published before 2020
store.removeOldBooks(2020);
```

<br/>

### Book Type Behaviors

<br/>

| Type | On Purchase | Restrictions |
|:-----|:------------|:-------------|
| **PaperBook** | Decrements stock, initiates shipping | Limited by available stock |
| **EBook** | Sends download link via email | Requires valid email address |
| **OnlineBook** | Grants online access | Cannot be purchased for offline use |

<br/>

---

## ✦ Design Patterns

<br/>

<table>
<tr>
<td width="140" align="center">
<b>Factory</b>
</td>
<td>
<code>BookFactory</code> encapsulates object creation logic, allowing flexible instantiation of different book types without exposing implementation details.
</td>
</tr>
<tr>
<td align="center">
<b>Interface</b>
</td>
<td>
<code>BookServices</code> defines a contract for bookstore operations, enabling loose coupling and testability.
</td>
</tr>
<tr>
<td align="center">
<b>Inheritance</b>
</td>
<td>
Abstract <code>Book</code> class provides shared functionality while allowing specialized behavior in subclasses.
</td>
</tr>
</table>

<br/>

---

<br/>

<div align="center">

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━

<br/>

<sub>

**Quantum Bookstore** · A Java OOP Demonstration

</sub>

<br/>

[![Made with Java](https://img.shields.io/badge/Made_with-Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](/)
[![OOP](https://img.shields.io/badge/Paradigm-OOP-5865F2?style=flat-square)](/)

</div>
