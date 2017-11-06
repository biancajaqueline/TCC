/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.Telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tcc.QuestaoDAO;
import tcc.QuestaoDTO;
import tcc.UsuarioDAO;
import tcc.UsuarioDTO;

/**
 *
 * @author usuario
 */
public class Pergunta extends javax.swing.JFrame {

    UsuarioDTO usuario;
    QuestaoDTO questao;
    int nivel;
    int progresso;

    public Pergunta(UsuarioDTO usuario, QuestaoDTO questao, int nivel, int progresso) throws SQLException {
        this.usuario = usuario;
        this.questao = questao;
        this.nivel = nivel;
        initComponents();

        pergunta.setText(questao.getQuestao());
        respostaA.setText(questao.getAlternativaA());
        respostaB.setText(questao.getAlternativaB());
        respostaC.setText(questao.getAlternativaC());
        respostaD.setText(questao.getAlternativaD());
        respostaE.setText(questao.getAlternativaE());

        barraProgresso.setValue(progresso);
        progresso = progresso + 5;
        this.progresso = progresso;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterinativas = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alternativaA = new javax.swing.JRadioButton();
        alternativaB = new javax.swing.JRadioButton();
        alternativaC = new javax.swing.JRadioButton();
        alternativaD = new javax.swing.JRadioButton();
        alternativaE = new javax.swing.JRadioButton();
        barraProgresso = new javax.swing.JProgressBar();
        proxima = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pergunta = new javax.swing.JTextArea();
        desistir = new javax.swing.JButton();
        respostaA = new javax.swing.JTextField();
        respostaB = new javax.swing.JTextField();
        respostaC = new javax.swing.JTextField();
        respostaD = new javax.swing.JTextField();
        respostaE = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel1.setText("Pergunta");

        alternativaA.setBackground(new java.awt.Color(0, 153, 153));
        alterinativas.add(alternativaA);
        alternativaA.setText("a)");
        alternativaA.setToolTipText("Opção A");

        alternativaB.setBackground(new java.awt.Color(0, 153, 153));
        alterinativas.add(alternativaB);
        alternativaB.setText("b)");
        alternativaB.setToolTipText("Opção B");

        alternativaC.setBackground(new java.awt.Color(0, 153, 153));
        alterinativas.add(alternativaC);
        alternativaC.setText("c)");
        alternativaC.setToolTipText("Opção C");

        alternativaD.setBackground(new java.awt.Color(0, 153, 153));
        alterinativas.add(alternativaD);
        alternativaD.setText("d)");
        alternativaD.setToolTipText("Opção D");

        alternativaE.setBackground(new java.awt.Color(0, 153, 153));
        alterinativas.add(alternativaE);
        alternativaE.setText("e)");
        alternativaE.setToolTipText("Opção E");

        barraProgresso.setBackground(new java.awt.Color(255, 204, 153));
        barraProgresso.setForeground(new java.awt.Color(255, 102, 51));

        proxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/right-arrow(2).png"))); // NOI18N
        proxima.setToolTipText("Botão para próxima questão");
        proxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximaActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        pergunta.setEditable(false);
        pergunta.setBackground(new java.awt.Color(0, 153, 153));
        pergunta.setColumns(20);
        pergunta.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        pergunta.setLineWrap(true);
        pergunta.setRows(5);
        pergunta.setText("pregunta");
        pergunta.setToolTipText("Pergunta para ser respondida");
        jScrollPane1.setViewportView(pergunta);

        desistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/desistir24.png"))); // NOI18N
        desistir.setText("  Desistir");
        desistir.setToolTipText("Botão para desistir da prova, não contará pontuação nenhuma");
        desistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desistirActionPerformed(evt);
            }
        });

        respostaA.setEditable(false);
        respostaA.setBackground(new java.awt.Color(0, 153, 153));
        respostaA.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        respostaB.setEditable(false);
        respostaB.setBackground(new java.awt.Color(0, 153, 153));
        respostaB.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        respostaC.setEditable(false);
        respostaC.setBackground(new java.awt.Color(0, 153, 153));
        respostaC.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        respostaD.setEditable(false);
        respostaD.setBackground(new java.awt.Color(0, 153, 153));
        respostaD.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        respostaE.setEditable(false);
        respostaE.setBackground(new java.awt.Color(0, 153, 153));
        respostaE.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alternativaC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(respostaC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alternativaD)
                            .addComponent(alternativaE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respostaD)
                            .addComponent(respostaE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alternativaA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(respostaA, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(alternativaB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(respostaB)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(desistir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proxima, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternativaA)
                    .addComponent(respostaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alternativaB)
                    .addComponent(respostaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respostaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alternativaC))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respostaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alternativaD))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respostaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alternativaE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desistir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(proxima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desistirActionPerformed
        usuario.setPontuacaoSessao(0);
        MenuUsuario menuUser = new MenuUsuario(usuario);
        menuUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_desistirActionPerformed

    private void proximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaActionPerformed
        QuestaoDAO qDAO = new QuestaoDAO();
        QuestaoDTO qDTO = new QuestaoDTO();

        try {
            System.out.println(nivel);
            qDTO = qDAO.retornaPergunta(nivel);
        } catch (SQLException ex) {
            Logger.getLogger(Pergunta.class.getName()).log(Level.SEVERE, null, ex);
        }
        int resp = qDTO.getAltCorreta();
        try {
            verificaResposta(resp);
        } catch (SQLException ex) {
            Logger.getLogger(Pergunta.class.getName()).log(Level.SEVERE, null, ex);
        }

        Pergunta pergunta = null;
        try {
            pergunta = new Pergunta(usuario, qDTO, nivel, progresso);
        } catch (SQLException ex) {
            Logger.getLogger(Pergunta.class.getName()).log(Level.SEVERE, null, ex);
        }
        pergunta.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_proximaActionPerformed

    //nem sei oq eu fiz
    private void verificaResposta(int altCorreta) throws SQLException {
        int altEscolhida = 0;

        if (alternativaA.isSelected()) {
            altEscolhida = 1;
        } else if (alternativaB.isSelected()) {
            altEscolhida = 2;
        } else if (alternativaC.isSelected()) {
            altEscolhida = 3;
        } else if (alternativaD.isSelected()) {
            altEscolhida = 4;
        } else if (alternativaE.isSelected()) {
            altEscolhida = 5;
        }

        UsuarioDAO uDAO = new UsuarioDAO();
        usuario = uDAO.retornaInfoPontuação(usuario);
        int pontos = usuario.getPontuacaoSessao();
        int pontosGeral = usuario.getPontuacaoGeral();

        if (altCorreta == altEscolhida) {
            pontos++;
            pontosGeral++;

            usuario.setPontuacaoSessao(pontos);
            usuario.setPontuacaoGeral(pontosGeral);
            System.out.println("Pontos sessão    " + pontos);
            System.out.println("Pontos geral     " + pontos);

            int area = questao.getArea();

            switch (area) {
                case 1:
                    int p1 = usuario.getPontuacaoA1();
                    p1++;
                    usuario.setPontuacaoA1(p1);
                    break;
                case 2:
                    int p2 = usuario.getPontuacaoA2();
                    p2++;
                    usuario.setPontuacaoA2(p2);
                    break;
                case 3:
                    int p3 = usuario.getPontuacaoA3();
                    p3++;
                    usuario.setPontuacaoA3(p3);
                    break;
                case 4:
                    int p4 = usuario.getPontuacaoA4();
                    p4++;
                    usuario.setPontuacaoA4(p4);
                    break;
                case 5:
                    int p5 = usuario.getPontuacaoA5();
                    p5++;
                    usuario.setPontuacaoA5(p5);
                    break;
                case 6:
                    int p6 = usuario.getPontuacaoA6();
                    p6++;
                    usuario.setPontuacaoA6(p6);
                    break;
                case 7:
                    int p7 = usuario.getPontuacaoA7();
                    p7++;
                    usuario.setPontuacaoA7(p7);
                    break;
                case 8:
                    int p8 = usuario.getPontuacaoA8();
                    p8++;
                    usuario.setPontuacaoA8(p8);
                    break;
                case 9:
                    int p9 = usuario.getPontuacaoA9();
                    p9++;
                    usuario.setPontuacaoA9(p9);
                    break;
            }
            uDAO.atualizaPontuação(usuario);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alterinativas;
    private javax.swing.JRadioButton alternativaA;
    private javax.swing.JRadioButton alternativaB;
    private javax.swing.JRadioButton alternativaC;
    private javax.swing.JRadioButton alternativaD;
    private javax.swing.JRadioButton alternativaE;
    private javax.swing.JProgressBar barraProgresso;
    private javax.swing.JButton desistir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pergunta;
    private javax.swing.JButton proxima;
    private javax.swing.JTextField respostaA;
    private javax.swing.JTextField respostaB;
    private javax.swing.JTextField respostaC;
    private javax.swing.JTextField respostaD;
    private javax.swing.JTextField respostaE;
    // End of variables declaration//GEN-END:variables
}
