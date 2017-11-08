/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.Telas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tcc.QuestaoDAO;
import tcc.QuestaoDTO;
import tcc.UsuarioDAO;
import tcc.UsuarioDTO;
import tcc.Util.Mensagem;
import tcc.Validacao;

/**
 *
 * @author usuario
 */
public class MenuUsuario extends javax.swing.JFrame {
    
    UsuarioDTO usuario;
    QuestaoDTO questao = new QuestaoDTO();
    int escolha = 0;

    public MenuUsuario(UsuarioDTO usuario) throws SQLException {
        
        initComponents();
        bemVindo.setText("Bem Vindo, " + usuario.getNome());
        UsuarioDAO uDAO = new UsuarioDAO();
        usuario = uDAO.retornaInfoPontuação(usuario);
        this.usuario = usuario;
    }
    
   
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        niveis = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        facil = new javax.swing.JRadioButton();
        medio = new javax.swing.JRadioButton();
        dificil = new javax.swing.JRadioButton();
        realizarProva = new javax.swing.JButton();
        desempenho = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        bemVindo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));

        jLabel2.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        jLabel2.setText("Escolha o nível desejado para realizar a prova:");

        facil.setBackground(new java.awt.Color(255, 153, 102));
        niveis.add(facil);
        facil.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        facil.setText("   Fácil");
        facil.setToolTipText("Nível fácil");

        medio.setBackground(new java.awt.Color(255, 153, 102));
        niveis.add(medio);
        medio.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        medio.setText("   Médio");
        medio.setToolTipText("Nível médio");

        dificil.setBackground(new java.awt.Color(255, 153, 102));
        niveis.add(dificil);
        dificil.setFont(new java.awt.Font("Harrington", 0, 18)); // NOI18N
        dificil.setText("   Difícil");
        dificil.setToolTipText("Nível difícil");

        realizarProva.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        realizarProva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/play(3).png"))); // NOI18N
        realizarProva.setText("  Realizar Prova");
        realizarProva.setToolTipText("Botão para começar a realização da prova");
        realizarProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarProvaActionPerformed(evt);
            }
        });

        desempenho.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        desempenho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bar-chart.png"))); // NOI18N
        desempenho.setText("  Ver desempenho");
        desempenho.setToolTipText("Botão para verificar o desempenho através dos gráficos");
        desempenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desempenhoActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/play(1).png"))); // NOI18N
        sair.setText("  Sair");
        sair.setToolTipText("Botão para sair do sistema");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        bemVindo.setEditable(false);
        bemVindo.setBackground(new java.awt.Color(255, 153, 102));
        bemVindo.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        bemVindo.setText("jTextField1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tongue.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/embarrassed.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/nerd.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(facil)
                                    .addComponent(dificil)
                                    .addComponent(medio))
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(512, 512, 512)
                        .addComponent(bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(desempenho, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(realizarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(883, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(bemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(facil)
                        .addGap(36, 36, 36)
                        .addComponent(medio)
                        .addGap(46, 46, 46)
                        .addComponent(dificil)))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desempenho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(realizarProva, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_sairActionPerformed

    private void desempenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desempenhoActionPerformed
        Desempenho desempenhoUser = new Desempenho(usuario);
        desempenhoUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_desempenhoActionPerformed

    private void realizarProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarProvaActionPerformed
        if (Validacao.validaNivel(facil, medio, dificil)) {

            Pergunta pergunta;

            if (facil.isSelected()) {
                escolha = 1;
                questao.setNivel(1);
            } else if (medio.isSelected()) {
                escolha = 2;
                questao.setNivel(2);
            } else {
                escolha = 3;
                questao.setNivel(3);
            }

            int progresso = 5;
            int i = 0;
            int pontos = 0;
            QuestaoDAO qDAO = new QuestaoDAO();
            ArrayList<QuestaoDTO> questoes = null;
            try {
                questoes = qDAO.retornaProva(escolha);
            } catch (SQLException ex) {
                Mensagem.msgErro("Erro de conexão com o banco de dados.");
            }
            
            try {
                pergunta = new Pergunta(usuario, escolha, progresso, i, pontos, questoes);
                pergunta.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Mensagem.msgErro("Erro de conexão com o banco de dados.");
            }

        }


    }//GEN-LAST:event_realizarProvaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bemVindo;
    private javax.swing.JButton desempenho;
    private javax.swing.JRadioButton dificil;
    private javax.swing.JRadioButton facil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton medio;
    private javax.swing.ButtonGroup niveis;
    private javax.swing.JButton realizarProva;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
