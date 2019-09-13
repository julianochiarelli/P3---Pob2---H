public class EntregaSEDEX extends FormaDeEntregaStrategy{
    private static EntregaSEDEX instance = new EntregaSEDEX();
    
    private EntregaSEDEX(){
    }
    
    public static EntregaSEDEX getInstance(){
        return instance;
    }
    
    
    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
        int peso = pedido.getPesoTotal();
        if (peso <= 500){
            return 12.50;
        }
        if (peso <= 750){
            return 20.00;
        }
        if (peso <= 1200){
            return 30.00;
        }
        if (peso <= 2000){
            return 45.00;
        }
        return 45.00 + Math.ceil((peso - 2000) / 100) * 1.50;
    }
    
}
