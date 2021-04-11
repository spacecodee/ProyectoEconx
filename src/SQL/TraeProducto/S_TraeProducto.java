package SQL.TraeProducto;

import Modelo.Producto.M_ComboProducto;
import Modelo.Proveedor.M_ComboProveedor;
import Modelo.TraeProducto.M_TraeProducto;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class S_TraeProducto extends Conexion {

    M_TraeProducto mTraeP = new M_TraeProducto();
    Vector<M_ComboProveedor> mComboProveedor = new Vector<>();
    Vector<M_ComboProducto> mComboProducto = new Vector<>();

    //Variables
    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;
    //spMostrarTablaIntermedia

    public Vector<M_ComboProveedor> MostrarComboProvee() {

        M_ComboProveedor mComboProvee;
        callSt = null;
        Con = getConexion();
        SQL = "CALL spComboProveedor()";

        try {
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            mComboProvee = new M_ComboProveedor();
            mComboProvee.setId(0);
            mComboProvee.setNombre("Selecciona".toUpperCase());
            mComboProveedor.add(mComboProvee);

            while (Res.next()) {
                mComboProvee = new M_ComboProveedor();
                mComboProvee.setId((Res.getInt(1)));
                mComboProvee.setNombre(Res.getString(2));
                mComboProveedor.add(mComboProvee);
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
        return mComboProveedor;
    }

    public Vector<M_ComboProducto> MostrarComboProducto() {

        M_ComboProducto mComboProduc;
        callSt = null;
        Con = getConexion();
        SQL = "CALL spComboProductos()";

        try {
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            mComboProduc = new M_ComboProducto();
            mComboProduc.setId(0);
            mComboProduc.setProducto("Selecciona".toUpperCase());
            mComboProducto.add(mComboProduc);

            while (Res.next()) {
                mComboProduc = new M_ComboProducto();
                mComboProduc.setId((Res.getInt(1)));
                mComboProduc.setProducto(Res.getString(2));
                mComboProducto.add(mComboProduc);
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
        return mComboProducto;
    }

    public DefaultTableModel mostrarTablaIntermedia() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "PROVEEDOR", "PRODUCTO", "PRECIO", "STOCK"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spMostrarTablaIntermedia()";
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

    public DefaultTableModel buscarTablaIntermedia(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "PROVEEDOR", "PRODUCTO", "PRECIO", "STOCK"
        };
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarTablaIntermedia(?)";
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

    public boolean agregarTraePro(M_TraeProducto mTraeProd) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarTablaInermedia(?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mTraeProd.getCodigo());
            callSt.setInt(2, mTraeProd.getIdProveedor());
            callSt.setInt(3, mTraeProd.getIdProducto());
            callSt.setDouble(4, mTraeProd.getPrecio());
            callSt.setInt(5, mTraeProd.getStock());
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

    public boolean actualizarIntermedia(M_TraeProducto mTraeProd) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarTablaIntermedia(?, ?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, mTraeProd.getCodigo());
            callSt.setInt(2, mTraeProd.getIdProveedor());
            callSt.setInt(3, mTraeProd.getIdProducto());
            callSt.setDouble(4, mTraeProd.getPrecio());
            callSt.setInt(5, mTraeProd.getStock());
            callSt.setInt(6, mTraeProd.getId());
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

    public boolean eliminarIntermedia(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarTablaIntermedia(?)";

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
