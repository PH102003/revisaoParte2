import java.util.Scanner;
package revisao2;

public class exercicio2 {
    public static int[] array(int[] vetor){
        for(int i = 0; i < vetor.length;i++){

            if(vetor[i]< 2 ){

            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] entrada = new int[10];
        
        //array num conjunto de 3 números
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            entrada[i] = sc.nextInt();
        }
        array(entrada);

        System.out.println("Números ordenados:");
        for(int i = 0; i < 3; i++){
            System.out.print(entrada[i] + " ");

        }
        }   
    }
    

