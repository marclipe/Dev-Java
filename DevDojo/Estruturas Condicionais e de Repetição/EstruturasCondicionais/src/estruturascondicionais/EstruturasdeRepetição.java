
package estruturascondicionais;

public class EstruturasdeRepetição {
    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count = count + 1; 
        }
        
        //do-while
        do {            
            System.out.println("den do do-while");
        } while (count > 10 );
        
        for(int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
