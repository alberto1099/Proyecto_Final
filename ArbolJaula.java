import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ArbolJaula {

    private NodoArbol raiz;
    private int nodos;
    String cadena = "";

    public ArbolJaula() {
        raiz = null;
        nodos = 0;
    }

    public int getNodos() {
        return nodos;
    }

    public void Insertar(Jaula d) {

        NodoArbol nuevo = new NodoArbol(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            if (raiz.getDato().getId_jaula() != d.getId_jaula()) {
                NodoArbol auxiliar = raiz;
                NodoArbol padre;
                while (true) {
                    padre = auxiliar;
                    if (d.getId_jaula() < auxiliar.getDato().getId_jaula()) {
                        auxiliar = auxiliar.getIzq();
                        if (auxiliar == null) {
                            padre.setIzq(nuevo);
                            return;
                        }
                    } else {
                        auxiliar = auxiliar.getDer();
                        if (auxiliar == null) {
                            padre.setDer(nuevo);
                            return;
                        }
                    }
                }
            }
        }
    }

    public boolean Vacio() {
        return raiz == null;
    }

    public String InOrden(NodoArbol r) {
        if (r != null) {
            InOrden(r.getIzq());
            cadena += r.getDato();
            InOrden(r.getDer());
        }
        return cadena;
    }

    public void LimpiarListas(NodoArbol r) {
        if (r != null) {
            LimpiarListas(r.getIzq());
            LimpiarListas(r.getDer());
            r.getDato().getAnimales().vaciar();
        }
    }

    public NodoArbol BuscarNodo(int d) {
        NodoArbol aux = raiz;
        while (aux.getDato().getId_jaula() != d) {
            if (d < aux.getDato().getId_jaula()) {
                aux = aux.getIzq();
            } else {
                aux = aux.getDer();
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }

    public boolean Eliminar(int d) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean hijoizq = true;
        while (auxiliar.getDato().getId_jaula() != d) {
            padre = auxiliar;
            if (d < auxiliar.getDato().getId_jaula()) {
                hijoizq = true;
                auxiliar = auxiliar.getIzq();
            } else {
                hijoizq = false;
                auxiliar = auxiliar.getDer();
            }
            if (auxiliar == null) {
                return false;
            }
        }
        if (auxiliar.getIzq() == null && auxiliar.getDer() == null) {
            if (auxiliar == raiz) {
                raiz = null;
            } else if (hijoizq) {
                padre.setIzq(null);
            } else {
                padre.setDer(null);
            }
        } else if (auxiliar.getDer() == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.getIzq();
            } else if (hijoizq) {
                padre.setIzq(auxiliar.getIzq());
            } else {
                padre.setDer(auxiliar.getIzq());
            }
        } else if (auxiliar.getIzq() == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.getDer();
            } else if (hijoizq) {
                padre.setIzq(auxiliar.getDer());
            } else {
                padre.setDer(auxiliar.getDer());
            }
        } else { //cuando tenemos hijos a la izquierda y derecha
            NodoArbol reemplazo = ObtenerReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (hijoizq) {
                padre.setIzq(reemplazo);
            } else {
                padre.setDer(reemplazo);
            }
            reemplazo.setIzq(auxiliar.getIzq());
        }
        nodos--;
        return true;
    }

    public NodoArbol ObtenerReemplazo(NodoArbol nodoreemplazo) {
        NodoArbol reemplazarpadre = nodoreemplazo;
        NodoArbol reemplazo = nodoreemplazo;
        NodoArbol auxiliar = nodoreemplazo.getDer();
        while (auxiliar != null) {
            reemplazarpadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.getIzq();
        }
        if (reemplazo != nodoreemplazo.getDer()) {
            reemplazarpadre.setIzq(reemplazo.getDer());
            reemplazo.setDer(nodoreemplazo.getDer());
        }
        System.out.println("El Nodo Reemplazo es:" + reemplazo);
        return reemplazo;
    }

    public NodoArbol Raiz() {
        return raiz;
    }

    public void ingresarNodos(String archivo, ListaAnimal[] animales) {
        Jaula[] jaulas = new Jaula[10];
        FileReader fr = null;
        BufferedReader br;
        try {
            fr = new FileReader(archivo); //ESTABLECE LA COMUNICACION DIRECTA CON EL ARCHIVO
        } catch (FileNotFoundException e) {
            return;
        }
        br = new BufferedReader(fr); //ME DA MÉTODO QUE ME PERMITEN INTERCAMBIAR DATOS CON EL ARCHIVO
        for (int i = 0; i < jaulas.length; i++) {
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
            jaulas[i] = new Jaula(Integer.parseInt(valores[0]), valores[1], valores[2], animales[i]);
            Insertar(jaulas[i]);
            nodos++;
        }
    }

    public boolean vacio() {
        return raiz == null;
    }

    public void vaciar() {
        LimpiarListas(raiz);
        raiz = null;
    }

    public NodoArbol buscar(int id) {
        NodoArbol auxiliar = raiz;
        if (!vacio()) {

            if (raiz.getDato().getId_jaula() != id) {
                while (auxiliar.getDato().getId_jaula() != id) {
                    if (id < auxiliar.getDato().getId_jaula()) {
                        auxiliar = auxiliar.getIzq();
                    } else {
                        auxiliar = auxiliar.getIzq();
                    }
                    if (auxiliar == null) {
                        return null;
                    }
                }
                return auxiliar;
            } else {
                return auxiliar;
            }
        }
        return auxiliar;
    }

    public NodoListaDoble buscarAnimal(int id) {
            LimpiarListas(raiz.getIzq());
            LimpiarListas(raiz.getDer());
            return raiz.getDato().getAnimales().buscar(id);
    }

}