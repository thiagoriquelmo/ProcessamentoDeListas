/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.processamentodelistas;

import java.util.List;

/**
 *
 * @author Thiago Riquelmo
 */
public class MinhaClasse {
    
    
    public static Dupla<Double,Double> metodo1(List<Double> ins, List<Double> outs){
        Double w0 = 0.0;
        Double w1 = 0.0; 
        Double p;
        Double dif;
        
        for(int j = 1; j <= 2000 ; j++){
            for(int i = 0; i < ins.size(); i++){
                p = (w1 * ins.get(i) + w0);
                dif = outs.get(i) - p;
                w0 += dif * 0.025;
                w1 += dif * 0.025 * ins.get(i);
                if( Math.floorMod(j,10)==0){
                    System.out.println("e = " + j + " w0 = " + w0 + " w1 = " + w1);
                }
            }            
        }
        
        final Double v1 = w0;
        final Double v2 = w1;
        return new Dupla<Double, Double>(){
            @Override
            public Double getL(){ return v1; }
            @Override
            public Double getR(){ return v2; }
        }; 

    }
    
    public static Dupla<Double,Double> metodo2(List<Double> ins, List<Double> outs, Integer e){
        Double w0 = 0.0;
        Double w1 = 0.0; 
        Double p;
        Double dif;
        
        for(int j = 1; j <= e ; j++){
            for(int i = 0; i < ins.size(); i++){
                p = (w1 * ins.get(i) + w0);
                dif = outs.get(i) - p;
                w0 += dif * 0.025;
                w1 += dif * 0.025 * ins.get(i);
                if( Math.floorMod(j,10)==0){
                    System.out.println("e = " + j + " w0 = " + w0 + " w1 = " + w1);
                }
            }            
        }
        
        final Double v1 = w0;
        final Double v2 = w1;
        return new Dupla<Double, Double>(){
            @Override
            public Double getL(){ return v1; }
            @Override
            public Double getR(){ return v2; }
        }; 

    }
    
    public static Dupla<Double,Double> metodo3(List<Double> ins, List<Double> outs, Integer e, Double lr){
        Double w0 = 0.0;
        Double w1 = 0.0; 
        Double p;
        Double dif;
        
        for(int j = 1; j <= e ; j++){
            for(int i = 0; i < ins.size(); i++){
                p = (w1 * ins.get(i) + w0);
                dif = outs.get(i) - p;
                w0 += dif * lr;
                w1 += dif * lr * ins.get(i);
                if( Math.floorMod(j,10)==0){
                    System.out.println("e = " + j + " w0 = " + w0 + " w1 = " + w1);
                }
            }            
        }
        
        final Double v1 = w0;
        final Double v2 = w1;
        return new Dupla<Double, Double>(){
            @Override
            public Double getL(){ return v1; }
            @Override
            public Double getR(){ return v2; }
        };                
    }
}
