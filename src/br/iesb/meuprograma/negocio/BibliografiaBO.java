package br.iesb.meuprograma.negocio;

import br.iesb.meuprograma.entidades.Bibliografia;
import java.util.List;

public class BibliografiaBO implements BO<Bibliografia> {

    @Override
    public void validar(Bibliografia entidade) throws NegocioException {
        if (entidade.getTitulo().isEmpty()){
       throw new NegocioException("Insira o Título");
        }
       if (entidade.getAutor().isEmpty ()){
       throw new NegocioException("Insira o Autor");
        }
       if (entidade.getIsbn().isEmpty() ){
       throw new NegocioException("Insira o código ISBN");
        }
       if (entidade.getAno().isEmpty()){
       throw new NegocioException("Insira o ano");
        }
       if (entidade.getEditora().isEmpty() ){
       throw new NegocioException("Insira a Editora");
        }
    }

    @Override
    public void inserir(Bibliografia entidade) throws NegocioException {
        validar (entidade);
        
    }

    @Override
    public void alterar(Bibliografia entidade) throws NegocioException {
        validar (entidade);
        consultar (entidade.getId());
    }

    @Override
    public void excluir(Bibliografia entidade) throws NegocioException {
        consultar (entidade.getId());
    }
    @Override
    public Bibliografia consultar(int id) throws NegocioException {
        return new Bibliografia();
    }

    @Override
    public List<Bibliografia> listar() throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
