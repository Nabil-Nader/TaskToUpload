# TaskToUpload

# Version 1 of simple spring boor demo
we have 8 api [4 api for student and the other 4 for teacher ]

GET => localhost:8080/api/v1/students/all -> show all student <br />
GET => localhost:8080/api/v1/students/{id} -> to get information of one student <br />
POST => localhost:8080/api/v1/students/add -> add  student <br />
PUT => localhost:8080/api/v1/students/update -> update a student <br />
DELETE => localhost:8080/api/v1/students/{id} -> delete a student <br />


GET => localhost:8080/api/v1/teachers/all -> show all teachers <br />
GET => localhost:8080/api/v1/teachers/{id} -> to get information of one teacher <br />
POST => localhost:8080/api/v1/teachers/add -> add  teacher <br />
PUT => localhost:8080/api/v1/teachers/update -> update a teacher <br />
DELETE => localhost:8080/api/v1/teachers/{id} -> delete a teacher <br />


create 2 database with its own simpledemo.sql[make it easy to test] <br />
right now there is no relationship with both database

# upcoming version 2
 Create some exceptionhandling and do a relationship with database [one Teacher many student ]
 
 # upcoming version 3
  create some Spring Security to make sure only a student can view his own information, 
  we can't hava a student change information in teacher database
