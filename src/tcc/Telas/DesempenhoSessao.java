/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.Telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;
import tcc.GráficoSessao;
import tcc.UsuarioDTO;
import tcc.Util.Mensagem;

public class DesempenhoSessao extends javax.swing.JFrame {

    UsuarioDTO usuario;
    int nivel;

    public DesempenhoSessao(UsuarioDTO usuario, int nivel) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.usuario = usuario;
        this.nivel = nivel;
        pontuacaoSessao.setBorder(null);
        pontuacaoSessao.setText("" + usuario.getPontuacaoSessao());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pontuacaoSessao = new javax.swing.JTextField();
        desempenho = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        verGraficoDesempenho = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel1.setText("Fim do Teste!");

        pontuacaoSessao.setEditable(false);
        pontuacaoSessao.setBackground(new java.awt.Color(0, 153, 153));
        pontuacaoSessao.setFont(new java.awt.Font("Harrington", 1, 60)); // NOI18N
        pontuacaoSessao.setForeground(new java.awt.Color(255, 102, 51));
        pontuacaoSessao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        desempenho.setBackground(new java.awt.Color(255, 153, 102));
        desempenho.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        desempenho.setText("Ver desempenho geral");
        desempenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desempenhoActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(255, 153, 102));
        menu.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        menu.setText("Voltar ao menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        verGraficoDesempenho.setBackground(new java.awt.Color(255, 153, 102));
        verGraficoDesempenho.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        verGraficoDesempenho.setText("Ver gráfico de desempenho");
        verGraficoDesempenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraficoDesempenhoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel2.setText("PONTOS");

        jLabel3.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel3.setText("VOCÊ FEZ");

        jLabel4.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jLabel4.setText("DO TOTAL DE 20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(703, 703, 703)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desempenho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verGraficoDesempenho))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(pontuacaoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(344, 344, 344)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))))
                .addContainerGap(1088, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pontuacaoSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(desempenho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(verGraficoDesempenho, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(281, Short.MAX_VALUE))
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

    private void desempenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desempenhoActionPerformed
        try {
            Desempenho desempenhoUser = new Desempenho(usuario);
            desempenhoUser.setVisible(true);
        this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(DesempenhoSessao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_desempenhoActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        MenuUsuario menuUser;
        try {
            menuUser = new MenuUsuario(usuario);
            menuUser.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Mensagem.msgErro("Erro de conexão com o banco de dados.");
        }

    }//GEN-LAST:event_menuActionPerformed

    private void verGraficoDesempenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraficoDesempenhoActionPerformed
        JFrame frame = new JFrame("Desempenho por Área");
        GráficoSessao chart = new GráficoSessao("Desempenho", usuario);
        chart.setSize(600, 400);
        frame.add(chart.createDemoPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        RefineryUtilities.centerFrameOnScreen(frame);
    }//GEN-LAST:event_verGraficoDesempenhoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton desempenho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menu;
    private javax.swing.JTextField pontuacaoSessao;
    private javax.swing.JButton verGraficoDesempenho;
    // End of variables declaration//GEN-END:variables
}
