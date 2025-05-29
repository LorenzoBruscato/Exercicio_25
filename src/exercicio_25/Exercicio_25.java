package exercicio_25;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_25 {

    public static void main(String[] args) {
        int[] numeros = new int[20];
        int soma = 0;

        for (int i = 0; i < 20; i++) {
            String entrada = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número inteiro:");
            numeros[i] = Integer.parseInt(entrada);
            soma += numeros[i];
        }

        double media = soma / 20.0;

        JOptionPane.showMessageDialog(null, "A soma dos números é: " + soma
                + "\nA média dos números é: " + String.format("%.2f", media));
    }
}
