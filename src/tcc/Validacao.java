package tcc;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Validacao {

    public static boolean validaTexto(JTextField campo) {
        if (campo.getText().trim().isEmpty()) {
            Mensagem.msgErro(campo.getToolTipText());
            campo.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean validaSenha(JPasswordField campo) {
        if (String.copyValueOf(campo.getPassword()).trim().isEmpty()) {
            Mensagem.msgErro(campo.getToolTipText());
            campo.requestFocus();
            return false;
        }
        return true;
    }
    
    public static boolean validaSexo (JRadioButton campo1, JRadioButton campo2) {
        
        if (campo1.isSelected() || campo2.isSelected())
            return true;
        else
            Mensagem.msgAviso("É necessário informar um sexo.");
            return false;
    }
}
