import java.util.ArrayList;
public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1, 2);
        System.out.println(l1.size());

        // print the arraylist
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();
        // System.out.println(l1);
        // //Get operation

        // int element =l1.get(1);
        // System.out.println(element);

        // //Delete Element
        // l1.remove(1);
        // System.out.println(l1);


        // //Set
        // l1.set(1, 2);
        // System.out.println(l1);

        // //contains element


        // Reverse of an arraylist
        for(int i=l1.size()-1;i>=0;i--){
            System.out.print(l1.get(i) + " ");
        }
        System.out.println();

    }

}