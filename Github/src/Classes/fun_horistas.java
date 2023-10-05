package Classes;

public class fun_horistas extends funcionario {
int horas_trabalhadas;
int valor_hora;

    public int getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public int getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(int valor_hora) {
        this.valor_hora = valor_hora;
    }

    public fun_horistas(int horas_trabalhadas, int valor_hora, String nome, String cpf, String endereco, String telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_hora = valor_hora;
    }

    public fun_horistas(int horas_trabalhadas, int valor_hora) {
        this.horas_trabalhadas = horas_trabalhadas;
        this.valor_hora = valor_hora;
    }

public fun_horistas(){
}

}
