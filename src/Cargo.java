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
}
