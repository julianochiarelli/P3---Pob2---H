
import java.text.DateFormat;
import java.text.ParseException;



public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance();
        try {
        Pedido pedido = new Pedido(654, "eu",df.parse("13/09/2019") , "furb");
        Produto tesoura = new Produto("uma tesoura", 10, 100);
        pedido.IncluirItem(tesoura, 2);
        Produto caneta = new Produto("uma caneta", 5, 50);
        pedido.IncluirItem(caneta, 10);
        pedido.setFormaDeEntrega("SEDEX");
        System.out.println(pedido.getValorEntrega());
        pedido.setFormaDeEntrega("PAC");
        System.out.println(pedido.getValorEntrega());
        Produto carro = new Produto("um carro", 10000, 5000);
        pedido.IncluirItem(carro, 1);
        System.out.println(pedido.getValorEntrega());
        } catch (ParseException pe){
            System.out.println("Data invalida");
        } catch (TipoEntregaInvalido tei){
            System.out.println(tei.getMessage());
        }

    }
    
}
