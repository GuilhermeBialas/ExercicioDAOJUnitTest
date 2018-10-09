/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bean.Filme;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guilherme Henrique Bialas
 */
public class FilmeDAOJUnitTest {
    
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
        sony.setTempoFilme(150);
        sony.setAno();
    }
    
    
}
