# blog system
Simple blog API (CRUD) based on Java Spring boot application for itacademy students

### Prerequisites

In order to run this application, you need to install [MongoDB](https://www.mongodb.com/) as well as Java and Gradle on your machine.

Change database name to your own (without < >) inside `application.properties` file.

### Running
First of all, you need to run MongoDB instance

Mac/Linux users (sorry Windows, you have to Google it yourself)
```bash
mongod
```

To run Spring Boot application
```bash
./gradlew bootRun
```

### Issues
If you have any issues or improvements do not hesitate to make a pull request or create a issue.

If your build fails for an unknown reason or you have faced cache issues, try:
```bash
./gradlew clean
```

### Notes
* For best development pleasure use [IntelliJ](https://www.jetbrains.com/idea/) IDE.