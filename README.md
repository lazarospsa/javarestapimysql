# javarestapimysql

<a href="https://paypal.me/lazarospsarokostas" rel="nofollow"><img src="https://camo.githubusercontent.com/d5d24e33e2f4b6fe53987419a21b203c03789a8f/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f446f6e6174652d50617950616c2d677265656e2e737667" alt="Donate" data-canonical-src="https://img.shields.io/badge/Donate-PayPal-green.svg" style="max-width:100%;"></a>


An example of java crud / rest api with hibernate, MySQL, springboot, lombok.

Run on Server -> Apache Tomcat 9

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
