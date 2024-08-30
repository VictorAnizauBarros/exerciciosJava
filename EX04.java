import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Graus Celsius(°C):"); 
		double celsius = sc.nextDouble();
		
		double fahrenheit = calcularFahrenheit(celsius); 
		System.out.println("Graus em Farenheit: " + fahrenheit + "°F"); 
	}
	
	private static double calcularFahrenheit(double celsius){
	    double fahrenheit = (celsius * 9/5) + 32; 
	    return fahrenheit; 
	}
}
