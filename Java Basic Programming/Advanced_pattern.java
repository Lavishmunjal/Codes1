public class Advanced_pattern{
    public static void Hollow_rectangle(int totalrows,int totalcols){
        for(int i= 1; i<=totalrows; i++){
            for(int j = 1; j<=totalcols; j++){
                if(i==1 || i==totalrows || j==1 || j==totalcols){
                    System.out.print("* ");

                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        //stars
        for(int i =1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

                //stars
                for(int j=1; j<=i ; j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int n){
        
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=n-i+1; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }

    public static void floyd_triangle(int n){
        int counter = 1;
        for(int i= 1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(counter+" ");
                counter++;

            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++) {
                if( (i+j) % 2 == 0){
                    System.out.print("1");

                }else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
    public static void butterfly_pattern(int n){
        //1st Half  
        for(int i = 1; i<=n; i++){
            //stars -i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }


            //spaces - 2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }


            //stars - i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            



        }
        //2nd Half
        for(int i=n; i>=1; i--){
            //stars -i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }


            //spaces - 2*(n-1)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }


            //stars - i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
    public static void solid_rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=(n-i); j++){
                System.out.print(" ");

            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void hollow_rectangle_rhombus(int n){
        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //hollow rectangle - stars
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for second half
         for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void multiply(int n){
        int p;
        for(int i = 1; i<=10; i++){
            int multip  = n*i;
            System.out.println(n + "*" + i + "= "  + multip);
        }
    }
    public static void main(String args[]){
        /*Hollow_rectangle(10,7);
        inverted_rotated_half_pyramid(8);
       inverted_half_pyramid_with_numbers(10);
       floyd_triangle(6);
       zero_one_triangle(4);
       butterfly_pattern(4);
       solid_rhombus(4);
        hollow_rectangle_rhombus(6);
        diamond(4);*/
        multiply(3);
        
        
    }
}