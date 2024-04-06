import javax.swing.*;

class Vehiculo {
    String matricula;
    String color;
    String modelo;

    public Vehiculo(String matricula, String color, String modelo) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
    }

    public void reparar() {
        JOptionPane.showMessageDialog(null, "No se han definido componentes para reparar para este vehículo.");
    }
}

class Coche extends Vehiculo {
    private String motor;
    private String faros;
    private String neumaticos;
    private String frenos;
    private String claxon;


    public Coche(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
        this.motor = motor;
        this.faros = faros;
        this.neumaticos = neumaticos;
        this.frenos = frenos;
        this.claxon = claxon;
    }


    @Override
    public void reparar() {
        String seleccion = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Motor\n- Faros\n- Neumaticos\n- Frenos\n- Claxon");
        if (!seleccion.equalsIgnoreCase("Motor") && !seleccion.equalsIgnoreCase("Faros") && !seleccion.equalsIgnoreCase("Neumaticos") && !seleccion.equalsIgnoreCase("Frenos") && !seleccion.equalsIgnoreCase("Claxon")) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada");
            seleccion = null;
        }

        if (seleccion != null) {
            JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccion + " del coche con matrícula " + matricula + ", que su color es " + color + " y el modelo del coche es " + modelo + ".");

        }
    }
}


class Moto extends Vehiculo {
    private String cilindros;
    private String manijas;
    private String exosto;
    private String calapie;
    private String farola;

    public Moto(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
        this.cilindros = cilindros;
        this.manijas = manijas;
        this.exosto = exosto;
        this.calapie = calapie;
        this.farola = farola;
    }


    @Override
    public void reparar() {
        String seleccion = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Cilindros\n- Manijas\n- Exosto\n- Calapie\n- Farola");
        if (!seleccion.equalsIgnoreCase("Cilindros") && !seleccion.equalsIgnoreCase("Manijas") && !seleccion.equalsIgnoreCase("Exosto") && !seleccion.equalsIgnoreCase("Calapie") && !seleccion.equalsIgnoreCase("Farola")) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada");
            seleccion = null;
        }

        if (seleccion != null) {
            JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccion + " de la moto con matrícula " + matricula + ", que su color es " + color + " y el modelo del coche es " + modelo + ".");
        }
    }

}


class Camion extends Vehiculo {
    private String capo;
    private String guardabarros;
    private String chimenea;
    private String semiremolque;
    private String paravientos;

    public Camion(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
        this.capo = capo;
        this.guardabarros = guardabarros;
        this.chimenea = chimenea;
        this.semiremolque = semiremolque;
        this.paravientos = paravientos;
    }

    @Override
    public void reparar() {
        String seleccion = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Capo\n- Guardabarros\n- Chimenea\n- Semirremolque\n- Paravientos");
        if (!seleccion.equalsIgnoreCase("Capo") && !seleccion.equalsIgnoreCase("Guardabarros") && !seleccion.equalsIgnoreCase("Chimenea") && !seleccion.equalsIgnoreCase("Semirremolque") && !seleccion.equalsIgnoreCase("Paravientos")) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada");
            seleccion = null;
        }
        if (seleccion != null) {
            JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccion + " del camión con matrícula " + matricula + ", que su color es " + color + " y el modelo del coche es " + modelo + ".");
        }
    }
}

class Tractor extends Vehiculo {
    private String diferencial;
    private String embrague;
    private String llantas;
    private String rops;
    private String gradas;

    public Tractor(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
        this.diferencial = diferencial;
        this.embrague = embrague;
        this.llantas = llantas;
        this.rops = rops;
        this.gradas = gradas;
    }


    @Override
    public void reparar() {
        String seleccion = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Diferencial\n- Embrague\n- Llantas\n- ROPS\n- Gradas");
        if (!seleccion.equalsIgnoreCase("Diferencial") && !seleccion.equalsIgnoreCase("Embrague") && !seleccion.equalsIgnoreCase("Llantas") && !seleccion.equalsIgnoreCase("ROPS") && !seleccion.equalsIgnoreCase("Gradas")) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada");
            seleccion = null;
        }

        if (seleccion != null) {
            JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccion + " del tractor con matrícula " + matricula + ", que su color es " + color + " y el modelo del coche es " + modelo + ".");
        }
    }
}


class Grua extends Vehiculo {
    private String gancho;
    private String plumin;
    private String pluma;
    private String plataforma;
    private String aparejo;

    public Grua(String matricula, String color, String modelo) {
        super(matricula, color, modelo);
        this.gancho = gancho;
        this.plumin = plumin;
        this.pluma = pluma;
        this.plataforma = plataforma;
        this.aparejo = aparejo;

    }

    @Override
    public void reparar() {
        String seleccion = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Gancho\n- Plumin\n- Pluma\n- Plataforma\n- Aparejo");
        if (!seleccion.equalsIgnoreCase("Gancho") && !seleccion.equalsIgnoreCase("Plumin") && !seleccion.equalsIgnoreCase("Pluma") && !seleccion.equalsIgnoreCase("Plataforma") && !seleccion.equalsIgnoreCase("Aparejo")) {
            JOptionPane.showMessageDialog(null, "Pieza no encontrada");
            seleccion = null;
        }

        if (seleccion != null) {
            JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccion + " de la grúa con matrícula " + matricula + ", que su color es " + color + " y el modelo del coche es " + modelo + ".");
        }
    }
}


