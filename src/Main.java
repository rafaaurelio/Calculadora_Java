import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // lista para calculo
        ArrayList<Double> lista = new ArrayList();
        lista.add(10.0);
        lista.add(2.0);

        // instanciar nosso objeto operador
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        // instanciar nosso objeto calculadora
        CalculadoraBasica calculadora = new CalculadoraBasica();

        // Operação de soma
        calculadora.calcular(soma,lista);
        // Resultado que foi atribuido após a soma
        System.out.println(calculadora.getResultado());

        // Operação de subtração
        calculadora.calcular(subtracao,lista);
        // Resultado que foi atribuido após a subtração
        System.out.println(calculadora.getResultado());

        // Operação de multiplicação
        calculadora.calcular(multiplicacao, lista);
        // Resultado que foi atribuido após a multiplicação
        System.out.println(calculadora.getResultado());

        // Operação de divisão
        calculadora.calcular(divisao, lista);
        // Resultado que foi atribuido após a divisão
        System.out.println(calculadora.getResultado());

        



    }

}