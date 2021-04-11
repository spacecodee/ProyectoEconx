package SQL.Proveedor;

import Modelo.Proveedor.M_Proveedor;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class S_Proveedor extends Conexion {

    //Variables
    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    public DefaultTableModel mostrarTablaProveedor() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "DNI", "NOMBRES", "APELLIDOS", "CORREO ELECTRÓNICO", "TELÉFONO"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spMostrarProveedores()";
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            while (Res.next()) {
                registros[0] = Res.getString(1);
                registros[1] = Res.getString(2);
                registros[2] = Res.getString(3);
                registros[3] = Res.getString(4);
                registros[4] = Res.getString(5);
                registros[5] = Res.getString(6);
                modelo.addRow(registros);
            }

        } catch (SQLException e) {
            System.err.println("Eror: " + e.toString());
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println("Erro: " + e.toString());
            }
        }

        return modelo;
    }
    
    public DefaultTableModel buscarProveedor(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "DNI", "NOMBRES", "APELLIDOS", "CORREO ELECTRÓNICO", "TELÉFONO"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarProveedores(?)";
                callSt = Con.prepareCall(SQL);
                callSt.setString(1, buscar);
                Res = callSt.executeQuery();

                while (Res.next()) {
                    registros[0] = Res.getString(1);
                    registros[1] = Res.getString(2);
                    registros[2] = Res.getString(3);
                    registros[3] = Res.getString(4);
                    registros[4] = Res.getString(5);
                    registros[5] = Res.getString(6);
                    modelo.addRow(registros);
                }
            } catch (SQLException e) {
                System.err.println(e);
            } finally {
                try {
                    Con.close();
                    Res.close();
                    callSt.close();
                } catch (SQLException e) {
                    System.err.println(e.toString());
                }
            }
        }
        return modelo;
    }
    
    public boolean agregarProveedor(M_Proveedor mProveedor) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarProveedores(?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mProveedor.getDni());
            callSt.setString(2, mProveedor.getNombre());
            callSt.setString(3, mProveedor.getApellidos());
            callSt.setString(4, mProveedor.getCorreoElectronico());
            callSt.setString(5, mProveedor.getTelefono());            
            callSt.executeQuery();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean actualizarProveedor(M_Proveedor mProveedor) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarProveedor(?, ?, ?, ?, ?, ?)";
        
        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mProveedor.getDni());
            callSt.setString(2, mProveedor.getNombre());
            callSt.setString(3, mProveedor.getApellidos());
            callSt.setString(4, mProveedor.getCorreoElectronico());
            callSt.setString(5, mProveedor.getTelefono());
            callSt.setInt(6, mProveedor.getId());
            callSt.executeQuery();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminarProveedor(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarProveedor(?)";
        
        try {
            callSt = Con.prepareCall(SQL);
            callSt.setInt(1, id);
            callSt.executeQuery();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
