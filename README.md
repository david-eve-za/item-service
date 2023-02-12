# Item Service

This is a simple item service that can be used to create, read, update and delete items.
This service is used to demonstrate the use of the [Spring Boot](https://spring.io/projects/spring-boot) framework.
This service uses RestTemplate to communicate with the [Product Service]


## Getting Started

Create a new item:

    curl -X POST -H "Content-Type: application/json" -d '{"name":"Item 1", "description":"Item 1 description"}' http://localhost:8080/items

Get all items:
    
    curl http://localhost:8080/items

Get an item:
    
    curl http://localhost:8080/items/1

Update an item:
        
    curl -X PUT -H "Content-Type: application/json" -d '{"name":"Item 1", "description":"Item 1 description"}' http://localhost:8080/items/1

Delete an item:
                
    curl -X DELETE http://localhost:8080/items/1   

## Running the tests

To run the tests, execute the following command:

    mvn test

## Deployment

### Prerequisites

* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/)
* [Docker Compose](https://docs.docker.com/compose/)
* [Postman](https://www.getpostman.com/) (optional)

### Running the service

To run the service, execute the following command:

    mvn spring-boot:run

### Running the service in Docker

To run the service in Docker, execute the following command:

    docker-compose up

### Running the service in Docker Swarm

To run the service in Docker Swarm, execute the following command:

    docker stack deploy -c docker-compose.yml item-service

### Running the service in Kubernetes

To run the service in Kubernetes, execute the following command:

    kubectl apply -f kubernetes/
