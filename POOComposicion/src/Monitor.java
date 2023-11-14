public class Monitor {
    private String modelo;
    private String fabricante;
    private double tamano;
    private Resolucion resolucionNativa;    //Esto es composicion
    
    public Monitor(String modelo, String fabricante, double tamano, Resolucion resolucionNativa) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.tamano = tamano;
        this.resolucionNativa = resolucionNativa;
    }

    public void dibujarPixel(int x, int y, String color){
        System.out.println("Dibujando pixel en la posicion " + x + "," + y + " en color " + color);
    }

    public Resolucion mostrarResolucionNativa() {
        return resolucionNativa;
    }

    public void cambiarResolucionNativa(Resolucion resolucionNativa) {
        this.resolucionNativa = resolucionNativa;
    }

    
    
}
