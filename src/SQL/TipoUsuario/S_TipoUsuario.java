package SQL.TipoUsuario;

import Modelo.TipoUsuario.M_TipoUsuario;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class S_TipoUsuario extends Conexion {
    
    //Variables
    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;
    
    public DefaultTableModel mostrarTablaRoles() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "ROLL"
        };
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spMostrarRoles()";
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            while (Res.next()) {
                registros[0] = Res.getString(1);
                registros[1] = Res.getString(2);
                registros[2] = Res.getString(3);
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
    
    public DefaultTableModel buscarTablaRoles(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "ROLL"
        };
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarRoll(?)";
                callSt = Con.prepareCall(SQL);
                callSt.setString(1, buscar);
                Res = callSt.executeQuery();

                while (Res.next()) {
                    registros[0] = Res.getString(1);
                    registros[1] = Res.getString(2);
                    registros[2] = Res.getString(3);
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
    
    public boolean agregarRoles(M_TipoUsuario mTipoUsuario) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarRoles(?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mTipoUsuario.getCodigo());
            callSt.setString(2, mTipoUsuario.getRoll());
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
    
    public boolean actualizarUsuarios(M_TipoUsuario mTipoUsuario) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarRoles(?, ?, ?)";
        //mTipoUsuario
        
        try {
            callSt = Con.prepareCall(SQL);            
            callSt.setString(1, mTipoUsuario.getCodigo());
            callSt.setString(2, mTipoUsuario.getRoll());
            callSt.setInt(3, mTipoUsuario.getId());
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
    
    public boolean eliminarRoll(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarRoll(?)";
        
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
