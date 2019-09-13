public class ItemPedido {
    private Produto produto;
    private int quantidade;

    protected ItemPedido(Produto produto, int quantidade) {
        this.setProduto(produto);
        this.setQuantidade(quantidade);
    }
    
    protected Produto getProduto() {
        return produto;
    }

    protected void setProduto(Produto produto) {
        if (produto == null){
            throw new IllegalArgumentException("Produto invalido");
        }
        this.produto = produto;
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        if (quantidade < 0){
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidade = quantidade;
    }
    
    protected double getValorIntem(){
        return this.produto.getValor() * this.quantidade;
    }
}
