package desafio5questao3;

import javax.swing.JOptionPane;

 /**
 * @author Jeferson Leon
 */
public class Desafio5Questao3 {

    /**
    Faça um programa que leia uma série não determinada de dois valores. O 
    * primeiro valor é um código que significa: (1) débito, (2) crédito e (0)
    * fim. O segundo valor é uma quantia numérica real. O programa deve 
    * identificar o código e se for 1, somar a quantia em um acumulador de
    * débitos; se for 2, somar a quantia em um acumulador de créditos; se for 0,
    * encerrar o programa. Ao final, mostre o total de débitos e créditos e o
    * saldo (saldo  créditos – débitos).     
    */
    public static void main(String[] args) {
        int cod;
        double valor, acDebito, acCredito;
        acDebito = 0; acCredito=0; cod=1;
        
        while(cod != 0){
            cod = Integer.parseInt(JOptionPane.showInputDialog("(1) débito, "
                    + "(2) crédito e (0) fim"));
            if(cod == 1 || cod == 2){
                valor = Double.parseDouble(JOptionPane.
                        showInputDialog("Informe o valor:"));
                if(cod == 1){
                    acDebito = acDebito + valor;
                    JOptionPane.showMessageDialog(null, "Valor debitado R$ "+valor);
                }else{
                    acCredito = acCredito + valor;
                    JOptionPane.showMessageDialog(null, "Valor creditado R$ "+valor);
                }//fim do if interno
            }else if(cod==0){
                JOptionPane.showMessageDialog(null, "Fim do programa!!");
            }else{
                JOptionPane.showMessageDialog(null, "Codigo inválido");
            } //fim do if principal
        }//fim do loop
        JOptionPane.showMessageDialog(null,"       Extrato Final\n--------------------------------\n"
                + "Créditos R$ "+acCredito 
                + "\nDébitos R$ "+acDebito +"\n--------------------------------\n"
                        + "Saldo Final R$ "+(acCredito-acDebito));
    }
    
}
