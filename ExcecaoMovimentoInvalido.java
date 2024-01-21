/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author 02902564023
 */
public class ExcecaoMovimentoInvalido extends Exception {

    /**
     * Creates a new instance of <code>ExcecaoMovimentoInvalido</code> without
     * detail message.
     */
    public ExcecaoMovimentoInvalido() {
    }

    /**
     * Constructs an instance of <code>ExcecaoMovimentoInvalido</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcecaoMovimentoInvalido(String msg) {
        super(msg);
    }
}
