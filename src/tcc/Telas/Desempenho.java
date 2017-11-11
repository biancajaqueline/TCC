/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.Telas;

import java.sql.SQLException;
import org.jfree.ui.RefineryUtilities;
import tcc.GraficoGeral;
import tcc.UsuarioDTO;
import tcc.Util.Mensagem;
import tcc.GraficoAreaGeral;

public class Desempenho extends javax.swing.JFrame {

    public Desempenho( UsuarioDTO usuario) {
        initComponents();
        this.usuario = usuario;
        
        
        desempenhoUsuario.setText("Sua pontuação total:  " + usuario.getPontuacaoGeral());
        desempenhoFacil.setText("Pontuação do nível fácil:  " + usuario.getPontF());
        desempenhoMedio.setText("Pontuação do nível médio:  " + usuario.getPontM());
        desempenhoDificil.setText("Pontuação do nível difícil:  " + usuario.getPontD());
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        voltar.setBackground(new java.awt.Color(0, 102, 102));
        voltar.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        desempenhoUsuario.setEditable(false);
        desempenhoUsuario.setBackground(new java.awt.Color(0, 153, 153));
        desempenhoUsuario.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N

        verGrafico.setBackground(new java.awt.Color(0, 102, 102));
        verGrafico.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        verGrafico.setText("Ver gráfico de desempenho geral");
        verGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraficoActionPerformed(evt);
            }
        });

        desempenhoFacil.setEditable(false);
        desempenhoFacil.setBackground(new java.awt.Color(255, 204, 153));
        desempenhoFacil.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N

        desempenhoMedio.setEditable(false);
        desempenhoMedio.setBackground(new java.awt.Color(255, 204, 153));
        desempenhoMedio.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N

        desempenhoDificil.setEditable(false);
        desempenhoDificil.setBackground(new java.awt.Color(255, 204, 153));
        desempenhoDificil.setFont(new java.awt.Font("Harrington", 0, 24)); // NOI18N

        verGraficoArea.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        verGraficoArea.setText("Ver gráfico de desempenho por área");
        verGraficoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGraficoAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(505, 505, 505)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(desempenhoDificil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                        .addComponent(desempenhoMedio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(desempenhoUsuario))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(desempenhoFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verGraficoArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(desempenhoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(desempenhoFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(verGraficoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(verGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(desempenhoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(desempenhoDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1095, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
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
        GraficoGeral chart = new GraficoGeral("Desempenho Geral", usuario);
        chart.setSize(560, 367);
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
        chart.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_verGraficoActionPerformed

    private void verGraficoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGraficoAreaActionPerformed
        GraficoAreaGeral chart = new GraficoAreaGeral("Desempenho", "Desempenho Geral por Area", usuario);
        chart.setSize(560, 367);
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
        chart.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }//GEN-LAST:event_verGraficoAreaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField desempenhoDificil;
    private javax.swing.JTextField desempenhoFacil;
    private javax.swing.JTextField desempenhoMedio;
    private javax.swing.JTextField desempenhoUsuario;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton verGrafico;
    private javax.swing.JButton verGraficoArea;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
