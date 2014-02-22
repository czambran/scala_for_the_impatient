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
	val array_with_swapped_values = for (i <- 0 until original_array.length) 
	  yield (
	      if (i == original_array.length - 1)
	        original_array(i)
	      else if (i % 2 == 0)
	        original_array(i+1)
	      else
	        original_array(i-1)
	      )
	
	println(array_with_swapped_values.toArray.mkString(","))
	println()
	
	println("Exercise 3.4")
	import collection.mutable.ArrayBuffer
	val exercise_3_4_original_array = Array(2,3,4,0,-2,4,8,0,10,-1)
	val sorted_array_buffer = new ArrayBuffer[Int]()
	// Expected output (2,3,4,4,8,10, 0,-2,0,-1)
	var positive_values = new ArrayBuffer[Int]()
	var zero_and_negative_values = new ArrayBuffer[Int]()
	for (i <- 0 until exercise_3_4_original_array.length) {
		if (exercise_3_4_original_array(i) > 0)
		  positive_values += exercise_3_4_original_array(i)
		else
		  zero_and_negative_values += exercise_3_4_original_array(i)
	}
	sorted_array_buffer ++= positive_values
	sorted_array_buffer ++= zero_and_negative_values
	println(sorted_array_buffer.toArray.mkString(","))
	println()
	
	println("Exercises 3.5")
	// Array and ArrayBuffers have the sum method
	val array_of_doubles = Array(2.0, 3.0, 4.0)
	// Average of value above is 3 (9.0 / 3)
	println(array_of_doubles.sum / array_of_doubles.length)
	println()
	
	
}
