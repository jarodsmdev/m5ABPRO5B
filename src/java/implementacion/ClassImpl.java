/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacion;

import interfaces.ICapacitacion;
import java.util.ArrayList;
import java.util.List;
import modelo.Capacitacion;

/**
 *
 * @author Yo
 */
public class ClassImpl implements ICapacitacion {

    @Override
    public List listaCapacitacion() {
        ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();
        Capacitacion c1 = new Capacitacion();
        Capacitacion c2 = new Capacitacion();
        Capacitacion c3 = new Capacitacion();

        listaCapacitacion.add(c1);
        listaCapacitacion.add(c2);
        listaCapacitacion.add(c3);

        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void agregarCapacitacion(Capacitacion c) {
        System.out.println("c");
        
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
