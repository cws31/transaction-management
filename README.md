Transaction Management Demo

A simple Spring Boot project demonstrating the use of @Transactional for database transaction management.

Features
Save person details
Validate age eligibility for voting
Automatically rollback transaction if age is below 18
Save voting status for eligible persons
Tech Stack
Java
Spring Boot
Spring Data JPA
MySQL
Lombok
Transaction Flow
Person data is saved
Age is validated
If age < 18 → Exception occurs and transaction rolls back
If age ≥ 18 → Vote record is also saved successfully
Key Concept
@Transactional

Ensures all database operations execute as a single unit of work.

Example
Age = 20 → Person + Vote saved ✅
Age = 15 → Nothing saved (Rollback) ❌
