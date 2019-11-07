package br.com.cruzeiro.ads.brcantina.exceptions;

import javax.swing.JOptionPane;

public class ExceptionsHandler implements Thread.UncaughtExceptionHandler{

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
}
