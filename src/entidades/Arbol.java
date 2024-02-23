/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.DefaultListModel;

/**
 *
 * @author md
 */
public class Arbol {
    private NodoArbol raiz;
    
    public Arbol() {
        raiz = null;
    }
    
    public boolean empty() {
        return raiz==null;
    }
    
    private NodoArbol insertar(int x, NodoArbol a) {
        if(a==null) {
            a = new NodoArbol(x);
        } else {
            if(x<a.getInfo()) {
                a.setHi(insertar(x,a.getHi()));
            } else {
                if(x>a.getInfo()) {
                    a.setHd(insertar(x,a.getHd()));
                }
            }
        }
        return a;
    }
    
    public void insertar (int x) {
        raiz = insertar(x,raiz);
    }
    
    private NodoArbol buscar(int x, NodoArbol a) {
        if(a!=null) {
            if(x==a.getInfo()) {
                return a;
            } else {
                if(x<a.getInfo()) {
                    return buscar(x,a.getHi());
                } else{
                    return buscar(x,a.getHd());
                }
            }
        } else {
             return null;
        }
    }
    
    public NodoArbol buscar (int x) {
        return buscar(x,raiz);
    }
    
    private void preOrden (NodoArbol a, DefaultListModel modelo) {
        if(a!=null) {
            modelo.addElement(a.getInfo());
            preOrden(a.getHi(),modelo);
            preOrden(a.getHd(),modelo);
        }
    }
    
    public void preOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        preOrden(raiz,modelo);
    }

    private void enOrden (NodoArbol a, DefaultListModel modelo) {
        if(a!=null) {
            enOrden(a.getHi(),modelo);            
            modelo.addElement(a.getInfo());
            enOrden(a.getHd(),modelo);
        }
    }
    
    public void enOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        enOrden(raiz,modelo);
    }
    
    private void postOrden(NodoArbol a, DefaultListModel modelo) {
        if(a!=null) {
            postOrden(a.getHi(),modelo);
            postOrden(a.getHd(),modelo);
            modelo.addElement(a.getInfo());
        }
    }
    
    public void postOrden(DefaultListModel modelo) {
        modelo.removeAllElements();
        postOrden(raiz,modelo);
    }
    
    private int buscarMax(NodoArbol a) {
        int max;
        if(a.getHd()==null) {
            max = a.getInfo();
        } else {
            max = buscarMax(a.getHd());
        }
        return max;
    }
    
    public int buscarMax() {
        return buscarMax(raiz);
    }
    
    private int buscarMin(NodoArbol a) {
        int min;
        if(a.getHi()==null) {
            min = a.getInfo();
        } else {
            min = buscarMin(a.getHi());
        }
        return min;
    }
    
    public int buscarMin() {
        return buscarMin(raiz);
    }
    
    private int contar(NodoArbol a) {
        if(a==null) {
            return 0;
        } else {
            return 1 + contar(a.getHi()) + contar(a.getHd());
        }
    }
    
    public int contar() {
        return contar(raiz);
    }

    private NodoArbol eliminarMin(NodoArbol a) {
        if(a.getHi()==null) {
            a = a.getHd();
        } else {
            a.setHi(eliminarMin(a.getHi()));
        }
        return a;
    }

    public void eliminarMin() {
        raiz = eliminarMin(raiz);
    }
    
    private NodoArbol elimina (int x, NodoArbol a) {
        if(a!=null) {
            if(x<a.getInfo()) {
                a.setHi(elimina(x,a.getHi()));
            } else {
                if(x>a.getInfo()) {
                    a.setHd(elimina(x,a.getHd()));
                } else {
                    if(a.getHi()==null) {
                        a = a.getHd();
                    } else {
                        if(a.getHd()==null) {
                            a = a.getHi();
                        } else { //dos hijos
                          a.setInfo(buscarMin(a.getHd()));
                          a.setHd(eliminarMin(a.getHd()));
                        }
                    }
                }
            }
        }
        return a;
    }
    
    public void eliminar(int x) {
        raiz = elimina(x,raiz);
    }
    
    private int alturaArbol(NodoArbol a) {
        int ahi, ahd;
        if(a==null) {
            return -1;
        } else {
            ahi = 1 + alturaArbol(a.getHi());
            ahd = 1 + alturaArbol(a.getHd());
            if(ahi>ahd) {
                return ahi;
            } else {
                return ahd;
            }
        }
    }
    
    public int alturaArbol() {
        return alturaArbol(raiz);
    }
    
    private int suma(NodoArbol a){
        if(a==null){
            return 0;
        }else{
            return a.getInfo() + suma(a.getHd()) + suma(a.getHi());
        }
    }
    
    public int suma(){
        return suma(raiz);
    }
    
    private int nHojas(NodoArbol a){
        if(a==null){
            return 0;
        }else{
            if(a.getHd()==null && a.getHi() ==null)
                return 1;
            else
                return nHojas(a.getHd())+ nHojas(a.getHi());
        }
    }
    
    public int nHojas(){
        return nHojas(raiz);
    }
    
    private int profundidad(int x, NodoArbol r) {
        if(r==null){
            return 0;
        }else{
            if(r.getInfo()==x){
                return 0;
            }else{
                if (x < r.getInfo()) {
                    if (r.getHi().getInfo() == x) {
                        return 1;
                    } else {
                        return 1 + profundidad(x, r.getHi());
                    }
                } else {
                    if (r.getHd().getInfo() == x) {
                        return 1;
                    } else {
                        return 1 + profundidad(x, r.getHd());
                    }
                }
            }
        }  
    }
    
    public int profundidad(int x){
        return profundidad(x,raiz);
    }
    
    public String resultados() {
        return "El mayor es: " + buscarMax() + "\n" + 
               "El menor es: " + buscarMin() + "\n" + 
               "Número de nodos es: " + contar() + "\n" +
               "Altura del árbol: " + alturaArbol() + "\n";
                
    }
    
}
