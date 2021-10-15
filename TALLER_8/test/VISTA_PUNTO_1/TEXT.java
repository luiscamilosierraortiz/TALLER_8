package VISTA_PUNTO_1;

import MODELO_PUNTO_1.*;

public class TEXT {

    public static void main(String[] args) {

        I_TRABJADOR empleado = new EMPLEADO ("Secretaria");
        imprimirTrabajador(empleado);
        System.out.println("---------------------------------");
        I_TRABJADOR docente = new DOCENTE (40);
        imprimirTrabajador(docente);
    }

    public static void imprimirTrabajador(I_TRABJADOR t) {
        System.out.println("Sueldo: " + t.obtenerSueldo());
        System.out.println("Bonificacion: " + t.obtenerBonificacion());
    }

}
