import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o 1° número:"); 
		double n1 = sc.nextDouble(); 
		System.out.println("Digite o 2° número:"); 
		double n2 = sc.nextDouble();
		
		double maior = qualEhOMaior(n1,n2); 
		System.out.println("O maior número entre os digitados é:" + maior);
	}
	
	private static double qualEhOMaior(double n1, double n2){
	    double maior = Math.max(n1,n2); 
	    return maior; 
	}
}
