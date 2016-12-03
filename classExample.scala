class sample(val x:Int , val y:Int)
{
	var a = x;
	var b = y;

	def sum(xx:Int,yy:Int)
	{
		a = a + xx;
		b = b + yy;

		println("A Value:" + a);
		println("B Value:" + b);
	}
}

object classExample
{
	def main(args: Array[String])
	{
		val s = new sample(10, 20);
		s.sum(10, 10);
	}
}