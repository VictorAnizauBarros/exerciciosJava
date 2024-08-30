import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    
	    System.out.println("Digite a altura (em metros):"); 
	    double altura = sc.nextDouble(); 
	    System.out.println("Digite a base (em metros):"); 
	    double base = sc.nextDouble();
	    
	    double area = calcularArea(base,altura); 
	    System.out.println("A área do retângulo (em metros quadrados):" + area); 
	}
	
	private static double calcularArea(double base, double altura){
	    double area = base * altura; 
	    return area; 
	}
}
