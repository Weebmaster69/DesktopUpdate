/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.desktopupdate;
import java.io.File;
import com.threerings.getdown.util.LaunchUtil;
/**
 *
 * @author Gonzalo
 */
public class Principal {
    public static void main (String[] args){
        if (args.length > 0) {
            final File appdir = new File(args[0]);
            new Thread() {
                @Override public void run () {
                    LaunchUtil.upgradeGetdown(new File(appdir, "getdown-old.jar"),
                                              new File(appdir, "getdown.jar"),
                                              new File(appdir, "getdown-new.jar"));
                }
            }.start();
        }
        Ventana v = new Ventana();
        v.setVisible(true);
    }
}
