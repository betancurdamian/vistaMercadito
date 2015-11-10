/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

/**
 *
 * @author Ariel
 */
public class MarcoProveedor extends javax.swing.JFrame {

    private PanelProveedor hs;
    private PanelPersona hr;
    /**
     * Creates new form Proveedor
     */
    public MarcoProveedor() { 
        
        
        //llamo al constructor padre y le mando el nombre del título de la ventana 
        super("Pantalla Principal");
        
        //Función de inicialización de componentes. Netbeans la coloca por defecto
        initComponents();

        //Colocamos el nuevo tipo de layout que queremos que tenga nuestro JFrame
        this.setLayout(new BorderLayout());
        
        //Ubica el JFrame en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
        //inhabilita la modificacion del tamaño de la ventana
        this.setResizable(false);
        
        //Se instancian los paneles necesarios
        hr = new PanelPersona();
        hs = new PanelProveedor();
        
        //Añade los paneles al JFrame
        this.add(hr, BorderLayout.SOUTH);
        this.add(hs, BorderLayout.CENTER);
        
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(300, 400));
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(300, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}