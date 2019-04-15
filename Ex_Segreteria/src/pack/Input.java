package pack;

public class Input {
	public String input;
	public String val;
	public int select;
	public Input() {
		// TODO Auto-generated constructor stub
	}
	
	public String input() {
		return input;
	}
	
	public void setIn(String input) {
		this.input = input;
		val = input;
	}
	
	public String getVal() {
		return val;
	}
	
	public void select() {
		switch(val) {
		case "studente":
			select = 1;
			break;
		case "Insegnante":
			select = 2;
			break;
		case "segreteria":
			select = 3;
			break;
			
		}
	}
	public int getSel() {
		return select;
	}
}
