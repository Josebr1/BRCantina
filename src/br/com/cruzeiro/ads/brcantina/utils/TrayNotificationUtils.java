/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeiro.ads.brcantina.utils;

import tray.notification.NotificationType;
import tray.notification.TrayNotification;


/**
 *
 * @author jose.antonio
 */
public class TrayNotificationUtils {
    
    public static void success(String title, String message) {
        TrayNotification tray = new TrayNotification();
        tray.setTitle(title);
        tray.setMessage(message);
        tray.setNotificationType(NotificationType.SUCCESS);
        tray.showAndWait();
    }
    
}
