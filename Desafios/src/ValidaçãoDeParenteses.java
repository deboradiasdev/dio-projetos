import java.util.Scanner;

/*Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']'
 *determine se uma determinada string é válida.
 *
 * Uma string é considerada válida se: Caracteres de abertura devem ser fechadas pelo mesmo tipo.
 *Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 
 */
public class ValidaçãoDeParenteses {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.

        String parentese = "()";
        String chaves = "{}";
        String colchete = "[]";
        String vazio = "";

        if(s.equals(parentese)) {
            return true;
        } else if(s.equals(chaves)) {
            return true;
        } else if(s.equals(colchete)) {
            return true;
        } else if(s.equals(vazio)) {
            return true;
        } else {
            return false;
        }
        
    }
}


