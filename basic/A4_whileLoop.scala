//while loop

object loop {
  def main(args:Array[String]){
    val msg :String =" welcome to my world"
    var i=0
    while(i<msg.length())              //lenght method for counting length of a string
    {
      println(msg(i))
      i=i+1;                           // scala don't support i++ 
    }
    
 
    
  }
}
