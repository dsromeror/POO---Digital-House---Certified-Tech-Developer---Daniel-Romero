package clase16Mesa;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getContenedores() {
        return contenedores;
    }

    public void setContenedores(List<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public void addContenedor(Contenedor cont){
        contenedores.add(cont);
    }

    public void mostrarContenedoresOrdenados(){
        contenedores.sort(null);
        for (Contenedor cont: contenedores) {
            System.out.println(cont.toString());
        }
    }

    public int getContenedoresPeligrososDesconocidos(){
        int cant=0;
        for (Contenedor cont: contenedores) {
            if (cont.getPais() == "DESCONOCIDO" && cont.isPeligroso())
                cant++;
        }
        return cant;
    }
}
