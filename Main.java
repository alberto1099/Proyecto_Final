import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //---------------------------------------------------------------------
        //CREAMOS LAS ESTRUCTURAS NECESARIAS
        ListaAnimal[] animales0 = new ListaAnimal[10];
        ListaAnimal[] animales1 = new ListaAnimal[10];
        ListaAnimal[] animales2 = new ListaAnimal[10];
        ListaAnimal[] animales3 = new ListaAnimal[10];
        ListaAnimal[] animales4 = new ListaAnimal[10];
        ListaAnimal[] animales5 = new ListaAnimal[10];
        ListaAnimal[] animales6 = new ListaAnimal[10];
        ListaAnimal[] animales7 = new ListaAnimal[10];
        ListaAnimal[] animales8 = new ListaAnimal[10];
        ListaAnimal[] animales9 = new ListaAnimal[10];
        ArbolJaula[] jaulas = new ArbolJaula[10];
        ListaSectores sectores = new ListaSectores();
        //---------------------------------------------------------------------
        //INICIALIZAMOS LAS ESTRUCTURAS
        for (int i = 0; i < 10; i++) {
            animales0[i] = new ListaAnimal();
            animales1[i] = new ListaAnimal();
            animales2[i] = new ListaAnimal();
            animales3[i] = new ListaAnimal();
            animales4[i] = new ListaAnimal();
            animales5[i] = new ListaAnimal();
            animales6[i] = new ListaAnimal();
            animales7[i] = new ListaAnimal();
            animales8[i] = new ListaAnimal();
            animales9[i] = new ListaAnimal();
            jaulas[i] = new ArbolJaula();
        }
        //---------------------------------------------------------------------
        animales0[0].ingresarNodos("ANIMALES_00.txt");
        animales0[1].ingresarNodos("ANIMALES_01.txt");
        animales0[2].ingresarNodos("ANIMALES_02.txt");
        animales0[3].ingresarNodos("ANIMALES_03.txt");
        animales0[4].ingresarNodos("ANIMALES_04.txt");
        animales0[5].ingresarNodos("ANIMALES_05.txt");
        animales0[6].ingresarNodos("ANIMALES_06.txt");
        animales0[7].ingresarNodos("ANIMALES_07.txt");
        animales0[8].ingresarNodos("ANIMALES_08.txt");
        animales0[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales1[0].ingresarNodos("ANIMALES_10.txt");
        animales1[1].ingresarNodos("ANIMALES_11.txt");
        animales1[2].ingresarNodos("ANIMALES_12.txt");
        animales1[3].ingresarNodos("ANIMALES_13.txt");
        animales1[4].ingresarNodos("ANIMALES_14.txt");
        animales1[5].ingresarNodos("ANIMALES_15.txt");
        animales1[6].ingresarNodos("ANIMALES_16.txt");
        animales1[7].ingresarNodos("ANIMALES_17.txt");
        animales1[8].ingresarNodos("ANIMALES_18.txt");
        animales1[9].ingresarNodos("ANIMALES_19.txt");
        //---------------------------------------------------------------------
        animales2[0].ingresarNodos("ANIMALES_20.txt");
        animales2[1].ingresarNodos("ANIMALES_21.txt");
        animales2[2].ingresarNodos("ANIMALES_22.txt");
        animales2[3].ingresarNodos("ANIMALES_23.txt");
        animales2[4].ingresarNodos("ANIMALES_04.txt");
        animales2[5].ingresarNodos("ANIMALES_05.txt");
        animales2[6].ingresarNodos("ANIMALES_06.txt");
        animales2[7].ingresarNodos("ANIMALES_07.txt");
        animales2[8].ingresarNodos("ANIMALES_08.txt");
        animales2[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales3[0].ingresarNodos("ANIMALES_00.txt");
        animales3[1].ingresarNodos("ANIMALES_01.txt");
        animales3[2].ingresarNodos("ANIMALES_02.txt");
        animales3[3].ingresarNodos("ANIMALES_03.txt");
        animales3[4].ingresarNodos("ANIMALES_04.txt");
        animales3[5].ingresarNodos("ANIMALES_05.txt");
        animales3[6].ingresarNodos("ANIMALES_06.txt");
        animales3[7].ingresarNodos("ANIMALES_07.txt");
        animales3[8].ingresarNodos("ANIMALES_08.txt");
        animales3[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales4[0].ingresarNodos("ANIMALES_00.txt");
        animales4[1].ingresarNodos("ANIMALES_01.txt");
        animales4[2].ingresarNodos("ANIMALES_02.txt");
        animales4[3].ingresarNodos("ANIMALES_03.txt");
        animales4[4].ingresarNodos("ANIMALES_04.txt");
        animales4[5].ingresarNodos("ANIMALES_05.txt");
        animales4[6].ingresarNodos("ANIMALES_06.txt");
        animales4[7].ingresarNodos("ANIMALES_07.txt");
        animales4[8].ingresarNodos("ANIMALES_08.txt");
        animales4[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales5[0].ingresarNodos("ANIMALES_00.txt");
        animales5[1].ingresarNodos("ANIMALES_01.txt");
        animales5[2].ingresarNodos("ANIMALES_02.txt");
        animales5[3].ingresarNodos("ANIMALES_03.txt");
        animales5[4].ingresarNodos("ANIMALES_04.txt");
        animales5[5].ingresarNodos("ANIMALES_05.txt");
        animales5[6].ingresarNodos("ANIMALES_06.txt");
        animales5[7].ingresarNodos("ANIMALES_07.txt");
        animales5[8].ingresarNodos("ANIMALES_08.txt");
        animales5[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales6[0].ingresarNodos("ANIMALES_00.txt");
        animales6[1].ingresarNodos("ANIMALES_01.txt");
        animales6[2].ingresarNodos("ANIMALES_02.txt");
        animales6[3].ingresarNodos("ANIMALES_03.txt");
        animales6[4].ingresarNodos("ANIMALES_04.txt");
        animales6[5].ingresarNodos("ANIMALES_05.txt");
        animales6[6].ingresarNodos("ANIMALES_06.txt");
        animales6[7].ingresarNodos("ANIMALES_07.txt");
        animales6[8].ingresarNodos("ANIMALES_08.txt");
        animales6[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales7[0].ingresarNodos("ANIMALES_00.txt");
        animales7[1].ingresarNodos("ANIMALES_01.txt");
        animales7[2].ingresarNodos("ANIMALES_02.txt");
        animales7[3].ingresarNodos("ANIMALES_03.txt");
        animales7[4].ingresarNodos("ANIMALES_04.txt");
        animales7[5].ingresarNodos("ANIMALES_05.txt");
        animales7[6].ingresarNodos("ANIMALES_06.txt");
        animales7[7].ingresarNodos("ANIMALES_07.txt");
        animales7[8].ingresarNodos("ANIMALES_08.txt");
        animales7[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales8[0].ingresarNodos("ANIMALES_00.txt");
        animales8[1].ingresarNodos("ANIMALES_01.txt");
        animales8[2].ingresarNodos("ANIMALES_02.txt");
        animales8[3].ingresarNodos("ANIMALES_03.txt");
        animales8[4].ingresarNodos("ANIMALES_04.txt");
        animales8[5].ingresarNodos("ANIMALES_05.txt");
        animales8[6].ingresarNodos("ANIMALES_06.txt");
        animales8[7].ingresarNodos("ANIMALES_07.txt");
        animales8[8].ingresarNodos("ANIMALES_08.txt");
        animales8[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        animales9[0].ingresarNodos("ANIMALES_00.txt");
        animales9[1].ingresarNodos("ANIMALES_01.txt");
        animales9[2].ingresarNodos("ANIMALES_02.txt");
        animales9[3].ingresarNodos("ANIMALES_03.txt");
        animales9[4].ingresarNodos("ANIMALES_04.txt");
        animales9[5].ingresarNodos("ANIMALES_05.txt");
        animales9[6].ingresarNodos("ANIMALES_06.txt");
        animales9[7].ingresarNodos("ANIMALES_07.txt");
        animales9[8].ingresarNodos("ANIMALES_08.txt");
        animales9[9].ingresarNodos("ANIMALES_09.txt");
        //---------------------------------------------------------------------
        jaulas[0].ingresarNodos("JAULAS_00.txt", animales0);
        jaulas[1].ingresarNodos("JAULAS_00.txt", animales1);
        jaulas[2].ingresarNodos("JAULAS_00.txt", animales2);
        jaulas[3].ingresarNodos("JAULAS_00.txt", animales3);
        jaulas[4].ingresarNodos("JAULAS_00.txt", animales4);
        jaulas[5].ingresarNodos("JAULAS_00.txt", animales5);
        jaulas[6].ingresarNodos("JAULAS_00.txt", animales6);
        jaulas[7].ingresarNodos("JAULAS_00.txt", animales7);
        jaulas[8].ingresarNodos("JAULAS_00.txt", animales8);
        jaulas[9].ingresarNodos("JAULAS_00.txt", animales9);

        String opcion;
        ArrayList<Integer> jaulas_disponibles = new ArrayList();
        ArrayList<Integer> ids_disponibles = new ArrayList();

        do {
            opcion = JOptionPane.showInputDialog(null, "INGRESE UNA DE LAS SIGUIENTES OPCIONES:"
                    + "\n1   ---   VER ZOOLOGICO"
                    + "\n2   ---   AGREGAR SECTOR"
                    + "\n3   ---   BORRAR SECTOR"
                    + "\n4   ---   EDITAR SECTOR"
                    + "\n5   ---   EDITAR JAULA"
                    + "\n6   ---   EDITAR ANIMAL"
                    + "\n7   ---   VER SECTOR"
                    + "\n8   ---   VER JULA"
                    + "\n9   ---   VER ANIMAL"
                    + "\n10  ---   SALIR", "PROYECTO FINAL ESTRUCTURA DE DATOS", JOptionPane.INFORMATION_MESSAGE);

            try {
                switch (opcion) {
                    case "1":
                        System.out.println("EL ZOOLOGICO TIENE " + sectores.getTam() + " SECTORES");
                        System.out.println(sectores.mostrar());
                        break;
                    case "2":
                        try {
                            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DEL SECTOR"));
                            String nombre = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL SECTOR");
                            int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL INDICE DE LA JAULA"));
                            if (!ids_disponibles.contains(id)) {
                                if (indice < 10) {
                                    if (!jaulas_disponibles.contains(indice)) {
                                        Sector c = new Sector(id, nombre, jaulas[indice - 1]);
                                        sectores.insertarFin(c);
                                        jaulas_disponibles.add(indice);
                                        ids_disponibles.add(id);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "LA JAULA YA ESTA SIENDO UTILIZADA", "ERROR", JOptionPane.ERROR_MESSAGE);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "EL INDICE ESTA FUERA DE RANGO", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "EL ID YA EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "3":
                        try {
                            int id_borrar = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DEL SECTOR"));
                            if (sectores.buscar(id_borrar) != null) {
                                sectores.eliminarEnMedio(id_borrar);
                                JOptionPane.showMessageDialog(null, "ELIMINADO CORRECTAMENTE");
                            } else {
                                JOptionPane.showMessageDialog(null, "EL ID NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "4":
                        try {
                            int ids = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DEL SECTOR"));
                            if (sectores.buscar(ids) != null) {
                                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UNA OPCION"
                                        + "\n1 --- CAMBIAR NOMBRE"
                                        + "\n2 --- CAMBIAR ID"));
                                switch (op) {
                                    case 1:
                                        String nombrec = JOptionPane.showInputDialog(null, "INGRESE EL NUEVO NOMBRE");
                                        sectores.buscar(ids).getDato().setNombre_sector(nombrec);
                                        break;
                                    case 2:
                                        int idc = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUEVO ID"));
                                        sectores.buscar(ids).getDato().setId_sector(idc);
                                        break;
                                    default:
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "EL SECTOR NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                        break;
                    case "5":
                        try {
                            int idjc = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DE LA JULA"));
                            if (sectores.verJaula(idjc) != null) {
                                int opj = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE UNA OPCION"
                                        + "\n1 --- CAMBIAR NOMBRE"
                                        + "\n2 --- CAMBIAR ID"));
                                switch (opj) {
                                    case 1:
                                        String nombrejc = JOptionPane.showInputDialog(null, "INGRESE EL NUEVO NOMBRE");
                                        sectores.verJaula(idjc).getDato().setNombre_jaula(nombrejc);
                                        break;
                                    case 2:
                                        int idjcc = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUEVO ID"));
                                        sectores.verJaula(idjc).getDato().setId_jaula(idjcc);
                                        break;
                                    default:
                                        break;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "LA JAULA NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "6":
                        try {
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        int idac = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DE LA JULA"));
                        if (sectores.verAnimal(idac) != null) {
                            int idacc = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL NUEVO ID"));
                            sectores.verAnimal(idac).getDato().setId(idacc);
                        } else {
                            JOptionPane.showMessageDialog(null, "EL ANIMAL NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "7":
                        try {
                            int idss = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DEL SECTOR"));
                            if (sectores.buscar(idss) != null) {
                                System.out.println(sectores.buscar(idss));
                            } else {
                                JOptionPane.showMessageDialog(null, "EL SECTOR NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "8":
                        try {
                            int idj = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DE LA JULA"));
                            if (sectores.verJaula(idj) != null) {
                                System.out.println(sectores.verJaula(idj));
                            } else {
                                JOptionPane.showMessageDialog(null, "LA JAULA NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "9":
                        try {
                            int ida = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL ID DE LA JULA"));
                            if (sectores.verAnimal(ida) != null) {
                                System.out.println(sectores.verAnimal(ida));
                            } else {
                                JOptionPane.showMessageDialog(null, "EL ANIMAL NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                    case "10":
                        JOptionPane.showMessageDialog(null, "EJECUCION FINALIZADA");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "OPCION NO VALIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "EJECUCION FINALIZADA");
                break;
            }
        } while (!"10".equals(opcion));
    }
}