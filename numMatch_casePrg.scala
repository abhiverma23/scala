object numMatch_casePrg
{
	def main(args: Array[String]){
		println(matchNum(3))
	}
	def matchNum(x: Int): String = x match
	{
		case 1 => "one"
		case 2 => "two"
		case _ => "Anything..Not a Number"
	}
}