package ProjetoSemana7;

public class Empregado {

    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado() {
        this.nome = " ";
        this.sobrenome = " ";
        this.salario = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;

    }

    public void setSalario(double salario) {
    this.salario = salario;
        if (salario<0){
    this.salario = 0;
    } else {
    this.salario = salario;
    }
    }
    public double getSalario() {
        return salario;
    }
    public double calcularsalario() {
        salario = salario * 1.1;
        return  salario;
    }
}
