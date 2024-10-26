# Student Management API
A Spring Boot REST API for managing student records using CRUD operations. This API allows you to create, retrieve, update, and delete student data stored in a relational database.


## Endpoints

1. Get All Students: Send a GET request to http://localhost:8080/api/students.

2. Get Student by ID: Send a GET request to http://localhost:8080/api/students/{id} (replace {id} with the actual student ID).

3. Create a New Student: Send a POST request to http://localhost:8080/api/students with the following JSON body:


```
{
  "firstName": "John",
  "lastName": "Doe"
}
```

4. Update Student: Send a PUT request to http://localhost:8080/api/students/{id} with the updated JSON body (replace {id} with the actual student ID):

```
{
  "firstName": "Jane",
  "lastName": "Doe"
}
```

5. Delete Student by ID: Send a DELETE request to http://localhost:8080/api/students/{id} (replace {id} with the actual student ID).

6. Delete All Students: Send a DELETE request to http://localhost:8080/api/students.

7. Get Student Count: Send a GET request to http://localhost:8080/api/students/count.

8. Check Existence of Student by ID: Send a GET request to http://localhost:8080/api/students/exists/{id} (replace {id} with the actual student ID).
