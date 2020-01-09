/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public class NegativeAmountException extends Exception{

    public NegativeAmountException() {
    }

    public NegativeAmountException(String message) {
        super(message);
    }
    
}
