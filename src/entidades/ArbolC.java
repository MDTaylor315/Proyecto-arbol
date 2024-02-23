/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author md
 */
public class ArbolC {

    private NodoArbolC raiz;

    public ArbolC() {
        raiz = null;
    }

    public NodoArbolC getRaiz() {
        return raiz;
    }
    
    public boolean esVacio() {
        return raiz == null;
    }

    private NodoArbolC inserta(Curso x, NodoArbolC r) {
        if (r == null) {
            r = new NodoArbolC(x);
        } else {
            if (x.getCodigo().compareToIgnoreCase(r.getInfo().getCodigo()) < 0) {
                r.setHi(inserta(x, r.getHi()));
            } else {
                if (x.getCodigo().compareToIgnoreCase(r.getInfo().getCodigo()) > 0) {
                    r.setHd(inserta(x, r.getHd()));
                }
            }
        }
        return r;
    }

    public void inserta(Curso x) {
        raiz = inserta(x, raiz);
    }

    public NodoArbolC buscar(Curso x, NodoArbolC r) {
        if (r != null) {
            if (x.getCodigo().equalsIgnoreCase(r.getInfo().getCodigo())) {
                return r;
            } else {
                if (x.getCodigo().compareToIgnoreCase(r.getInfo().getCodigo()) < 0) {
                    return buscar(x, r.getHi());
                } else {
                    return buscar(x, r.getHd());
                }
            }
        } else {
            return null;
        }
    }

    public NodoArbolC buscar(Curso x) {
        return buscar(x, raiz);
    }

    public void agregarFila(DefaultTableModel modelo, Curso x) {
        Object fila[] = {x.getCodigo(), x.getNombre(), x.getCarrera(), x.getCiclo(), x.getCreditos()};
        modelo.addRow(fila);
    }

    public void limpiarTabla(DefaultTableModel modelo) {
        int filas = modelo.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    public void enOrden(DefaultTableModel modelo) {
        String titulos[] = {"Código", "Nombre", "Carrera", "Ciclo", "Créditos"};
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        enOrden(raiz, modelo);

    }

    private void enOrden(NodoArbolC r, DefaultTableModel modelo) {
        if (r != null) {
            enOrden(r.getHi(), modelo);
            agregarFila(modelo, r.getInfo());
            enOrden(r.getHd(), modelo);
        }
    }

    public void preOrden(DefaultTableModel modelo) {
        String titulos[] = {"Código", "Nombre", "Carrera", "Ciclo", "Créditos"};
        modelo.setColumnIdentifiers(titulos);
        limpiarTabla(modelo);
        preOrden(raiz, modelo);
    }

    private void preOrden(NodoArbolC r, DefaultTableModel modelo) {
        if (r != null) {
            agregarFila(modelo, r.getInfo());
            preOrden(r.getHi(), modelo);
            preOrden(r.getHd(), modelo);
        }
    }

    private void postOrden(NodoArbolC r, DefaultTableModel modelo) {
        if (r != null) {
            postOrden(r.getHi(), modelo);
            postOrden(r.getHd(), modelo);
            agregarFila(modelo, r.getInfo());
        }
    }

    public void postOrden(DefaultTableModel modelo) {
        String[] headers = {"Código", "Nombre", "Carrera", "Ciclo", "Créditos"};
        modelo.setColumnIdentifiers(headers);
        limpiarTabla(modelo);
        postOrden(raiz, modelo);
    }

    private Curso buscarMax(NodoArbolC r) {
        Curso x;
        if (r.getHd() == null) {
            x = r.getInfo();
        } else {
            x = buscarMax(r.getHd());
        }
        return x;
    }

    public Curso buscarMax() {
        return buscarMax(raiz);
    }

    private Curso buscarMin(NodoArbolC r) {
        Curso x;
        if (r.getHi() == null) {
            x = r.getInfo();
        } else {
            x = buscarMin(r.getHi());
        }
        return x;
    }

    public Curso buscarMin() {
        return buscarMin(raiz);
    }

    private int contar(NodoArbolC r) {
        if (r == null) {
            return 0;
        } else {
            return 1 + contar(r.getHd()) + contar(r.getHi());
        }
    }

    public int contar() {
        return contar(raiz);
    }

    private NodoArbolC eliminarMin(NodoArbolC r) {
        if (r.getHi() == null) {
            r = r.getHd();
        } else {
            r.setHi(eliminarMin(r.getHi()));
        }
        return r;
    }

    public void eliminarMin() {
        raiz = eliminarMin(raiz);
    }

    private NodoArbolC elimina(Curso x, NodoArbolC r) {
        if (r != null) {
            if (x.getCodigo().compareToIgnoreCase(r.getInfo().getCodigo()) < 0) {
                r.setHi(elimina(x, r.getHi()));
            } else {
                if (x.getCodigo().compareToIgnoreCase(r.getInfo().getCodigo()) > 0) {
                    r.setHd(elimina(x, r.getHd()));
                } else {
                    if (r.getHi() == null) {
                        r = r.getHd();
                    } else {
                        if (r.getHd() == null) {
                            r = r.getHi();
                        } else {
                            r.setInfo(buscarMin(r.getHd()));
                            r.setHd(eliminarMin(r.getHd()));
                        }

                    }
                }
            }
        }
        return r;
    }

    public void elimina(Curso x) {
        raiz = elimina(x, raiz);
    }

    public int alturaArbol() {
        return alturaArbol(raiz);
    }

    private int alturaArbol(NodoArbolC r) {
        int ahi, ahd;
        if (r == null) {
            return -1;
        } else {
            ahi = 1 + alturaArbol(r.getHi());
            ahd = 1 + alturaArbol(r.getHd());
            if (ahi > ahd) {
                return ahi;
            } else {
                return ahd;
            }
        }
    }


   

    private int sumaCreditos(NodoArbolC r, String carrera) {
        if (r != null) {
            if (r.getInfo().getCarrera().equalsIgnoreCase(carrera)) {
                return r.getInfo().getCreditos() + sumaCreditos(r.getHd(), carrera) + sumaCreditos(r.getHi(), carrera);
            } else {
                return sumaCreditos(r.getHd(), carrera) + sumaCreditos(r.getHi(), carrera);
            }
        } else {
            return 0;
        }
    }

    public int sumaCreditos(String carrera) {
        return sumaCreditos(raiz, carrera);
    }

    private void enOrdenListaCiclo(NodoArbolC r, DefaultListModel modelo,int ciclo) {
        if (r != null) {
            enOrdenListaCiclo(r.getHi(), modelo,ciclo);
            if(r.getInfo().getCiclo()==ciclo){
            modelo.addElement(r.getInfo().getNombre() );
            }            
            enOrdenListaCiclo(r.getHd(), modelo,ciclo);
        }
    }

    public void enOrdenListaCiclo(DefaultListModel modelo,int ciclo) {
        modelo.removeAllElements();
        enOrdenListaCiclo(raiz, modelo,ciclo);
    }
    
    private void enOrdenListaCarrera(NodoArbolC r, DefaultListModel modelo,String carrera) {
        if (r != null) {
            enOrdenListaCarrera(r.getHi(), modelo,carrera);
            if(r.getInfo().getCarrera().equalsIgnoreCase(carrera)){
            modelo.addElement(r.getInfo().getNombre() );
            }            
            enOrdenListaCarrera(r.getHd(), modelo,carrera);
        }
    }

    public void enOrdenListaCarrera(DefaultListModel modelo,String carrera) {
        modelo.removeAllElements();
        enOrdenListaCarrera(raiz, modelo,carrera);
    }
    
    public String resultados() {
        return "El mayor es: " + buscarMax() + "\n\n"
                + "El menor es: " + buscarMin() + "\n\n"
                + "Numero de nodos: " + contar() + "\n\n"
                + "Altura del arbol: " + alturaArbol();
    }
}
