
package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Ata;
import java.util.List;


public class AtaBO implements BO<Ata> {

    
    @Override
    public void validar(Ata entidade) throws NegocioException {
       if (entidade.getData()== null){
       throw new NegocioException("Campo data é obrigatório");
        }
       if (entidade.getLocal().isEmpty ()){
       throw new NegocioException("O campo local é obrigatório");
        }
       if (entidade.getParticipantes().isEmpty ()){
       throw new NegocioException("Insira os participantes");
        }
        if (entidade.getDeliberacoes().isEmpty ()){
       throw new NegocioException("Insira as deliberações");
        } 
    }

    @Override
    public void inserir(Ata entidade) throws NegocioException {
        validar (entidade);
        
    }

    @Override
    public void alterar(Ata entidade) throws NegocioException {
        validar (entidade);
        consultar (entidade.getId());
    }

    @Override
    public void excluir(Ata entidade) throws NegocioException {
        consultar (entidade.getId());
    }

    @Override
    public Ata consultar(int id) throws NegocioException {
        return new Ata();
    }

    @Override
    public List<Ata> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
