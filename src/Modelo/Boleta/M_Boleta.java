package Modelo.Boleta;

public class M_Boleta {
    
    private int id;
    private int idTrae;
    private int usuarioComprador;
    private String codigo;
    private double precio;
    private int cantidad;
    private String empresa;
    private String fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTrae() {
        return idTrae;
    }

    public void setIdTrae(int idTrae) {
        this.idTrae = idTrae;
    }

    public int getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(int usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
