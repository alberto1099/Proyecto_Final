public class Sector {

    private int id_sector;
    private String nombre_sector;
    private int cantidad_jaulas;
    private ArbolJaula jaulas;

    public Sector(int id_sector, String nombre_sector, ArbolJaula jaulas) {
        this.id_sector = id_sector;
        this.nombre_sector = nombre_sector;
        this.jaulas = jaulas;
        this.cantidad_jaulas = numJaulas();
    }

    public Sector() {
    }

    public int getId_sector() {
        return id_sector;
    }

    public void setId_sector(int id_sector) {
        this.id_sector = id_sector;
    }

    public String getNombre_sector() {
        return nombre_sector;
    }

    public void setNombre_sector(String nombre_sector) {
        this.nombre_sector = nombre_sector;
    }

    public int getCantidad_jaulas() {
        return cantidad_jaulas;
    }

    public void setCantidad_jaulas(int cantidad_jaulas) {
        this.cantidad_jaulas = cantidad_jaulas;
    }

    public ArbolJaula getJaulas() {
        return jaulas;
    }

    public void setJaulas(ArbolJaula jaulas) {
        this.jaulas = jaulas;
    }

    public int numJaulas() {
        return this.getJaulas().getNodos();
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena += "\n\t\t NOMBRE -----------> " + nombre_sector;
        cadena += "\n\t\t ID ---------------> " + id_sector;
        cadena += "\n\t\t NUMERO DE JAULAS -> " + cantidad_jaulas;
        cadena += "\n\t JAULAS" + jaulas.InOrden(jaulas.Raiz());
        return cadena;
    }

}