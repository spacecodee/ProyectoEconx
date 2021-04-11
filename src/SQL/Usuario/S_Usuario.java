package SQL.Usuario;

import Modelo.TipoUsuario.M_ComboRoll;
import Modelo.Usuario.M_Usuario;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class S_Usuario extends Conexion {

    //Objetos
    Vector<M_ComboRoll> tipoUsuarios = new Vector<>();

    //Variables
    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    //Crud
    public DefaultTableModel mostrarTablaUsuarios() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "DNI", "NOMBRES", "APELLIDOS", "TELÉFONO", "ROLL"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spCargarTablaUsuarios()";
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

    public DefaultTableModel buscarUsuarios(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "DNI", "NOMBRES", "APELLIDOS", "TELÉFONO", "ROLL"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarUsuario(?)";
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

    public Vector<M_ComboRoll> MostrarTipoUsuarios() {

        M_ComboRoll usuariosT;
        callSt = null;
        Con = getConexion();
        SQL = "CALL spSeleccionarRoll()";

        try {
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            usuariosT = new M_ComboRoll();
            usuariosT.setId(0);
            usuariosT.setRoll("Selecciona".toUpperCase());
            tipoUsuarios.add(usuariosT);

            while (Res.next()) {
                usuariosT = new M_ComboRoll();
                usuariosT.setId((Res.getInt(1)));
                usuariosT.setRoll(Res.getString(2));

                tipoUsuarios.add(usuariosT);
            }

        } catch (SQLException ex) {
            System.err.println(ex);
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return tipoUsuarios;
    }
    
    public boolean agregarUsuarios(M_Usuario mUsuario) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarUsuarios(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mUsuario.getDni());
            callSt.setString(2, mUsuario.getPassword());
            callSt.setString(3, mUsuario.getNombre());
            callSt.setString(4, mUsuario.getApellidos());
            callSt.setString(5, mUsuario.getTelefono());
            callSt.setString(6, mUsuario.getCorreoElectronico());
            callSt.setString(7, mUsuario.getFechaNacimiento());
            callSt.setInt(8, mUsuario.getRoll());
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
    
    public boolean actualizarUsuarios(M_Usuario mUsuario) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarUsuarios(?, ?, ?, ?, ?, ?)";
        
        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mUsuario.getDni());
            callSt.setString(2, mUsuario.getNombre());
            callSt.setString(3, mUsuario.getApellidos());
            callSt.setString(4, mUsuario.getTelefono());
            callSt.setInt(5, mUsuario.getRoll());
            callSt.setInt(6, mUsuario.getId());
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

    public boolean eliminarUsuarios(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarUsuarios(?)";
        
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
