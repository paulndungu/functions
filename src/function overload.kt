fun overload(n1:Int,n2:Int):Int{

    return n1+n2
}
fun overload(n1:Int,n2:Int,n3:Int):Int{

    return n1+n2+n3
}
fun overload(n1:Int,n2:Int,n3:Int,n4:Int):Int{

    return n1+n2+n3+n4
}
fun overload(n1:Int,n2:Int,n3:Int,n4:Int,n5:Int):Int{

    return n1+n2+n3+n4+n5
}
fun main(){

    var overloadsum=overload(10,n2 = 20)
    println("Sum: "+overloadsum)

    overloadsum=overload(10,20,30)
    println("sum2: "+overloadsum)
    overloadsum=overload(10,20,30,40)
    println("sum3: "+overloadsum)
    overloadsum=overload(10,20,30,40,50)
    println("sum4: "+overloadsum)
}