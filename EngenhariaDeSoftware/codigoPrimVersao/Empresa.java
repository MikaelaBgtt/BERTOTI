import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private List<Area> areas;

    
    public Empresa(String cnpj, String nome, List<Area> areas) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.areas = areas;
    }

    public void addArea(Area area){
        areas.add(area);
    }

    public List<Area> getAreas(){
        for(int i = 0; i < areas.size();i++){
            Area nomesAreas = areas.get(i);
            System.out.println(nomesAreas.getNome());
        }
        return areas;
    }

    public String getCnpj() {
        return cnpj;
    }


    public List<Area> getArea() {
        return areas;
    }



    public void setArea(List<Area> areas) {
        this.areas = areas;
    }



    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

   


    
    
}