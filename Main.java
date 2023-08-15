/*@author Daniel Juarez
 * 14/08/2023
 */
/*El proposito de este programa es lograr vender 60 entradas para el Eras Tour de la forma mas igualitaria posible para esto se hace uso de 
 * asignaciones random y ventas bajo cierto criterio.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Scanner scanner = new Scanner(System.in);

        int option;
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Nuevo comprador");
            System.out.println("2. Nueva solicitud de boletos");
            System.out.println("3. Consultar disponibilidad total");
            System.out.println("4. Consultar disponibilidad individual");
            System.out.println("5. Reporte de caja");
            System.out.println("6. Salir");
            System.out.print("Elija una opción: ");
            
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (option) {
                    case 1:
                        Comprador newComprador = new Comprador();
                        newComprador.capturarDatos();
                        compra.setComprador(newComprador);
                        break;
                    case 2:
                        compra.comprarBoletos();
                        break;
                    case 3:
                        compra.consultarDisponibilidadTotal();
                        break;
                    case 4:
                        compra.consultarDisponibilidadIndividual();
                        break;
                    case 5:
                        compra.reporteCaja();
                        break;
                    case 6:
                        System.out.println("¡Hasta luego!");
                        return; 
                    default:
                        System.out.println("Opción inválida.");
                }
            } else {
                String input = scanner.nextLine();
                System.out.println("Opción inválida.");
            }
        }
    }
}