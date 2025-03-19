import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Cire um sistema que permita o usuário digitar vários números inteiros,
        //positivos ou negativos. Ao final, quando o usuário digita o valor -1, o programa deve calcular e
        //exibir:
        //○ A quantidade de números digitados pelo usuário;
        //○ O maior número digitado;
        //○ O menor número digitado;
        //○ A média dos números digitados;



       Calculadora calculadora = new Calculadora();


        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: \n(Digite -1 para finalizar e exibir os resultados)"));
            if (numero == -1) {
                break;
            }

            calculadora.soma += numero;

            calculadora.contador++;

            if (numero > calculadora.maior) {
                calculadora.maior = numero;
            }

            if (numero < calculadora.menor) {
                calculadora.menor = numero;
            }
        }

        if (calculadora.contador > 0) {
            double media = (double) calculadora.soma / calculadora.contador;

            JOptionPane.showMessageDialog(null, "Quantidade de números digitados: " + calculadora.contador + "\nMaior número digitado: " + calculadora.maior + "\nMenor número digitado: " + calculadora.menor + "\nMédia dos números digitados: " + media);
        } else {
            JOptionPane.showMessageDialog(null,"Número inválido. Encerrando o programa.");
        }
    }
}