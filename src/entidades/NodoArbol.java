/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author md
 */
public class NodoArbol {
     private int info;
    private NodoArbol hi;
    private NodoArbol hd;
    
    public NodoArbol() {
        hd = null;
        hi = null;
    }
    
    public NodoArbol(int info) {
        this.info = info;
        hi = null;
        hd = null;
    }

    public int getInfo() {
        return info;
    }

    public NodoArbol(int info, NodoArbol hi, NodoArbol hd) {
        this.info = info;
        this.hi = hi;
        this.hd = hd;
    }
    
    public void setInfo(int info) {
        this.info = info;
    }

    public NodoArbol getHi() {
        return hi;
    }

    public void setHi(NodoArbol hi) {
        this.hi = hi;
    }

    public NodoArbol getHd() {
        return hd;
    }

    public void setHd(NodoArbol hd) {
        this.hd = hd;
    }
}
