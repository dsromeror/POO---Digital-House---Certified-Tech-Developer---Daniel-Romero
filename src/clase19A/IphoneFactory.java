package clase19A;

public class IphoneFactory {
    public static Iphone construir(String nombre){
        switch (nombre){
            case "IPHONE X":
                return new IponeX();
            case "IPHONE 11":
                return new Iphone11();
            default:
                System.out.println("No tenemos el modelo que pides");
                return null;
        }
    }
}
