/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bean.Filme;
import dao.FilmeDAO;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme Henrique Bialas
 */
public class FilmeDAOJUnitTest {
    private Object dao;
   
    
    @Test
    public void testarCadastro(){
        Filme sony = new Filme();
        sony.setNome("Vingadores");
        sony.setCategoria("ação");
        sony.setAtorPrincipal("Homem aranha kkkk");
        sony.setDiretor(" Anthony Russo, Joe Russo");
        sony.setDublado(true);
        sony.setFaixaEtaria("Livre");
        sony.setFaturamento(100000);
        sony.setIdiomaOriginal("Inglês");
        sony.setLegenda(true);
        sony.setOrcamento(500000);
        sony.setAno(2018);
        sony.setTempoFilme(180);
        
        int identificador = new FilmeDAO().cadastrar(sony);
        
        assertNotSame(identificador, -1);
        Filme filmeBuscado = new FilmeDAO.obterPeloId(identificador);
        assertNotNull(filmeBuscado);
    
        assertEquals(sony.getAno(),filmeBuscado.getAno());
        assertEquals(sony.getAtorPrincipal(),filmeBuscado.getAtorPrincipal());
        assertEquals(sony.getCategoria(),filmeBuscado.getCategoria());
        assertEquals(sony.getDiretor(),filmeBuscado.getDiretor());
        assertEquals(sony.getFaixaEtaria(),filmeBuscado.getFaixaEtaria());
        assertEquals(sony.getFaturamento(),filmeBuscado.getFaturamento());
        assertEquals(sony.getIdiomaOriginal(),filmeBuscado.getIdiomaOriginal());
        assertEquals(sony.getNome(),filmeBuscado.getNome());
        assertEquals(sony.getOrcamento(),filmeBuscado.getOrcamento());
        assertEquals(sony.getTempoFilme(),filmeBuscado.getTempoFilme());
    
    
    }
    
    
}
