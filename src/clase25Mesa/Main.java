package clase25Mesa;

public class Main {
    public static void main(String[] args) {
        Subasta subasta = new Subasta(15000.0,"Jarrón Antiguo");
        Oferente oferente = new Oferente("Maria","García",20999888,12000.0);
        Oferente oferente2= new Oferente("Ricardo","Gonzalez",31555666,17000.0);
        Oferente oferente3 = new Oferente("Juliana","Ramirez",34222333,18500.0);

        subasta.agregarOferente(oferente);
        subasta.agregarOferente(oferente2);
        subasta.agregarOferente(oferente3);
        subasta.notificar();

    }
}
