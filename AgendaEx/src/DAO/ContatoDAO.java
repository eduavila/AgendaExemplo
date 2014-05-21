/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;


import bean.*;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Avila Malheiros
 */
public class ContatoDAO {
    
        public void gravar(Contato contato){

            com.db4o.ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"banco");

            try{
                
                db.store(contato);
                
            }finally{
                db.close();
            }

        }
        
        public void deletar(Contato contato){
            
            com.db4o.ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"banco");

            try{
                
                ObjectSet<Contato> result = db.queryByExample(contato);
               
                Contato found = (Contato) result.next();
                
                db.delete(found);
                
            }finally{
                db.close();
            }
        
        }
        
        
        public List<Contato> buscarTodos(){
            com.db4o.ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"banco");
            ArrayList<Contato> lista = new ArrayList<>();
            try{
               
                Contato c = new Contato();
                ObjectSet<Contato> queryByExample = db.queryByExample(c);
                while(queryByExample.hasNext()){
                    Contato contato = queryByExample.next();
                    lista.add(contato);
                }
                
            }finally{
                db.close();
                return lista;
            }
        }
        
     
        
}
      


