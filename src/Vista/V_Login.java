package Vista;

import Controlador.C_Total;
import Controlador.C_Login;
import javax.swing.UIManager;

public class V_Login extends javax.swing.JFrame {

    C_Login cLogin = new C_Login();
    C_Total cTotal = new C_Total();

    public V_Login() {
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlL = new javax.swing.JPanel();
        pnlLogim = new javax.swing.JPanel();
        pnl1 = new javax.swing.JPanel();
        lblMinimizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        pwsPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        lblMensaje = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        pnl3 = new javax.swing.JPanel();
        pnlImg = new javax.swing.JPanel();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 900));
        setMinimumSize(new java.awt.Dimension(1500, 900));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 900));

        pnlL.setBackground(new java.awt.Color(255, 255, 255));
        pnlL.setLayout(new java.awt.GridLayout(1, 0));

        pnlLogim.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogim.setLayout(new java.awt.BorderLayout());

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setMaximumSize(new java.awt.Dimension(750, 100));
        pnl1.setMinimumSize(new java.awt.Dimension(750, 100));
        pnl1.setPreferredSize(new java.awt.Dimension(750, 100));
        pnl1.setLayout(null);

        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/mini.png"))); // NOI18N
        lblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });
        pnl1.add(lblMinimizar);
        lblMinimizar.setBounds(60, 10, 30, 30);

        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimi.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        pnl1.add(lblCerrar);
        lblCerrar.setBounds(20, 10, 30, 30);

        pnlLogim.add(pnl1, java.awt.BorderLayout.PAGE_START);

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setLayout(null);

        pwsPass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pwsPass.setForeground(new java.awt.Color(73, 131, 254));
        pwsPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwsPass.setBorder(null);
        pwsPass.setCaretColor(new java.awt.Color(73, 131, 254));
        pwsPass.setMaximumSize(new java.awt.Dimension(460, 50));
        pwsPass.setMinimumSize(new java.awt.Dimension(460, 50));
        pwsPass.setPreferredSize(new java.awt.Dimension(460, 50));
        pwsPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pwsPassKeyTyped(evt);
            }
        });
        pnl2.add(pwsPass);
        pwsPass.setBounds(150, 290, 460, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        pnl2.add(jSeparator2);
        jSeparator2.setBounds(150, 340, 460, 10);

        lblMensaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(73, 131, 254));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensaje.setText("TODOS LOS CAMPOS SON NECESARIOS");
        pnl2.add(lblMensaje);
        lblMensaje.setBounds(140, 370, 490, 50);

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(73, 131, 254));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(73, 131, 254));
        txtUsuario.setMaximumSize(new java.awt.Dimension(460, 50));
        txtUsuario.setMinimumSize(new java.awt.Dimension(460, 50));
        txtUsuario.setPreferredSize(new java.awt.Dimension(460, 50));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        pnl2.add(txtUsuario);
        txtUsuario.setBounds(150, 200, 460, 50);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        pnl2.add(jSeparator1);
        jSeparator1.setBounds(150, 250, 460, 10);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/Pass.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl2.add(jLabel1);
        jLabel1.setBounds(80, 290, 50, 50);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/ID.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnl2.add(jLabel2);
        jLabel2.setBounds(80, 200, 50, 50);

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Login/btnLogin.png"))); // NOI18N
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnl2.add(btnLogin);
        btnLogin.setBounds(150, 440, 450, 70);

        pnlLogim.add(pnl2, java.awt.BorderLayout.CENTER);

        pnl3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlLogim.add(pnl3, java.awt.BorderLayout.PAGE_END);

        pnlL.add(pnlLogim);

        pnlImg.setBackground(new java.awt.Color(255, 255, 255));
        pnlImg.setLayout(new java.awt.BorderLayout());

        lblImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/paisaje.jpg"))); // NOI18N
        pnlImg.add(lblImg, java.awt.BorderLayout.CENTER);

        pnlL.add(pnlImg);

        getContentPane().add(pnlL, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        if (evt.getSource() == lblMinimizar) {
            cTotal.minimizar(this);
        }
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        if (evt.getSource() == lblCerrar) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if (evt.getSource() == txtUsuario) {
            cLogin.verif(evt, txtUsuario, lblMensaje);
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void pwsPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwsPassKeyTyped
        if (evt.getSource() == pwsPass) {
            cLogin.verif(pwsPass, lblMensaje);
        }
    }//GEN-LAST:event_pwsPassKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (evt.getSource() == btnLogin) {
            if (!cLogin.textVacio(evt, txtUsuario, pwsPass, lblMensaje)) {
                cLogin.login(this, evt, txtUsuario, pwsPass, lblMensaje);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblImg;
    public javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnlImg;
    private javax.swing.JPanel pnlL;
    private javax.swing.JPanel pnlLogim;
    private javax.swing.JPasswordField pwsPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        lblMensaje.setText("");
        cTotal.ini(this);
        cLogin.agregarImg(btnLogin);
        cLogin.textFantasma(txtUsuario, pwsPass);
    }
}
