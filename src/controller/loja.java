package controller;

import model.automovel;

public class loja {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        automovel a = new automovel();
        a.setMarca("Jeep");
        a.setModelo("Commander");
        a.setTipo("SUV");
        System.out.println("Marca: " + a.getMarca()+ "Modelo: " + a.getModelo() + "Tipo: " + a.getTipo());
        
        automovel b = a.clone();
        System.out.println("Marca: " + b.getMarca());
        
        b.setModelo("Compass");
        System.out.println("Marca: " + b.getMarca() + "Modelo: " + b.getModelo() + "Tipo: " + b.getTipo());
        
    }
}
