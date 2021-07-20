package clase20Mesa;

public interface Estado {
    void agregar(Producto producto);
    void volverAtras();
    void siguienteEstado();
    void cancelar();
}
