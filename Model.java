import java.util.*;

public class Model extends Observable{
    private boolean[][] human;
    private boolean[][] computer;
    public Model(){
	human = new boolean[3][3];
	computer = new boolean[3][3];
	for(int i = 0; i < human.length; i++){
	    for(int j = 0; j < human[i].length; j++){
		human[i][j] = false;
		computer[i][j] = false;
	    }
	}
    }
    public void markSquare(int row, int col){
        human[row][col] = true;
	datorDrag();
	setChanged();
	notifyObservers(null);
    }
    public int isSetAndByWho(int row, int col){
	if(human[row][col]){
	    return 1;
	}else if(computer[row][col]){
	    return 2;
	}else{
	    return -1;
	}
    }
    public void datorDrag(){
	System.out.println("d");
	boolean set = false;
	for(int i = 0; i < computer.length; i++){
	    for(int j = 0; j < computer[i].length; j++){
		if(isSetAndByWho(i,j) == -1 && !set){
		    computer[i][j]= true;
		    System.out.println(i+", "+j);
		    set = true;
		}
	    }
	}

    }
    public boolean finnsVinnare(){
	for(int i = 0; i < computer.length; i++){
	    for(int j = 0; j < computer[i].length; j++){
		if(isSetAndByWho(i,j) == -1 && !set){
		    computer[i][j]= true;
		    System.out.println(i+", "+j);
		    set = true;
		} 
	    }
	}
    }
    
}