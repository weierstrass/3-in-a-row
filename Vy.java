import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.event.*;

public class Vy extends JPanel implements Observer{
    private JButton[][] knappFalt;
    public Vy(Model model){
	super();
	JPanel huvudPanel = new JPanel();
	this.setLayout(new BorderLayout());
	this.add(spelPanel(model), BorderLayout.CENTER);
	model.addObserver(this);
    }
    private JPanel spelPanel(Model model){
	Control control = new Control(model);
	JPanel tmpPanel = new JPanel();
	tmpPanel.setLayout(new GridLayout(3,3));
	knappFalt = new JButton[3][3];
	for(int i = 0; i < knappFalt.length; i++){
	    for(int j = 0; j < knappFalt[i].length; j++){
		knappFalt[i][j] = new JButton("");
		knappFalt[i][j].setPreferredSize(new Dimension(40, 40));
		knappFalt[i][j].addActionListener(control);
		knappFalt[i][j].setActionCommand(i+" "+j);
		knappFalt[i][j].setBorder(new LineBorder(Color.lightGray));
		tmpPanel.add(knappFalt[i][j]);
	    }
	}
	return tmpPanel;
    }
    public void update(Observable o, Object arg){
	Model model = (Model)o;
	for(int i = 0; i < knappFalt.length; i++){
	    for(int j = 0; j < knappFalt[i].length; j++){
		if(model.isSetAndByWho(i,j) == 1){
		    knappFalt[i][j].setText("x");
		}else if(model.isSetAndByWho(i,j) == 2){
		    knappFalt[i][j].setText("o");
		}
	    }
	}
	//JOptionPane.showMessageDialog(null, "hej");
    }
}