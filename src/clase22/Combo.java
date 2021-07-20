package clase22;

import java.util.ArrayList;

public class Combo extends Item{
    ArrayList<Item> listaItems;

    public Combo(String nombre) {
        setNombre(nombre);
        listaItems = new ArrayList<>();
    }

    public void agregar(Item i){
        listaItems.add(i);
    }

    @Override
    public double calcularPrecio() {
        double totalPrecio = 0;
        for (Item i:listaItems) {
            totalPrecio+=i.calcularPrecio();
        }
        return totalPrecio;
    }

    @Override
    public String mostrar() {
        String texto = getNombre()+"--> Precio "+calcularPrecio()+"\n";
        for (Item i:listaItems) {
            texto=texto.concat(i.mostrar())+"\n";
        }
        return texto;
    }

    @Override
    public String obtenerNombre() {
        return getNombre();
    }
}
