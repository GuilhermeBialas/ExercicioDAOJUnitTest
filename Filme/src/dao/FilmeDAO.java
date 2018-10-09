package dao;

import bean.Filme;
import data.Conexao;
import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilheme Henrique Bialas
 * @Date 08/10/2018
 */
public class FilmeDAO {

    public int cadastrar(Filme sony) {
    Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO filmes"
                    +"\n(nome,diretor,categoria,faixa_etaria,ator_principal,idioma_original,legenda,dublado,tempo_filme,ano,faturmento,orcamento)"
                    +"\n(?,?,?,?,?,?,?,?,?,?,?,?)";
                    
                    }
    }

    public static class cadastrar {

        public cadastrar(Filme sony) {
        }
    }

    public static class obterPeloId extends Filme {

        public obterPeloId(int identificador) {
        }
    }
  
    
    
}
