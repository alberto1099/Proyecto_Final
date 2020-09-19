public class Animal{
    
    private int id_animal;
    private int edad_animal;
    private String genero_animal;

    public Animal(int id, int edad, String genero) {
        this.id_animal = id;
        this.edad_animal = edad;
        this.genero_animal = genero;
    }

    public Animal() {
    }

    public int getId() {
        return id_animal;
    }

    public void setId(int id) {
        this.id_animal = id;
    }

    public int getEdad() {
        return edad_animal;
    }

    public void setEdad(int edad) {
        this.edad_animal = edad;
    }

    public String getGenero() {
        return genero_animal;
    }

    public void setGenero(String genero) {
        this.genero_animal = genero;
    }

    @Override
    public String toString() {
        return "[ID -> " + id_animal + ", EDAD ->" + edad_animal + ", GENERO -> " + genero_animal + ']';
    }
}