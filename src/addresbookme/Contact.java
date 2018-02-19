/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addresbookme;
import abstractdatatypes.*;

/**
 *
 * @author MaJoy
 */
public class Contact extends Person{
    private String address;
    private String email;
    private Phone[] phoneNumber;
    
    public Contact (String firstName, String lastName, String cpf, Date date, 
            String address, String email, Phone[] phoneNumber ){        
        super(firstName, lastName, cpf, date);
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;    
    } 
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int i;
        for (i = 0; i < this.phoneNumber.length; i++) {
            str.append(phoneNumber[i]);
            str.append("\n");
        }
        return str.toString();
    }   
    
}
