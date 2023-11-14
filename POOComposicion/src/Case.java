public class Case {
    private String modelo;
    private String fabricante;
    private String fuentePoder;
    private Dimensiones dimensionesCase;    //Esto es composicion
    
    public Case(String modelo, String fabricante, String fuentePoder, Dimensiones dimensionesCase) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.fuentePoder = fuentePoder;
        this.dimensionesCase = dimensionesCase;
    }

    public Dimensiones mostrarDimensionesCase() {
        return dimensionesCase;
    }

    public void cambiarDimensionesCase(Dimensiones dimensionesCase) {
        this.dimensionesCase = dimensionesCase;
    }

    public void presionarBotonEncendido(){
        System.out.println("Boton de encendido presionado.");
    }
    
}
