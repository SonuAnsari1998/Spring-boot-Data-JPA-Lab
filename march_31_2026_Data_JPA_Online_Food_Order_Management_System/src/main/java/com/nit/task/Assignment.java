/*Assignment:

============

Online Food Order Management System (Console-Based Application)
Requirements:

1. Database Configuration:

Configure database in application.properties.

2. FoodOrder Entity Class:

Fields:

id (Long)
customerName (String)
foodItem (String)
quantity (Integer)
pricePerItem (Double)
totalAmount (Double) (Derived Field)

💡 Business Logic:
totalAmount = quantity × pricePerItem
If quantity > 5 → Apply 10% discount
If totalAmount > 1000 → Apply additional ₹100 off

Validate:
quantity > 0
price > 0

3. FoodOrderRepository:

Extend CrudRepository<FoodOrder, Long>

4. IFoodOrderService:

🔹 CREATE Operations

save(FoodOrder order)
→ Save single order after applying logic

saveAll(Iterable<FoodOrder> orders)
→ Save multiple orders with discount calculation

🔹 READ Operations
findById(Long id)
→ Return order if exists

findAll()
→ Retrieve all orders

findAllById(Iterable<Long> ids)
→ Fetch multiple orders using list of IDs

existsById(Long id)
→ Check order existence

count()
→ Total number of orders

🔹 DELETE Operations
deleteById(Long id)
→ Delete order by ID (only if exists)

delete(FoodOrder order)
→ Delete specific object

deleteAllById(Iterable<Long> ids)
→ Delete multiple orders using IDs

deleteAll(Iterable<? extends FoodOrder> orders)
→ Delete selected list of orders

deleteAll()
→ Remove all records

5. FoodOrderService (Logic Responsibilities):
Calculate totalAmount
Apply discount rules
Validate input
Check existence before delete
Handle invalid IDs
Bulk operations handling

6. FoodOrderController:

Methods:

addOrder() → Take user input, calculate bill, save
addMultipleOrders() → Bulk insert
viewAllOrders() → Display all
viewOrdersByIds() → Fetch multiple records
findOrderById() → Show single order
checkOrderExists() → Boolean result
countOrders() → Total orders
deleteOrderById() → Delete single
deleteOrdersByIds() → Bulk delete
deleteSpecificOrder() → Delete using object
deleteSelectedOrders() → Delete list
deleteAllOrders() → Clear database

7. ApplicationRunner (Menu):
1. Add Order
2. Add Multiple Orders
3. View All Orders
4. View Orders by IDs
5. Find Order by ID
6. Check Order Exists
7. Count Orders
8. Delete Order by ID
9. Delete Orders by IDs
10. Delete Specific Order
11. Delete Selected Orders
12. Delete All Orders
13. Exit
*/
