object setPrg  {
	def main(args: Array[String])
	{
		val technologies = Set("Spark", "Scala", "Python")
		val rank: Set[Int] =  Set()
		println( "Head of Technologies : " + technologies.head)
		println( "Tail of Technologies : " + technologies.tail)
		println( " IS Technology empty? : " + technologies.isEmpty )
		println( " IS Rank empty? : " + rank.isEmpty)
	}
	
}
