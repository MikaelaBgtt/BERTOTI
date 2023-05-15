import java.util.List;

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
    public List<Funcionario> getFuncionarios() {
        for(int i = 0; i < funcionarios.size();i++){
        Funcionario nome = funcionarios.get(i);
        System.out.println(nome.getNome());
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
