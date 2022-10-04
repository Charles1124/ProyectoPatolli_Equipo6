/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentación;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author cyt88
 */
public class MenuPrincipal extends javax.swing.JFrame {
FondoPanel fondo=new FondoPanel();
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() 
    { 
        this.setContentPane(fondo);  
        initComponents();
        tamañoPlay();
        tamañoUnirse();
    }
    public void tamañoPlay() {
        ImageIcon play;
        play = new ImageIcon(getClass().getResource("/img/play.png"));
        Icon png = new ImageIcon(play.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        btnIniciarPartida.setIcon(png);
    }

    public void tamañoUnirse() {
        ImageIcon uni;
        uni = new ImageIcon(getClass().getResource("/img/unirse.png"));
        Icon png = new ImageIcon(uni.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        btnUnirsePartida.setIcon(png);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnIniciarPartida = new javax.swing.JButton();
        btnUnirsePartida = new javax.swing.JButton();
        btnSalirJuego = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAcercaDe = new javax.swing.JMenu();
        menuInfo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Patolli");

        btnIniciarPartida.setBackground(new java.awt.Color(204, 255, 255));
        btnIniciarPartida.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnIniciarPartida.setForeground(new java.awt.Color(102, 51, 0));
        btnIniciarPartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play.png"))); // NOI18N
        btnIniciarPartida.setText("Iniciar Partida");
        btnIniciarPartida.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIniciarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarPartidaActionPerformed(evt);
            }
        });

        btnUnirsePartida.setBackground(new java.awt.Color(204, 255, 255));
        btnUnirsePartida.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnUnirsePartida.setForeground(new java.awt.Color(102, 51, 0));
        btnUnirsePartida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unirse.png"))); // NOI18N
        btnUnirsePartida.setText("Unirse a Partida");
        btnUnirsePartida.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUnirsePartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirsePartidaActionPerformed(evt);
            }
        });

        btnSalirJuego.setBackground(new java.awt.Color(204, 255, 255));
        btnSalirJuego.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        btnSalirJuego.setForeground(new java.awt.Color(102, 51, 0));
        btnSalirJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log_out.png"))); // NOI18N
        btnSalirJuego.setText("Salir del Juego");
        btnSalirJuego.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSalirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirJuegoActionPerformed(evt);
            }
        });

        menuAcercaDe.setText("Acerca De");
        menuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAcercaDeActionPerformed(evt);
            }
        });

        menuInfo.setText("Info.");
        menuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoActionPerformed(evt);
            }
        });
        menuAcercaDe.add(menuInfo);

        jMenuBar1.add(menuAcercaDe);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUnirsePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUnirsePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalirJuego)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarPartidaActionPerformed
        // TODO add your handling code here:
       MenuIniciaPartida iniciar=new MenuIniciaPartida();
       iniciar.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnIniciarPartidaActionPerformed

    private void btnSalirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirJuegoActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_btnSalirJuegoActionPerformed

    private void menuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAcercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuAcercaDeActionPerformed

    private void menuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Proyecto Final Arquitectura de Software\n" + 
        "\n\n Carlos Arturo Valle Encinas \n" + "\n\n David Sotelo Palafox \n" + "\n\n Equipo #6 \n", 
        "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuInfoActionPerformed

    private void btnUnirsePartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirsePartidaActionPerformed
        // TODO add your handling code here:
        MenuUnirsePartida unirse=new MenuUnirsePartida();
        unirse.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUnirsePartidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarPartida;
    private javax.swing.JButton btnSalirJuego;
    private javax.swing.JButton btnUnirsePartida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenuItem menuInfo;
    // End of variables declaration//GEN-END:variables

   class FondoPanel extends JPanel
   {
      private Image imagen; 

      @Override
      public void paint(Graphics g)
      {
         imagen= new ImageIcon(getClass().getResource("/img/o-ANCIENT-MAYANS-facebook.jpg")).getImage(); 
         g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this); 
         setOpaque(false);
         super.paint(g);
      }    
   }

}

