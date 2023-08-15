import java.util.Scanner;

public class Comprador {
    private String nombre;
    private String email;
    private int cantidadBoletos;
    private double presupuesto;
    private int localidad;

    /*@param este metodo nos sirve para capturar los datos del comprador */
    public void capturarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Cantidad de boletos: ");
        cantidadBoletos = scanner.nextInt();
        System.out.print("Presupuesto: ");
        presupuesto = scanner.nextDouble();
    }

    /*@param metodos get y set */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCantidadBoletos() {
        return cantidadBoletos;
    }

    public void setCantidadBoletos(int cantidadBoletos) {
        this.cantidadBoletos = cantidadBoletos;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

}