/*esse pedaço de texto
não será 
executado 
 */

public class App {
    public static void main(String[] args) throws Exception {
       //este é um comentário
       
    char[] texto_c={'C','u','r','s','o',' ','d','e',' ','J','a','v','a'};
    String texto_s=new String("CAMC Project");
    String primeiroNome = "\n \"Clélio\"";
    byte numeroPequeno = 127;
    short numeroShort = 32767;
    int numeroInteiro = 214748364;
        
    String s1=new String();
    String s2=new String(texto_s);
    String s3=new String(texto_c);
    String s4=new String(texto_c,0,13);
   
    System.out.println(texto_c);
    System.out.println(primeiroNome);  
    System.out.println(s2);
    System.out.println(numeroPequeno);  
    System.out.println(numeroShort);
    System.out.println( numeroInteiro);
    
    }

}
