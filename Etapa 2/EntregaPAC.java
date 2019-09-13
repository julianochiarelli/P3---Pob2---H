public class EntregaPAC extends FormaDeEntregaStrategy {
    private static EntregaPAC instance = new EntregaPAC();
    
    private EntregaPAC(){
    }
    
    public static EntregaPAC getInstance(){
        return instance;
    }
    
    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalido{
        int peso = pedido.getPesoTotal();
        if (peso <= 1000){
            return 10.00;
        }
        if (peso <= 2000){
            return 15.00;
        }
        if (peso <= 3000){
            return 20.00;
        }
        if (peso <= 5000){
            return 30.00;
        }
        throw new TipoEntregaInvalido("PAC");
    }
}
