import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva algo:"); 
		String frase = sc.next();
		
		String invertida = inverterString(frase); 
		
		System.out.println("Original:" + frase);
		System.out.println("Invertida:" + invertida);
	}
	
	private static String inverterString(String frase){
	    StringBuilder sb = new StringBuilder(frase);
	    return sb.reverse().toString();
	}
}
