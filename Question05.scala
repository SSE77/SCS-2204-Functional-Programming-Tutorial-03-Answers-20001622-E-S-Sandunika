object taketime{

    var easypace:Int=8
    var tempo:Int=7

    def easypacetime(easypacedistance:Float):Double=
    {
        2*easypacedistance/8
    } 

    def tempotime(tempodistance:Float):Double=
    {
        tempodistance/7
    }  

    def main(args: Array[String]):Unit=
    {
        printf("The total time to go home:%.2f minutes\n",(easypacetime(2.0)+tempotime(3.0))) 
        printf("The total time to go home:%.2f seconds",((easypacetime(2.0)+tempotime(3.0))*60)) 

    }
}