package Vista.PerfilUsuario;

import Controlador.Perfil.C_Perfil;
import Modelo.Usuario.M_UsuarioLogin;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_Perfil extends javax.swing.JDialog {

    C_Perfil cPerfil = new C_Perfil();

    M_UsuarioLogin mUsuarioLogin;
    V_PanelPerfilPrincipal vPanelPrin;

    public V_Perfil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    public V_Perfil(java.awt.Frame parent, boolean modal, M_UsuarioLogin mUsuarioLogin) {
        super(parent, modal);
        ini();
        this.mUsuarioLogin = mUsuarioLogin;
        cPerfil.botonMenuPerfilP(pnlEntorno, mUsuarioLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCambiarC = new javax.swing.JButton();
        btnInfoBasica = new javax.swing.JButton();
        btnInfoAvanzada = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pnlEntorno = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(245, 246, 250), 4, true));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 800));
        jPanel2.setLayout(null);

        btnCambiarC.setBackground(new java.awt.Color(253, 253, 254));
        btnCambiarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnCambiarC.png"))); // NOI18N
        btnCambiarC.setBorder(null);
        btnCambiarC.setBorderPainted(false);
        btnCambiarC.setContentAreaFilled(false);
        btnCambiarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarC.setFocusPainted(false);
        btnCambiarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarCActionPerformed(evt);
            }
        });
        jPanel2.add(btnCambiarC);
        btnCambiarC.setBounds(0, 310, 200, 60);

        btnInfoBasica.setBackground(new java.awt.Color(253, 253, 254));
        btnInfoBasica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnInfBas.png"))); // NOI18N
        btnInfoBasica.setBorder(null);
        btnInfoBasica.setBorderPainted(false);
        btnInfoBasica.setContentAreaFilled(false);
        btnInfoBasica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfoBasica.setFocusPainted(false);
        btnInfoBasica.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfoBasica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoBasicaActionPerformed(evt);
            }
        });
        jPanel2.add(btnInfoBasica);
        btnInfoBasica.setBounds(0, 190, 200, 60);

        btnInfoAvanzada.setBackground(new java.awt.Color(253, 253, 254));
        btnInfoAvanzada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnInfA.png"))); // NOI18N
        btnInfoAvanzada.setBorder(null);
        btnInfoAvanzada.setBorderPainted(false);
        btnInfoAvanzada.setContentAreaFilled(false);
        btnInfoAvanzada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfoAvanzada.setFocusPainted(false);
        btnInfoAvanzada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfoAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoAvanzadaActionPerformed(evt);
            }
        });
        jPanel2.add(btnInfoAvanzada);
        btnInfoAvanzada.setBounds(0, 250, 200, 60);

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenu);
        btnMenu.setBounds(130, 20, 50, 50);
        btnMenu.getAccessibleContext().setAccessibleName("btnMenu");

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(245, 246, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel3.setLayout(new java.awt.BorderLayout());

        pnlEntorno.setBackground(new java.awt.Color(245, 246, 250));
        pnlEntorno.setPreferredSize(new java.awt.Dimension(800, 700));
        pnlEntorno.setLayout(new java.awt.BorderLayout());
        jPanel3.add(pnlEntorno, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(245, 246, 250));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 100));
        jPanel4.setLayout(null);

        btnCancel.setBackground(new java.awt.Color(253, 253, 254));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Cancelar.png"))); // NOI18N
        btnCancel.setBorder(null);
        btnCancel.setBorderPainted(false);
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel4.add(btnCancel);
        btnCancel.setBounds(470, 30, 150, 40);

        btnSave.setBackground(new java.awt.Color(253, 253, 254));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Guardar.png"))); // NOI18N
        btnSave.setBorder(null);
        btnSave.setBorderPainted(false);
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setFocusPainted(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave);
        btnSave.setBounds(630, 30, 150, 40);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnInfoBasicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoBasicaActionPerformed
        if (evt.getSource() == btnInfoBasica) {
            cPerfil.PanelInfoBasica(pnlEntorno, mUsuarioLogin);
        }
    }//GEN-LAST:event_btnInfoBasicaActionPerformed

    private void btnInfoAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoAvanzadaActionPerformed
        if (evt.getSource() == btnInfoAvanzada) {
            cPerfil.PanelInfoAvanzada(pnlEntorno, mUsuarioLogin);
        }
    }//GEN-LAST:event_btnInfoAvanzadaActionPerformed

    private void btnCambiarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCActionPerformed
        if (cPerfil.botonCambiarPass(evt, btnCambiarC, mUsuarioLogin)) {
            
        }
    }//GEN-LAST:event_btnCambiarCActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (evt.getSource() == btnMenu) {
            cPerfil.botonMenuPerfilP(pnlEntorno, mUsuarioLogin);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_Perfil dialog = new V_Perfil(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCambiarC;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnInfoAvanzada;
    private javax.swing.JButton btnInfoBasica;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel pnlEntorno;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);
        cPerfil.imgP(btnSave, btnCancel, btnInfoBasica, btnCambiarC, btnInfoAvanzada);
    }
}
