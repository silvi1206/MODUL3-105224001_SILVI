
public class App {
    public static void main(String[] args) throws Exception {
        
        for (int i = 0 ; i < 50 ; i++){
            if(i % 3 == 0 || i % 5 == 0){
                continue;
            }
            
            System.out.println(i);
        } 


        
    }
}
