
package Model;


public class Conecta_DB {
    public static  void carregaDriver(){
       try {
           // Conecttando o driver
           
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Driver carregado com sucesso!");



            // Erro driver não encontrado
       } catch (Exception ex) { 
            System.out.println("Driver nao pode ser carregado!");
        }

    }
   

}
