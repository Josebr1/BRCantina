package br.com.cruzeiro.ads.brcantina.exceptions;

import javax.swing.JOptionPane;

public class ShowableException extends Exception{
    public void notifyUserWithToast() {
        JOptionPane.showMessageDialog(null, toString(), "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
}
