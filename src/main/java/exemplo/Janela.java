package exemplo;

//Criação da classe
public class Janela {
    
    //Atributos privados
    private static final Janela INSTANCE = new Janela();
    private static final String Teste = "Exemplo Singleton Privado";
    
    //Atributo público
    public static final String Singleton = "Exemplo Singleton Publico";
    
    //Construtor privado
    private Janela() {
        
    }
    //Método público estático realizando o primeiro e único acesso necessário nesse tipo de aplicação.
    public static Janela getInstance(){
        return INSTANCE;
}
    //Execução desse método de qualquer parte do projeto
    public static void Abrir() {
        System.out.println("Abrir Janela!");
}
    //Execução desse método de qualquer parte do projeto
    public static void Fechar() {
        System.out.println("Abrir Fechar!");
    }
}