package Vista.Boleta;

import Controlador.Boleta.C_Boleta;
import Controlador.Dialogos.C_Dialogos;
import java.awt.Color;

public class V_PanelBoletaNueva extends javax.swing.JPanel {

    //Objetos
    C_Dialogos cDialogos = new C_Dialogos();
    C_Boleta cBoleta = new C_Boleta();
    int id;

    public V_PanelBoletaNueva() {
        ini();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUsu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        pnlCentro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        jspTabla = new javax.swing.JScrollPane();
        tblBoleta = new rojerusan.RSTableMetro();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnFac = new javax.swing.JButton();
        btnFacturarTodo = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1200, 850));
        setMinimumSize(new java.awt.Dimension(1200, 850));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        setLayout(new java.awt.BorderLayout());

        pnlUsu.setBackground(new java.awt.Color(253, 253, 254));
        pnlUsu.setMaximumSize(new java.awt.Dimension(1200, 850));
        pnlUsu.setMinimumSize(new java.awt.Dimension(1200, 850));
        pnlUsu.setPreferredSize(new java.awt.Dimension(1200, 850));
        pnlUsu.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(253, 253, 254));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 50));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 50));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 50));
        jPanel1.setLayout(null);

        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Minimi.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCerrar.setMaximumSize(new java.awt.Dimension(50, 50));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lblCerrar);
        lblCerrar.setBounds(1130, 10, 30, 30);

        pnlUsu.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pnlCentro.setBackground(new java.awt.Color(253, 253, 254));
        pnlCentro.setMaximumSize(new java.awt.Dimension(1200, 800));
        pnlCentro.setMinimumSize(new java.awt.Dimension(1200, 800));
        pnlCentro.setPreferredSize(new java.awt.Dimension(1200, 800));
        pnlCentro.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(73, 131, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ECONX");
        jLabel2.setPreferredSize(new java.awt.Dimension(64, 64));
        pnlCentro.add(jLabel2);
        jLabel2.setBounds(930, 0, 180, 64);

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoeconx.png"))); // NOI18N
        pnlCentro.add(lblIcon);
        lblIcon.setBounds(1110, 0, 64, 64);

        jspTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(73, 131, 254), 0));

        tblBoleta.setBackground(new java.awt.Color(253, 253, 254));
        tblBoleta.setForeground(new java.awt.Color(253, 253, 254));
        tblBoleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROVEEDOR", "PRODUCTO", "COMPRADOR", "PRECIO", "STOCK", "FECHA", "CÓDIGO", "EMPRESA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBoleta.setBackgoundHead(new java.awt.Color(73, 131, 254));
        tblBoleta.setBackgoundHover(new java.awt.Color(73, 131, 254));
        tblBoleta.setColorBorderHead(new java.awt.Color(253, 253, 254));
        tblBoleta.setColorBorderRows(new java.awt.Color(253, 253, 254));
        tblBoleta.setColorPrimaryText(new java.awt.Color(73, 131, 254));
        tblBoleta.setColorSecundaryText(new java.awt.Color(73, 131, 254));
        tblBoleta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBoleta.setFontHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBoleta.setFontRowHover(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBoleta.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblBoleta.setGridColor(new java.awt.Color(73, 131, 254));
        tblBoleta.setHighHead(40);
        tblBoleta.setRowHeight(30);
        tblBoleta.setSelectionBackground(new java.awt.Color(73, 131, 254));
        tblBoleta.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblBoleta.getTableHeader().setResizingAllowed(false);
        tblBoleta.getTableHeader().setReorderingAllowed(false);
        tblBoleta.setWidthBorderHead(0);
        tblBoleta.setWidthBorderRows(0);
        jspTabla.setViewportView(tblBoleta);

        pnlCentro.add(jspTabla);
        jspTabla.setBounds(20, 190, 1160, 402);

        txtBuscar.setBackground(new java.awt.Color(253, 253, 254));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(73, 131, 254));
        txtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscar.setBorder(null);
        txtBuscar.setCaretColor(new java.awt.Color(73, 131, 254));
        txtBuscar.setDisabledTextColor(new java.awt.Color(36, 101, 239));
        txtBuscar.setSelectionColor(new java.awt.Color(73, 131, 254));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        pnlCentro.add(txtBuscar);
        txtBuscar.setBounds(20, 130, 370, 50);

        jSeparator1.setBackground(new java.awt.Color(73, 131, 254));
        jSeparator1.setForeground(new java.awt.Color(73, 131, 254));
        pnlCentro.add(jSeparator1);
        jSeparator1.setBounds(20, 180, 370, 10);

        btnEditar.setBackground(new java.awt.Color(253, 253, 254));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/btnEdit.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnEditar);
        btnEditar.setBounds(20, 610, 450, 70);

        btnEliminar.setBackground(new java.awt.Color(253, 253, 254));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/btnElim.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnEliminar);
        btnEliminar.setBounds(720, 610, 450, 70);

        btnAgregar.setBackground(new java.awt.Color(253, 253, 254));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Usuario/Agregar.png"))); // NOI18N
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlCentro.add(btnAgregar);
        btnAgregar.setBounds(930, 120, 250, 60);

        btnFac.setBackground(new java.awt.Color(253, 253, 254));
        btnFac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boleta/Fac.png"))); // NOI18N
        btnFac.setBorder(null);
        btnFac.setBorderPainted(false);
        btnFac.setContentAreaFilled(false);
        btnFac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFac.setFocusPainted(false);
        btnFac.setFocusable(false);
        btnFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacActionPerformed(evt);
            }
        });
        pnlCentro.add(btnFac);
        btnFac.setBounds(730, 120, 150, 60);

        btnFacturarTodo.setBackground(new java.awt.Color(253, 253, 254));
        btnFacturarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boleta/FT.png"))); // NOI18N
        btnFacturarTodo.setBorder(null);
        btnFacturarTodo.setBorderPainted(false);
        btnFacturarTodo.setContentAreaFilled(false);
        btnFacturarTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFacturarTodo.setFocusPainted(false);
        btnFacturarTodo.setFocusable(false);
        btnFacturarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturarTodoActionPerformed(evt);
            }
        });
        pnlCentro.add(btnFacturarTodo);
        btnFacturarTodo.setBounds(580, 120, 150, 60);

        pnlUsu.add(pnlCentro, java.awt.BorderLayout.CENTER);

        add(pnlUsu, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        if (evt.getSource() == lblCerrar) {
            this.setVisible(false);
        }
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        if (evt.getSource() == txtBuscar) {
            cBoleta.buscarBoleta(tblBoleta, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getSource() == txtBuscar) {
            cBoleta.verif(evt, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (evt.getSource() == btnEditar) {
            if (!cDialogos.validarSeleccion(tblBoleta, "Selecciona lo que deseas editar")) {
                cBoleta.pasarBoleta(tblBoleta);
                cBoleta.mostrarTablaBoleta(tblBoleta);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (evt.getSource() == btnEliminar) {
            if (!cDialogos.validarSeleccion(tblBoleta, "Selecciona lo que deseas eliminar")) {
                cBoleta.dialogoEliminarBoleta(id, tblBoleta, "¿Estas seguro(a) que deseas eliminar el producto?");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (evt.getSource() == btnAgregar) {
            cBoleta.dialogoAgregarProducto();
            cBoleta.mostrarTablaBoleta(tblBoleta);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnFacturarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturarTodoActionPerformed
        if (evt.getSource() == btnFacturarTodo) {
            cBoleta.facturar();
        }
    }//GEN-LAST:event_btnFacturarTodoActionPerformed

    private void btnFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacActionPerformed
        if (evt.getSource() == btnFac) {
            cBoleta.dialogoBoleta();
        }
    }//GEN-LAST:event_btnFacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFac;
    private javax.swing.JButton btnFacturarTodo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JScrollPane jspTabla;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlUsu;
    public static rojerusan.RSTableMetro tblBoleta;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        cBoleta.mostrarTablaBoleta(tblBoleta);
        jspTabla.getViewport().setBackground(new Color(253, 253, 254));
        cBoleta.agregarImg(btnAgregar, btnEditar, btnEliminar, btnFacturarTodo, btnFac);
        cBoleta.fantasmaText(txtBuscar, "Buscar por codigo");
    }
}
