
package com.mycompany.sistemarestaurante.model;
import java.util.ArrayList;

public class Contabilidad {
    private ArrayList<MovimientoContable> movimientos;
    
    public Contabilidad(){
        this.movimientos = new ArrayList<>();
    }
    
    public void registrarIngreso(String descripcion, double monto){
        MovimientoContable mov = new MovimientoContable(movimientos.size()+1,"Ingreso",descripcion,monto);
        movimientos.add(mov);
    }
    
    public void registrarEgreso(String descripcion, double monto){
        MovimientoContable mov = new MovimientoContable(movimientos.size()+1,"Egreso",descripcion,monto);
        movimientos.add(mov);
    }
    
    public double calcularBalance(){
        double balance  = 0.0;
        
        for(MovimientoContable mov: movimientos){
            if(mov.getTipo().equalsIgnoreCase("Ingreso")){
                balance += mov.getMonto();
            }
            else if(mov.getTipo().equalsIgnoreCase("Egreso")){
                balance -= mov.getMonto();
            }
        }
        
        return balance;
    }
    
    public static Contabilidad getInstance(){
        Contabilidad obj = new Contabilidad();
        
        return obj;
    }
    
    @Override
    public String toString(){
        String movs = "";
        
        for(MovimientoContable mov: movimientos){
            movs += mov.toString() + "\n";
        }
        
        return movs;
    }
}
