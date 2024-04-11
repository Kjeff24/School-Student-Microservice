# SCHOOL AND STUDENT MICROSERVICE

## TECHNOLOGY USED
- Spring Boot
- Spring Cloud (Eureka Server, Gateway)
- Feign Client for communication between microservices

## ACCESSING THE SERVICES AND SERVERS
- Eureka Server(discovery): `http://localhost:8761`
- School Service: `http://localhost:8080`
- Student Service: `http://localhost:8081`
- Gateway: `http://localhost:8765`

## USAGE
Best required to access api endpoints using the api gateway endpoint `http://localhost:8765`

## API Endpoints

### School Service
Base URL: `/api/v1/schools`
- GET : Retrieve all schools.
- GET `/{id}`: Retrieve school by ID.
- GET `/students/{school-id}`: Retrieve all students based on school id.
- POST : Create a new school.

### Student Service
Base URL: `/api/v1/students`
- GET : Retrieve all students.
- GET `{id}`: Retrieve student by ID.
- GET `/schools/{school-id}`: Retrieve all students based on school id.
- POST : Create a new student.
- DELETE `/{id}`: Delete student by ID.