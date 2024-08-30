import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
	    
	    System.out.println("Digite um número qualquer:");
	    int numero = sc.nextInt();
	    boolean numeroPar = numeroEhPar(numero); 
	    
	    System.out.println("O número é par? " + numeroPar); 
 
	}
	
	private static boolean numeroEhPar(int numero){
        return numero % 2 == 0; 
	}
}
