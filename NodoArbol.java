public class NodoArbol {

    private Jaula dato;
    private NodoArbol izq;
    private NodoArbol der;

    public NodoArbol(Jaula dato) {
        this.dato = dato;
        this.der = null;
        this.izq = null;
    }

    public Jaula getDato() {
        return dato;
    }

    public void setDato(Jaula dato) {
        this.dato = dato;
    }

    public NodoArbol getIzq() {
        return izq;
    }

    public void setIzq(NodoArbol izq) {
        this.izq = izq;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }

    @Override
    public String toString() {
        return ""+dato;
    }
}
