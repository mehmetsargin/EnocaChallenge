## Run Project 

Run the project by updating the url, username and password fields used for the database connection in the application.properties file.

Project is running default 8080 port.

(GET) http://localhost:8080/api/students Get All Students.

(GET) http://localhost:8080/api/students/3 Get Student With Id

(POST) http://localhost:8080/api/students Add New Student

```bash 
{
    "firstName":"Ali",
    "lastName": "Can",
    "email": "alican@gmail.com",
    "departmentId": 1
}
```

(PUT) http://localhost:8080/api/students Update Student. If there is no student with that id number, it creates a new one.
```bash
{
    "id":4,
    "firstName":"Can",
    "lastName": "Cem",
    "email": "cancem@gmail.com",
    "departmentId": 3
}
```
(DELETE) http://localhost:8080/api/students/1 Delete Student With Id

~You can do the same for Departments by referring to http://localhost:8080/api/departments
