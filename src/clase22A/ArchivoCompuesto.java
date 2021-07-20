package clase22A;

import clase22Mesa.Figura;

import java.util.ArrayList;

public class ArchivoCompuesto implements Archivo {
    ArrayList<Archivo> archivos;

    public ArchivoCompuesto() {
        this.archivos = new ArrayList<>();
    }

    public void agregarArchivo(Archivo a){
        archivos.add(a);
    }

    @Override
    public void mostrarNombre() {
        for (Archivo a:archivos) {
            a.mostrarNombre();
        }
    }
}
