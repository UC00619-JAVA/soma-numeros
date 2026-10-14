import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Escreve números para somar (0 para terminar):");
        numero = sc.nextInt();

        while (numero != 0) {
            soma += numero;
            numero = sc.nextInt();
        }

        System.out.println("Soma total: " + soma);
    }
}
