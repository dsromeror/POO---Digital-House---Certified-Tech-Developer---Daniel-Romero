package clase25Mesa;
import java.util.ArrayList;

public class Subasta implements Sujeto{
    private double monto;
    private String descripcion;
    private ArrayList<Observador> oferentes;

    public Subasta(double monto, String descripcion) {
        this.monto = monto;
        this.descripcion = descripcion;
        oferentes = new ArrayList<>();
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Observador> getOferentes() {
        return oferentes;
    }

    public void setOferentes(ArrayList<Observador> oferentes) {
        this.oferentes = oferentes;
    }

    @Override
    public void notificar() {
        for (Observador o:oferentes
        ) {
            o.accionar(getMonto());
        }
    }

    @Override
    public void agregarOferente(Oferente o) {
        oferentes.add(o);
    }

    @Override
    public void eliminarOferente(Oferente o) {
        oferentes.remove(o);
    }


}
