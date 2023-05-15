import java.util.LinkedList;

public class Startup {
    public static void main(String[] args) {
        Empresa empresa =  new Empresa("83758374849", "Gomes Corp", new LinkedList<Area>());
        Funcionario funcionario = new Funcionario("João Gomes", 22, 15.000,empresa);
        Localizacao localizacao =  new Localizacao(12,"3;4;5");

        Area area =  new Area("RH", new LinkedList<Funcionario>(),localizacao); //list é uma classe abstrata, não é instanciável, por isso linked list
        area.addFuncionario(funcionario);

        Funcionario funcionario2 = new Funcionario("Caio Matheus", 20, 3.000,empresa);
        area.addFuncionario(funcionario2);
        empresa.addArea(area);
        System.out.println(empresa.getAreas());

        //caio e joao gomes estao na mesma área, por isso foram adicionados na mesma lista que o objeto área guarda como atributo. São apenas funcionários do RH.
        
        System.out.println(area.getFuncionarios());
}
}
