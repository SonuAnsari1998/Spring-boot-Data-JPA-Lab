package com.nit.runner;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.descriptor.java.LocalDateTimeJavaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Product;
import com.nit.service.ProductService;

import jakarta.persistence.Column;
import jakarta.persistence.Version;

@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	ProductService productService;

	@Override
	public void run(String... args) throws Exception {
		IO.println("==============================================\n");
		IO.println("=====Inventory_Management_System==============\n");
		IO.println("==============================================\n");
		IO.println("1. Add Product\r\n"
				+ "2. View Products\r\n"
				+ "3. Update Price\r\n"
				+ "4. Purchase Product\r\n"
				+ "5. Bulk Update Price\r\n"
				+ "6. Delete Product");
		int choice = Integer.parseInt(IO.readln("Enter Your Choice"));
		switch(choice) {
		case 1->{
			Long id = Long.parseLong(IO.readln("Enter Product id"));
			String name = IO.readln("Enter Product Name");
			double price = Double.parseDouble(IO.readln("Enter Product price"));
			int quantity = Integer.parseInt(IO.readln("Enter Product quantity"));
			Product product = new Product();
			product.setId(id);
			product.setName(name);
			product.setPrice(price);
			product.setQuantity(quantity);
			productService.addProduct(product);
		}
		case 2->{
			List<Product> viewAllProducts = productService.viewAllProducts();
			viewAllProducts.forEach(IO::println);
		}
		case 3->{
			Long id = Long.parseLong(IO.readln("Enter Product id want to update"));
			double newprice = Double.parseDouble(IO.readln("Enter Product new price"));
			productService.updateProductPrice(id, newprice);
			
		}
		case 4->{
			Long id = Long.parseLong(IO.readln("Enter Product id want to purches"));
			int qty = Integer.parseInt(IO.readln("Enter Product quantity"));
			productService.purchaseProduct(id, qty);
		}
		case 5->{
			productService.bulkUpdatePrice();
		}
		case 6->{
			Long id = Long.parseLong(IO.readln("Enter Product id want to delete"));
			productService.deleteProduct(id);
		}
		
		default -> System.err.println("Invalid choice");
		}
	}

}
