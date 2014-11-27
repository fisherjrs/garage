
def x = false
def y = false

if ( !x ) {
	println("Is x true ${x}")
	x = true
}

assert x == true

if ( x ) {
	x = false
} else {
	y = true
}

assert x == y