/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import bank.Person;
/**
 *
 * @author Vyshnavi Srilaxmi Thannir
 */
public interface Eligible
{

    /**
     *
     * @param person
     * @return
     */
    boolean checkAge(Person person);

    /**
     *
     * @param person
     * @return
     */
    boolean verifyIdentity(Person person);
}
