package clase22;

public class CadenaExpress {
    public static void main(String[] args) {
        Combo c1 = new Combo("Pack Dia del amigo");

        c1.agregar(new Comida("Cerveza",200));
        c1.agregar(new Comida("Gaseosa",180));
        c1.agregar(new Comida("Papas",300));
        c1.agregar(new Comida("Hamburguesa",550));

        Combo c2 = new Combo("Pack postre Terminaste de rendir :D");

        c2.agregar(new Comida("Helado",200));
        c2.agregar(new Comida("Flan",120));

        Combo carrito = new Combo("Carrito/Bandeja");
        carrito.agregar(c1);
        carrito.agregar(c2);

        System.out.println(carrito.mostrar());
    }
}
