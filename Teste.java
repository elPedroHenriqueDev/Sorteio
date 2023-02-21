public class Teste {
    public static void main (String [] args){

        ValorAleatorio sorteado = new ValorAleatorio ();

            sorteado.setNumMax(100);

            System.out.println(sorteado.randomNum);

            for (int i = 0 ; ; ){
                sorteado.setNumSorteado();
            System.out.println(sorteado.getNumSorteado());
                 if (sorteado.getNumSorteado() >= sorteado.getNumMax()){
                    System.out.println("Teste para saber se está passando : "+sorteado.getNumSorteado());
                    break ;
                 } else if (sorteado.getNumSorteado() < sorteado.getNumMin()){
                    System.out.println("Está faltando : "+sorteado.getNumSorteado());
                    break;

                 }
        }

    }
}
