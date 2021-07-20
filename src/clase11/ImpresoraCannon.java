package clase11;

import com.sun.source.tree.ReturnTree;

public class ImpresoraCannon extends Impresora{
    @Override
    public String imprimir(){
        return "Imprimiendo tus ideas con tu impresora Cannon";
    }
    @Override
    public boolean necesitaTinta(){
        return true;
    }

}
