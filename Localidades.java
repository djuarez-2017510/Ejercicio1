import java.util.Random;
import java.util.Scanner;

public class Localidades {
    private String[] categorias = {"Localidad 1", "Localidad 5", "Localidad 10"};
    private double[] precios = {100, 500, 1000};
    private int[] boletosD = {20, 20, 20};
    private int[] boletosV = {0, 0, 0};

    /*@param vende los boletos al comprador actual */
    public int venderBoletos(Comprador comprador) {
        int localidad = generarLocalidadAleatoria();
        int boletosDisponibles = boletosD[localidad];

        if (boletosDisponibles == 0) {
            System.out.println("Lo sentimos, no quedan boletos disponibles para esta localidad.");
            return 0;
        }

        int boletosComprados = Math.min(boletosDisponibles, comprador.getCantidadBoletos());
        double costoTotal = precios[localidad] * boletosComprados;

        if (costoTotal > comprador.getPresupuesto()) {
            System.out.println("El costo total excede el presupuesto del comprador.");
            return 0;
        }

        boletosD[localidad] -= boletosComprados;
        boletosV[localidad] += boletosComprados;
        comprador.setLocalidad(localidad);

        return boletosComprados;
    }

    /*muestra las localidades disponibles */
    public void mostrarDisponibilidadTotal() {
        for (int i = 0; i < categorias.length; i++) {
            System.out.println(categorias[i] + " - Disponibles: " + boletosD[i] + ", Vendidos: " + boletosV[i]);
        }
    }

    public void mostrarDisponibilidadIndividual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una localidad:");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }
        
        int opcion = scanner.nextInt();
        if (opcion >= 1 && opcion <= categorias.length) {
            int localidadSeleccionada = opcion - 1;
            System.out.println(categorias[localidadSeleccionada] + " - Disponibles: " + boletosD[localidadSeleccionada] +
                    ", Vendidos: " + boletosV[localidadSeleccionada]);
        } else {
            System.out.println("Opción inválida.");
        }
    }
    

    public double getPrecioLocalidad(int localidad) {
        return precios[localidad];
    }

    private int generarLocalidadAleatoria() {
        Random random = new Random();
        return random.nextInt(categorias.length);
    }

    public String getCategoriaLocalidad(int localidad) {
        if (localidad >= 0 && localidad < categorias.length) {
            return categorias[localidad];
        } else {
            return "Localidad inválida";
        }
    }

    public String[] getCategorias() {
        return categorias;
    }

    public int getBoletosVendidos(int localidad) {
        if (localidad >= 0 && localidad < boletosV.length) {
            return boletosV[localidad];
        } else {
            return 0;
        }
    }
}