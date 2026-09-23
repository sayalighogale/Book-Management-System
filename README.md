# Book-Management-System

# Book Management System

A Java console CRUD app for managing books, built with the same
architecture as your CafeManagementSystem project:

```
com.book
├── App.java                 // menu-driven console entry point
├── dao
│   ├── bookDao.java          // DAO interface
│   └── bookDaoimp.java       // JDBC implementation (MySQL)
├── dbconnection
│   └── DC.java                // returns a JDBC Connection
└── pojo
    └── book.java              // plain data object (id, name, author, price, quantity, category)
```

## Fields
| Cafe project | Book project |
|---|---|
| mName (item name) | bName (book title) |
| price | price |
| quantity | quantity |
| category | category |
| — | **author** (new field) |

## Setup

1. **Create the database table** — run `book_schema.sql` in MySQL
   (uses the same `miniproject` database as your cafe app, just a
   separate `book` table, so both can coexist):
   ```
   mysql -u root -p < book_schema.sql
   ```

2. **Add the MySQL JDBC driver** — download `mysql-connector-j` from
   https://dev.mysql.com/downloads/connector/j/ and drop the jar into
   the `lib/` folder (the `.classpath` already points there).

3. **Set your DB credentials** in `src/com/book/dbconnection/DC.java`
   — update the URL/user/password if they differ from
   `root` / `MySQL@123` on `localhost:3306`.

4. **Import into Eclipse**: File → Import → Existing Projects into
   Workspace → select this folder. Or compile/run from the command
   line:
   ```
   javac -d bin -cp lib/mysql-connector-j-8.4.0.jar $(find src -name "*.java")
   java -cp bin:lib/mysql-connector-j-8.4.0.jar com.book.App
   ```
   (On Windows use `;` instead of `:` in the classpath.)

## Menu

```
**** Book Management System ****
1. Add book
2. Read All books
3. Update book Details
4. Delete book
5. Exit
```

Same flow as the cafe app: add a book (title, author, price,
quantity, category), list all books, update by id, or delete by id.
