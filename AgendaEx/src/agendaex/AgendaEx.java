/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agendaex;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class AgendaEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("======== Agenda Exemplo ========");
       System.out.println("Menu escolha uma opção.");
       System.out.println("1 - Cadastrar novo registro.");
       System.out.println("2 - Listar todos registro agenda.");
       System.out.println("3 - Busca por numero");
       System.out.println("4 - Deletar numero");
       
        Scanner  teclado = new Scanner(System.in);
        
       int  opcao = teclado.nextInt();
       
       view visao = new view();
       
       
       if(opcao == 1){
           
           visao.listarTodos();
       }if(opcao ==2){
           visao.cadastrar();
                   
       }
       
       
    
     

       
    }
    
}
