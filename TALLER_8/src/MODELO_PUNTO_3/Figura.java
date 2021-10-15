
package MODELO_PUNTO_3;


public class Figura implements IColoriable
 {
        private String figura;

    public Figura() {
    }

    public Figura(String figura) {
        this.figura = figura;
    }
    

    /**
     * @return the figura
     */
    public String getFigura() {
        return figura;
    }

    /**
     * @param figura the figura to set
     */
    public void setFigura(String figura) {
        this.figura = figura;
    }

    @Override
    public String dibujar() {
        String Mensaje;
        switch (getFigura()) {
            case "Triangulo":
                Mensaje = "Creando Triangulo";
                break;
            case "Circulo":
                Mensaje = "Creando Circulo";
                break;
            default:
                Mensaje = "Creando Cudrado";
        }
        return Mensaje;
    }

    @Override
    public String borrar() {
        String Mensaje;
        switch (getFigura()) {
            case "Triangulo":
                Mensaje = "Borrando Triangulo";
                break;
            case "Circulo":
                Mensaje = "Borrando Circulo";
                break;
            default:
                Mensaje = "Borrando Cudrado";
        }
        return Mensaje;
    }

}
