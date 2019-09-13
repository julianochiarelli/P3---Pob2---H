public class RetiradaLocal extends FormaDeEntregaStrategy{
    private static RetiradaLocal instance = new RetiradaLocal();
    
    private RetiradaLocal(){
    }
    
    public static RetiradaLocal getInstance(){
        return instance;
    }
    
    @Override
    public double getValorEntrega(int peso) throws TipoEntregaInvalido {
        return 0.0;
    }
    
}
