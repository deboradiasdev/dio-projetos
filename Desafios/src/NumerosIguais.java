import java.util.Scanner;

public class NumerosIguais {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int A;
        int B;

        A = leitor.nextInt();
        B = leitor.nextInt();

        if (A == B) {
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são iguais!");
        }
    }
}
