package com.qa.testingMongoDBSpring;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingMongoDBSpringApplication{
	
//	@Autowired
//	private DBObjectRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(TestingMongoDBSpringApplication.class, args);
	}
	
//	public void run(String... args) throws Exception{
//		repository.deleteAll();
//
//		// save a couple of customers
//		repository.save(new DBObject("Alice", "Smith"));
//		repository.save(new DBObject("Bob", "Smith"));
//
//		// fetch all customers
//		System.out.println("Customers found with findAll():");
//		System.out.println("-------------------------------");
//		for (DBObject customer : repository.findAll()) {
//			System.out.println(customer);
//		}
//		System.out.println();
//
//		// fetch an individual customer
//		System.out.println("Customer found with findByFirstName('Alice'):");
//		System.out.println("--------------------------------");
//		System.out.println(repository.findByFirstName("Alice"));
//
//		System.out.println("Customers found with findByLastName('Smith'):");
//		System.out.println("--------------------------------");
//		for (DBObject customer : repository.findByLastName("Smith")) {
//			System.out.println(customer);
//		}
//
//	}
}
