

package br.iesb.meuprograma.entidades;
import java.util.Date;
import javax.swing.JTextArea;


public class Ata {
    
   private int id; 
   private Date data;
   private String local;
   private String participantes;
   private String deliberacoes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
   
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getDeliberacoes() {
        return deliberacoes;
    }

    public void setDeliberacoes(String deliberacoes) {
        this.deliberacoes = deliberacoes;
    }

    public void setParticipantes(JTextArea jTDelib) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
