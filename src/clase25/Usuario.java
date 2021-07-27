package clase25;
import java.util.ArrayList;

public class Usuario implements Sujeto{
    private String nombre;
    private String apellido;
    private ArrayList<Observador> seguidores;
    private boolean fotoSubida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isFotoSubida() {
        return fotoSubida;
    }

    public void setFotoSubida(boolean fotoSubida) {
        this.fotoSubida = fotoSubida;
    }

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        seguidores= new ArrayList<>();
        fotoSubida=false;
    }

    @Override
    public void agregar(Observador o) {
        seguidores.add(o);
    }

    @Override
    public void eliminar(Observador o) {
        seguidores.remove(o);
    }

    @Override
    public void notificar() {
        if (fotoSubida){
            for (Observador obs: seguidores) {
                obs.actualizar(getNombre());
            }
            setFotoSubida(false);
        }

    }
}
