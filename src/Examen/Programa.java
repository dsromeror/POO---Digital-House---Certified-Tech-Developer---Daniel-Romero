package Examen;

public class Programa {
    public static void main(String[] args) {
        Persona p1 = new Persona("Daniel", "Romero", "1026292408", 25);
        Persona p2 = new Persona("Gloria", "Rodríguez", "154sd210", 50);
        Titulo tt1 = new Terciarios(4,"15092021","15102021",true,true,p1,"NACIONAL");
        Titulo tt2 = new Terciarios(4,"15092021","15102021",false,false,p1,"PROVINCIAL");
        Comparable tl1 = new Licenciatura(3,"15092021","15102021",false,false,p1,"Pasar POO","01072021",5);
        Comparable tl2 = new Licenciatura(3,"15092021","15102021",false,false,p2,"Pasar POO","01072021",6);


        if(tl1.compareTo(tl2) == 0){
            System.out.println("Licenciatura 1 tiene igual número de trabajos de investigación que Licenciatura 2");
        }else if(tl1.compareTo(tl2) > 0) {
            System.out.println("Licenciatura 1 tiene más trabajos de investigación que Licenciatura 2");
        } else{
            System.out.println("Licenciatura 2 tiene más trabajos de investigación que Licenciatura 1");
        }

        if ( tt1.puedeEjercer() ){
            System.out.println("El titulo terciario 1 puede ejercer");
        }else{
            System.out.println("El titulo terciario 1 no puede ejercer");
        }

        if (((Terciarios)tt1).validoNacional()){
            System.out.println("El titulo terciario 1 es válido NACIONAL");
        }else{
            System.out.println("El titulo terciario 1 es válido solo PROVINCIAL");
        }

        if (((Terciarios)tt2).validoNacional()){
            System.out.println("El titulo terciario 2 es válido NACIONAL");
        }else{
            System.out.println("El titulo terciario 2 es válido solo PROVINCIAL");
        }
    }
}
