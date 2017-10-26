package tcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public void incluiUsuario(UsuarioDTO usuario) throws SQLException{
        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";
        Connection conn = DriverManager.getConnection(str);
        
        String sql = "INSERT INTO CADASTRO (ID_USUARIO, NOME, SOBRENOME, LOGIN, SEXO) VALUES (?, ?, ?, ?, ?)";
        
        PreparedStatement p = conn.prepareStatement(sql);
        
        p.setString(1, usuario.getNome());
        p.setString(2, usuario.getSobrenome());
        p.setString(3, usuario.getLogin());
        // p.setCharacterStream(4, );
       
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
