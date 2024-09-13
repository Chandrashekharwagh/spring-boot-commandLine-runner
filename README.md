# Spring Boot Command-Line Runner

This project demonstrates how to create a command-line runner using Spring Boot. It provides a simple template for building command-line applications with the power and convenience of the Spring framework.

## Features

- Easy setup with Spring Boot
- Command-line argument parsing
- Customizable business logic
- Dependency injection support

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher

## Getting Started

1. Clone the repository:
   ```
   git clone https://github.com/Chandrashekharwagh/spring-boot-commandLine-runner.git
   ```

2. Navigate to the project directory:
   ```
   cd spring-boot-commandLine-runner
   ```

3. Build the project:
   ```
   mvn clean package
   ```

4. Run the application:
   ```
   java -jar target/spring-boot-commandLine-runner-1.0.0.jar [arguments]
   ```

## Usage

The application accepts command-line arguments. Here's an example:

```
java -jar target/spring-boot-commandLine-runner-1.0.0.jar --name John --action greet
```

Customize the `run` method in the `CommandLineRunnerImpl` class to define your application's behavior.

## Configuration

You can configure the application using `application.properties` or `application.yml` files. Place these in the `src/main/resources` directory.

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
