package SQL.Login;

import Modelo.Usuario.M_UsuarioLogin;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class S_Login extends Conexion {

    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    public boolean login(M_UsuarioLogin mUsuario) {

        callSt = null;
        Con = getConexion();
        SQL = "CALL spLogin(?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mUsuario.getDni());
            Res = callSt.executeQuery();

            if (Res.next()) {

                if (mUsuario.getPassword().equals(Res.getString(3))) {

                    mUsuario.setId(Integer.parseInt(Res.getString(1)));
                    mUsuario.setDni(Res.getString(2));
                    mUsuario.setNombre(Res.getString(4));
                    mUsuario.setApellidos(Res.getString(5));
                    mUsuario.setTelefono(Res.getString(6));
                    mUsuario.setCorreoElectronico(Res.getString(7));
                    mUsuario.setFechaNacimiento(Res.getString(8));
                    mUsuario.setRoll(Res.getString(9));
                    return true;
                } else {
                    return false;
                }
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

}
