

def interleave1(String a, String b) {
	int maxlength = [a.size(), b.size()].max()
	def sb = new StringBuffer()
	(0..<maxlength).each{
		if (it < a.size()) sb << a[it]
		if (it < b.size()) sb << b[it]
	}
	sb
}

println interleave1('Grain', 'Harvest') 
// => HWeolrllod!
//println interleave1(null, 'World!')
// => NullPointerException (somewhere within the method call)


def interleave2(String a, String b) {
	assert a != null, 'First parameter must not be null'
	assert b != null, 'Second parameter must not be null'
	int maxlength = [a.size(), b.size()].max()
	def sb = new StringBuffer()
	(0..<maxlength).each{
		if (it < a.size()) sb << a[it]
		if (it < b.size()) sb << b[it]
	}
	sb
}

println interleave2('Hello', 'World!')
// => HWeolrllod!
println interleave2(null, 'World!')
// => AssertionError: First parameter must not be null.