object forLoopPrac_Until
{
	def main(args: Array[String])
	{
		var a = 0;
		// until 10 means..10 is NOT included up to 9 only
		for( a <- 1 until 10)
		{
			println( "Value of a: " + a );
		}
	}
}