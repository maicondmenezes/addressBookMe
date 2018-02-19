/**
*#Universidade Federal de Pelotas#
*#Unidade: CDTEC
*#Curso: Ciência da Computação
*#Disciplina: Programação Orientada a Objetos
*#Profº: Felipe de Souza Marques
*#Aluno: Maicon de Menezes
*#Projeto: 
*#Módulo: 

*@author Maicon de Menezes <mdmoliveira@inf.ufpel.edu.br>
*@date   19/02/2018
*/
package addresbookme;

import abstractdatatypes.*;
import java.util.ArrayList;

/**
 *
 * @author MaJoy
 */
public class Contact extends Person {

    private String address;
    private String email;
    private ArrayList<Phone> phoneList;

    public Contact(String firstName, String lastName, String cpf, Date date,
            String address, String email, ArrayList<Phone> phoneList) {
        super(firstName, lastName, cpf, date);
        this.address = address;
        this.email = email;
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Nome: ");
        str.append(super.toString());
        str.append("\n");
        str.append("Endereço: ");
        str.append(this.address);
        str.append("\n");
        str.append("Email: ");
        str.append(this.email);
        str.append("\n");
        str.append("Telefones:");
        str.append("\n");
        for (Phone phoneNumber : phoneList) {
            str.append("|");
            str.append(phoneNumber.toString());
            str.append("|");
            str.append(phoneNumber.getType());
            str.append("\n");
        }

        return str.toString();
    }

}
