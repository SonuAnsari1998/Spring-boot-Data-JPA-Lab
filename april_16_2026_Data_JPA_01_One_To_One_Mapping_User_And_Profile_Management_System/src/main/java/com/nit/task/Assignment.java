/*Ques 01 — User & Profile Management System (One-to-One Mapping)

Project Overview
----------------
Develop a Spring Boot application to manage user details where each user has exactly one profile 
using One-to-One mapping.

Entities
--------
User
----
id (Long)
name (String)
email (String)
profile (One-to-One)

Profile
--------
id (Long)
phone (String)
address (String)

Relationship
------------
One User → One Profile
One Profile → Belongs to One User

Repository Layer
----------------
1.UserRepository

Save user with profile
Find user by id
Delete user

2.ProfileRepository

Optional (if needed separately)

Service Layer
-------------

1.UserService

Add user with profile
Get user details along with profile
Update user/profile
Delete user

Controller Layer
----------------

1.UserController

Add user + profile
View user details
Update user + profile
Delete user

System Description
-------------------
The application stores user information along with their profile details. 
When a user is created, the profile is also created and linked using One-to-One mapping.

Real-Time Scenario
-------------------
Used in social media / job portals where each user has one profile containing personal details.

Expected Output
---------------
Display user details along with profile information*/