# JWT Authentication with Spring Boot 3.1

This repository demonstrates the implementation of JWT (JSON Web Token) authentication using Spring Boot 3.1 framework. JWT authentication provides a secure mechanism for user authentication and authorization.

## Features

- User registration and login endpoints for authentication
- JWT token generation and verification
- Role-based authorization using JWT claims
- Secure endpoints for protected resources
- Integration with Spring Security for enhanced security measures

## Installation

1. Clone the repository: `git clone https://github.com/AnkitG7/Jwt-Authentication-Spring-boot3.git`
3. Navigate to the project directory.
4. Build the project: `mvn clean install`
5. Run the application: `mvn spring-boot:run`

Make sure you have Java and Maven installed on your system.

## Usage

1. Access the application at: `http://localhost:8081`
2. Register a new user or login with existing credentials
3. Receive JWT token upon successful authentication
4. Include the JWT token in the Authorization header for protected API endpoints

## Contributing

Contributions are welcome! If you find any issues or want to add new features, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
