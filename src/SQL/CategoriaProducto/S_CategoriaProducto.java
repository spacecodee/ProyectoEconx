package SQL.CategoriaProducto;

import Modelo.CategoriaProducto.M_CategoriaProducto;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class S_CategoriaProducto extends Conexion {

    //Variables
    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    public DefaultTableModel mostrarTablaCategoria() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "CATEGORÍA"
        };
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spMostrarTablaCategoria()";
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

    public DefaultTableModel buscarTablaCategoria(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "CATEGORÍA"
        };
        String[] registros = new String[3];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarCategoriaProductos(?)";
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

    public boolean agregarCategoria(M_CategoriaProducto mCategoriaP) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarCategoriaP(?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mCategoriaP.getCodigo());
            callSt.setString(2, mCategoriaP.getNombre());
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

    public boolean actualizarCategoria(M_CategoriaProducto mCategoriaP) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarCategorias(?, ?, ?)";
        //mTipoUsuario

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mCategoriaP.getCodigo());
            callSt.setString(2, mCategoriaP.getNombre());
            callSt.setInt(3, mCategoriaP.getId());
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

    public boolean eliminarCategoria(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarCategoriaProd(?)";

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
