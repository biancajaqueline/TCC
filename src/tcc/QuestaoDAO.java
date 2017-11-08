package tcc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestaoDAO {

    public QuestaoDTO retornaPergunta(int nivel) throws SQLException {

        String str = "jdbc:mysql://localhost:3307/tcc?"
                + "user=root&password=root";

        Connection conn = DriverManager.getConnection(str);
        String sql = "SELECT AREA, DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, "
                + "DESC_ALTERNATIVA_5, IND_CORRETA FROM QUESTAO WHERE IND_NIVEL = ? ORDER BY RAND() LIMIT 1";
        PreparedStatement p = conn.prepareStatement(sql);
        p.setInt(1, nivel);

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
            System.out.println("-----------------------------------");
            System.out.println("ALTERNATIVA:     " + rs.getInt(8));
        }
        return questaoDTO;
    }

    public ArrayList<QuestaoDTO> retornaProva(int nivel) throws SQLException {
        ArrayList<QuestaoDTO> listaQuestoes = new ArrayList();
        int area = 1;
        int questoes = 2;
        do {
            if (area > 7) {
                questoes = 3;
            }
            String str = "jdbc:mysql://localhost:3307/tcc?"
                    + "user=root&password=root";

            Connection conn = DriverManager.getConnection(str);
            String sql = "SELECT DESC_QUESTAO, DESC_ALTERNATIVA_1, DESC_ALTERNATIVA_2, DESC_ALTERNATIVA_3, DESC_ALTERNATIVA_4, "
                    + "DESC_ALTERNATIVA_5, IND_CORRETA FROM QUESTAO WHERE IND_NIVEL = ? AND AREA = ? ORDER BY RAND() LIMIT ?";
            PreparedStatement p = conn.prepareStatement(sql);
            p.setInt(1, nivel);
            p.setInt(2, area);
            p.setInt(3, questoes);
            System.out.println(p.toString());
            ResultSet rs = p.executeQuery();

            QuestaoDTO questaoDTO;
            // não executa
            if (rs.next()) {
                questaoDTO = new QuestaoDTO();
                questaoDTO.setQuestao(rs.getString(1));
                questaoDTO.setAlternativaA(rs.getString(2));
                questaoDTO.setAlternativaB(rs.getString(3));
                questaoDTO.setAlternativaC(rs.getString(4));
                questaoDTO.setAlternativaD(rs.getString(5));
                questaoDTO.setAlternativaE(rs.getString(6));
                questaoDTO.setAltCorreta(rs.getInt(7));
                listaQuestoes.add(questaoDTO);
            }

            area++;
        } while (area < 10);

        return listaQuestoes;
    }
}
