### How to start project
1. Create a database as a testdb on Postgresql
2. Clone the project
3. Reload project for downloading Maven dependencies
4. Run the project
5. Open Postman and test this entrypoints

* localhost:8080/todo [GET]
* localhost:8080/todo [POST] { "subject":"my subject", "description":"my desc" }
* localhost:8080/todo/1 [GET]
* localhost:8080/todo/1 [PUT] { "subject":"my subject", "description":"my desc" }
* localhost:8080/todo/1 [DELETE]

