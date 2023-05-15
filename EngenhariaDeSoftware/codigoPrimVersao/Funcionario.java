public class Funcionario {

    private String nome;
    private int idade;
    private double salario;
    private Empresa empresa;

    

    public Funcionario(String nome, int idade, double salario, Empresa empresa) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.empresa = empresa;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getSalario() {
        return salario;
    }
    public Empresa getEmpresa() {
        return empresa;
    }


    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
   

    
}
