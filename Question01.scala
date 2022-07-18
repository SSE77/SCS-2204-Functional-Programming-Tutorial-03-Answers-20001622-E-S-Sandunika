object diskarea{ 

    def calculateDiskArea(radius:Float):Double=
    {
        math.Pi*radius*radius
    }
    
    def main(args: Array[String]):Unit =
    {   
        printf("The area of the disk:%.2f\n",calculateDiskArea(7.5))
        printf("The area of the disk:%.2f\n",calculateDiskArea(56.5))
        printf("The area of the disk:%.2f\n",calculateDiskArea(10.0))
        printf("The area of the disk:%.2f\n",calculateDiskArea(24.56))
    }
}