/*esse pedaço de texto
não será 
executado 
 */

public class App {

    static void meuMetodo(String primeiroNome, int idade){
           System.out.println(primeiroNome+" tem "+idade+" anos ");
           
    }
    public static void main(String[] args) throws Exception {
       //este é um comentário
    int[][] meusNumeros = { {1,2,3,4},{5,6,7} }; 
    int x = meusNumeros [1][0];
 
  
    meuMetodo("Clélio", 31);
    meuMetodo("Vitor", 26);
    meuMetodo("Heitor", 37);
    meuMetodo("Álvaro", 2);

    char[] texto_c={'C','u','r','s','o',' ','d','e',' ','J','a','v','a'};
    String texto_s=new String("CAMC Project");
    String primeiroNome = "\n \"Clélio\"";
    byte numeroPequeno = 127;
    short numeroShort = 32767;
    int numeroInteiro = 214748364;
        
    String nameSinger=new String();
    String nameActor=new String(texto_s);
    String nameBand=new String(texto_c);
    String nameMusic=new String(texto_c,0,13);
   
    System.out.println(x);
    System.out.println(primeiroNome);  
    System.out.println(nameActor);
    System.out.println(numeroPequeno);  
    System.out.println(numeroShort);
    System.out.println( numeroInteiro);
    
    }

}
