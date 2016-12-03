object casePrg
{
	def main(args: Array[String])
{
		var days = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
		for( day <- days) {
			println(day)

		day match
		{
			case "Mon" => println("First Day of the Week")
			case "Tue" => println("Second Day of the Week")
			case "Wed" => println("Third Day of the Week")
			case "Thu" => println("Fourth Day of the Week")
			case "Fri" => println("Fifth Day of the Week")
			case "Sat" => println("Sixth Day of the Week")
			case "Sun" => println("Seventh Day of the Week")
			case _ => println("Not a Day...")
		}
	}
}
}
