public class Localizacao {
    private int numero;
    private String coordenada;
    public Localizacao(int numero, String coordenada) {
        this.numero = numero;
        this.coordenada = coordenada;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCoordenada() {
        return coordenada;
    }
    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }
    
}
