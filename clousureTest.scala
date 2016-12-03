object clousureTest 
 {
def main(arg:Array[String]) 
 {
println("gopalfun(1) value = " + gopalfun(1));
println("gopalfun(2) value = " + gopalfun(2)); 
	}
		var refVar = 5
	val gopalfun = (i:Int) => i * refVar
}
