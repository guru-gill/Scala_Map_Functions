object Main_object {
  def main(args: Array[String]){
val data=new Maps()
    var months: List[String] = List("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    println(data.toUpperCase(months))
    println("Get Substring "+ data.toUpperCase(months).map(x=>x.substring(0,3)))
    val phone=new Phone("Apple",List("Iphone X","Iphone 11"))
    val google =new Phone("Google",List("Pixel 2 XL","Pixel "))
    val phonelist =List(phone,google)
    println(phonelist.map(x=>x.models))
    println(phonelist.flatMap(x=>x.models))
   
  }
}
