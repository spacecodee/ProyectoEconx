package SQL.Producto;

import Modelo.CategoriaProducto.M_ComboCategoriaP;
import Modelo.Producto.M_Producto;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class S_Producto extends Conexion {

    M_Producto mProducto = new M_Producto();
    Vector<M_ComboCategoriaP> mCategoriaProducto = new Vector<>();

    //Variables
    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    public Vector<M_ComboCategoriaP> MostrarCategoriaPro() {

        M_ComboCategoriaP mCategoriaP;
        callSt = null;
        Con = getConexion();
        SQL = "CALL spMostrarCategoriaP()";

        try {
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            mCategoriaP = new M_ComboCategoriaP();
            mCategoriaP.setId(0);
            mCategoriaP.setNombre("Selecciona".toUpperCase());
            mCategoriaProducto.add(mCategoriaP);

            while (Res.next()) {
                mCategoriaP = new M_ComboCategoriaP();
                mCategoriaP.setId((Res.getInt(1)));
                mCategoriaP.setNombre(Res.getString(2));
                mCategoriaProducto.add(mCategoriaP);
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
        return mCategoriaProducto;
    }

    public DefaultTableModel mostrarTablaProductos() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "NOMBRE", "PRECIO", "STOCK", "CATEGORÍA"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spMostrarProductos()";
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

    public DefaultTableModel buscarProductos(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "NOMBRE", "PRECIO", "STOCK", "CATEGORÍA"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarProductos(?)";
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

    public boolean agregarProductos(M_Producto mProducto) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarProductos(?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mProducto.getCodigo());
            callSt.setString(2, mProducto.getNombre());
            callSt.setDouble(3, mProducto.getPrecio());
            callSt.setInt(4, mProducto.getStock());
            callSt.setInt(5, mProducto.getCategoria());
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

    public boolean actualizarProducto(M_Producto mProducto) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarProducto(?, ?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mProducto.getCodigo());
            callSt.setString(2, mProducto.getNombre());
            callSt.setDouble(3, mProducto.getPrecio());
            callSt.setInt(4, mProducto.getStock());
            callSt.setInt(5, mProducto.getCategoria());
            callSt.setInt(6, mProducto.getId());
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
    
    public boolean eliminarProducto(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarProducto(?)";
        
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
