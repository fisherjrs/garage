package garage.samples

/*
 * How do closures work? Why would I use them?
 */
class Class1 {
	def closure = {
		println this.class.name
		println delegate.class.name
		def nestedClos = {
		  println owner.class.name
		}
		nestedClos()
	  }
}

def clos = new Class1().closure
clos.delegate = this
clos()


// square is defined as a chunk of code by the brackets. It can get passed around as if it were a string or an integer.

square = { it * it }

def a1 = 7
println "the square of ${a1} is :: ${square(a1)}"

// that's not real interesting, but I can pass square as an argument to certain functions.
// create an array and square the values
println "${[2, 3, 4, 5]}"
println "${[2, 3, 4, 5].collect()}" //no transform, just returns a copy of the collection
println "${[2, 3, 4, 5].collect(square)}"
