
public class Compra {
    private int totalVentas = 0;
    private Comprador comprador;
    private Localidades localidades = new Localidades();
    private int[] preciosLocalidades = {100, 500, 1000};
    /*
     * @param establece que es el comprador actual
     */
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    /*
     *@param Realiza la compra de los boletos para el comprador actual
     */
    public void comprarBoletos() {
        if (comprador == null) {
            System.out.println("¡Debe ingresar los datos del comprador primero!");
            return;
        }

        int boletosComprados = localidades.venderBoletos(comprador);
        if (boletosComprados > 0) {
            totalVentas += boletosComprados;
            String localidadComprada = localidades.getCategoriaLocalidad(comprador.getLocalidad());
            System.out.println("¡Compra exitosa! Se han comprado " + boletosComprados + " boletos de la " + localidadComprada);
        } else {
            System.out.println("No se pudieron comprar boletos.");
        }
    }

    /*@param Encargador de mostrar cuantos boletos quedan en todas las localidades */
    public void consultarDisponibilidadTotal() {
        localidades.mostrarDisponibilidadTotal();
    }

    /*@param encargado de mostrar cuantos boletos hay en una localidad en especifico */
    public void consultarDisponibilidadIndividual() {
        localidades.mostrarDisponibilidadIndividual();
    }

    /*@param encargado de multiplicar la cantidad de boletos de cada localidad para su precio correspondiente */
    public void reporteCaja() {

        for (int i = 0; i < preciosLocalidades.length; i++) {
            totalVentas += preciosLocalidades[i] * localidades.getBoletosVendidos(i);
        }

        System.out.println("Ingresos totales generados: $" + totalVentas);
    }

}