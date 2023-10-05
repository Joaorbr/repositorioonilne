package Classes;

public class fun_assalariados extends funcionario {
    int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public fun_assalariados(int salario, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salario = salario;
    }

    public fun_assalariados(int salario) {
        this.salario = salario;
    }
    
    public fun_assalariados(){
    }
}
