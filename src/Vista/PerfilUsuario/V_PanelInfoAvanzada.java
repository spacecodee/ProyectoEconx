package Vista.PerfilUsuario;

import Controlador.Perfil.C_Perfil;
import Modelo.Usuario.M_UsuarioLogin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class V_PanelInfoAvanzada extends javax.swing.JPanel {

    M_UsuarioLogin mUsuarioLogin;
    C_Perfil cPerfil = new C_Perfil();
    SimpleDateFormat txtFecha = new SimpleDateFormat("yyyy-MM-dd");
    Date txtDate;
    String fecha;

    public V_PanelInfoAvanzada() {
        initComponents();
    }

    public V_PanelInfoAvanzada(M_UsuarioLogin mUsuarioLogin) {
        ini();
        this.mUsuarioLogin = mUsuarioLogin;

        try {
            //
            txtDate = txtFecha.parse(mUsuarioLogin.getFechaNacimiento());
            dtFecha.setDatoFecha(txtDate);
            //
        } catch (ParseException ex) {
            Logger.getLogger(V_PanelInfoAvanzada.class.getName()).log(Level.SEVERE, null, ex);
        }

        txtRoll.setText(mUsuarioLogin.getRoll());
        dtFecha.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImgPerfil = new javax.swing.JLabel();
        dtFecha = new rojeru_san.rsdate.RSDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtRoll = new javax.swing.JTextField();

        setBackground(new java.awt.Color(245, 246, 250));
        setMaximumSize(new java.awt.Dimension(800, 700));
        setLayout(null);

        lblImgPerfil.setBackground(new java.awt.Color(245, 246, 250));
        lblImgPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImgPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/userPerfil.png"))); // NOI18N
        add(lblImgPerfil);
        lblImgPerfil.setBounds(310, 30, 128, 128);

        dtFecha.setBackground(new java.awt.Color(245, 246, 250));
        dtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        dtFecha.setForeground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorBackground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorButtonHover(new java.awt.Color(36, 101, 239));
        dtFecha.setColorDiaActual(new java.awt.Color(73, 131, 254));
        dtFecha.setColorForeground(new java.awt.Color(73, 131, 254));
        dtFecha.setColorSelForeground(new java.awt.Color(245, 246, 250));
        dtFecha.setColorTextDiaActual(new java.awt.Color(245, 246, 250));
        dtFecha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtFecha.setFuente(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dtFecha.setPlaceholder("SELECCIONE SU FECHA");
        add(dtFecha);
        dtFecha.setBounds(210, 260, 370, 50);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Fecha.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(150, 260, 50, 50);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Roll.png"))); // NOI18N
        add(jLabel8);
        jLabel8.setBounds(150, 350, 50, 50);

        jSeparator8.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator8.setForeground(new java.awt.Color(73, 131, 254));
        add(jSeparator8);
        jSeparator8.setBounds(210, 400, 370, 10);

        btnSave.setBackground(new java.awt.Color(253, 253, 254));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnG.png"))); // NOI18N
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
        add(btnSave);
        btnSave.setBounds(160, 570, 450, 70);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        add(lblMensaje);
        lblMensaje.setBounds(20, 490, 760, 50);

        btnEdit.setBackground(new java.awt.Color(253, 253, 254));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Perfil/btnE.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setBorderPainted(false);
        btnEdit.setContentAreaFilled(false);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.setFocusPainted(false);
        btnEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        add(btnEdit);
        btnEdit.setBounds(580, 30, 200, 70);

        txtRoll.setBackground(new java.awt.Color(245, 246, 250));
        txtRoll.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtRoll.setForeground(new java.awt.Color(73, 131, 254));
        txtRoll.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRoll.setBorder(null);
        txtRoll.setCaretColor(new java.awt.Color(73, 131, 254));
        txtRoll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRollKeyTyped(evt);
            }
        });
        add(txtRoll);
        txtRoll.setBounds(210, 350, 370, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {
            if (cPerfil.actualizarInfoAvanzada(dtFecha, mUsuarioLogin.getId(), lblMensaje)) {
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        dtFecha.setEnabled(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtRollKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRollKeyTyped
        if (evt.getSource() == txtRoll) {
        }
    }//GEN-LAST:event_txtRollKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private rojeru_san.rsdate.RSDateChooser dtFecha;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblImgPerfil;
    public static javax.swing.JLabel lblMensaje;
    public static javax.swing.JTextField txtRoll;
    // End of variables declaration//GEN-END:variables
    private void ini() {
        initComponents();
        cPerfil.imgPerfil(btnSave, btnEdit);
        txtRoll.setEnabled(false);
        dtFecha.setEnabled(false);
        lblMensaje.setText(null);
    }

}
