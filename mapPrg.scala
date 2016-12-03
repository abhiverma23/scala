object mapPrg
{
	def main(args: Array[String])
	{
		val natureOfTech = Map("Hadoop" -> "BIGDATA",
								"Spark" -> "IN-MEMORY",
								"IoT" -> "AI");
		println( "Keys in natureOfTech : " + natureOfTech.keys)
		println( "Values in natureOfTech : " + natureOfTech.values)  
	}
}