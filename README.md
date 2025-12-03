# Doc2FAQ Application

A Spring Boot web application that transforms documents into comprehensive FAQ formats with ease.

## Overview

Doc2FAQ is designed to help users convert various types of documents (technical documentation, user manuals, knowledge base articles) into well-structured, accessible FAQ content. This application provides an intelligent way to generate questions and answers from existing documentation.

## Features (Planned)

- 📄 Document upload and processing
- 🤖 Intelligent question generation
- 📋 FAQ formatting and organization
- 📤 Export capabilities in multiple formats
- 🎨 User-friendly web interface
- 🔍 Search and filter functionality

## Prerequisites

Before running this application, make sure you have the following installed:

- **Java 17** or higher
- **Maven 3.6+** (for building the project)
- **Git** (for version control)

## Getting Started

### 1. Clone the Repository

```bash
git clone <repository-url>
cd doc2faq-app
```

### 2. Build the Project

```bash
mvn clean compile
```

### 3. Run Tests

```bash
mvn test
```

### 4. Start the Application

```bash
mvn spring-boot:run
```

Alternatively, you can build and run the JAR file:

```bash
mvn clean package
java -jar target/doc2faq-app-0.0.1-SNAPSHOT.jar
```

### 5. Access the Application

Once the application is running, open your web browser and navigate to:

```
http://localhost:8080
```

You should see the Doc2FAQ landing page with a welcome message and feature overview.

## Project Structure

```
doc2faq-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/doc2faq/app/
│   │   │       ├── Doc2FaqApplication.java      # Main Spring Boot application
│   │   │       └── controller/
│   │   │           └── HomeController.java      # Landing page controller
│   │   └── resources/
│   │       ├── templates/
│   │       │   └── index.html                   # Landing page template
│   │       └── application.properties           # Application configuration
│   └── test/
│       └── java/
│           └── com/doc2faq/app/
│               └── Doc2FaqApplicationTests.java # Basic application tests
├── pom.xml                                      # Maven configuration
├── .gitignore                                   # Git ignore rules
└── README.md                                    # This file
```

## Configuration

The application uses the following default configuration:

- **Server Port**: 8080
- **Context Path**: /
- **Thymeleaf Templates**: Located in `src/main/resources/templates/`

You can modify these settings in `src/main/resources/application.properties`.

## Development

### Adding New Features

1. Create feature branches from `main`
2. Follow the existing package structure under `com.doc2faq.app`
3. Add appropriate tests for new functionality
4. Update documentation as needed

### Running in Development Mode

The application includes Spring Boot DevTools for hot reloading during development:

```bash
mvn spring-boot:run
```

Changes to Java files will require a restart, but template and static resource changes will be picked up automatically.

## Testing

Run the test suite with:

```bash
mvn test
```

For integration tests:

```bash
mvn verify
```

## Building for Production

To create a production-ready JAR file:

```bash
mvn clean package -Pprod
```

The JAR file will be created in the `target/` directory.

## Troubleshooting

### Common Issues

1. **Port 8080 already in use**
   - Change the port in `application.properties`: `server.port=8081`
   - Or kill the process using port 8080

2. **Java version issues**
   - Ensure you're using Java 17 or higher
   - Check with: `java -version`

3. **Maven build failures**
   - Ensure Maven is properly installed: `mvn -version`
   - Clear Maven cache: `mvn dependency:purge-local-repository`

### Getting Help

If you encounter issues:

1. Check the application logs for error messages
2. Verify all prerequisites are installed correctly
3. Ensure no other applications are using port 8080

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Next Steps

This application is ready for development! The next phases will include:

- Document upload functionality
- AI-powered question generation
- FAQ formatting and export features
- User authentication and management
- Advanced search and filtering capabilities

---

**Status**: ✅ Initial setup complete - Ready for development!