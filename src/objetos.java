public class objetos {
    public static class Numero {
        int x;
        
       public Numero(int x ){
        this.x=x;
       }

        public void add1(){
            this.x++;
        }

        public void add(int x){
            this.x+=x;
        }

        public int getx(){
         return this.x;            
 
        }
        public void setx(int x){
            this.x=x;
        }
    }

    public static void main (String [] args){

        Numero num = new Numero(5);
        Numero num2 = new Numero(2);
        num2.x=10;
        System.out.println(num2.getx());
        System.out.println(num.getx());
        num2.add1();
        System.out.println(num2.getx());
        num2.add(8);
        System.out.println(num2.getx());
    }

    }

