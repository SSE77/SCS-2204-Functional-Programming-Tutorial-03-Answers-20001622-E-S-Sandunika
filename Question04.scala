object copycost{

    var coverprice:Float=24.95
    var shippingcost1:Float=3.00
    var shippingcost2:Float=0.75
    var fistcopiesset:Int=50

    def calculatecoverprice(numberofcopies:Int):Double=
    {
        24.95*numberofcopies
    }    

    def calculatetdiscount(numberofcopies:Int):Double=
    {
        24.95*numberofcopies*0.4
    }

    def calculateshippingcost(numberofcopies:Int):Double=
    {   
        50*3.00+(numberofcopies-50)*0.75
    } 

    def main(args: Array[String]):Unit =
    {   
        printf("The total cost of 60 copies:")
        printf("Rs.%.2f",((calculatecoverprice(60)+calculateshippingcost(60))-calculatetdiscount(60)))
    }
}