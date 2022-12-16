public class patterns{ 
    public static void main (String args[]){
        
        for(int i=1;i<=5;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)(68+i+j-1));
            }   
            
            System.out.println();
        }

    }
}