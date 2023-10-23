package Ej_Mesa_Spotify;

public class DescargaProxy implements DescargaInterface{

    private Descarga solicitudDescarga;

    public DescargaProxy() {
        solicitudDescarga = new Descarga();
    }

    @Override
    public String descargar(Usuario usuario) {
        if (usuario.getTipoUsuario().equals("Premium")){
            return solicitudDescarga.descargar(usuario);
        }else{
            return "Solo usuarios premium pueden realizar descargas";
        }
    }
}
