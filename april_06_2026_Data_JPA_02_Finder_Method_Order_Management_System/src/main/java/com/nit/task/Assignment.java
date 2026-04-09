/*Task 2: Order Management System

Objective
Use finder methods for real-time order filtering and reporting.


Entity Class: Order

Fields:

id (Long)
customerName (String)
productName (String)
amount (Double)
orderDate (LocalDate)
status (String) (Placed, Shipped, Delivered)

Repository Interface: OrderRepository

Finder Methods:
findByCustomerName(String name)
findByStatus(String status)
findByAmountGreaterThan(Double amount)
findByAmountBetween(Double min, Double max)
findByOrderDateAfter(LocalDate date)
findByOrderDateBetween(LocalDate start, LocalDate end)
findByStatusAndAmountGreaterThan(String status, Double amount)
findByProductNameContaining(String keyword)
findTop5ByOrderByOrderDateDesc()
findByStatusIn(List<String> statusList)

Service Logic
Get recent orders
Filter high-value orders
Track orders by status
Search orders by product name

Runner Logic
Insert order data
Execute all finder methods
Print reports

Pro Tip (Important)
--------------------
While practicing these tasks, focus on:

Method naming rules (VERY important)
Combining conditions (And, Or)
Sorting (OrderBy)
Limiting results (Top, First)
Collections (In, NotIn)*/
