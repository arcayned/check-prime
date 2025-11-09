# My Java Project

This is a simple Java application that demonstrates the basic structure of a Java project using Maven.

## Project Structure

```
my-java-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── AppTest.java
├── pom.xml
├── .gitignore
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven

## Building the Project

To build the project, navigate to the project directory and run:

```
mvn clean install
```

## Running the Application

To run the application, use the following command:

```
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Running Tests

To run the tests, execute:

```
mvn test
```

## License

This project is licensed under the MIT License.