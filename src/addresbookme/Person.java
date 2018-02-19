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
public abstract class Person {
    private String firstName;
    private String lastName;
    private String cpf;
    private Date birthDay;
    
    public Person(String firstName, String lastName, String cpf, Date date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.birthDay = date;
    }
    
    public String getName() {
        return firstName+" "+lastName;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    //*
    @Override
    public String toString() {
        return " " + firstName + " " + lastName + 
                " | CPF: " + cpf + " | Data de Nascimento: " + birthDay;
    }
    //*/
}
