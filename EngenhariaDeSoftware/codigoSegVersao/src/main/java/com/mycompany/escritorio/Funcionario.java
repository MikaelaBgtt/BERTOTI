
package com.mycompany.escritorio;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    
    public Funcionario(String nome, int idade, String cargo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.cargo =  cargo;
        this.salario = salario;
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
    
    /**
     * @return the cargo
     */
    public String getCargo() {
        System.out.println(cargo);
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario(){
        System.out.println(salario);
        return salario;
    }
    
    public void setSalario(Funcionario funcionario, double salarioNovo){
        if(this.cargo == "Gestor"){
            funcionario.salario = salarioNovo;
            funcionario.getSalario();
            System.out.println("Operação possível.");
            
        }
        else{
            System.out.println("Operação impossível.");
        }
    }
    
    public void setCargo(Funcionario funcionario, String cargo){
        if(this.cargo == "Gestor"){
            funcionario.cargo = cargo;
            funcionario.getCargo();
        }
    }
    

}
