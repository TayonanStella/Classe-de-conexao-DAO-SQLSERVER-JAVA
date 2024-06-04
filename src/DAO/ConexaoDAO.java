package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    private Connection con;

    public Connection connect() {
        try {
            // Define Driver de conexão JDBC thin
            String URL =  "jdbc:sqlserver://localhost:50833;databaseName=test;user=sa;password=1234";
 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(URL);   
            
 
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com sucesso!");
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Falha na conexão");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
