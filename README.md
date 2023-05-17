### Deploy web application with database  on tomcat using docker
	## First step
Need to make a war file for project
cmd -> nvm clean install ( then you can rename the war file as ROOT.war it”s optional)

 	## Second steps
	Create a Dockerfile(“The docker file name must be start Capital letter D”) in your project .

		FROM tomcat   
COPY /target/ROOT.war /usr/local/tomcat/webapps/ROOT.war
CMD ["catalina.sh", "run"]

FROM tomcat means docker demon search tomcat image locally if not found then demon  pull tomcat image from docker hub
COPY src to destination
CMD for Run the default Tomcat server
## 3rd step 
now we need to build a image from the Dockerfile
docker build  -t  (imageName)  . (dot for current directory)
The build command creates a docker image based on the Dockerfile.
Docker run -p 80:8080 –name (containerName)  imageName/imageId
	Here p is publish port. 80 is your localport and 8080 is container port. We can access 8080 container port using 80.

## Docker-compose
Docker Compose is used for running multiple containers as a single service. Each of the      containers here run in isolation but can interact with each other when required.

## create docker-compose.yml file 
version: '3.9'
services:
 user_management_db:
   image: postgres:latest
   container_name: user_management_db
   volumes:
     - ./data:/data
   ports:
     - '5533:5432'
   environment:
     - 'POSTGRES_PASSWORD=postgres'
     - 'POSTGRES_USER=postgres'
     - 'POSTGRES_DB=user_management_db'
 user_management_webapp:
   depends_on:
     - user_management_db
   image: user_servlet_app
   container_name: user_management_webapp
   volumes:
     - ./data:/data
   ports:
     - "80:8080"

command : docker-compuse up 



