import java.util.Random;
public class ValorAleatorio{

    private int numMax;
    private final int numMin = 1;
    private int numSorteado;

    Random randomNum = new Random ();
    
    public int getNumSorteado() {
        return numSorteado;
    }

    public void setNumSorteado() {
        this.numSorteado =randomNum.nextInt(getNumMax()-getNumMin()+1)+getNumMin();;
    }

    public int getNumMax() {
        return numMax;
    }
    public void setNumMax(int numMax) {
        this.numMax=numMax;
    }
    
    public int getNumMin() {
        return numMin;
    }
    
}