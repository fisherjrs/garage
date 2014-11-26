package garage.loops

def list1 = ["abc", "xyz", "Platypus"]

list1.eachWithIndex { item, index ->
	println item
	println index
}