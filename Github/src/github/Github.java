package github;

import Classes.fun_assalariados;
import Classes.fun_horistas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Github {

    public static void main(String[] args) {
        ArrayList Dados = new ArrayList();
        int opcao = 0, i, cont=0;
        String msg;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite: \n1 para inserir Funcionário assalariado, \n2 para inserir Funcionário horista, \n3 para listar e \n0 para sair"));
            switch (opcao) {
                case 0: {
                    JOptionPane.showMessageDialog(null, "Finalizando");
                }
                break;
                case 1: {
                    fun_assalariados fun_a = new fun_assalariados();
                    fun_a.setNome(JOptionPane.showInputDialog(null, "Nome: "));
                    fun_a.setCpf(JOptionPane.showInputDialog(null, "Cpf: "));
                    fun_a.setEndereco(JOptionPane.showInputDialog(null, "Endereço: "));
                    fun_a.setTelefone(JOptionPane.showInputDialog(null, "Telefone: "));
                    fun_a.setSetor(JOptionPane.showInputDialog(null, "Setor: "));
                    fun_a.setSalario (Integer.parseInt(JOptionPane.showInputDialog(null, "Salário: ")));
                    Dados.add(fun_a);
                    cont = cont;
                }
                break;
                case 2: {
                    fun_horistas fun_h = new fun_horistas();
                    fun_h.setNome(JOptionPane.showInputDialog(null, "Nome: "));
                    fun_h.setCpf(JOptionPane.showInputDialog(null, "Cpf: "));
                    fun_h.setEndereco(JOptionPane.showInputDialog(null, "Endereço: "));
                    fun_h.setTelefone(JOptionPane.showInputDialog(null, "Telefone: "));
                    fun_h.setSetor(JOptionPane.showInputDialog(null, "Setor: "));
                    fun_h.setHoras_trabalhadas (Integer.parseInt(JOptionPane.showInputDialog(null, "Horas de trabalho: ")));
                    fun_h.setValor_hora (Integer.parseInt(JOptionPane.showInputDialog(null, "Valor da hora: ")));
                    Dados.add(fun_h);
                    cont = cont++;
                }
                break;
                case 3: {
                    msg = "Dados armazenados: \n";
                    for (i = 0; i < (Dados.size()); i++) {
                        if ((Dados.get(i)) instanceof fun_assalariados) {
                            fun_assalariados fun_a = new fun_assalariados();
                            fun_a = (fun_assalariados) Dados.get(i);
                            msg = msg + "Nome: " + fun_a.getNome() + "\n";
                            msg = msg + "Cpf: " + fun_a.getCpf() + "\n";
                            msg = msg + "Endereço: " + fun_a.getEndereco() + "\n";
                            msg = msg + "Telefone: " + fun_a.getTelefone() + "\n";
                            msg = msg + "Setor: " + fun_a.getSetor() + "\n";
                            msg = msg + "Salário: " + fun_a.getSalario() + "\n";
                            msg = msg + "\n --------------------------------- \n";
                        }

                        if ((Dados.get(i)) instanceof fun_horistas) {
                            fun_horistas fun_h = new fun_horistas();
                            fun_h = (fun_horistas) Dados.get(i);
                            msg = msg + "Nome: " + fun_h.getNome() + "\n";
                            msg = msg + "Cpf: " + fun_h.getCpf() + "\n";
                            msg = msg + "Endereço: " + fun_h.getEndereco() + "\n";
                            msg = msg + "Telefone: " + fun_h.getTelefone() + "\n";
                            msg = msg + "Setor: " + fun_h.getSetor() + "\n";
                            msg = msg + "Horas trabalhadas: " + fun_h.getHoras_trabalhadas() + "\n";
                            msg = msg + "Valor por hora: " + fun_h.getValor_hora() + "\n";
                            msg = msg + "\n --------------------------------- \n";
                        }

                    }
                    JOptionPane.showMessageDialog(null, msg);
                }
                break;

            }

        } while (opcao != 0);
    }

    
   
}