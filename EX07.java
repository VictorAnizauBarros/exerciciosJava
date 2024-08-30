import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String frase = "ovo"; 
		boolean EhPalindromo = ehPalindromo(frase);
		System.out.println(EhPalindromo);
		
	}
	private static boolean ehPalindromo(String frase){
	    StringBuilder sb = new StringBuilder(frase); 
	    String invertido = sb.reverse().toString();
	    
	    return frase.equals(invertido);
	}
}
