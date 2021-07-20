package clase22A;

public class Main {
    public static void main(String[] args) {
        Archivo a1 = new Carpeta("Carpeta");
        Archivo a2 = new Video("Video 1");
        Archivo a3 = new Video("Video 2");
        Archivo a4 = new Video("Video 3");
        Archivo a5 = new Video("Video 4");
        Archivo a6 = new Video("Video 5");

        ArchivoCompuesto carpeta = new ArchivoCompuesto();
        carpeta.agregarArchivo(a1);
        carpeta.agregarArchivo(a2);
        carpeta.agregarArchivo(a3);
        carpeta.agregarArchivo(a4);
        carpeta.agregarArchivo(a5);
        carpeta.agregarArchivo(a6);

        carpeta.mostrarNombre();
    }
}
