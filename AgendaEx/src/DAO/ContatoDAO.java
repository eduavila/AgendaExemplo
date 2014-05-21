/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;


import bean.*;
import com.db4o.*;
import java.util.ArrayList;
/**
 *
 * @author eduardo
 */
public class ContatoDAO {
    
    public void gravar(Contato contato){
      com.db4o.ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
      try{
          db.store(contato);
      }finally{
          db.close();
      }
    }
    
    
    public void deletar(Contato contato){
      com.db4o.ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
      try{
         ObjectSet<Contato> result = db.queryByExample(contato);
         Contato found = (Contato) result.next();
         db.delete(found);
      }finally{
          db.close();
      }  
    }
    
    
    public ArrayList<Contato> BuscaTodos(){
      com.db4o.ObjectContainer db =  Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "banco");
      ArrayList<Contato> lista = new ArrayList();
      try{
         Contato c = new Contato();
         ObjectSet<Contato> query = db.queryByExample(c);
         while(query.hasNext()){
              Contato contato= query.next();
              lista.add(contato);
                      
         }
      }finally{
          db.close();
          return lista;
      }  
    }
           
    
}
