import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Pica {
	
	public static double cena = 0;
	
	public static void pasutitPicu() {
		String izvele;
		String izvele2;
		int izmers;
		try {
		FileWriter fw = new FileWriter("picas.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		do {
		izvele = JOptionPane.showInputDialog("1 - Studentu pica | 2 - Siera pica | 3 - Salami pica | 4 - Pastaisita pica | stop - atgriezties");
		izvele= izvele.toLowerCase();
		
		do {
		izvele2=JOptionPane.showInputDialog("1 - 30cm | 2 - 40cm | 3 - 50cm | stop - atgriezties");
		izvele2 = izvele2.toLowerCase();
		
		switch(izvele2) {
		case "1":
			izmers = 30;
			cena = cena + 2;
			break;
		case "2":
			izmers = 40;
			cena = cena + 3.50;
			break;
		case "3":
			izmers = 50;
			cena = cena + 4.50;
			break;
		case "stop":
		 break;
		 default:
			 JOptionPane.showMessageDialog(null, "Darbiba nepastav!");
		}
		}while(!izvele2.equals("stop"));
		switch(izvele) {
		
		case "1":
			
			break;
		case "2":
			
			break;
		case "stop":
			
			break;
		default:
			
		
		}
		}while(!izvele.equals("stop"));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Radusies kluda!");
		}
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
