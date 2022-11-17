import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {
        int A;
        int N;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        do {
            
            A = input.nextInt();
            N = input.nextInt();
            
            for(int i = 0; i <= N; i++) {
                if(i % A == 0)
                soma = soma + i;
            }
            System.out.println(soma);
        }while (A == 0);
    }
}
