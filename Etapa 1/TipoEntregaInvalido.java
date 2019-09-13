/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhchiarelli
 */
public class TipoEntregaInvalido extends Exception {

    /**
     * Creates a new instance of <code>NewException</code> without detail
     * message.
     */
    public TipoEntregaInvalido() {
        super("Tipo de entrega invalido");
    }

    /**
     * Constructs an instance of <code>NewException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TipoEntregaInvalido(String msg) {
        super("Tipo de entrega invalido: " + msg);
    }
}
