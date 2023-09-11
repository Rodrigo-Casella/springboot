# Spring Boot Topic-Course Management System

## Overview
This is a small-scale RESTful web application built with Spring Boot that allows users to manage topics and courses. Users can perform various operations, such as creating, retrieving, updating, and deleting topics and courses as JSON objects. All data is stored in an embedded Apache Derby database for persistence.

## Features
- **Topic Management**:
  - Create a new topic
  - Retrieve a list of all topics
  - Retrieve a specific topic by ID
  - Update an existing topic
  - Delete a topic
- **Course Management**:
  - Create a new course under a topic
  - Retrieve a list of all courses
  - Retrieve a specific course by ID
  - Update an existing course
  - Delete a course

## Prerequisites
Before running this application, ensure you have the following:

- Java 17 or higher installed on your machine.
- Maven installed for building and managing dependencies.
- Your favorite REST API client (e.g., Postman) for testing the API endpoints.

## Getting Started
Clone this repository to your local machine:
```
git clone https://github.com/Rodrigo-Casella/springboot.git
```

Navigate to the project directory:
```
cd springboot
```

Build the project using Maven:
```
mvn clean install
```

Run the Spring Boot application:

```
java -jar target/demo-1.0-SNAPSHOT.jar
```

The application will start on `http://localhost:8080`

## API Endpoints
### Topics
- **GET** /topics: Retrieve a list of all topics.
- **GET** /topics/{id}: Retrieve a specific topic by ID.
- **POST** /topics: Create a new topic.
  - Request Body: JSON representing the new topic.
- **PUT** /topics/{id}: Update an existing topic by ID.
  - Request Body: JSON representing the updated topic.
- **DELETE** /topics/{id}: Delete a topic by ID.

### Courses
- **GET** /topics/{topicId}/courses: Retrieve a list of all courses of a specific topic.
- **GET** /topics/{topicId}/courses/{id}: Retrieve a specific course by ID.
- **POST** /topics/{topicId}/courses: Create a new course under topicID.
  - Request Body: JSON representing the new course.
- **PUT** /topics/{topicId}/courses/{id}: Update an existing course by ID.
  - Request Body: JSON representing the updated course.
- **DELETE** /topics/{topicId}/courses/{id}: Delete a course by ID.

## Sample Requests
Here are some sample requests using cURL to interact with the API:

### Create a Topic
```
curl -X POST -H "Content-Type: application/json" -d '{"id": "java", "name": "Java Programming", "description": "Learn Java programming language."}' http://localhost:8080/topics
```

### Retrieve All Topics
```
curl http://localhost:8080/topics
```

### Create a Course
```
curl -X POST -H "Content-Type: application/json" -d '{"id": "java-intro", "name": "Introduction to Java", "description": "Basic Java concepts."}' http://localhost:8080/topics/java/courses
```

### Retrieve All Courses On A Specific Topic
```
curl http://localhost:8080/topics/java/courses
```
