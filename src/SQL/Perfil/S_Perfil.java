package SQL.Perfil;

import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S_Perfil extends Conexion {

    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    public boolean confPassw(String Passw, int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spComprobarPass(?)";
        try {
            callSt = Con.prepareCall(SQL);
            callSt.setInt(1, id);
            Res = callSt.executeQuery();

            if (Res.next()) {
                return Passw.equals(Res.getString(1));
            }
            return false;
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println("Error: " + e.toString());
            }
        }
    }
    
    public boolean modificarPass(String Passw, int id) {
        callSt = null;
        Con = getConexion();

        try {
            SQL = "CALL spCambiarPass(?, ?)";
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, Passw);
            callSt.setInt(2, id);
            callSt.execute();

            return true;
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println("Error: " + e.toString());
            }
        }
    }
    
    public boolean ActualizarInfoBasica(String Nom, String Ape, String Telef, String Mail, int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarInfoBasica(?, ?, ?, ?, ?)";

        try {

            callSt = Con.prepareCall(SQL);
            callSt.setString(1, Nom);
            callSt.setString(2, Ape);
            callSt.setString(3, Telef);
            callSt.setString(4, Mail);
            callSt.setInt(5, id);
            callSt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println("Error: " + e.toString());
            }
        }
    }
    
    public boolean ActualizarInfoAvanzada(String Fecha, int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarInfoAvanzada(?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, Fecha);
            callSt.setInt(2, id);
            callSt.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
            return false;
        } finally {
            try {
                Con.close();
            } catch (SQLException e) {
                System.err.println("Error: " + e.toString());
            }
        }
    }

}
