package Modelo.TipoUsuario;

public class M_ComboRoll {

    private int id;
    private String roll;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return this.roll;
    }

}
