/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcc.Telas;

import tcc.UsuarioDTO;

/**
 *
 * @author usuario
 */
public class Pergunta extends javax.swing.JFrame {

    /**
     * Creates new form Escolha
     */
    public Pergunta(UsuarioDTO usuario) {
        this.usuario = usuario;
        initComponents();
        
    }

    UsuarioDTO usuario;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterinativas = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alternativaA = new javax.swing.JRadioButton();
        alternativaB = new javax.swing.JRadioButton();
        alternativaC = new javax.swing.JRadioButton();
        alternativaD = new javax.swing.JRadioButton();
        alternativaE = new javax.swing.JRadioButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        proxima = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pergunta = new javax.swing.JTextArea();
        desistir = new javax.swing.JButton();

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

        proxima.setText("Próxima");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alternativaE)
                    .addComponent(alternativaD)
                    .addComponent(alternativaC)
                    .addComponent(alternativaB)
                    .addComponent(alternativaA))
                .addGap(495, 495, 495))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desistir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proxima)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(alternativaA)
                .addGap(18, 18, 18)
                .addComponent(alternativaB)
                .addGap(18, 18, 18)
                .addComponent(alternativaC)
                .addGap(18, 18, 18)
                .addComponent(alternativaD)
                .addGap(18, 18, 18)
                .addComponent(alternativaE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desistir)
                    .addComponent(proxima))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        MenuUsuario menuUser = new MenuUsuario(usuario);
        menuUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_desistirActionPerformed

    private void proximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximaActionPerformed
        Pergunta pergunta = new Pergunta(usuario);
        pergunta.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_proximaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alterinativas;
    private javax.swing.JRadioButton alternativaA;
    private javax.swing.JRadioButton alternativaB;
    private javax.swing.JRadioButton alternativaC;
    private javax.swing.JRadioButton alternativaD;
    private javax.swing.JRadioButton alternativaE;
    private javax.swing.JButton desistir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pergunta;
    private javax.swing.JButton proxima;
    // End of variables declaration//GEN-END:variables
}
