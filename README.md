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
