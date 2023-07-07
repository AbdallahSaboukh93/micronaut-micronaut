# Microservice Project with Micronaut

This repository contains a microservice project developed using Micronaut. It consists of two services: the User Service and the User Preferences Service, which communicate with each other.

## Project Overview

The microservice project aims to provide functionality related to user management and user preferences. It includes the following components:

### User Service

The User Service handles user-related operations such as user registration, authentication, and profile management. It exposes the following endpoints:

- `POST /api/users`: Create a new user.
- `GET /api/users`: Retrieve a list of all users.
- `GET /api/users/{id}`: Retrieve user details by ID.
- `PUT /api/users/{id}`: Update user details by ID.
- `DELETE /api/users/{id}`: Delete a user by ID.

### User Preferences Service

The User Preferences Service manages user preferences and settings. It communicates with the User Service to retrieve user preferences based on the user's ID. It provides the following endpoint:

- `GET /api/user-preferences/{userId}`: Retrieve user preferences by user ID.

## Installation

To set up the microservice project locally, follow these steps:

1. Clone the repository:

   ```bash
   git clone <repository_url>


API Documentation

Start the User Service:
The microservice project provides the following API endpoints:

User Service API:

POST /api/users: Create a new user.
GET /api/users: Retrieve a list of all users.
GET /api/users/{id}: Retrieve user details by ID.
PUT /api/users/{id}: Update user details by ID.
DELETE /api/users/{id}: Delete a user by ID.
User Preferences Service API:

GET /api/user-preferences/{userId}: Retrieve user preferences by user ID.
For detailed information about the endpoints and request/response payloads, please refer to the API documentation provided by each service.
