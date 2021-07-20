package clase22Mesa;

import java.util.ArrayList;

public class FiguraCompuesta implements Figura{
    ArrayList<Figura> figuras;

    public FiguraCompuesta() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura f){
        figuras.add(f);
    }

    public String mostrar(){
        String texto = "";
        for (Figura f:figuras) {
            texto += f.mostrarFigura()+"\n";
        }
        return texto;
    }

    @Override
    public String mostrarFigura() {
        return "Soy figura compuesta";
    }

    @Override
    public double calcularArea() {
        double areaTotal = 0.0;
        for (Figura f:figuras) {
            areaTotal += f.calcularArea();
        }
        return areaTotal;
    }
}
