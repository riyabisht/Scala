object loop {
  def main(args:Array[String]){
    val msg :String =" welcome to my world"
   
    // foreach loop
    
    
   msg.foreach(m => println(m))          // "msg" is our stirng.'foreach' is a method for msg And "m=>println(m)" is our fxn literal. and "m" is a 'val' variable. 
                                         //it will print each charater seperatly
    
 
    //for loop
    
   for(m<-msg)                           // output is same as above
                                          
      println(m)
    
  }
   // here m is a val variable . we don't need to write val . Although it seems that it'll be of type var because a new value is assigned to the varoable "m".
  //But we can't change the value of val . Hence it'll recreate the varialbe m on each iteration.
}
