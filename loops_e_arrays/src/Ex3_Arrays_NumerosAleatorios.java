import java.util.Random;

/*Faça um programa que leia números inteiros aleatórios (entre 0 e 100),
 * armazene-os em um vetor.
 * Ao final mostre os números e seus sucessores.*/
public class Ex3_Arrays_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
           System.out.println(numero + " "); 
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
           System.out.println(numero+1 + " "); 
        }
    }
}
