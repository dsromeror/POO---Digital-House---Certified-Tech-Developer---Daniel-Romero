package clase19A;

public class Main {
    public static void main(String[] args) {
        try{
            Iphone ip1 = IphoneFactory.construir("IPHONE X");
            ip1.modelo();

            Iphone ip2 = IphoneFactory.construir("IPHONE 11");
            ip2.modelo();

            Iphone ip3 = IphoneFactory.construir("IPHONE 10");
            ip3.modelo();
        }catch (Exception e){
            System.out.println("Exception encotrada: "+e);
        }


    }
}
