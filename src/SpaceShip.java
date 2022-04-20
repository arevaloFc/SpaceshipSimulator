public class SpaceShip {
    private String nombre;
    private String matriculaGalactica;
    private int aceleracion;
    private int velocidadX;
    private int velocidadY;
    private int coordenadaX;
    private int coordenadaY;
    private int direccionX;
    private int direccionY;

    public SpaceShip(String nombre, String matriculaGalactica, int aceleracion) {
        this.nombre = nombre;
        this.matriculaGalactica = matriculaGalactica;
        this.aceleracion = aceleracion;
        this.velocidadX = 0;
        this.velocidadY = 0;
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        this.direccionX = 0;
        this.direccionY = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatriculaGalactica() {
        return matriculaGalactica;
    }

    public void setMatriculaGalactica(String matriculaGalactica) {
        this.matriculaGalactica = matriculaGalactica;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public int getVelocidadX() {
        return velocidadX;
    }

    public void setVelocidadX(int velocidadX) {
        this.velocidadX = velocidadX;
    }

    public int getVelocidadY() {
        return velocidadY;
    }

    public void setVelocidadY(int velocidadY) {
        this.velocidadY = velocidadY;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }
}
