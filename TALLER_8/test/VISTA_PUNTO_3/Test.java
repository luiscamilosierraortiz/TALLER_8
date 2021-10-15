package VISTA_PUNTO_3;
import MODELO_PUNTO_3.*;
public class Test{
    public static void main(String[] args) {
        
        IColoriable figura = new Figura("Cuadrado");
        imprimirFigura(figura);
        System.out.println("*************");

    }
    private static void imprimirFigura(IColoriable f) {
        System.out.println("Mensaje: " + f.dibujar());
        System.out.println("Borrando: " + f.borrar());
       }
    
}