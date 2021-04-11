package Vista.Proveedor;

import Controlador.Dialogos.C_Dialogos;
import Controlador.Proveedores.C_Proveedor;
import java.awt.Color;

public class V_PanelProveedor extends javax.swing.JPanel {

    //Objetos
    C_Dialogos cDialogos = new C_Dialogos();
    C_Proveedor cProveedor = new C_Proveedor();
    int id;

    public V_PanelProveedor() {
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
        tblUsuarios = new rojerusan.RSTableMetro();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

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

        tblUsuarios.setBackground(new java.awt.Color(253, 253, 254));
        tblUsuarios.setForeground(new java.awt.Color(253, 253, 254));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDOS", "CORREO ELECTRÓNICO", "TELÉFONO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setBackgoundHead(new java.awt.Color(73, 131, 254));
        tblUsuarios.setBackgoundHover(new java.awt.Color(73, 131, 254));
        tblUsuarios.setColorBorderHead(new java.awt.Color(253, 253, 254));
        tblUsuarios.setColorBorderRows(new java.awt.Color(253, 253, 254));
        tblUsuarios.setColorPrimaryText(new java.awt.Color(73, 131, 254));
        tblUsuarios.setColorSecundaryText(new java.awt.Color(73, 131, 254));
        tblUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblUsuarios.setFontHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblUsuarios.setFontRowHover(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblUsuarios.setFontRowSelect(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tblUsuarios.setGridColor(new java.awt.Color(73, 131, 254));
        tblUsuarios.setHighHead(40);
        tblUsuarios.setRowHeight(30);
        tblUsuarios.setSelectionBackground(new java.awt.Color(73, 131, 254));
        tblUsuarios.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblUsuarios.getTableHeader().setResizingAllowed(false);
        tblUsuarios.getTableHeader().setReorderingAllowed(false);
        tblUsuarios.setWidthBorderHead(0);
        tblUsuarios.setWidthBorderRows(0);
        jspTabla.setViewportView(tblUsuarios);

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
            cProveedor.buscarTablaProveedor(tblUsuarios, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (evt.getSource() == txtBuscar) {
            cProveedor.verif(evt, txtBuscar);
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (evt.getSource() == btnEditar) {
            if (!cDialogos.validarSeleccion(tblUsuarios, "Selecciona lo que deseas editar")) {
                cProveedor.pasarUsuario(tblUsuarios);
                cProveedor.mostrarTablaProveedor(tblUsuarios);
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (evt.getSource() == btnEliminar) {
            if (!cDialogos.validarSeleccion(tblUsuarios, "Selecciona lo que deseas eliminar")) {
                cProveedor.dialogoEliminarProveedor(id, tblUsuarios, "¿Estas seguro que deseas eliminar el registro?");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (evt.getSource() == btnAgregar) {
            cProveedor.dialogoAgregarProveedor();
            cProveedor.mostrarTablaProveedor(tblUsuarios);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JScrollPane jspTabla;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlUsu;
    public static rojerusan.RSTableMetro tblUsuarios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void ini() {
        initComponents();
        cProveedor.mostrarTablaProveedor(tblUsuarios);
        jspTabla.getViewport().setBackground(new Color(253, 253, 254));
        cProveedor.agregarImg(btnAgregar, btnEditar, btnEliminar);
        cProveedor.fantasmaText(txtBuscar, "Buscar por dni");
    }
}
