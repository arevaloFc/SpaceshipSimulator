public class Cargo extends SpaceShip{
    private int cargaMaximaBodega;

    public static int cantidadEspaciosBodega;

    public Cargo(String nombre, String matriculaGalactica, int aceleracion) {
        super(nombre, matriculaGalactica, aceleracion);
        this.cargaMaximaBodega = 10;
    }

    public int getCargaMaximaBodega() {
        return cargaMaximaBodega;
    }

    public void setCargaMaximaBodega(int cargaMaximaBodega) {
        this.cargaMaximaBodega = cargaMaximaBodega;
    }

    public String load(int numeroMaximaCarga){
        cantidadEspaciosBodega = cargaMaximaBodega -= numeroMaximaCarga;
        if (cantidadEspaciosBodega < 0) {
            return "\t\tNo te queda mas Espacios en tu bodega";
        }
        return "\t\tTe quedan : " + cantidadEspaciosBodega + " Espacios en tu bodega";
    }

    public String unload(int numeroMaximaCarga){
        int cantidadEspacios = cantidadEspaciosBodega += numeroMaximaCarga;
        if (cantidadEspacios > 10) {
            return "\t\tNo hay mas containers en tu bodega";
        }
        return "\t\tTe quedan : " + cantidadEspacios + " containers en tu bodega";
    }

}
