/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.Telas;

import java.sql.SQLException;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;
import tcc.GraficoGeral;
import tcc.UsuarioDTO;
import tcc.Util.Mensagem;
import tcc.GraficoAreaGeral;
import tcc.UsuarioDAO;

public class Desempenho extends javax.swing.JFrame {

    public Desempenho(UsuarioDTO usuario) throws SQLException {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.usuario = usuario;
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.retornaInfoPontuação(usuario);
        
        desempenhoUsuario.setText("" + usuario.getPontuacaoGeral());
        desempenhoFacil.setText("" + usuario.getPontF());
        desempenhoMedio.setText("" + usuario.getPontM());
        desempenhoDificil.setText("" + usuario.getPontD());
        
        desempenhoUsuario.setBorder(null);
        desempenhoFacil.setBorder(null);
        desempenhoMedio.setBorder(null);
        desempenhoDificil.setBorder(null);
        
    }

    UsuarioDTO usuario;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        desempenhoUsuario = new javax.swing.JTextField();
        verGrafico = new javax.swing.JButton();
        desempenhoFacil = new javax.swing.JTextField();
        desempenhoMedio = new javax.swing.JTextField();
        desempenhoDificil = new javax.swing.JTextField();
        verGraficoArea = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        voltar.setBackground(new java.awt.Color(0, 153, 153));
        voltar.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        voltar.setText("Voltar ao menu");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        desempenhoUsuario.setEditable(false);
        desempenhoUsuario.setBackground(new java.awt.Color(255, 153, 102));
        desempenhoUsuario.setFont(new java.awt.Font("Harrington", 1, 60)); // NOI18N
        desempenhoUsuario.setForeground(new java.awt.Color(0, 102, 102));
        desempenhoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        verGrafico.setBackground(new java.awt.Color(0, 153, 153));
        verGrafico.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        verGrafico.setText("Ver gráfico de desempenho geral");
        verGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraficoActionPerformed(evt);
            }
        });

        desempenhoFacil.setEditable(false);
        desempenhoFacil.setBackground(new java.awt.Color(255, 153, 102));
        desempenhoFacil.setFont(new java.awt.Font("Harrington", 1, 60)); // NOI18N
        desempenhoFacil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        desempenhoMedio.setEditable(false);
        desempenhoMedio.setBackground(new java.awt.Color(255, 153, 102));
        desempenhoMedio.setFont(new java.awt.Font("Harrington", 1, 60)); // NOI18N
        desempenhoMedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        desempenhoDificil.setEditable(false);
        desempenhoDificil.setBackground(new java.awt.Color(255, 153, 102));
        desempenhoDificil.setFont(new java.awt.Font("Harrington", 1, 60)); // NOI18N
        desempenhoDificil.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        verGraficoArea.setBackground(new java.awt.Color(0, 153, 153));
        verGraficoArea.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        verGraficoArea.setText("Ver gráfico de desempenho por área");
        verGraficoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraficoAreaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel1.setText("PONTUAÇÃO DO NÍVEL DIFÍCIL:");

        jLabel2.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel2.setText("PONTOS");

        jLabel3.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel3.setText("VOCÊ TEM UM TOTAL DE");

        jLabel4.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel4.setText("PONTUAÇÃO DO NÍVEL MÉDIO:");

        jLabel5.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel5.setText("PONTUAÇÃO DO NÍVEL FÁCIL:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desempenhoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2)))
                        .addGap(123, 123, 123)
                        .addComponent(desempenhoFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(480, 480, 480)
                        .addComponent(desempenhoDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(471, 471, 471)
                                .addComponent(desempenhoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(155, 155, 155))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(145, 145, 145)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verGraficoArea, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(jLabel5)))
                .addContainerGap(581, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jLabel3)
                    .addContainerGap(1482, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desempenhoFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(verGraficoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(verGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(desempenhoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desempenhoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(desempenhoDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1155, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(263, 263, 263)
                    .addComponent(jLabel3)
                    .addContainerGap(1482, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 105, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

        try {
            MenuUsuario menuUser = new MenuUsuario(usuario);
            menuUser.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Mensagem.msgErro("Erro de conexão com o banco de dados.");
        }
    }//GEN-LAST:event_voltarActionPerformed

    private void verGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraficoActionPerformed
        JFrame frame = new JFrame("Desempenho por Área");
        GraficoGeral chart = new GraficoGeral("Desempenho Geral", usuario);
        chart.setSize(600, 400);
        frame.add(chart.createDemoPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        RefineryUtilities.centerFrameOnScreen(frame);
    }//GEN-LAST:event_verGraficoActionPerformed


    private void verGraficoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraficoAreaActionPerformed
        JFrame frame = new JFrame("Desempenho por Área");
        GraficoAreaGeral chart = new GraficoAreaGeral("Desempenho", usuario);
        chart.setSize(600, 600);
        frame.add(chart.createDemoPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        RefineryUtilities.centerFrameOnScreen(frame);
        
    }//GEN-LAST:event_verGraficoAreaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desempenhoDificil;
    private javax.swing.JTextField desempenhoFacil;
    private javax.swing.JTextField desempenhoMedio;
    private javax.swing.JTextField desempenhoUsuario;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton verGrafico;
    private javax.swing.JButton verGraficoArea;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
