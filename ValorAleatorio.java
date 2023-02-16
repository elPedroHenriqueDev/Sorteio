import  java.util.concurrent.ThreadLocalRandom;
public class ValorAleatorio{

    private int numMax;
    private final int numMin = 1;
    private int numSorteado;

    
    int aleat = ThreadLocalRandom.corrent().nextInt();
    
    public int getNumSorteado() {
        return numSorteado;
    }
    public void setNumSorteado() {
        
        this.numSorteado = aleat.nextInt();
    }


    public int getMax() {
        return numMax;
    }
    public void setMax(int max) {
        numMax=max;
    }
    
    public int getNumMin() {
        return numMin;
    }
    
}