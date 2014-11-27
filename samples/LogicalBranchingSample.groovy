
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


def p = 1.23
def result = ""

switch ( p ) {
	case "foo":
		result = "found foo"
		// lets fall through

	case "bar":
		result += "bar"

	case [4, 5, 6, 'inList']:
		result = "list"
		break

	case 12..30:
		result = "range"
		break

	case Integer:
		result = "integer"
		break

	case Number:
		result = "number"
		break

	default:
		result = "default"
}

assert result == "number"
println("result :: ${result}")