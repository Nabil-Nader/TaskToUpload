# TaskToUpload

# Version 1 of simple spring boor demo
we have 8 api [4 api for student and the other 4 for teacher ]

GET => localhost:8080/api/v1/students/all -> show all student
GET => localhost:8080/api/v1/students/{id} -> to get information of one student
POST => localhost:8080/api/v1/students/add -> add  student
PUT => localhost:8080/api/v1/students/update -> update a student
DELETE => localhost:8080/api/v1/students/{id} -> delete a student


GET => localhost:8080/api/v1/teachers/all -> show all teachers
GET => localhost:8080/api/v1/teachers/{id} -> to get information of one teacher
POST => localhost:8080/api/v1/teachers/add -> add  teacher
PUT => localhost:8080/api/v1/teachers/update -> update a teacher
DELETE => localhost:8080/api/v1/teachers/{id} -> delete a teacher


create 2 database with its own simpledemo.sql[make it easy to test]
right now there is no relationship with both database

# upcoming version 2
 Create some exceptionhandling and do a relationship with database [one Teacher many student ]
 
 # upcoming version 3
  create some Spring Security to make sure only a student can view his own information, 
  we can't hava a student change information in teacher database
