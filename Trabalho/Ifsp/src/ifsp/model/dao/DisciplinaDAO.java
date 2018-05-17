//******************************************************
//Instituto Federal de São Paulo - Campus Sertãozinho
//Disciplina......: M3LPBD
//Programação de Computadores e Dispositivos Móveis
//Aluno...........: José Maria Jairo Chaves
//******************************************************

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsp.model.dao;

import ifsp.model.beans.Disciplina;
import ifsp.model.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jairo
 */
public class DisciplinaDAO {

    /**
     * Método que faz a inserção da disciplina no banco de dados
     *
     * @param disc disciplina que será inserida
     */
    public static void insereDisciplina(Disciplina disc) {
        final String SQL = "INSERT INTO disciplina (nome,cargaHoraria,cursoPertencente,numeroVagas,periodo) VALUES(?,?,?,?,?)";
        Connection connection = new ConnectionFactory().getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement(SQL);

            stmt.setString(1, disc.getNome());
            stmt.setString(2, disc.getCargaHoraria());
            stmt.setString(3, disc.getCursoPertencente());
            stmt.setInt(4, disc.getNumeroVagas());
            stmt.setString(5, disc.getPeriodo());

            stmt.execute();
            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir\nTente novamente!");

        }

    }

    /**
     * Método que faz a busca no banco de dados
     */
    public static ArrayList<Disciplina> selectDisc() {
        ArrayList<Disciplina> listDisc = new ArrayList<>();

        final String SQL = "SELECT * FROM disciplina";
        Connection connection = new ConnectionFactory().getConnection();
        try {
            PreparedStatement ptmt = connection.prepareStatement(SQL);

            //Efetua a consulta
            ResultSet rs = ptmt.executeQuery();
            //Adiciona todos os item que foram recebidos do banco de dados na List
            while (rs.next()) {
                Disciplina disc = new Disciplina();

                disc.setId(rs.getInt("id"));
                disc.setNome(rs.getString("nome"));
                disc.setCargaHoraria(rs.getString("cargaHoraria"));
                disc.setCursoPertencente(rs.getString("cursoPertencente"));
                disc.setNumeroVagas(rs.getInt("numeroVagas"));
                disc.setPeriodo(rs.getString("periodo"));

                listDisc.add(disc);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DisciplinaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDisc;
    }

    /**
     * Método que faz a deleção do item passado
     *
     * @param id id da disciplina que será deletada
     */
    public static void deletaDisc(int id) {
        final String SQL = "DELETE FROM disciplina WHERE id = ?";
        Connection connection = new ConnectionFactory().getConnection();
        try {
            PreparedStatement stmt = connection.prepareStatement(SQL);
            
            stmt.setInt(1, id);
            
            //efetua a deleção
            stmt.execute();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir\nTente novamente!");

        }

    }
}
