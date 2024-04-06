import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int opciones = 0;
        while (opciones != 2) {
            try {
                opciones = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Eliga una opcion: \n1. Meter un vehiculo \n2. Salir"));
            } catch (Exception e) {
                opciones = -1;
                JOptionPane.showMessageDialog(null, "Debes introducir un numero");
            }
            switch (opciones) {
                case 1:
                    // Seleccionar vehiculo y reparar pieza;
                    Vehiculo vehiculo = datosVehiculos();
                    if (vehiculo != null) {
                        vehiculo.reparar();
                        finSeguir();
                    }
                    break;
                case 2:
                    // Salir del taller;
                    JOptionPane.showMessageDialog(null, "Saliendo del taller");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Debes introducir un valor entre el 1 y el 2");
                    break;
            }
        }
    }

    public static Vehiculo datosVehiculos() {
        String seleccion = JOptionPane.showInputDialog(null, "Que vehiculo desea reparar?\n- Coche\n- Moto\n- Camion\n- Tractor\n- Grua");
        if (!seleccion.equals("Coche") && !seleccion.equals("Moto") && !seleccion.equals("Camion") && !seleccion.equals("Tractor") && !seleccion.equals("Grua")) {
            JOptionPane.showMessageDialog(null, "Vehículo no reconocido");
            return null;
        }

        if (seleccion != null) {
            String matricula = JOptionPane.showInputDialog(null, "Ingrese la matrícula del vehículo:");
            String color = JOptionPane.showInputDialog(null, "Ingrese el color del vehículo:");
            String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo del vehículo:");
            switch (seleccion) {
                case "Coche":
                    return new Coche(matricula, color, modelo);
                case "Moto":
                    return new Moto(matricula, color, modelo);
                case "Camion":
                    return new Camion(matricula, color, modelo);
                case "Tractor":
                    return new Tractor(matricula, color, modelo);
                case "Grua":
                    return new Grua(matricula, color, modelo);
                default:
                    return null;
            }
        }
        return null;
    }

    public static void finSeguir() {
        int opciones2 = 0;
        while (opciones2 != 2) {
            try {
                opciones2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Eliga una opcion: \n1. Seguir \n2. Salir"));
            } catch (Exception e) {
                opciones2 = -1;
                JOptionPane.showMessageDialog(null, "Debes introducir un valor 1 u 2");
            }

            switch (opciones2) {
                case 1:
                    // Volver a elegir un vehiculo.
                    Vehiculo vehiculo = datosVehiculos();
                    if (vehiculo != null) {
                        vehiculo.reparar();
                        finSeguir();
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del taller");
                    throw new RuntimeException("Salir"); // Uso una excepción para salir de la ejecución totalmente.
                default:
                    JOptionPane.showMessageDialog(null, "Debes introducir un valor 1 u 2");
                    break;
            }
        }
    }
}
