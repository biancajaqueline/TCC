package tcc;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import tcc.Util.Mensagem;

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
    
     public static boolean validaNivel (JRadioButton campo1, JRadioButton campo2, JRadioButton campo3) {
        
        if (campo1.isSelected() || campo2.isSelected() || campo3.isSelected())
            return true;
        else
            Mensagem.msgAviso("É necessário informar um nível.");
            return false;
    }
     
     public static boolean validaPergunta (JRadioButton campo1, JRadioButton campo2, JRadioButton campo3, JRadioButton campo4, JRadioButton campo5){
         if (campo1.isSelected() || campo2.isSelected() || campo3.isSelected() || campo4.isSelected() || campo5.isSelected())
            return true;
        else
            Mensagem.msgAviso("É necessário informar uma resposta.");
            return false;
     }
}
