/*Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n.
Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras,
é o produto de algum inteiro consigo mesmo.
Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

A entrada consiste em um número inteiro n, representando o valor total.

A saída consiste em retornar o menor número de números quadrados perfeitos.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class QuadradoPerfeito {

    public static boolean verificaQuadradoPerfeito(int valor) {
        double raizQuadrada = Math.sqrt(valor);
        return ((int) raizQuadrada == raizQuadrada);
    }
    public static void main(String args[]) {

        //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.

        // Criando o objeto scanner:
        Scanner scanner = new Scanner(in);


        // Lista que irá armazenar os quadrados perfeitos encontrados:
        List<Integer> quadradosPerfeitos = new ArrayList<>();


        // Entrada do usuário:
        int entradaUsuario = scanner.nextInt();


        // Verificador de quadrados perfeitos:
        for (int i = 1; i < entradaUsuario; i++) {
            if (verificaQuadradoPerfeito(i)) quadradosPerfeitos.add(0, i);
        }

        int sizeLista = quadradosPerfeitos.size();
        int resultado = entradaUsuario;

        for (int i = 0; i < sizeLista; i++) {

            int varAuxiliar = entradaUsuario;
            int contAuxiliar = 0;

            for (int x = i; x < sizeLista; x++) {
                while((varAuxiliar - quadradosPerfeitos.get(x)) >= 0){
                    varAuxiliar -= quadradosPerfeitos.get(x);
                    contAuxiliar ++;
                }
            }

            if (contAuxiliar < resultado) resultado = contAuxiliar;
        }

        // Resultado:
         System.out.println(resultado);
    }
}