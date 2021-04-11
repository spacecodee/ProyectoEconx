package Vista.Boleta;

import Controlador.Boleta.C_Boleta;
import java.awt.Color;
import javax.swing.UIManager;
import rojeru_san.complementos.RSMoveWindow;

public class V_TablaProProd extends javax.swing.JDialog {

    C_Boleta cBoleta = new C_Boleta();
    int id;
    String verificar;

    public V_TablaProProd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ini();
    }

    public V_TablaProProd(java.awt.Frame parent, boolean modal, String verificar) {
        super(parent, modal);
        ini();
        this.verificar = verificar;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        arriba = new javax.swing.JPanel();
        centro = new javax.swing.JPanel();
        jspTabla = new javax.swing.JScrollPane();
        tbl = new rojerusan.RSTableMetro();
        txtBuscar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        abajo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(253, 253, 254));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel1.setForeground(new java.awt.Color(253, 253, 254));
        jPanel1.setLayout(new java.awt.BorderLayout());

        arriba.setBackground(new java.awt.Color(253, 253, 254));
        arriba.setPreferredSize(new java.awt.Dimension(1000, 50));

        javax.swing.GroupLayout arribaLayout = new javax.swing.GroupLayout(arriba);
        arriba.setLayout(arribaLayout);
        arribaLayout.setHorizontalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        arribaLayout.setVerticalGroup(
            arribaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(arriba, java.awt.BorderLayout.PAGE_START);

        centro.setBackground(new java.awt.Color(253, 253, 254));
        centro.setPreferredSize(new java.awt.Dimension(1000, 450));
        centro.setLayout(null);

        jspTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(73, 131, 254), 0));

        tbl.setBackground(new java.awt.Color(253, 253, 254));
        tbl.setForeground(new java.awt.Color(253, 253, 254));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROVEEDOR", "PRODUCTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setBackgoundHead(new java.awt.Color(73, 131, 254));
        tbl.setBackgoundHover(new java.awt.Color(73, 131, 254));
        tbl.setColorBorderHead(new java.awt.Color(253, 253, 254));
        tbl.setColorBorderRows(new java.awt.Color(253, 253, 254));
        tbl.setColorPrimaryText(new java.awt.Color(73, 131, 254));
        tbl.setColorSecundaryText(new java.awt.Color(73, 131, 254));
        tbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl.setFontHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl.setFontRowHover(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbl.setGridColor(new java.awt.Color(73, 131, 254));
        tbl.setHighHead(40);
        tbl.setRowHeight(30);
        tbl.setSelectionBackground(new java.awt.Color(73, 131, 254));
        tbl.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl.getTableHeader().setResizingAllowed(false);
        tbl.getTableHeader().setReorderingAllowed(false);
        tbl.setWidthBorderHead(0);
        tbl.setWidthBorderRows(0);
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jspTabla.setViewportView(tbl);

        centro.add(jspTabla);
        jspTabla.setBounds(30, 112, 920, 320);

        txtBuscar.setBackground(new java.awt.Color(253, 253, 254));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(73, 131, 254));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(73, 131, 254));
        txtBuscar.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        centro.add(txtBuscar);
        txtBuscar.setBounds(30, 50, 370, 50);

        jSeparator2.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator2.setForeground(new java.awt.Color(73, 131, 254));
        centro.add(jSeparator2);
        jSeparator2.setBounds(30, 100, 370, 10);

        jPanel1.add(centro, java.awt.BorderLayout.CENTER);

        abajo.setBackground(new java.awt.Color(245, 246, 250));
        abajo.setMinimumSize(new java.awt.Dimension(1000, 100));
        abajo.setPreferredSize(new java.awt.Dimension(1000, 100));
        abajo.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(245, 246, 250));
        jPanel2.setLayout(null);

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
        jPanel2.add(btnCancel);
        btnCancel.setBounds(660, 40, 150, 40);

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
        jPanel2.add(btnSave);
        btnSave.setBounds(820, 40, 150, 40);

        abajo.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel1.add(abajo, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        if (evt.getSource() == btnCancel) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (evt.getSource() == btnSave) {
            if (verificar.equals("Agregar")) {
                cBoleta.traer(tbl, "Agregar");
            } else if (verificar.equals("Actualizar")) {
                cBoleta.traer(tbl, "Actualizar");
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        if (evt.getSource() == tbl) {
        }
    }//GEN-LAST:event_tblMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (evt.getSource() == txtBuscar) {
            cBoleta.mostrarTablita(tbl, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getSource() == txtBuscar) {
            cBoleta.verif(evt, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_TablaProProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_TablaProProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_TablaProProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_TablaProProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                V_TablaProProd dialog = new V_TablaProProd(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel abajo;
    private javax.swing.JPanel arriba;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel centro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JScrollPane jspTabla;
    public static rojerusan.RSTableMetro tbl;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        this.setLocationRelativeTo(null);
        new RSMoveWindow().setMoveWindow(this);

        jspTabla.getViewport().setBackground(new Color(253, 253, 254));
        cBoleta.mostrarTablita(tbl);
        cBoleta.fantasmaText(txtBuscar, "Buscar por codigo");
        cBoleta.agregarImg(btnCancel, btnSave);
    }
}
