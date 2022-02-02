import javax.swing.JOptionPane;

public class Pica {
	
	public static void pasutitPicu() {
		
	}
	
	public static void apskatitPicu() {
		
	}
	
	public static void apskatitCenu() {
		
	}

	public static void main(String[] args) {
		
		String izvele;
		
		do {
		izvele = JOptionPane.showInputDialog("1 - Pasutit picu | 2 - Apskatit picu | 3 - Apskatit cenu | stop - Apstadinat programmu");
		izvele=izvele.toLowerCase();
		
		switch(izvele) {
		
		case "1":
				pasutitPicu();
			break;
		case "2":
				apskatitPicu();
			break;
		case "3":
				apskatitCenu();
			break;
		case "stop":
			 JOptionPane.showMessageDialog(null, "Programma aptureta", "Bridinajums", JOptionPane.WARNING_MESSAGE);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Darbiba nepastav", "Kluda", JOptionPane.ERROR_MESSAGE);
		
		}
		
		}while(!izvele.equals("stop"));
	}

}
