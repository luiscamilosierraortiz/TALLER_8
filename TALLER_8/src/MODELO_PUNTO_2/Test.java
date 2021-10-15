
package MODELO_PUNTO_2;

import MODELO_PUNTO_2.IPersona.Persona;
import static MODELO_PUNTO_2.IPersona.imprimeArrayPersonas;
import java.util.Arrays;
        
        
public class Test {
       public static void main(String[] args) {
        Persona[] arrayPersonas = new Persona[7];
        arrayPersonas[0] = new Persona("CAMILO", 24, 160);
        arrayPersonas[1] = new Persona("LUIS", 42, 189);
        arrayPersonas[2] = new Persona("ALBERTO", 32, 150);
        arrayPersonas[3] = new Persona("MARIA", 47, 164);
        arrayPersonas[4] = new Persona("REBECA", 18, 167);
        arrayPersonas[5] = new Persona("ALEJANDRA", 90, 170);
        arrayPersonas[6] = new Persona("YORIEL", 77, 175);

        System.out.println("Array sin ordenar por altura");
        System.out.println("------------------------------");
        imprimeArrayPersonas(arrayPersonas);
        Arrays.sort(arrayPersonas);
        System.out.println("\nArray ordenado por altura");
        System.out.println("-------------------------------");
        imprimeArrayPersonas(arrayPersonas);
    
}
}
    

