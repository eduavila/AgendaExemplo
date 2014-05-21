/*
 *
 * 
 * and open the template in the editor.
 */

package bean;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Eduaroo Avila Malheiros
 */
public class Contato {
       private String nomeCompleto;
       private Date dataNascimento;
       private String site;
       private String facebook;
       private String email;
       private String obs;
       private Endereco endereco;
       private List<Telefone> telefones;
       
       
       public Contato(){

       }
       
       public Contato(String nomeCompleto,Date dataNascimento, String site, String facebook,String email, String obs, Endereco endereco, List<Telefone> telefones){
           this.nomeCompleto = nomeCompleto;
           this.dataNascimento = dataNascimento;
           this.site = site;
           this.facebook = facebook; 
           this.email = email;
           this.obs = obs;
           this.endereco = endereco;
           this.telefones = telefones;
        }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the telefones
     */
    public List<Telefone> getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
    
    
}
