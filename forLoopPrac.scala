object forLoopPrac
{
	def main(args: Array[String])
	{
		var a = 0; //
		//for loop execution with a range , "<-" is a generator operator 
		for( a <- 1 to 10)
		{
			println( "Value of a: " + a );
		}
	}
}