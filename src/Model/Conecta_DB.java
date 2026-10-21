package Model;

public class Conecta_DB {
    public static void carregaDriver() {
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver carregado com sucesso!");

        } catch (ClassNotFoundException ex) { 
            System.out.println("Driver nao pode ser carregado! Verifique se o conector do MySQL está nas bibliotecas.");
        }
    }
}