import java.util.Scanner;

/*Faça um programa que peça N números inteiros,
 *calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.*/
public class Ex_4ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números");
        quantNumeros = scan.nextInt();

        int contar = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            contar++;
        } while(contar < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpares: " + quantImpares);
    }
}
