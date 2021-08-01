

object Feilds {
  def main(args:Array[String]){
    var myVar:Int =10;
    val myVal :String="Hello Scala with datatype declaration .";
    println(myVal);
    val myVal1 =20;
    var myVar1="Hello Scala new without datatype declaration.";
    myVar=30;      //myVar is of variable type var we can change the value
   // myVal1=70;    //myVa1 isl of variable type val we can't change the value
    println("myVal "+ myVal);
    println("myVar1 "+ myVar1);
    println("myVal1 "+ myVal1);
    
  }
}