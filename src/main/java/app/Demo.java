/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Demo { // define uma classe pública chamada "Demo"
    private static Application configureApplication() { // Define um método estático privado chamado "configureApplication" que retorna um objeto da classe "Application"
        Application app; // declara uma variável chamada "app" do tipo "Application"
        GUIFactory factory; // declara uma variável chamada "factory" do tipo "GUIFactory"
        String osName = System.getProperty("os.name").toLowerCase(); // recupera o valor da propriedade de sistema "os.name" e a atribui a uma variável chamada "osName"
    if (osName.contains("mac")) { // verifica se o valor da variável string "osName" contém a substring "mac". Em caso afirmativo, ele cria uma nova instância da classe "MacOSFactory" e a atribui à variável "factory". Caso contrário, o programa continua no próximo bloco de código.
        factory = new MacOSFactory(); // cria uma nova instância da classe "MacOSFactory" e a atribui à variável "factory".
    } else { 

        factory = new WindowsFactory(); // caso a condição anterior do if não seja alcançada, vai para uma nova instância da classe "WindowsFactory"
    }
    app = new Application(factory); // cria uma nova instância da classe "Application" e a atribui à variável "app", passando o objeto "factory" como um argumento para o construtor.
    return app; // retorna o objeto "app" do método "configureApplication
}

public static void main(String[] args) { // realiza a iniciação do código 
    Application app = configureApplication(); // cria uma nova instância da classe "Application" chamando o método "configureApplication" e atribui essa instância à variável "app".
    app.paint(); // chama o método "paint" da instância da classe "Application" que foi criada anteriormente e atribuída à variável "app".
}
}