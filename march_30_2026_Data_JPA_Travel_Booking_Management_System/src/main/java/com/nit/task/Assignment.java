/*Assignment:
===========
Travel Booking Management System (Console-Based Application)
Requirements:
1. Database Configuration:
--------------------------
Configure the database connection in application.properties.
2. Travel Entity Class:
-----------------------
Create a Travel class with the following fields:

id (Long)
destination (String)
transportationMode (String)
price (Double)
Include getters, setters, and constructors.
3. TravelRepository:
--------------------
Define a TravelRepository interface extending CrudRepository for data handling.
4. ITravelService Interface:
----------------------------
Define an ITravelService interface with methods:

void addTravel(Travel travel): Adds a new travel booking.
Iterable<Travel> getAllTravels(): Retrieves all travel bookings.
Optional<Travel> findTravelById(Long id): Finds a travel booking by ID.
void deleteTravelById(Long id): Deletes a travel booking by ID.
boolean existsById(Long id): Checks if a travel booking exists by ID.
long count(): Returns the total number of travel bookings.
void delete(Travel travel): Deletes a specific travel booking object.
void deleteAll(): Deletes all travel bookings.
5. TravelService:
-----------------
Implement TravelService class that implements ITravelService.
Inject TravelRepository and define method implementations.
6. TravelController:
--------------------
Create TravelController with methods:

addTravel(Travel travel): Prompts the user for travel details and saves the booking.
retrieveAllTravels(): Lists all travel bookings.
findTravelById(Long id): Finds and displays a travel booking by its ID.
deleteTravelById(Long id): Deletes a travel booking by ID.
checkIfTravelExists(Long id): Checks if a travel booking exists.
countTravels(): Retrieves the total number of travel bookings.
deleteTravelObject(Travel travel): Deletes a specific travel booking.
deleteAllTravels(): Deletes all travel bookings.
7. TravelApplicationRunner:
----------------------------
Implement TravelApplicationRunner class that implements CommandLineRunner.
In run(), display a menu to the user with options:

1.Add a new travel booking.
2.Retrieve all travel bookings.
3.Find a travel booking by ID.
4.Delete a travel booking by ID.
5.Check if a travel booking exists.
6.Count total travel bookings.
7.Delete a specific travel booking.
8.Delete all travel bookings.
9.Exit.*/