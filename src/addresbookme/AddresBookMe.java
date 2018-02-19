/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addresbookme;
import abstractdatatypes.*;
import java.util.ArrayList;

/**
 *
 * @author MaJoy
 */
public class AddresBookMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Phone> minhaListaDeTelefones = new ArrayList<>();
        Phone fone = new Phone(55,53,988924347,"celular");
        Phone fone2 = new Phone(55,54,878924347,"Trabalho");
        minhaListaDeTelefones.add(fone);
        minhaListaDeTelefones.add(fone2);
        Person contato1 = new Contact(
                "Maicon",
                "Oliveira",
                "057892437-46",
                new Date(17,07,1986),
                "Alvares Chaves, 19",
                "mdmoliveira@inf.ufpel.edu.br",
                minhaListaDeTelefones
                
        );
         System.out.println(contato1.toString());
    }
    
}
