# springboot-with-cassandra

Cassandra 4.0 doesn't support Java 17

A spring crud repo using cassandra
create docker-compose.yml file. You need to execute docker-compose up command when you're in the folder where that
file is present.

Edit the application.yml file

Create container
docker compose up -d

Start docker desktop
Run docker-compose up

Use docker ps to get container id of your cassandra image

This command will exec your container. 6exxxxxxx is container id
docker exec -it 572c21347a36 bash

CREATE KEYSPACE casscrudks WITH replication = {'class':'SimpleStrategy', 'replication_factor' : 3};

describe keyspaces;

use casscrudks;

CREATE TABLE Product( id int PRIMARY KEY, name text);

describe tables;

describe table product;


POST - http://localhost:8080/api/products

{
"id":"1",
"name":"manideep"
}

GET - http://localhost:8080/api/products/1

GET - http://localhost:8080/api/products

PUT - http://localhost:8080/api/products/1

{
"id":"1",
"name":"praj"
}

DELETE - localhost:8080/api/products/1