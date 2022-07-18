object getfahrenheit{ 

    def calculateFahrenheit(celciusvalue: Double):Double=
    {
        celciusvalue * 1.8000 + 32.00
    }
    
    def main(args: Array[String]):Unit =
    {   
        printf("The Fahrenheit value:%.2f\n",calculateFahrenheit(17.5))
        printf("The Fahrenheit value:%.2f\n",calculateFahrenheit(-57.5))
        printf("The Fahrenheit value:%.2f\n",calculateFahrenheit(-40.0))
        printf("The Fahrenheit value:%.2f\n",calculateFahrenheit(-45.56))
        printf("The Fahrenheit value:%.2f\n",calculateFahrenheit(24.56))
    }
}