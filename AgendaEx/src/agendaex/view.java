/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agendaex;


import DAO.*;

import bean.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author eduardo
 */
public class view {
    public void listarTodos(){
        System.out.println("======== Todos  registro da agend========");
        System.out.println(" Nome Completo \t Número \t Operadora \t E-mail\t");
        
        ContatoDAO contatodao = new ContatoDAO();
         ArrayList<Contato> contatos = contatodao.BuscaTodos();
        
        for(int i=0; i< contatos.size(); i++){
            System.out.print(contatos.get(i).getNomeCompleto()+"\t");
            System.out.print(contatos.get(i).getNumero()+"\t");
            System.out.print(contatos.get(i).getOperadora()+"\t");          
            System.out.println(contatos.get(i).getEmail()+"\t");
           
        }
    
    }
    
    
    public void cadastrar(){
        Scanner  teclado = new Scanner(System.in);
      
              
        Contato contato =new Contato();
 
        
        System.out.println("========Novo registro========");
        System.out.println("Nome Completo: ");
        contato.setNomeCompleto(teclado.nextLine());
        System.out.println("Número: ");
        contato.setNumero(teclado.nextInt());
        System.out.println("Operadora: ");
        contato.setOperadora(teclado.nextLine());
        System.out.println("E-mail: ");
        contato.setEmail(teclado.nextLine());
        
        
        ContatoDAO contatodao =new ContatoDAO();

         contatodao.gravar(contato);
        
         System.out.println("Registro salvo com sucesso.");
            
        
        
    }
    
}
