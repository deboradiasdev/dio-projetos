/*Neste desafio você deverá construir uma função que recebe uma String e identifique se a mesma é um palíndromo,
ou seja, se a String é igual a ela mesma invertida. 

Dado que temos a String "digital" uma vez invertida temos "latigid" que são diferentes. 

Logo, NÃO é um Palíndromo. 

Já se recebemos a string "radar" uma vez invertida temos "radar" que são iguais.*/
import java.util.*;

public class ChecarPalíndromo {

    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        String contrario = "";
        
        System.out.println("Digite uma palavra para verificar se é um palíndromo");
        String nome = ent.nextLine();

        
        for (int i = (nome.length() -1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }
        
        
        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
    }
    
}