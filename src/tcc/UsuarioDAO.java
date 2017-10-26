package tcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuarioDAO {
    
    public void incluiUsuario(UsuarioDTO usuario) throws SQLException{
        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";
        Connection conn = DriverManager.getConnection(str);
        
        String sql = "INSERT INTO CADASTRO (NOME, SOBRENOME, SEXO) VALUES (?, ?, ?)";
        
        PreparedStatement p = conn.prepareStatement(sql);
        
        p.setString(1, usuario.getNome());
        p.setString(2, usuario.getSobrenome());
        p.setString(3, usuario.getSexo());
        
        p.execute();
        
        Statement stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT LAST_INSERT_ID() FROM DUAL");
        rs.beforeFirst();
        rs.next();
        
        int id = rs.getInt(1);
        
        
        sql = "INSERT INTO USUARIO (ID_USUARIO, LOGIN, SENHA) VALUES (?, ?, ?)";
        
        p = conn.prepareStatement(sql);
        
        p.setInt(1, id);
        p.setString(2, usuario.getLogin());
        p.setString(3, usuario.getSenha());
       
        p.execute();        
    }
    
    public UsuarioDTO autenticaUsuario(
            UsuarioDTO usuario) throws SQLException {

        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";

        Connection conn = DriverManager.getConnection(str);
        String sql = "SELECT ID_USUARIO, LOGIN, SENHA FROM CADASTRO"
                + " WHERE LOGIN = ? "
                + " AND SENHA = ? ";

        PreparedStatement p = conn.prepareStatement(sql);

        
        p.setString(1, usuario.getLogin());
        p.setString(2, usuario.getSenha());
        ResultSet rs = p.executeQuery();
        UsuarioDTO usuarioDTO = null;
        if (rs.next()) {
            usuarioDTO = new UsuarioDTO();
            usuarioDTO.setId_usuario(rs.getInt(1));
            usuarioDTO.setNome(rs.getString(2));
            usuarioDTO.setSenha(rs.getString(3));
        }
        return usuarioDTO;
    }
}
