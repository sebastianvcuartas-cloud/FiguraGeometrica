/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurageometrica;
import Vista.VistaRectangulo;
/**
 *
 * @author USUARIO
 */
public class FiguraGeometrica {
     public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               
                VistaRectangulo Vista = new VistaRectangulo();
                
              
                Vista.setLocationRelativeTo(null);
                
             
                Vista.setVisible(true);
            }
        });
    }
    }
