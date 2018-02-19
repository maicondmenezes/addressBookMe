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

public class AddresBookMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Phone> minhaListaDeTelefones = new ArrayList<>();
        Phone fone = new Phone(55, 53, 988924347, "celular");
        Phone fone2 = new Phone(55, 54, 878924347, "Trabalho");
        minhaListaDeTelefones.add(fone);
        minhaListaDeTelefones.add(fone2);
        Person contato1 = new Contact(
                "Maicon",
                "Oliveira",
                "057892437-46",
                new Date(17, 07, 1986),
                "Alvares Chaves, 19",
                "mdmoliveira@inf.ufpel.edu.br",
                minhaListaDeTelefones
        );
        System.out.println(contato1.toString());
    }

}
