
package com.mycompany.escritorio;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mikaela.begotti
 */
public class MainTest {

    @org.junit.jupiter.api.Test
    public void testMainP1(){
        Empresa empresa = new Empresa("298485","DM",new LinkedList<Area>());
        Area area = new Area("Gente e Gestão", new LinkedList<Funcionario>(),new Localizacao(12,"8,4,3"));
        empresa.addArea(area);
        Funcionario carlos = new Funcionario("Carlos Roberto Junior",22, "Gestor",3000.00);
        area.addFuncionario(carlos);
        area.getFuncionarioNome("Carlos Roberto Junior");
        
        Funcionario nathalia =  new Funcionario("Nathalia Amaro Farias",29,"Administrador",1800.00);
        area.addFuncionario(nathalia);
        area.getFuncionarios();
        empresa.getAreas();
        
       carlos.setSalario(nathalia, 1950.00);
       nathalia.getSalario();
       nathalia.setSalario(nathalia, 2000.00);
    }
    
        @org.junit.jupiter.api.Test
        public void testMainP2(){
        Empresa empresa = new Empresa("124758","Accenture",new LinkedList<Area>());
        Area area = new Area("RH", new LinkedList<Funcionario>(),new Localizacao(05,"1,7,12"));
        empresa.addArea(area);
        Funcionario renata = new Funcionario("Renata Vieira",32, "Analista de projetos I",2000.00);
        area.addFuncionario(renata);
        area.getFuncionarioNome("Renata Vieira");
        
        Funcionario renan =  new Funcionario("Renan Sardinha",22,"Estagiario de projetos",1300.00);
        area.addFuncionario(renan);
        area.getFuncionarios();
        empresa.getAreas();
        
       renata.setSalario(renan, 1950.00);
       renan.getSalario();
       renan.setSalario(renan, 2000.00);
    }
        
        @org.junit.jupiter.api.Test
        public void testMainP3(){
        Empresa empresa = new Empresa("124758","Accenture",new LinkedList<Area>());
        Area area = new Area("RH", new LinkedList<Funcionario>(),new Localizacao(05,"1,7,12"));
        empresa.addArea(area);
        Funcionario renata = new Funcionario("Renata Vieira",32, "Analista de projetos I",2000.00);
        area.addFuncionario(renata);
        area.getFuncionarioNome("Renata Vieira");
        
        Funcionario renan =  new Funcionario("Renan Sardinha",22,"Estagiario de projetos",1300.00);
        area.addFuncionario(renan);
        area.getFuncionarios();
        empresa.getAreas();
        
       renata.setSalario(renan, 1950.00);
       renan.getSalario();
       renan.setSalario(renan, 2000.00);
       
       Area areaNova = new Area("Suporte", new LinkedList<Funcionario>(), new Localizacao(06,"6,4,2"));
       empresa.addArea(areaNova);
       empresa.buscarAreaPorNome("Suporte");
    }
        
        
    
}
