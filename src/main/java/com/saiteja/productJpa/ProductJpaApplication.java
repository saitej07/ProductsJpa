package com.saiteja.productJpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ProductJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProductJpaApplication.class, args);

       ProductService service = context.getBean(ProductService.class);
       
       List<Product> products = service.getAllProduct();
		for(Product p : products)
		{
			System.out.println(p);
		}
       
    }

}
