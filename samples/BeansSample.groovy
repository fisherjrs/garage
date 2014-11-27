
/*
 * Groovy beans are java beans, but with simpler syntax.
 * 
 */

class Customer {
	// properties
	Integer id
	String name
	Date dob
}

def firstCustomer = new Customer(id: 1, name:"Bruce Wayne", dob: new Date());
println("Hello ${firstCustomer.name}")

def secondCustomer = new Customer();
secondCustomer.name = "Ryan Seacrest!"
println("Hello ${secondCustomer.name}")