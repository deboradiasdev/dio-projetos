package Metodos;

/*Crie uma aplicação que resolva as seguintes situações:
 * ° Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
 * Sempre 2 valores devem ser passados.
 * ° A partir da hora do dia, informe a mensagem adequada:
 * Bom dia, Boa tarde ou Boa noite.
 * ° Calcule o valor final de um empréstimo, a partir do valor solicitado.
 * Taxas e parcelas influenciam. Defina arbitrariamente as faixas que infuenciam
 * nos valores.*/
public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma (3, 6);
        Calculadora.subtracao (9, 1.8);
        Calculadora.multiplicacao (7, 8);
        Calculadora.divisao (5, 2.5);
        
        //Mensagem
        System.out.println("\nExercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("\nExercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Sobrecarga
        System.out.println("\nExercício sobrecarga");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(8, 7, 9);
        Quadrilatero.area(5f, 5f);

        //Retornos
        System.out.println("\nExercício retorno");

        double areaQuadrado = QuadrilateroComReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroComReturn.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroComReturn.area(8,7, 9);
    System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
