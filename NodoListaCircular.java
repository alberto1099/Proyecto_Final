public class NodoListaCircular {

    private Sector dato;
    private NodoListaCircular siguiente;

    public NodoListaCircular(Sector dato, NodoListaCircular siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Sector getDato() {
        return dato;
    }

    public void setDato(Sector dato) {
        this.dato = dato;
    }

    public NodoListaCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircular siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return ""+dato;
    }
}