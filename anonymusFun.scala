object anonymusFun 
 {
	def main(args: Array[String])
	{
		var incr = (x:Int) => x+1;
		var multy = (a:Int,b:Int) => a*b;

		println(" INCR VALUE : " + incr(6));
		println(" MULTIPLIED VALUE : " + multy(5,6));

		println(" NEW INCR VALUE : " + (incr(6) - 2));
		println(" MULTIPLIED VALUE : " + (multy(5,6) + 20));
	}
}
