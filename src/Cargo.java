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
        int rest = cargaMaximaBodega -= numeroMaximaCarga;
        if (rest < 0) {
            return "No te queda mas Espacios en tu bodega";
        }
        return "Te quedan : " + rest + " Espacios en tu bodega";
    }

}
