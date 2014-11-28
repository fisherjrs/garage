
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


def s = 5
def t = (s > 1) ? "worked" : "failed"
assert t == "worked"
println("did it work ${t}")


def p = 'foo'
def result = ""

switch ( p ) {
	case "foo":
		result = "found foo"
		println("result :: ${result}")
		// lets fall through
	case ["corn", "foo", "grass", 'inList']:
		result += " and found foo in list"
	case "bar":
		result += "bar"
		println("result :: ${result}")

	case [4, 5, 6, 'inList']:
		result = "list"
		println("result :: ${result}")
		break

	case 12..30:
		result = "range"
		println("result :: ${result}")
		break

	case Integer:
		result = "integer"
		println("result :: ${result}")
		break

	case Number:
		result = "number"
		println("result :: ${result}")
		break

	default:
		result = "default"
		println("result :: ${result}")
}

assert result == "number"
println("result :: ${result}")

h = 3
if ( [2,3,4,5, 'inList']) {
	println('found in list')
}

d = "fred"

if(['fred', 'tom', 'shelly', 'inList']) {
	println('found in list of strings.')
}
