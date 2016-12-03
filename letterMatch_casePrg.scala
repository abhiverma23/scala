object letterMatch_casePrg
{
	def main(args: Array[String]){
		for( x <- 0 to 15) {
		  	println(x)
		x match {
			case x if x % 2 == 0 => println("Number is Even")
			case x if x % 2 == 1 => println("Number is Odd")
			case _				 => println("Not An EvenOdd Number")
		}
	}
}}