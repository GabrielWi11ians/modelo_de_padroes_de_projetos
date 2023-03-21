/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class MacOSFactory implements GUIFactory { //Cria uma classe MacOSFactory e implementa a interface GUIFactory. 

    @Override
    public Button createButton() { //Cria botões especificamente para o sistema operacional MacOS

    return new MacOSButton();
    }
    
    @Override // indica que um método em uma subclasse pretende sobrescrever um método com o mesmo nome e assinatura em sua superclasse ou interface.
    public Checkbox createCheckBox() { //Cria uma Checkbox especificamente para o sistema operacional MacOS
    return new MacOSCheckbox();
    }

}
