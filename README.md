🌟 Spring Boot Authentication Project 🌟
Welcome to the Spring Boot Authentication project! This application demonstrates a complete Registration and Login system using Spring Boot, MySQL, and Spring Security. 🚀

📚 Features
✅ User Registration
✅ User Login with Authentication
✅ Password Encryption with BCrypt
✅ MySQL Database Integration
✅ Spring Security Configuration
✅ Custom UserDetails Implementation
✅ Role-Based Authorization
✅ Thymeleaf Frontend for User Interface

🛠️ Technologies Used
Java ☕
Spring Boot 🌱
Spring Security 🔒
MySQL 🐬
Thymeleaf 🎨
Maven 🧩
BCrypt Password Encoder 🔑
🚀 How to Run the Project
Clone the Repository

bash
Copy code
git clone https://github.com/asadbek2006y/SpringBootAuth.git
cd SpringBootAuth
Set Up the Database
Create a MySQL database named auth_db (or update the name in application.properties):

sql
Copy code
CREATE DATABASE auth_db;
Configure application.properties
Update the database username and password in src/main/resources/application.properties:

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/auth_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Run the Application

bash
Copy code
mvn spring-boot:run
Access the Application
Open your browser and navigate to:

Registration: http://localhost:8080/register
Login: http://localhost:8080/login
Home: http://localhost:8080/home
🌟 Project Structure
plaintext
Copy code
src/
├── main/
│   ├── java/com/otabekov/registration/
│   │   ├── config/            # Security configuration
│   │   ├── controller/        # Controllers (Registration/Login)
│   │   ├── dto/               # Data Transfer Objects
│   │   ├── entity/            # JPA Entities
│   │   ├── repository/        # Database repositories
│   │   ├── service/           # Business logic services
│   │   └── SpringBootAuthApplication.java
│   └── resources/
│       ├── templates/         # Thymeleaf HTML templates
│       │   ├── register.html
│       │   ├── login.html
│       │   └── home.html
│       ├── application.properties
│       └── static/            # Static assets (CSS, JS)
└── pom.xml                    # Maven dependencies
🌟 Key Endpoints
HTTP Method	Endpoint	Description
GET	/register	Show registration page
POST	/register	Handle user registration
GET	/login	Show login page
POST	/login	Handle user login
GET	/home	Display home page (authenticated users)
🤝 Contributing
Contributions are welcome! Feel free to submit a pull request or open an issue. Let’s make this project better together. 🛠️

📧 Contact
If you have any questions, feel free to reach out:
📧 asadbek2006y@gmail.com

Enjoy coding! 🚀✨ Let’s build amazing things together. 💻🌟

