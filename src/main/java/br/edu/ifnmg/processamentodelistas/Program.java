/*
 * 
 * 
 */
package br.edu.ifnmg.processamentodelistas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thiago Riquelmo
 */
public class Program {
    public static void main(String[] args) {
        Integer e = 2000;
        Double lr = 0.025;
                
        //Teste 1
        System.out.println("---Teste 1---\n");
        List<Double> ins1 = new ArrayList<Double>();
        List<Double> out1 = new ArrayList<Double>();
        
        ins1.add(1.0);
        ins1.add(3.0);
        ins1.add(5.0);
        
        out1.add(1.0);
        out1.add(3.0);
        out1.add(5.0);
        
        //MinhaClasse.metodo1(ins1,out1);
        //MinhaClasse.metodo2(ins1,out1,e);
        MinhaClasse.metodo3(ins1,out1,e,lr);
        
                
        //Teste 2
        System.out.println("\n---Teste 2---\n");
        List<Double> ins2 = new ArrayList<Double>();
        List<Double> out2 = new ArrayList<Double>();
        
        ins2.add(1.0);
        ins2.add(3.0);
        ins2.add(5.0);
        
        out2.add(2.0);
        out2.add(4.0);
        out2.add(6.0);
        
        //MinhaClasse.metodo1(ins2,out2);
        //MinhaClasse.metodo2(ins2,out2,e);
        MinhaClasse.metodo3(ins2,out2,e,lr);
        
        
        //Teste 3
        System.out.println("\n---Teste 3---\n");
        List<Double> ins3 = new ArrayList<Double>();
        List<Double> out3 = new ArrayList<Double>();
        
        ins3.add(1.0);
        ins3.add(3.0);
        ins3.add(5.0);
        
        out3.add(3.0);
        out3.add(7.0);
        out3.add(11.0);
        
        //MinhaClasse.metodo1(ins3,out3);
        //MinhaClasse.metodo2(ins3,out3,e);
        MinhaClasse.metodo3(ins3,out3,e,lr);
        
        
        //Teste 4
        System.out.println("\n---Teste 4---\n");
        List<Double> ins4 = new ArrayList<Double>();
        List<Double> out4 = new ArrayList<Double>();
        
        ins4.add(1.0);
        ins4.add(3.0);
        ins4.add(5.0);
        
        out4.add(4.5);
        out4.add(12.5);
        out4.add(20.5);
        
        //MinhaClasse.metodo1(ins4,out4);
        //MinhaClasse.metodo2(ins4,out4,e);
        MinhaClasse.metodo3(ins4,out4,e,lr);
        
        
        //Teste 5      
        System.out.println("\n---Teste 5---\n");
        List<Double> ins5 = new ArrayList<Double>();
        List<Double> out5 = new ArrayList<Double>();
        
        ins5.add(2.900000095);
        ins5.add(6.699999809);
        ins5.add(4.900000095);
        ins5.add(7.900000095);
        ins5.add(9.800000191);
        ins5.add(6.900000095);
        ins5.add(6.099999905);
        ins5.add(6.199999809);
        ins5.add(6.0);
        ins5.add(5.099999905);
        ins5.add(4.699999809);
        ins5.add(4.400000095);
        ins5.add(5.800000191);
        
        out5.add(4.0);
        out5.add(7.400000095);
        out5.add(5.0);
        out5.add(7.199999809);
        out5.add(7.900000095);
        out5.add(6.099999905);
        out5.add(6.0);
        out5.add(5.800000191);
        out5.add(5.199999809);
        out5.add(4.199999809);
        out5.add(4.0);
        out5.add(4.400000095);
        out5.add(5.199999809);
        
        //MinhaClasse.metodo1(ins5,out5);
        //MinhaClasse.metodo2(ins5,out5,e);
        MinhaClasse.metodo3(ins5,out5,e,lr);
        
        
    }
}
