package clase16A;

import java.util.ArrayList;

public class Alumno {
    //No modificar
    private String nombre;
    private ArrayList<Double> notas;
    //No modificar
    public Alumno(String nombre) {
        this.nombre = nombre;
        notas =  new ArrayList<>();
    }
    //no modificar
    public void ingresarNota(Double nota){
        notas.add(nota);
    }

    public Double calcularPromedio(){
        Double sumatoria = 0.0;
        for(Double nota : notas)
            sumatoria +=nota;
        return sumatoria / notas.size();
    }
}
