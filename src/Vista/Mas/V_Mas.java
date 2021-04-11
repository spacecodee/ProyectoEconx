package Vista.Mas;

import Controlador.Mas.C_Mas;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_Mas extends javax.swing.JDialog {

    C_Mas cMas = new C_Mas();

    public V_Mas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JPanel();
        btnListo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(700, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 400));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setPreferredSize(new java.awt.Dimension(700, 300));
        pnl1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 131, 254));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLAVIJO CÉSPEDES, RONNY HAROL");
        pnl1.add(jLabel1);
        jLabel1.setBounds(10, 150, 680, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(73, 131, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DESARROLLADO POR");
        pnl1.add(jLabel2);
        jLabel2.setBounds(10, 90, 680, 40);

        jPanel1.add(pnl1, java.awt.BorderLayout.PAGE_START);

        pnl2.setBackground(new java.awt.Color(245, 246, 250));
        pnl2.setMaximumSize(new java.awt.Dimension(700, 100));
        pnl2.setMinimumSize(new java.awt.Dimension(700, 100));
        pnl2.setLayout(null);

        btnListo.setBackground(new java.awt.Color(253, 253, 254));
        btnListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Mas/Listo.png"))); // NOI18N
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
        pnl2.add(btnListo);
        btnListo.setBounds(520, 30, 150, 40);

        jPanel1.add(pnl2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        if (evt.getSource() == btnListo) {
            this.dispose();
        }
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
            java.util.logging.Logger.getLogger(V_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Mas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_Mas dialog = new V_Mas(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        new RSMoveWindow().setMoveWindow(this);
        this.setLocationRelativeTo(null);
        cMas.agregarImg(btnListo);
    }
}
