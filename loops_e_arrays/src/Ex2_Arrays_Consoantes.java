import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres,
 * e diga quantas consoantes foram lidas.
 * Imprima as consoantes.*/
public class Ex2_Arrays_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int contar = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                    consoantes[contar] = letra;
                    quantidadeConsoantes++;
                }

                contar++;

        } while(contar < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
    }
}
