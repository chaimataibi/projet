/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

/**
 *
 * @author TM 161
 */
public class NewClass {
     public static void main(String[] args) {
         sp  screen = new sp();
     principale ho =new  principale ();
    screen.setVisible(true);
     try{
     for (int x=0; x<=100;x++){
     Thread.sleep(50);
    screen.loadingnumber.setText(Integer.toString(x)+"%");
      screen.loadingprogress.setValue(x);
      if (x == 100) {
                    
                    screen.setVisible(false);
                   ho.setVisible(true);
                }
     }}
     catch (Exception e) {
        }
}}
