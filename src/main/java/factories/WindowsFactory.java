/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class WindowsFactory implements GUIFactory{ //Cria uma classe WindowsFactory e implementa a interface GUIFactory. 

    @Override // indica que um método em uma subclasse pretende sobrescrever um método com o mesmo nome e assinatura em sua superclasse ou interface.
    public Button createButton(){ //Cria e retornar uma instância da WindowsButton, Cria um botão especificamente para o sistema operacional Windows. 

        return new WindowsButton();
    }   

    @Override // indica que um método em uma subclasse pretende sobrescrever um método com o mesmo nome e assinatura em sua superclasse ou interface.
    public Checkbox createCheckBox() { //Cria e retornar uma instãncia da WindowsCheckbox, Cria uma Checkbox especificamente para o sistema operacional Windows. 
         return new WindowsCheckbox();
    }
}
