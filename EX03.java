import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número que deseja o fatorial:");
        int numero = sc.nextInt(); 
        if (numero < 0) {
            System.out.println("Número inválido! O fatorial não é definido para números negativos.");
        } else {
            int fatorial = calcularFatorial(numero);
            System.out.printf("O fatorial de %d é %d\n", numero, fatorial);
        }
    }

    
    private static int calcularFatorial(int numero) {

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
}
