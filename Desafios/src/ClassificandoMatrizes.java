/*Dado um array inteiro nums, mova todos os inteiros pares no início
do array seguido por todos os inteiros ímpares. 
Retorne um array que satisfaça essa condição.

A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array.
As linhas seguintes deverão conter os valores que esse array receberá.

A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares.*/ 
import java.util.*;
import java.util.Scanner;
import static java.lang.System.*;

public class ClassificandoMatrizes {

    public static void main(String args[]) {

        //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares

        // Criando o objeto scanner:
        Scanner scanner = new Scanner(in);

        out.println("Digite o tamanho do Array:");
        int tamanhoArray = scanner.nextInt();
        int [] nums = new int[tamanhoArray];
        int primeiroDoIndex = 0;

        out.println("Digite os números do Array: ");
        // Gerando o array inicial:
        for (int i = 0; i < tamanhoArray; i++) nums[i] = scanner.nextInt();

        // Estrutura de Repetição que ordena o array:
        for(int i = 0; i < tamanhoArray; i++) {
            if(nums[i] % 2 == 0) {
                int varAuxiliar = nums[primeiroDoIndex];
                nums[primeiroDoIndex] = nums[i];
                nums[i] = varAuxiliar;
                primeiroDoIndex++;
            }
        }

        // Resultado:
        for(int numero : nums) out.println(numero);
    }
}