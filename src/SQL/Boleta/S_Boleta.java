package SQL.Boleta;

import Modelo.Boleta.M_Boleta;
import Modelo.Boleta.M_ComboComprador;
import Modelo.Boleta.M_ComboTrae;
import SQL.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class S_Boleta extends Conexion {

    Vector<M_ComboTrae> mComboTrae = new Vector<>();
    Vector<M_ComboComprador> mComboComprador = new Vector<>();

    private Connection Con = null;
    private CallableStatement callSt = null;
    private ResultSet Res = null;
    String SQL;

    public Vector<M_ComboTrae> MostrarComboTrae() {

        M_ComboTrae mComboTraeP;
        callSt = null;
        Con = getConexion();
        SQL = "CALL spComboTraeProd()";

        try {
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            mComboTraeP = new M_ComboTrae();
            mComboTraeP.setId(0);
            mComboTraeP.setCodigo("Selecciona".toUpperCase());
            mComboTrae.add(mComboTraeP);

            while (Res.next()) {
                mComboTraeP = new M_ComboTrae();
                mComboTraeP.setId((Res.getInt(1)));
                mComboTraeP.setCodigo(Res.getString(2));
                mComboTrae.add(mComboTraeP);
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
        return mComboTrae;
    }

    public Vector<M_ComboComprador> MostrarComboComprador() {

        M_ComboComprador mComboComp;
        callSt = null;
        Con = getConexion();
        SQL = "CALL spComboComprador()";

        try {
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            mComboComp = new M_ComboComprador();
            mComboComp.setId(0);
            mComboComp.setNombre("Selecciona".toUpperCase());
            mComboComprador.add(mComboComp);

            while (Res.next()) {
                mComboComp = new M_ComboComprador();
                mComboComp.setId((Res.getInt(1)));
                mComboComp.setNombre(Res.getString(2));
                mComboComprador.add(mComboComp);
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
        return mComboComprador;
    }

    public DefaultTableModel mostrarTablaBoleta() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "PROVEEDOR", "PRODUCTO", "COMPRADOR", "PRECIO", "STOCK",
            "FECHA", "CÓDIGO", "EMPRESA"
        };
        String[] registros = new String[9];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spMostrarBoleta()";
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            while (Res.next()) {
                registros[0] = Res.getString(1);
                registros[1] = Res.getString(2);
                registros[2] = Res.getString(3);
                registros[3] = Res.getString(4);
                registros[4] = Res.getString(5);
                registros[5] = Res.getString(6);
                registros[6] = Res.getString(7);
                registros[7] = Res.getString(8);
                registros[8] = Res.getString(9);
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

    public DefaultTableModel tablita() {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "PROVEEDOR", "PRODUCTO"
        };
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spTablaIntermediaEnBoleta()";
            callSt = Con.prepareCall(SQL);
            Res = callSt.executeQuery();

            while (Res.next()) {
                registros[0] = Res.getString(1);
                registros[1] = Res.getString(2);
                registros[2] = Res.getString(3);
                registros[3] = Res.getString(4);
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

    public DefaultTableModel buscarBoleta(String buscar) {

        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "PROVEEDOR", "PRODUCTO", "COMPRADOR", "PRECIO", "STOCK",
            "FECHA", "CÓDIGO", "EMPRESA"
        };
        String[] registros = new String[9];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        if (buscar.trim().length() > 0) {
            try {
                SQL = "CALL spBuscarBoleta(?)";
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
                    registros[6] = Res.getString(7);
                    registros[7] = Res.getString(8);
                    registros[8] = Res.getString(9);
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

    public DefaultTableModel tablita(String buscar) {
        Con = getConexion();
        callSt = null;
        Res = null;

        String[] nombresColumnas = {
            "ID", "CÓDIGO", "PROVEEDOR", "PRODUCTO"
        };
        String[] registros = new String[4];

        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);

        try {
            SQL = "CALL spBuscarTablaIEnBoleta(?)";
            callSt = Con.prepareCall(SQL);
            callSt.setString(1, buscar);
            Res = callSt.executeQuery();

            while (Res.next()) {
                registros[0] = Res.getString(1);
                registros[1] = Res.getString(2);
                registros[2] = Res.getString(3);
                registros[3] = Res.getString(4);
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

    public boolean agregarBoleta(M_Boleta mBoleta) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spInsertarBoleta(?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setInt(1, mBoleta.getIdTrae());
            callSt.setInt(2, mBoleta.getUsuarioComprador());
            callSt.setString(3, mBoleta.getCodigo());
            callSt.setString(4, mBoleta.getEmpresa());
            callSt.setString(5, mBoleta.getFecha());
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

    public boolean actualizarBoleta(M_Boleta mBoleta) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spActualizarBoleta(?, ?, ?, ?, ?, ?, ?)";

        try {
            callSt = Con.prepareCall(SQL);
            callSt.setInt(1, mBoleta.getIdTrae());
            callSt.setInt(2, mBoleta.getUsuarioComprador());
            callSt.setString(3, mBoleta.getCodigo());
            callSt.setString(4, mBoleta.getEmpresa());
            callSt.setString(5, mBoleta.getFecha());
            callSt.setInt(6, mBoleta.getId());
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

    public boolean eliminarBoleta(int id) {
        callSt = null;
        Con = getConexion();
        SQL = "CALL spEliminarBoleta(?)";

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

    public boolean facturarTodo() {
        try {
            JasperReport archivo = JasperCompileManager.compileReport("Boleta.jrxml");
            Con = getConexion();
            JasperPrint prin = JasperFillManager.fillReport(archivo, null, Con);
            JasperExportManager.exportReportToPdfFile(prin, "reporte.pdf");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(S_Boleta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean facturar(String dni, String nombre, String fecha) {
        try {
            JasperReport archivo = JasperCompileManager.compileReport("BoletaDia.jrxml");
            Map<String, Object> map = new HashMap<>();
            map.put("dn", dni);
            map.put("fe", fecha);
            Con = getConexion();
            JasperPrint prin = JasperFillManager.fillReport(archivo, map, Con);
            JasperExportManager.exportReportToPdfFile(prin, nombre + ".pdf");
            return true;
        } catch (JRException ex) {
            Logger.getLogger(S_Boleta.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
