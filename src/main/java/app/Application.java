/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import button.Button; // importa button de button
import checkbox.Checkbox; // importa checkbox de checkbox
import factories.GUIFactory; // importa GUIFactory de factories

public class Application { // define uma classe pública chamada "Application"
    private Button button; // declara uma variável de instância privada denominada "botão" do tipo "Botão".
    private Checkbox checkbox; // declara uma variável de instância privada denominada "checkbox" do tipo "CheckBox".
    
    public Application(GUIFactory factory) { // declara um construtor Java para uma classe chamada "Application"
        button = factory.createButton(); // atribui um objeto de botão a uma variável de instância denominada "botão".
        checkbox = factory.createCheckBox(); // atribui um objeto de checkbox a uma variável de instância denominada "checkbox".
    }
    
    public void paint() { // declara um método Java que define um método público chamado "paint" com um tipo de retorno "void".
        button.paint(); //invoca o método "paint" do objeto "button"
        checkbox.paint(); // invoca o método "paint" do objeto "checkbox"
    }
}
