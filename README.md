🎉 Initial Commit: Spring Boot Authentication Project 🎉

- 🚀 Features:
  - User Registration and Login
  - Password Encryption with BCrypt
  - MySQL Database Integration
  - Role-Based Authorization using Spring Security
  - Thymeleaf Frontend Templates

- 🛠️ Technologies Used:
  - Spring Boot, Spring Security, MySQL, Thymeleaf, Maven, BCrypt

- 📚 Key Endpoints:
  - /register (GET, POST)
  - /login (GET, POST)
  - /home (GET)

- 💻 Setup:
  1. Create MySQL database: `CREATE DATABASE auth_db;`
  2. Configure `application.properties`:
     - `spring.datasource.url=jdbc:mysql://localhost:3306/auth_db`
     - `spring.datasource.username=your_username`
     - `spring.datasource.password=your_password`
  3. Run the project: `mvn spring-boot:run`

- ✨ Access:
  - Registration: [http://localhost:8080/register](http://localhost:8080/register)
  - Login: [http://localhost:8080/login](http://localhost:8080/login)
  - Home: [http://localhost:8080/home](http://localhost:8080/home)

📧 Questions? Contact: asadbek2006y@gmail.com
