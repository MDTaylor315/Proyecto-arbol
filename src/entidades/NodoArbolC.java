/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;


/**
 *
 * @author md
 */
public class NodoArbolC {
    
    private Curso info;
    private NodoArbolC  hi;
    private NodoArbolC hd;

    public NodoArbolC(Curso info) {
        this.info = info;
        this.hi = null;
        this.hd = null;
    }

    public NodoArbolC(Curso info, NodoArbolC hi, NodoArbolC hd) {
        this.info = info;
        this.hi = hi;
        this.hd = hd;
    }

    public Curso getInfo() {
        return info;
    }

    public void setInfo(Curso info) {
        this.info = info;
    }

    public NodoArbolC getHi() {
        return hi;
    }

    public void setHi(NodoArbolC hi) {
        this.hi = hi;
    }

    public NodoArbolC getHd() {
        return hd;
    }

    public void setHd(NodoArbolC hd) {
        this.hd = hd;
    }

    
    
}
