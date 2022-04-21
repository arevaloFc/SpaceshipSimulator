public class Cargo extends SpaceShip{
    private int cargaMaximaBodega;

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
        int cantidadEspacios = cargaMaximaBodega -= numeroMaximaCarga;
        if (cantidadEspacios < 0) {
            return "No te queda mas Espacios en tu bodega";
        }
        return "\t\tTe quedan : " + cantidadEspacios + " Espacios en tu bodega";
    }

    public String unload(int numeroMaximaCarga){
        int cantidadEspacios = cargaMaximaBodega += numeroMaximaCarga;
        if (cantidadEspacios > 10) {
            return "No hay mas containers en tu bodega";
        }
        return "Te quedan : " + cantidadEspacios + " containers en tu bodega";
    }

}
