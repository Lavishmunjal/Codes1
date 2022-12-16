public class objects{
    public static void main(String args[]) {
        Pen p1 = new Pen(); //created a pen oblect called p1
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);

        Bankaccount myacc = new Bankaccount();
        myacc.username = "lavish munjal";
        myacc.setPassword("abcdefghi");




        
    }

}

class Pen{
    String color;
    int tip;

    void setcolor(String newColor){
        color = newColor;

    }
    void settip(int newTip){
        tip = newTip;
    }
}
    
class Bankaccount(
    public String username ;
    private String passwaord;
    public void setPassword(String pwd){
        password = pwd;
    }

)
    
    