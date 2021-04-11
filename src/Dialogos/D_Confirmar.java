package Dialogos;

import Controlador.Dialogos.C_Dialogos;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class D_Confirmar extends javax.swing.JDialog {

    C_Dialogos cDialogos = new C_Dialogos();

    public D_Confirmar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnListo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 246, 250), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));
        jPanel1.setLayout(null);

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Dialogos/Error.png"))); // NOI18N
        jPanel1.add(lblImg);
        lblImg.setBounds(340, 20, 128, 128);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("¿ESTAS SEGURO(A) QUE DESEAS CERRAR SESIÓN?");
        jPanel1.add(lblMensaje);
        lblMensaje.setBounds(20, 180, 760, 60);

        btnListo.setBackground(new java.awt.Color(253, 253, 254));
        btnListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Dialogos/Listo.png"))); // NOI18N
        btnListo.setBorder(null);
        btnListo.setBorderPainted(false);
        btnListo.setContentAreaFilled(false);
        btnListo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListo.setFocusPainted(false);
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        jPanel1.add(btnListo);
        btnListo.setBounds(170, 290, 450, 70);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnListoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_Confirmar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_Confirmar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_Confirmar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_Confirmar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_Confirmar dialog = new D_Confirmar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListo;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblImg;
    public static javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);
        cDialogos.agregarImg(btnListo);
    }
}
