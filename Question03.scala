object spherevolume{ 

    def calculatespherevolume(radius:Float):Double=
    {
        (4/3)*math.Pi*radius*radius*radius
    }
    
    def main(args: Array[String]):Unit =
    {   
        println("The volume of the sphere with radius=5 :")
        printf("%.2f",calculatespherevolume(5.0))
        
    }
}