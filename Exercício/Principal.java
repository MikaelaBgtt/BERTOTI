public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Estoque estoque = new Estoque();
        produto.setNome("Bolacha");
        estoque.addProduto(produto);
        estoque.buscarProdutoPorNome("Bolacha");

    }
}
