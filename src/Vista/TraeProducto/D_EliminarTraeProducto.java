package Vista.TraeProducto;

import Controlador.Dialogos.C_Dialogos;
import Controlador.TraeProducto.C_TraeProducto;
import Vista.Menu.V_Menu;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class D_EliminarTraeProducto extends javax.swing.JDialog {

    //Objetos
    C_Dialogos cDialogos = new C_Dialogos();
    C_TraeProducto cTraePro = new C_TraeProducto();
    
    //Variables
    V_Menu vMenu;
    public int id;

    public D_EliminarTraeProducto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        btnNo = new javax.swing.JButton();
        btnSi = new javax.swing.JButton();

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

        lblMsg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(73, 131, 254));
        lblMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMsg.setText("¿ESTAS SEGURO(A) QUE DESEAS CERRAR SESIÓN?");
        jPanel1.add(lblMsg);
        lblMsg.setBounds(20, 180, 760, 60);

        btnNo.setBackground(new java.awt.Color(253, 253, 254));
        btnNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Dialogos/No.png"))); // NOI18N
        btnNo.setBorder(null);
        btnNo.setBorderPainted(false);
        btnNo.setContentAreaFilled(false);
        btnNo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNo.setFocusPainted(false);
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNo);
        btnNo.setBounds(460, 290, 300, 70);

        btnSi.setBackground(new java.awt.Color(253, 253, 254));
        btnSi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Dialogos/Si.png"))); // NOI18N
        btnSi.setBorder(null);
        btnSi.setBorderPainted(false);
        btnSi.setContentAreaFilled(false);
        btnSi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSi.setFocusPainted(false);
        btnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiActionPerformed(evt);
            }
        });
        jPanel1.add(btnSi);
        btnSi.setBounds(40, 290, 300, 70);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiActionPerformed
        if (evt.getSource() == btnSi) {
            cTraePro.eliminar(id);
            this.dispose();
        }
    }//GEN-LAST:event_btnSiActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_EliminarTraeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_EliminarTraeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_EliminarTraeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_EliminarTraeProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_EliminarTraeProducto dialog = new D_EliminarTraeProducto(new java.awt.Frame(), true);
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
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImg;
    public static javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);
        cDialogos.agregarImg(btnSi, btnNo);
    }

}
