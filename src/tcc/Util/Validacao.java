package tcc.Util;

import tcc.Util.Mensagem;
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
    
    public static char validaSexo(JRadioButton campo) {
        char sexo = 0;
       // if (Character.copyValueOf(campo.getV))
       return sexo;
    }
    

}
