package tcc.Telas;

import java.sql.SQLException;
import tcc.Util.Mensagem;
import tcc.UsuarioDAO;
import tcc.UsuarioDTO;
import tcc.Validacao;
import org.apache.commons.codec.digest.DigestUtils;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro(UsuarioDTO usuario) {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nome = new javax.swing.JTextField();
        NomeUsuario = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        feminino = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Sobrenome = new javax.swing.JTextField();
        senhaUsuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel2.setText("Usuário");

        jLabel3.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel3.setText("Senha");

        jLabel4.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel4.setText("Sexo");

        jLabel5.setFont(new java.awt.Font("Forte", 0, 48)); // NOI18N
        jLabel5.setText("Cadastro");

        Nome.setBackground(new java.awt.Color(204, 204, 204));
        Nome.setToolTipText("Insira seu nome");
        Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeActionPerformed(evt);
            }
        });

        NomeUsuario.setBackground(new java.awt.Color(204, 204, 204));
        NomeUsuario.setToolTipText("Inisira seu nome de usuário");

        confirmar.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/checked.png"))); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setToolTipText("Botão para confirmar cadastro");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancel24.png"))); // NOI18N
        cancelar.setText("  Cancelar");
        cancelar.setToolTipText("Botão para cancelar cadastro");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        feminino.setBackground(new java.awt.Color(0, 153, 153));
        sexo.add(feminino);
        feminino.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        feminino.setText("Feminino");
        feminino.setToolTipText("Sexo feminino");

        masculino.setBackground(new java.awt.Color(0, 153, 153));
        sexo.add(masculino);
        masculino.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        masculino.setText("Masculino");
        masculino.setToolTipText("Sexo masculino");

        jLabel6.setFont(new java.awt.Font("Harrington", 0, 14)); // NOI18N
        jLabel6.setText("Sobrenome");

        Sobrenome.setBackground(new java.awt.Color(204, 204, 204));
        Sobrenome.setToolTipText("Insira seu sobrenome");

        senhaUsuario.setBackground(new java.awt.Color(204, 204, 204));
        senhaUsuario.setToolTipText("Insira sua senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(feminino)
                                .addGap(18, 18, 18)
                                .addComponent(masculino))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(senhaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(NomeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Sobrenome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nome, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5)))
                .addGap(150, 150, 150))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(feminino)
                        .addComponent(masculino)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_cancelarActionPerformed

    private void NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeActionPerformed

    }//GEN-LAST:event_NomeActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (Validacao.validaTexto(Nome) && Validacao.validaTexto(Sobrenome) && Validacao.validaTexto(NomeUsuario) && Validacao.validaSenha(senhaUsuario)
                && Validacao.validaSexo(feminino, masculino)) {

            UsuarioDTO usuarioDTO = new UsuarioDTO();
            usuarioDTO.setNome(Nome.getText());
            usuarioDTO.setSobrenome(Sobrenome.getText());
            usuarioDTO.setLogin(NomeUsuario.getText());
            usuarioDTO.setSenha(DigestUtils.sha1Hex(String.copyValueOf(senhaUsuario.getPassword())));

            String valSexo = null;

            if (feminino.isSelected()) {
                valSexo = "F";
            } else if (masculino.isSelected()) {
                valSexo = "M";
            }

            usuarioDTO.setSexo(valSexo);

            UsuarioDAO usuarioDAO = new UsuarioDAO();
            try {
                usuarioDAO.incluiUsuario(usuarioDTO);
                Mensagem.msgInfo("Usuário cadastrado no sistema!");
                MenuUsuario menuUser = new MenuUsuario(usuarioDTO);
                menuUser.setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Mensagem.msgErro("Erro de cadastro de usuário, tente novamente.");
            }

        }

    }//GEN-LAST:event_confirmarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nome;
    private javax.swing.JTextField NomeUsuario;
    private javax.swing.JTextField Sobrenome;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton confirmar;
    private javax.swing.JRadioButton feminino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
}
