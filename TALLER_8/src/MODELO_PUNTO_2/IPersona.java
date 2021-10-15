
package MODELO_PUNTO_2;


public class IPersona {


    static class Persona implements Comparable<Persona> {

        public String nombre;
        public int edad, altura;

        public Persona(String nombre, int edad, int altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        @Override
        public int compareTo(Persona o) {
            if (altura < o.altura) {
                return -1;
            }
            if (altura > o.altura) {
                return 1;
            }
            return 0;
        }
    }

    static void imprimeArrayPersonas(Persona[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i].nombre + " - Altura: " + array[i].altura + " - Edad: " + array[i].edad);
        }
    }

}
    

