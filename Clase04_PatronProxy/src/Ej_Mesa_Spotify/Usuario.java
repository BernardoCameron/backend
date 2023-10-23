package Ej_Mesa_Spotify;

public class Usuario {

    private int ID;
    private String tipoUsuario;

    public Usuario(int ID, String tipoUsuario) {
        this.ID = ID;
        this.tipoUsuario = tipoUsuario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
