/*Task:Inventory_Management_System with Versioning, Timestamping & Transaction Management

Project Structure
com.app.inventory
│
├── entity
│     └── Product.java
│
├── repository
│     └── ProductRepository.java
│
├── service
│     └── ProductService.java
│
├── runner
│     └── AppRunner.java
│
└── exception
      └── InsufficientStockException.java
1️.Entity Class – Product

Responsibilities:
-----------------
Map to database table
Maintain version (for concurrency)
Maintain timestamps automatically

Requirements:
------------
Fields:
id
name
price
quantity
version → use @Version
createdAt → use @CreationTimestamp
updatedAt → use @UpdateTimestamp

2️.Repository Layer – ProductRepository extends JpaRepository<Product, Long>

Methods:
Find by name
Find products with quantity less than given value
Find products between price range

3.Service Layer – ProductService

@Service
@Transactional (IMPORTANT)

Methods to Implement
1. addProduct()

Save product
createdAt auto-generated

2. viewAllProducts()

Fetch all products

3. updateProductPrice(id, newPrice)
Fetch product
Update price
Save product
updatedAt auto-updated
Version will increment automatically

4. purchaseProduct(id, qty)
Fetch product
Check:
if qty > available → throw exception
Deduct quantity
Save product

Must:
Use @Transactional
Ensure rollback if exception occurs

5. bulkUpdatePrice()

Logic:

Increase all product prices by 10%

6. deleteProduct(id)
InsufficientStockException

Thrown when:

Requested quantity > available quantity

5️. Runner Class – AppRunner

Use:

CommandLineRunner
📌 Sample Flow (Menu Simulation)
1. Add Product
2. View Products
3. Update Price
4. Purchase Product
5. Bulk Update Price
6. Delete Product


SAMPLE OUTPUT
-------------
Adding Products
Product Added Successfully!
ID: 1 | Name: Laptop | Price: 50000 | Qty: 10
CreatedAt: 2026-04-10 10:30:21
Version: 0

Product Added Successfully!
ID: 2 | Name: Mobile | Price: 20000 | Qty: 5
CreatedAt: 2026-04-10 10:31:10
Version: 0

View All Products
---- Product List ----

ID: 1 | Laptop | Price: 50000 | Qty: 10 | Version: 0
CreatedAt: 2026-04-10 10:30:21
UpdatedAt: 2026-04-10 10:30:21

ID: 2 | Mobile | Price: 20000 | Qty: 5 | Version: 0
CreatedAt: 2026-04-10 10:31:10
UpdatedAt: 2026-04-10 10:31:10

Update Product Price
Updating Product ID: 1

Old Price: 50000
New Price: 55000

Updated Successfully!
Version Updated: 1
UpdatedAt: 2026-04-10 10:35:00
*/
