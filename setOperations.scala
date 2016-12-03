object setOperations
{
	def main(args: Array[String])
	{
		val ranks = Set(5,6,20,30,45);
		val ranksnew =Set(1,3,20,2,45,121);

		println("MAX Rank in Ranks : " + ranks.max);
		println("MIN Rank is Ranks : " + ranks.min);

		println( "ranks.intersect(ranksnew) : " + ranks.intersect(ranksnew) );
	}	
}
