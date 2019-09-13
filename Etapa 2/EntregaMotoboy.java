public class EntregaMotoboy extends FormaDeEntregaStrategy{
    private static EntregaMotoboy instance = new EntregaMotoboy();
    
    private EntregaMotoboy(){
    }
    
    public static EntregaMotoboy getInstance(){
        return instance;
    }

    @Override
    public double getValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
        if (pedido.getPesoTotal() <= 25000
                && pedido.getQuantidadeItens() <= 30 ){
            return 7.00;
        }
        throw new TipoEntregaInvalido("Motoboy");
    }
}
