object techMatch_casePrg
{
	def main(args: Array[String])
	{
		var technologies = List("Linux","Windows","MacOs", "Eclipse", "NetBeans", "R", "Scala", "Java", "Python")
		for (tech <- technologies) {
			println(tech)
		tech match {
			case "Windows" |"Linux"|"MacOs" => println("Operating System")
			case "Eclipse"|"NetBeans" => println("IDEs for Development")
			case "R"|"Scala"|"Java"|"Python" => println("Programming Languages")
			case _ => println("Not a Techi Group Member")
		}
	}
}
}
