/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package button;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class WindowsButton implements Button{ // // declara uma classe Java que define uma classe pública denominada "WindowsButton" que implementa a interface "Button".
    @Override // // indica que um método em uma subclasse pretende sobrescrever um método com o mesmo nome e assinatura em sua superclasse ou interface.
    public void paint() { // declara um método em Java que define um método público chamado "paint" que não aceita argumentos e não retorna nenhum valor.

        System.out.println("You have created WindowsButton."); // Uma instrução Java que usa o método para imprimir a string especificada no console
    }
}
