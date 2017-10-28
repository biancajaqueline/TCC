package tcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestaoDAO {

    public QuestaoDTO retornaPergunta() throws SQLException {

        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";

        Connection conn = DriverManager.getConnection(str);
        String sql = "SELECT AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, "
                + "DESC_ALTERNATIVA_5, IND_CORRETA FROM QUESTAO WHERE ID_QUESTAO = 1";

        PreparedStatement p = conn.prepareStatement(sql);
        //p.setInt(9, id);
        ResultSet rs = p.executeQuery();
        QuestaoDTO questaoDTO = null;
        if (rs.next()) {
            questaoDTO = new QuestaoDTO();
            questaoDTO.setArea(rs.getInt(1));
            questaoDTO.setQuestao(rs.getString(2));
            questaoDTO.setAlternativaA(rs.getString(3));
            questaoDTO.setAlternativaB(rs.getString(4));
            questaoDTO.setAlternativaC(rs.getString(5));
            questaoDTO.setAlternativaD(rs.getString(6));
            questaoDTO.setAlternativaE(rs.getString(7));
            questaoDTO.setAltCorreta(rs.getInt(8));
        }
        return questaoDTO;
    }
}
