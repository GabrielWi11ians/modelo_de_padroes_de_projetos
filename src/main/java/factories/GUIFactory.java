/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;
import button.Button;
import checkbox.Checkbox;
/**
 *
 * @author FATEC ZONA LESTE
 */
public interface GUIFactory { //Cria uma interface, métodos createButton e createCheckbox que devem ser implementados por qualquer classe que implemente a GUIFactory..

    Button createButton();
    Checkbox createCheckBox();
}
