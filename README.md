# Learning JDBC

...

## Installation

Clone this repository

```bash
git clone https://github.com/baguilar6174/java-learning-jdbc.git
```

## Running the app

If you need local Postgres database

- Install docker
- Run `docker compose up -d` (Only the first time you start the project)

This command create a local volume in root project to save data.

- Run `data/ecommerce.sql` script to fill the database with data

---

## Concepts

### DAO (Data Access Object) Pattern

One of the most common patterns when dealing with databases is the DAO Pattern. 

- Provide abstraction between JDBC and the rest of the code (business logic)
- Can be just abstraction or a true object
- Most use data transfer objects (DTOs) with data access objects (DAOs) abstraction.
- Provides clear separation of concerns in code.
- Usually leverages a common interface
- Concrete implementation reacts on single-data domain
- Can and usually supports multiple tables
- Provide solid encapsulation of complex joins and aggregations

If you're using a DAO as a pure abstraction layer you're going to have a DTO or a data transfer object.

### DTO (Data transfer object)

- DTO provides single-domain data
- Should fully encapsulate object and/or contains sub objects
- Should be output and input of a single DAO

### DAO Factory

- Often used with DAOs
- Provides ability to leverage common paths for basic CRUD operations.
- Loses value when you have a lot of custom methods.

### What is a ResultSet?

- A multidimensional array that returns a database statement
- Metadata associated with the Query and where the cursor is as far as reading that table that comes out
- Limited functionality on size and scope of results
- Operates like an iterator in many ways

#### Iteration over ResultSet

- Simple repetitive operation
- `while(resultSet.next())`
- Within loop, unpack the structure

#### Accessing Values

- By column name
- By index
- Note the names aren't necessarily the same as the table definition - it's the query definition that matters.

#### Advanced Operations and Settings

- Navigation based on type
- Concurrency is updatable
- Holdability lives past commit

### The repository Pattern

- The difference between the repository pattern and DAO pattern is that the repository pattern focuses only on single table access per clas.
- Instead of joining in the database, you'll joining in code
- Complex joins in the database require single-instance databases
- Allows sharding of database in such a way you can focus on single-table access instead of accessing the entire database as a whole
- You can store one piece of data in a separate database to facilitate distribution

#### Where are your constraints?

- Is your application database constrained?, then repository pattern can help, because you don't do joins in database.
- Is your application horizontally scalable?, then repository pattern fits in
- Is your application vertical scalable?, then DAO can help
- Is your data highly normalized?
- Do you need atomic transactions that cross data table?

---

## My process

### Built with

- Maven
- Java 23
- postgresql

### What I learned

- 

## Development Features

- 

## Improves

- 

## Stay in touch

- Website - [www.bryan-aguilar.com](https://www.bryan-aguilar.com/)
- Medium - [baguilar6174](https://baguilar6174.medium.com/)
- Linkedin - [baguilar6174](https://www.linkedin.com/in/baguilar6174)
