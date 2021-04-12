# URA - User Registration Application

## Introduction

> URA is an application developed on Spring Boot that registers users in a Relational Database. It uses MySQL, JPA and Hibernate for data storage and retrieval, and Thymeleaf and Boostrap for front-end access and UI. 

## REST Service Endpoints

> The REST service endpoints for the application CRUD operations are as follows:
* GET - list all users `/api/users`
* GET - single user by id `/api/users/{id}`
* POST - register a user `/api/users`
* PUT - update a user info `/api/users/{id}`
* DELETE - remove a registered user `/api/users/{id}`
* GET - users by first name `/api/users/first_name`
* GET - users by last name `/api/users/last_name`
* GET - users by email `/api/users/email`
* GET - users by phone number `/api/users/phone`

## Application launch

> The application can be run locally on a Tomcat Server. It will start running at <http://localhost:8080>.