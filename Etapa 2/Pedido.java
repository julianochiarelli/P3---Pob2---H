
import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numero;
    private String nomeCliente;
    private Date data;
    private String endereco;
    private ArrayList <ItemPedido> itens = new ArrayList();
    private FormaDeEntregaStrategy FormaDeEntrega;

    public Pedido(int numero, String nomeCliente, Date data, String endereco) {
        this.setNumero(numero);
        this.setNomeCliente(nomeCliente);
        this.setData(data);
        this.setEndereco(endereco);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero < 0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.numero = numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null
                && nomeCliente.isEmpty()){
            throw new IllegalArgumentException("Nome do cliente invalido");
        }
        this.nomeCliente = nomeCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null
                && endereco.isEmpty()){
            throw new IllegalArgumentException("Endereco invalido");
        }
        this.endereco = endereco;
    }
    
    public void IncluirItem(Produto p, int qnt){
        ItemPedido item = new ItemPedido(p, qnt);
        this.itens.add(item);
    }
    
    public double getValorPedido(){
        double result = 0;
        for (ItemPedido i: itens){
            result += i.getValorItem();
        }
        return result;
    }
    
    public void setFormaDeEntrega(String entrega)throws TipoEntregaInvalido{
        if (entrega.equals("PAC")){
            FormaDeEntrega = EntregaPAC.getInstance();
            return;
        }
        if (entrega.equals("SEDEX")){
            FormaDeEntrega = EntregaSEDEX.getInstance();
            return;
        }
        if (entrega.equals("Retirada Local")){
            FormaDeEntrega = RetiradaLocal.getInstance();
            return;
        }
        if (entrega.equals("Motoboy")){
            FormaDeEntrega = EntregaMotoboy.getInstance();
            return;
        }
        
        throw new TipoEntregaInvalido();
    }
    
    public int getPesoTotal(){
        int result = 0;
        for (ItemPedido i: itens){
            result += i.getPesoProduto();
        }
        return result;
    }
    
    public double getValorEntrega() throws TipoEntregaInvalido{
        return FormaDeEntrega.getValorEntrega(this);
    }
    
    public double getValorTotal() throws TipoEntregaInvalido{
        return this.getValorEntrega() + this.getValorPedido();
    }
    
    public int getQuantidadeItens(){
        int result = 0;
        for (ItemPedido i: itens){
            result += i.getQuantidade();
        }
        return result;
    }
}
