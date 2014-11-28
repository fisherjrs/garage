
/*
 * If else blocks and try catch blocks can return a value if they are the last code block of a method or closure.
 */

def method(bool) {
	try {
		if (bool) throw new Exception("foo")
		1
	} catch(e) {
		2
	} finally {
		3
	}
}

println method(false)
println method(true)
assert method(false) == 1
assert method(true) == 2



def method() {
	if (true) 1 else 0
}

println method()
assert method() == 1