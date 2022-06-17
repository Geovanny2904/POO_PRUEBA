/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Servicio.EmpresaServicio;
import Modelo.Empresa;
import java.util.List;

/**
 *
 * @author GEOVANNY
 */
public class EmpresaControl {
    private final EmpresaServicio empresaServicio = new EmpresaServicio();
    
    public Empresa crear(String [] params){
//      
        var empresa = new E
                mpresa(params[0], params[1], Integer.valueOf(params[2]), Integer.valueOf(params[3]), params[4]);
        this.empresaServicio.crear(empresa);
        return empresa;                                                    
    }
    
    public List<Empresa> listar()
    {
        return this.empresaServicio.listar();
    }
}
