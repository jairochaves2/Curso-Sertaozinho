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
package ifsp.model.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jairo
 */
public class ConnectionFactory {
    /**
     *Retorna uma conexão com o banco de dados
     *@return connection - Conexão com banco de dados
     */
        public Connection getConnection() {
              try {
                  return DriverManager.getConnection(
                          "jdbc:mysql://localhost/ifsp", "root", "root");
              } catch (SQLException e) {
                  throw new RuntimeException(e);
              }
          }
    
}
