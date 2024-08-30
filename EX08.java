import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite seu peso (em KG): "); 
		double peso = sc.nextDouble(); 
		System.out.println("Digite sua altura (em metros): "); 
		double altura = sc.nextDouble();
		
		double imc = calculaIMC(peso,altura); 
		System.out.println("O seu imc é: " + imc); 

		
	}
	private static double calculaIMC(double peso, double altura){
	    double imc = peso / (altura * altura);
	    return imc; 
	}
}