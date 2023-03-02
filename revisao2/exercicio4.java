package revisao2;

import java.util.Scanner;

public class exercicio4 {
    public static void numeroPrimo(int numeroMaximo, int numeroMinimo) {
        for (int numero = numeroMinimo; numero < numeroMaximo; numero++) {
            if (numero > 1) { // 1 não é considerado primo
                boolean primo = true;
                for (int i = 2; i < numero; i++) { // i = 2 porque o número 1 não é considerado primo e também porque qualquer número dividido por 1 é igual a ele mesmo.



                    if (numero % i == 0) {
                        primo = false;
                    }

                }
                if (primo) {
                    System.out.println(numero);
                    break;
                }
                
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o menor número: ");
        int menor = sc.nextInt();
        System.out.println("Escolha o maior número:");
        int maior = sc.nextInt();
        if(maior < menor){
            System.out.println("ERRO!");
            System.exit(0);
        }
        numeroPrimo(maior, menor);
    }
}
