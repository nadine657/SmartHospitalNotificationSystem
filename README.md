# Smart Hospital Notification System

## Project Description
This is a Spring Boot application that manages hospital notifications using the Spring IoC container and Dependency Injection.

## Features
- Email notifications for routine patient alerts.
- SMS notification service.
- Emergency notifications for critical patient alerts.
- Dependency Injection using `@Autowired`.
- Service selection using `@Primary` and `@Qualifier`.
- Hospital configuration using `@Value`.
- Environment variable support for API secrets.

## Technologies Used
- Java
- Spring Boot
- Maven
- IntelliJ IDEA

## Configuration
The application uses these environment variables:

- `HOSPITAL_API_SECRET`
- `HOSPITAL_NAME`

Set `HOSPITAL_API_SECRET` in your environment before running the application.

## Running the Application
Run `SmartHospitalNotificationSystemApplication.java` from IntelliJ IDEA.

## Security
The `.env` file is excluded from Git using `.gitignore`. Do not upload real secrets to GitHub.