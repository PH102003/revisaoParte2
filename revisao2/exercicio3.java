package revisao2;

import java.util.Scanner;

public class exercicio3 {
    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número: ");
        int outroNumero = sc.nextInt();
        if (numeroPrimo(outroNumero)) {
            System.out.println("O número " + (outroNumero) + " é primo.");
        } else {
            System.out.println("O número " + (outroNumero) + " não é primo.");
        }

        sc.close();
    }
    }


        
    
