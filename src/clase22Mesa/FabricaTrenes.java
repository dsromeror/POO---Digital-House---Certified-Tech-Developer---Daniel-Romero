package clase22Mesa;

public class FabricaTrenes {
    public static void main(String[] args) {
        Figura rueda = new Circulo(1);
        Figura cuerpoVagon = new Rectangulo(4,5);

        Figura baseChimenea = new Rectangulo(6,4);
        Figura cuerpoChimenea = new Rectangulo(4,3);
        Figura torreChimenea = new Rectangulo(1,1);
        Figura frenteLocomotora = new Triangulo(2,2);

        FiguraCompuesta locomotora = new FiguraCompuesta();
        locomotora.agregarFigura(frenteLocomotora);
        locomotora.agregarFigura(rueda);
        locomotora.agregarFigura(rueda);
        locomotora.agregarFigura(baseChimenea);
        locomotora.agregarFigura(cuerpoChimenea);
        locomotora.agregarFigura(torreChimenea);

        System.out.println("Área Locomotora: "+locomotora.calcularArea());

        FiguraCompuesta primerVagon = new FiguraCompuesta();

        primerVagon.agregarFigura(rueda);
        primerVagon.agregarFigura(rueda);
        primerVagon.agregarFigura(rueda);
        primerVagon.agregarFigura(cuerpoVagon);

        System.out.println("Área Primer Vagón: "+primerVagon.calcularArea());

        FiguraCompuesta segundoVagon = new FiguraCompuesta();
        segundoVagon.agregarFigura(rueda);
        segundoVagon.agregarFigura(rueda);
        segundoVagon.agregarFigura(rueda);
        segundoVagon.agregarFigura(cuerpoVagon);

        System.out.println("Área Segundo Vagón: "+segundoVagon.calcularArea());

        FiguraCompuesta trencito = new FiguraCompuesta();
        trencito.agregarFigura(locomotora);
        trencito.agregarFigura(primerVagon);
        trencito.agregarFigura(segundoVagon);

        System.out.println("Área \uD83D\uDE82:"+trencito.calcularArea());
        /*
        Rectangulo r1 = new Rectangulo(5.0,4.0);
        Circulo c1 = new Circulo(1.0);
        Circulo c2 = new Circulo(1.0);
        Circulo c3 = new Circulo(1.0);

        FiguraCompuesta vagon1 = new FiguraCompuesta();
        vagon1.agregarFigura(r1);
        vagon1.agregarFigura(c1);
        vagon1.agregarFigura(c2);
        vagon1.agregarFigura(c3);

        System.out.println(vagon1.calcularArea());
        System.out.println(vagon1.mostrar());*/
    }
}
