# Student Management API
A Spring Boot REST API for managing student records using CRUD operations. This API allows you to create, retrieve, update, and delete student data stored in a relational database.


## Endpoints

Get All Students: Send a GET request to http://localhost:8080/api/students.

Get Student by ID: Send a GET request to http://localhost:8080/api/students/{id} (replace {id} with the actual student ID).

Create a New Student: Send a POST request to http://localhost:8080/api/students with the following JSON body:

json
Copy code
{
  "firstName": "John",
  "lastName": "Doe"
}
Update Student: Send a PUT request to http://localhost:8080/api/students/{id} with the updated JSON body (replace {id} with the actual student ID):

json
Copy code
{
  "firstName": "Jane",
  "lastName": "Doe"
}
Delete Student by ID: Send a DELETE request to http://localhost:8080/api/students/{id} (replace {id} with the actual student ID).

Delete All Students: Send a DELETE request to http://localhost:8080/api/students.

Get Student Count: Send a GET request to http://localhost:8080/api/students/count.

Check Existence of Student by ID: Send a GET request to http://localhost:8080/api/students/exists/{id} (replace {id} with the actual student ID).
