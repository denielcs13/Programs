object Main {
  
  def output(x: String) : Int = {
    val arr= x.split("\\s+")
    var a = arr(0).trim().toInt
    var b = arr(1).trim().toInt
    if (a==b || a==0 || b==0){
      return (a+b)
    }else if(a==1 || b==1){
      return 2;
    }
    else{
      if(a>b)
        a=a%b
        if(a==0){
        	a=b;
        }
      else
        b=b%a
        if(b==0){
        	b=a;
        }
    }
    var y: String =a + " " + b
    output(y)
  }
    
  
  
  def main(args: Array[String]){
    val a= scala.io.StdIn.readInt()
    for(x <- 1 to a){
      var input= scala.io.StdIn.readLine()
      println(output(input))
    }
  }
}