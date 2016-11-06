import java.awt.event.*;

public class Control implements ActionListener{
    private Model model;
    public Control(Model model){
	this.model = model;
    }
    public void actionPerformed(ActionEvent e){
	String[] tmp = (e.getActionCommand()).split("\\s");
	int row = Integer.parseInt(tmp[0]);
	int col = Integer.parseInt(tmp[1]);
	model.markSquare(row, col);
	//model.datorDrag();
    }
}