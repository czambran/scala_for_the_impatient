object Chapter3 extends App {
	def integerArrayGenerator(n: Int) = {
	  var random_numbers = for (i <- 0 until n) yield util.Random.nextInt(n)
	  random_numbers
	}
	
	println("Exercise 3.1")
	print("Please type an integer ")
	val numberOfElementsToGenerate = readInt
	println(integerArrayGenerator(numberOfElementsToGenerate))
	println()
	
	
	println("Exercise 3.2")
	val original_array = Array(1,2,3,4,5)
	val modified_array_buffer = original_array.toBuffer
	for (i <- 1 until (original_array.length, 2)) {
	  modified_array_buffer(i-1) = original_array(i)
	  modified_array_buffer(i) = original_array(i-1)
	}
	println(modified_array_buffer.toArray.mkString(","))
	println()
	
	
	println("Exercise 3.3")
	
	
}
