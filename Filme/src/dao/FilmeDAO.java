package dao;

import bean.Filme;
import data.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
                    + "\n(nome,diretor,categoria,faixa_etaria,ator_principal,idioma_original,"
                    + "legenda,dublado,tempo_filme,ano,faturmento,orcamento)"
                    + "\n(?,?,?,?,?,?,?,?,?,?,?,?)";

            try {
                PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, sony.getNome());
                ps.setString(2, sony.getDiretor());
                ps.setString(3, sony.getCategoria());
                ps.setString(4, sony.getFaixaEtaria());
                ps.setString(5, sony.getAtorPrincipal());
                ps.setString(6, sony.getIdiomaOriginal());
                ps.setBoolean(7, sony.isLegenda());
                ps.setBoolean(8, sony.isDublado());
                ps.setInt(9, sony.getTempoFilme());
                ps.setInt(10, sony.getAno());
                ps.setDouble(11, sony.getFaturamento());
                ps.setDouble(12, sony.getOrcamento());
                ps.setInt(13, sony.getId());
                ps.execute();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return -1;

    }

    public static class obterPeloId extends Filme {

       
        
        
        
        
        
        
        
    }

}
