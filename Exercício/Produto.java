import java.util.LinkedList;
import java.util.List;

public class Produto {
    static List<Produto> produtos = new LinkedList<Produto>();
    private static String nome;
    


public String getNome() {
    System.out.println(nome);
    return nome;
}
public String setNome(String nome){
    this.nome = nome;
    return nome;
}
    
}