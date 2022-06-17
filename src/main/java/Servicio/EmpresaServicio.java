/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GEOVANNY
 */

public class EmpresaServicio implements IEmpresaServicio {
     private final List<Empresa> EmpresaList = new ArrayList<>();
     
     @Override
    public Empresa crear(Empresa Empresa) {
        this.empresaList.add(empresa);
        return empresa;
    }

     @Override
    public List<Empresa> listar() {
        return this.empresaList;
    }

    public List<Empresa> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}