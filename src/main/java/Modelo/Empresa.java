/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author GEOVANNY
 */
public class Empresa {
    String Nombre;
    String Ciudad;
    int Id;
    int NumeroEmpleados;
    
    public Empresa(Integer valueOf, String param) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
}

    Empresa(String param, String param0, Integer valueOf, Integer valueOf0, String param1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getNumeroEmpleados() {
        return NumeroEmpleados;
    }

    public void setNumeroEmpleados(int NumeroEmpleados) {
        this.NumeroEmpleados = NumeroEmpleados;
    }

    public Empresa(String Nombre, String Ciudad, int Id, int NumeroEmpleados) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Id = Id;
        this.NumeroEmpleados = NumeroEmpleados;
    }

    @Override
    public String toString() {
        return "Empresa{" + "Nombre=" + Nombre + ", Ciudad=" + Ciudad + ", Id=" + Id + ", NumeroEmpleados=" + NumeroEmpleados + '}';
    }
    
    
    
    
    
}