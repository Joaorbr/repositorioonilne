package helloworld;

import javax.swing.JOptionPane;

public class Helloworld {

    public static void main(String[] args) {
    int idade;
    String nome;
    
    nome = JOptionPane.showInputDialog(null,"Qual seu nome? \n");
    idade = (Integer.parseInt(JOptionPane.showInputDialog(null,"Qual sua idade? \n")));
    JOptionPane.showMessageDialog(null,"Nome: " + nome + "\n" + "Idade: " + idade);
    }
    
}
