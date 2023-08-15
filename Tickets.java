import java.util.Random;

public class Tickets {
    private int numBoleto;
    private int num1;
    private int num2;
    /*@param Genera 3 numeros aleatorios */
    public void generarNum() {
        Random random = new Random();
        numBoleto = random.nextInt(15000) + 1;
        num1 = random.nextInt(15000) + 1;
        num2 = random.nextInt(15000) + 1;
    }
    
    public boolean validarRango() {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        return numBoleto >= min && numBoleto <= max;
    }
}