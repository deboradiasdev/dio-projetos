/* Crie um vetor de 6 números inteiros
 * e mostre-os na ordem inversa.
 */
public class Ex1_Arrays_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        
        System.out.println("Vetor: ");

        int contar = 0;

        while(contar < (vetor.length)) {
            System.out.print(vetor[contar] + " ");
            contar++;
        }
        System.out.println("\nVetor: ");

        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }    
}