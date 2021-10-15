
package MODELO_PUNTO_1;


public class EMPLEADO implements I_TRABJADOR
 {
    private String cargo;

    public EMPLEADO () {
    }

    public EMPLEADO (String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public double obtenerSueldo() {
        double sueldo;
        switch (cargo) {
            case "Coordinador":
                sueldo = 5000;
                break;
            case "Asistente":
                sueldo = 4000;
                break;
            default:
                sueldo = 3000;
        }
        return sueldo;
    }

    @Override
    public double obtenerBonificacion() {
        return this.obtenerSueldo();
    
}
}
