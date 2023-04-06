
package com.mycompany.escritorio;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author mikaela.begotti
 */
public class Area {
    private String nome;
    private List<Funcionario> funcionarios;
    private Localizacao localizacao;

    
    public Area(String nome, List<Funcionario> funcionarios, Localizacao localizacao) {
        this.nome = nome;
        this.funcionarios = funcionarios;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Funcionario> getFuncionarioNome(String nomeFuncionario) {
        List<Funcionario> funcionariosEncontrados = new LinkedList<Funcionario>();
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getNome().equals(nomeFuncionario)){
                funcionariosEncontrados.add(funcionario);
                for(int i = 0; i < funcionariosEncontrados.size();i++){
                    System.out.println(funcionariosEncontrados.get(i).getNome());
                }
            }
        }
        return funcionariosEncontrados;
    }
    public List<Funcionario> getFuncionarios(){
        for(int i=0;i < funcionarios.size();i++){
        System.out.println(funcionarios.get(i).getNome());
        }
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public Localizacao getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
}
