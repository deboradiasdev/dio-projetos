import java.util.Scanner;

/*Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números.
 */
public class Ex3_MaiorEMedia {
/**
 * @param args
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero;
    int contar = 0;
    int maior = 0;
    int soma = 0;

    do {
       System.out.println("Número: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if (numero > maior) maior = numero;

        contar = contar + 1;
    } while(contar < 5);

    System.out.println("Maior: " + maior);
    System.out.println("Média: " + soma / 5);
   } 
}
