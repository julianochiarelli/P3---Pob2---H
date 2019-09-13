public class Produto {
    private String descricao;
    private double valor;
    private int peso;

    public Produto(String descricao, double valor, int peso) {
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setPeso(peso);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null
                && descricao.isEmpty()){
            throw new IllegalArgumentException("Descrição invalida");
        }
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso < 0){
            throw new IllegalArgumentException("peso invalido");
        }
        this.peso = peso;
    }
}
