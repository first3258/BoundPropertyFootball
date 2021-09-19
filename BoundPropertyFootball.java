package boundpropertyfootball;
import java.util.*;

class BoundPropertyFootball{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyPropertyBean mySource = new MyPropertyBean();
        Listener1 l1 = new Listener1();
        Listener2 l2 = new Listener2();
        mySource.addPropertyChangeListener(l1);
        mySource.addPropertyChangeListener(l2);
        
        while (true) {
            System.out.print("input : ");
            String score = input.nextLine();
            if(score.equals("")) return;
            
            mySource.setScore(score);
        }
    }
}