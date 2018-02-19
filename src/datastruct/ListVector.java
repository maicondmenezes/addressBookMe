/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastruct;
import addresbookme.*;

/**
 *
 * @author Maicon de Menezes
 */
public class ListVector implements LinkedList{
    private int numberOfContacts;
    private Person[] addressBook; 

    public ListVector() {
        numberOfContacts = 0;
        addressBook = new Person [10];
    }
    
    public ListVector(int tamanho) {
        numberOfContacts = 0;
        addressBook = new Person [tamanho];
    }
    
    @Override
    public void include(Person dado) {
        if (numberOfContacts == addressBook.length) {
            System.err.println("-- Expandindo a Agenda -- Tamanho autal: " + addressBook.length);
            Person[] newAddresBook = new Person[addressBook.length * 2];
            int i;
            for(i = 0; i < addressBook.length; i++)
                newAddresBook[i] = addressBook[i];
            addressBook = newAddresBook;
        }
        addressBook[numberOfContacts++] = dado;
    }
    
    @Override
    public Person delete(int index) {
        if (index >= 0 && index < numberOfContacts) {
            Person valor = addressBook[index];
            for (; index < numberOfContacts; index++)
                   addressBook[index] = addressBook[index + 1];
            numberOfContacts--;
            return valor;
        }
        System.out.println("Indice fora dos limites do vetor!");
        return null;
    }
    
    @Override
    public int search(String valor) {
        int i = 0;
        while (!valor.equals(addressBook[i].getCPF()) && i < numberOfContacts)
            i++;
        if (valor.equals(addressBook[i].getCPF()))
            return i;
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        int i;
        for (i = 0; i < numberOfContacts; i++) {
            str.append(addressBook[i]);
            str.append("\n----------------------------------------------------\n");
        }
        return str.toString();
    }    
}