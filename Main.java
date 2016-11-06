import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] arg){
	Model model = new Model();
	Vy vy = new Vy(model);
	JFrame ram = new JFrame();
	ram.add(vy);
	ram.pack();
	ram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ram.setVisible(true);
	
    }
}