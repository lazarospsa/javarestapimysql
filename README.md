# javarestapimysql
An example of java crud / rest api with hibernate, MySQL, springboot, lombok.

Endpoints:

Get (/user/users)
http://localhost:8080/usermanagment/user/users

return all users from mysql database

Get (/user/user/{id})
http://localhost:8080/usermanagment/user/user/1

return a specific user by id

Post (/user/add)
http://localhost:8080/usermanagment/user/add

posting as json/application a new user

{
	"usedId":1,
	"userEmail":"lazaros@psarokostas.gr",
	"userName":"lazaros",
	"userPhone":"6912345678"
}

Delete (/user/delete/{id})
http://localhost:8080/usermanagment/user/delete/4

delete a specific user by id

Put (/user/update)
http://localhost:8080/usermanagment/user/update

update a json/application user data to database

{
	"usedId":1,
	"userEmail":"lazaros1@psarokostas.gr",
	"userName":"lazaros",
	"userPhone":"6912345678"
}
