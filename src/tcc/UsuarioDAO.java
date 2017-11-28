package tcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.commons.codec.digest.DigestUtils;

public class UsuarioDAO {

    public void incluiUsuario(UsuarioDTO usuario) throws SQLException {
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
        String sql = "SELECT ID_USUARIO, LOGIN, SENHA FROM USUARIO"
                + " WHERE LOGIN = ? "
                + " AND SENHA = ? ";

        PreparedStatement p = conn.prepareStatement(sql);

        p.setString(1, usuario.getLogin());
        p.setString(2, DigestUtils.sha1Hex(usuario.getSenha()));
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

    public void atualizaPontuação(UsuarioDTO usuario) throws SQLException {
        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";

        Connection conn = DriverManager.getConnection(str);
        String sql = "UPDATE USUARIO SET PONTUACAO_GERAL = ?, PONTUACAO_AREA1 = ?, PONTUACAO_AREA2 = ?, "
                + "PONTUACAO_AREA3 = ?, PONTUACAO_AREA4 = ?, PONTUACAO_AREA5 = ?, PONTUACAO_AREA6 = ?, PONTUACAO_AREA7 = ?, "
                + "PONTUACAO_AREA8 = ?, PONTUACAO_AREA9 = ?, PONTUACAO_FACIL = ?, PONTUACAO_MEDIO = ?, PONTUACAO_DIFICIL = ? WHERE ID_USUARIO = ?";
        PreparedStatement p = conn.prepareStatement(sql);

        p.setInt(1, usuario.getPontuacaoGeral());
        p.setInt(2, usuario.getPontuacaoA1());
        p.setInt(3, usuario.getPontuacaoA2());
        p.setInt(4, usuario.getPontuacaoA3());
        p.setInt(5, usuario.getPontuacaoA4());
        p.setInt(6, usuario.getPontuacaoA5());
        p.setInt(7, usuario.getPontuacaoA6());
        p.setInt(8, usuario.getPontuacaoA7());
        p.setInt(9, usuario.getPontuacaoA8());
        p.setInt(10, usuario.getPontuacaoA9());
        p.setInt(11, usuario.getPontF());
        p.setInt(12, usuario.getPontM());
        p.setInt(13, usuario.getPontD());
        p.setInt(14, usuario.getId_usuario());
        p.execute();
    }

    public UsuarioDTO retornaInfoPontuação(UsuarioDTO usuario) throws SQLException {
        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";

        Connection conn = DriverManager.getConnection(str);
//        String sql = "SELECT C.NOME, U.PONTUACAO_GERAL, U.PONTUACAO_AREA1, U.PONTUACAO_AREA2, U.PONTUACAO_AREA3, U.PONTUACAO_AREA4, U.PONTUACAO_AREA5, U.PONTUACAO_AREA6, U.PONTUACAO_AREA7," +
//                 " U.PONTUACAO_AREA8, U.PONTUACAO_AREA9, U.PONTUACAO_FACIL, U.PONTUACAO_MEDIO, U.PONTUACAO_DIFICIL FROM CADASTRO C INNER JOIN USUARIO U ON C.ID_USUARIO = U.ID_USUARIO";
        String sql = "SELECT PONTUACAO_GERAL, PONTUACAO_AREA1, PONTUACAO_AREA2, PONTUACAO_AREA3, PONTUACAO_AREA4, PONTUACAO_AREA5, PONTUACAO_AREA6, PONTUACAO_AREA7,"
                + " PONTUACAO_AREA8, PONTUACAO_AREA9, PONTUACAO_FACIL, PONTUACAO_MEDIO, PONTUACAO_DIFICIL FROM USUARIO WHERE ID_USUARIO = ?";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, usuario.getId_usuario());
        ResultSet rs = p.executeQuery();
        //UsuarioDTO uDTO = null;
       

        while (rs.next()) {
            //usuario = new UsuarioDTO();
            //usuario.setNome(rs.getString(1));
            usuario.setPontuacaoGeral(rs.getInt(1));
            usuario.setPontuacaoA1(rs.getInt(2));
            usuario.setPontuacaoA2(rs.getInt(3));
            usuario.setPontuacaoA3(rs.getInt(4));
            usuario.setPontuacaoA4(rs.getInt(5));
            usuario.setPontuacaoA5(rs.getInt(6));
            usuario.setPontuacaoA6(rs.getInt(7));
            usuario.setPontuacaoA7(rs.getInt(8));
            usuario.setPontuacaoA8(rs.getInt(9));
            usuario.setPontuacaoA9(rs.getInt(10));
            usuario.setPontF(rs.getInt(11));
            usuario.setPontM(rs.getInt(12));
            usuario.setPontD(rs.getInt(13));
        }

        return usuario;
    }
}
