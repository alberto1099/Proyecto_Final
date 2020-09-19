public class NodoListaDoble {

    private Animal dato;
    private NodoListaDoble anterior;
    private NodoListaDoble siguiente;

    public NodoListaDoble(Animal dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }

    public NodoListaDoble(Animal dato, NodoListaDoble siguiente, NodoListaDoble anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public Animal getDato() {
        return dato;
    }

    public void setDato(Animal dato) {
        this.dato = dato;
    }

    public NodoListaDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDoble anterior) {
        this.anterior = anterior;
    }

    public NodoListaDoble getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDoble siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return ""+dato;
    }
    
}