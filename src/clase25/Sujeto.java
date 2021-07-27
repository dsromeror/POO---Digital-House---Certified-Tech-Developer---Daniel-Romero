package clase25;
public interface Sujeto {
    void agregar (Observador o);
    void eliminar (Observador o);
    void notificar();
}
