public class Temperature
{
    double kelvin;
    double fahrenheit;
    double celsius;
    
    public Temperature(double kelvin, double fahrenheit, double celsius){
        this.kelvin = kelvin;
        this.fahrenheit = fahrenheit;
        this.celsius = celsius;
    }
    
    public void displayTemperatures(){
        System.out.println("Kelvin: " + kelvin + ", Fahrenheit: " + fahrenheit + ", Celsius: " + celsius);
    }
    
    public void kelvinToCelsius(){
        this.celsius = this.kelvin - 273.15;
    }
    
    public void kelvinToFahrenheit(){
        this.fahrenheit = (this.kelvin - 273.15)  * 9/5 + 32;
    }
    
    public void fahrenheitToCelsius(){
        this.celsius = (this.fahrenheit - 32) * 5/9;
    }
    
    public void fahrenheitToKelvin(){
        this.kelvin = (this.fahrenheit - 32) * 5/9 + 273.15;
    }
    
    public void celsiusToKelvin(){
        this.kelvin = this.celsius + 273.15;
    }
    
    public void celsiusToFahrenheit(){
        this.fahrenheit = (this.celsius * 9/5) + 32;
    }
}
