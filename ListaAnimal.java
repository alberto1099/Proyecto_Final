import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ListaAnimal {

    private NodoListaDoble inicio;
    private NodoListaDoble fin;
    private int tam;

    public ListaAnimal() {
        this.inicio = null;
        this.fin = null;
        this.tam = 0;
    }

    public NodoListaDoble getInicio() {
        return inicio;
    }

    public void setInicio(NodoListaDoble inicio) {
        this.inicio = inicio;
    }

    public NodoListaDoble getFin() {
        return fin;
    }

    public void setFin(NodoListaDoble fin) {
        this.fin = fin;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "ListaDoble{" + "inicio=" + inicio + ", fin=" + fin + '}';
    }

    public boolean vacio() {
        return inicio == null;
    }

    public void insertarFinal(Animal d) {
        if (vacio()) {
            fin = new NodoListaDoble(d, null, null);
            inicio = fin;
        } else {
            NodoListaDoble nuevo = new NodoListaDoble(d, null, fin);
            fin = nuevo;
            fin.getAnterior().setSiguiente(fin);
        }
        tam++;
    }

    public String mostrar() {
        String listad = "*******************************";
        if (!vacio()) {
            NodoListaDoble auxiliar = inicio;
            while (auxiliar != null) {
                listad += "\n GENERO -> " + auxiliar.getDato().getGenero();
                listad += "\n ID -----> " + auxiliar.getDato().getId();
                listad += "\n EDAD ---> " + auxiliar.getDato().getEdad();
                listad += "\n*******************************";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return listad;
    }

    public void ingresarNodos(String archivo) {
        Animal[] animales = new Animal[10];
        FileReader fr = null;
        BufferedReader br;
        try {
            fr = new FileReader(archivo); //ESTABLECE LA COMUNICACION DIRECTA CON EL ARCHIVO
        } catch (FileNotFoundException e) {
            return;
        }
        br = new BufferedReader(fr); //ME DA MÉTODO QUE ME PERMITEN INTERCAMBIAR DATOS CON EL ARCHIVO
        for (int i = 0; i < animales.length; i++) {
            String dato; //AUXILIAR PARA LEER LOS DATOS
            try {
                dato = br.readLine();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR");
                return;
            }
            if (dato == null) {
                break;
            }
            String[] valores;
            valores = dato.split(";");
            animales[i] = new Animal(Integer.parseInt(valores[0]), Integer.parseInt(valores[1]), valores[2]);
            insertarFinal(animales[i]);
        }
    }

    public void eliminarInicio() {
        if (!vacio()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
            tam--;
        }
    }

    public void eliminarFin() {
        if (!vacio()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                fin = fin.getAnterior();
                fin.setSiguiente(null);
            }
            tam--;
        }
    }

    public void eliminarEnMedio(int dato) {
        if (!vacio()) {
            if (buscar(dato) != null) {
                NodoListaDoble aux = inicio;
                if (inicio == fin && inicio.getDato().getId() == dato) {
                    inicio = fin = null;
                } else if (inicio.getDato().getId() == dato) {
                    eliminarInicio();
                } else if (fin.getDato().getId() == dato) {
                    eliminarFin();
                } else {
                    while (aux != null) {
                        if (aux.getDato().getId() == dato) {
                            aux.getAnterior().setSiguiente(aux.getSiguiente());
                            aux.getSiguiente().setAnterior(aux.getAnterior());
                            break;
                        } else {
                            aux = aux.getSiguiente();

                        }
                    }
                }
            }
        }
    }

    public NodoListaDoble buscar(int dato) {
        NodoListaDoble aux = inicio;
        while (aux != null) {
            if (aux.getDato().getId() == dato) {
                break;
            }
            aux = aux.getSiguiente();
        }
        return aux;
    }

    public void vaciar() {
        inicio = fin = null;
    }

}