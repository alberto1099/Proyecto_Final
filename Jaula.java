public class Jaula {

    private int id_jaula;
    private String nombre_jaula;
    private String especie_animal;
    private ListaAnimal animales;

    public Jaula(int id_jaula, String nombre_jaula, String especie_animal, ListaAnimal animales) {
        this.id_jaula = id_jaula;
        this.nombre_jaula = nombre_jaula;
        this.especie_animal = especie_animal;
        this.animales = animales;
    }

    public Jaula() {
    }

    public int getId_jaula() {
        return id_jaula;
    }

    public void setId_jaula(int id_jaula) {
        this.id_jaula = id_jaula;
    }

    public String getNombre_jaula() {
        return nombre_jaula;
    }

    public void setNombre_jaula(String nombre_jaula) {
        this.nombre_jaula = nombre_jaula;
    }

    public String getEspecie_animal() {
        return especie_animal;
    }

    public void setEspecie_animal(String especie_animal) {
        this.especie_animal = especie_animal;
    }

    public ListaAnimal getAnimales() {
        return animales;
    }

    public void setAnimales(ListaAnimal animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        String cadena= "";
        cadena += "\n************************************************\n";
            cadena += "\t|  ID JAULA -> " + getId_jaula() + "\n";
            cadena += "\t|  NOMBRE ---> " + getNombre_jaula() + "\n";
            cadena += "\t|  ESPECIE --> " + getEspecie_animal() + "\n";
            cadena += "\n ANIMALES\n" + getAnimales().mostrar();
            cadena += "\n************************************************\n";
        return cadena;
    }

}