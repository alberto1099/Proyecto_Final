public class ListaSectores {

    private NodoListaCircular inicio;
    private NodoListaCircular fin;
    private int tam;
    private ArbolJaula jaulas;

    public ListaSectores() {
        this.inicio = fin = null;
        this.tam = 0;
    }

    public NodoListaCircular getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaCircular inicio) {
        this.inicio = inicio;
    }

    public NodoListaCircular getFin() {
        return fin;
    }

    public void setFin(NodoListaCircular fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public ArbolJaula getJaulas() {
        return jaulas;
    }

    public void setJaulas(ArbolJaula jaulas) {
        this.jaulas = jaulas;
    }

    @Override
    public String toString() {
        return "ListaSectores{" + "inicio=" + inicio + ", fin=" + fin + ", tam=" + tam + ", num_jaulas=" + jaulas.getNodos() + ", jaulas=" + jaulas + '}';
    }

    public boolean vacio() {
        return inicio == null;
    }

    public void insertarFin(Sector d) {
        if (vacio()) {
            inicio = fin = new NodoListaCircular(d, inicio);
        } else {
            NodoListaCircular nuevo = new NodoListaCircular(d, inicio);
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tam++;
    }

    public void eliminarInicio() {
        if (!vacio()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
            }
            tam--;
        }
    }

    public void eliminarInicio2() {
        if (!vacio()) {
            if (tam == 1) {
                vaciarLista();
                tam = 0;
            } else if (tam == 2) {
                inicio = fin;
                fin.setSiguiente(fin);
                tam = 1;
            } else {
                fin.setSiguiente(inicio.getSiguiente());
                inicio = inicio.getSiguiente();
                tam--;
            }
        }
    }

    public void eliminarFin() {
        if (!vacio()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                NodoListaCircular auxiliar = inicio;
                while (auxiliar.getSiguiente() != fin) {
                    auxiliar = auxiliar.getSiguiente();
                }
                auxiliar.setSiguiente(inicio);
                fin = auxiliar;
            }
            tam--;
        }
    }

    public void eliminarEnMedio(int x) {
        if (!vacio()) {
            if (inicio.getSiguiente() == inicio && inicio.getDato().getId_sector() == x) {
                inicio = fin = null;
                tam = 0;
            } else {
                NodoListaCircular auxiliar = inicio;
                while (auxiliar != fin) {
                    if (auxiliar.getDato().getId_sector() == x) {
                        if (inicio == auxiliar) {
                            eliminarInicio2();
                            auxiliar = inicio;
                        } else if (auxiliar.getSiguiente().getDato().getId_sector() == x) {
                            if (auxiliar.getSiguiente() == fin) {
                                eliminarFin();
                            } else {
                                auxiliar.setSiguiente(auxiliar.getSiguiente().getSiguiente());
                                tam--;
                            }
                        } else {
                            auxiliar = auxiliar.getSiguiente();
                        }
                    }
                }
                if (auxiliar.getDato().getId_sector() == x) {
                    eliminarFin();
                }
            }
        }
    }

    public String mostrar() {
        String cadena = "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        if (!vacio()) {
            if (inicio != fin) {
                NodoListaCircular auxliar = inicio;
                do {
                    cadena += "\n\t\t NOMBRE -----------> " + auxliar.getDato().getNombre_sector();
                    cadena += "\n\t\t ID ---------------> " + auxliar.getDato().getId_sector();
                    cadena += "\n\t\t NUMERO DE JAULAS -> " + auxliar.getDato().getCantidad_jaulas();
                    cadena += "\n\t JAULAS" + auxliar.getDato().getJaulas().InOrden(auxliar.getDato().getJaulas().Raiz());
                    cadena += "\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
                    auxliar = auxliar.getSiguiente();
                } while (auxliar != inicio);
            } else {
                cadena += "\n\t\t NOMBRE -----------> " + inicio.getDato().getNombre_sector();
                cadena += "\n\t\t ID ---------------> " + inicio.getDato().getId_sector();
                cadena += "\n\t\t NUMERO DE JAULAS -> " + inicio.getDato().getCantidad_jaulas();
                cadena += "\n\t JAULAS" + inicio.getDato().getJaulas().InOrden(inicio.getDato().getJaulas().Raiz());
                cadena += "\n----------------------------------------------------------------------";
            }
        } else {
            cadena = "ZOOLOGICO VACIO";
        }
        return cadena;
    }

    public NodoListaCircular buscar(int dato) {
        if (!vacio()) {
            NodoListaCircular aux = inicio;
            while (aux != null) {
                if (aux.getDato().getId_sector() == dato) {
                    break;
                }
                aux = aux.getSiguiente();
            }
            return aux;
        } else {
            return null;
        }
    }

    public void vaciarLista() {
        inicio = fin = null;
    }

    public NodoArbol verJaula(int id) {
        if (!vacio()) {
            NodoListaCircular aux = inicio;
            NodoArbol mostrar = null;
            while (aux != null) {
                if (aux.getDato().getJaulas().BuscarNodo(id) != null) {
                    mostrar = aux.getDato().getJaulas().BuscarNodo(id);
                    break;
                }
                aux = aux.getSiguiente();
            }
            return mostrar;
        } else {
            return null;
        }
    }

    public NodoListaDoble verAnimal(int id) {
        if (!vacio()) {
            NodoListaCircular aux = inicio;
            NodoArbol nodo;
            NodoListaDoble mostrar = null;
            while (aux != null) {
                if (aux.getDato().getJaulas().buscarAnimal(id) != null) {
                    mostrar = aux.getDato().getJaulas().buscarAnimal(id);
                    break;
                }
                aux = aux.getSiguiente();
            }
            return mostrar;
        } else {
            return null;
        }
    }
}