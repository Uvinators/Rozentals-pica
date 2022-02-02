import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Pica {
	
	public static double cena = 0;
	
	public static void pasutitPicu() {
		String izvele;
		String izvele2;
		int izmers = 0;
		try {
		FileWriter fw = new FileWriter("picas.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		do {
		izvele = JOptionPane.showInputDialog("1 - Studentu pica | 2 - Siera pica | 3 - Salami pica | stop - atgriezties");
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
		}while(izvele2.equals("stop"));
		switch(izvele) {
		
		case "1":
			cena = cena + 7.95;
			JOptionPane.showMessageDialog(null, "Studentu pica | izmers: "+izmers+" cena: "+cena);
			pw.print("Studentu pica | izmers: "+izmers+" cena: "+cena+"\n");
			pw.close();
			cena = 0;
			break;
		case "2":
			cena = cena + 9;
			JOptionPane.showMessageDialog(null, "Siera pica | izmers: "+izmers+" cena: "+cena);
			pw.print("Siera pica | izmers: "+izmers+" cena: "+cena+"\n");
			pw.close();
			cena = 0;
			break;
		case "3":
			cena = cena + 10.25;
			JOptionPane.showMessageDialog(null, "Salami pica | izmers: "+izmers+" cena: "+cena);
			pw.print("Salami pica | izmers: "+izmers+" cena: "+cena+"\n");
			pw.close();
			cena = 0;
			break;
		case "stop":
			
			break;
		default:
			JOptionPane.showMessageDialog(null, "Darbiba nepastav!");
		}
		}while(!izvele.equals("stop"));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Radusies kluda!");
		}
	}
	
	public static void apskatitPicu() {
		try {
			String teksts, virkne="";
            FileReader fr = new FileReader("picas.txt");
            BufferedReader br = new BufferedReader(fr);
            while((teksts=br.readLine()) !=null){
                virkne = virkne+teksts+"\n";
            }
            br.close();
            JOptionPane.showMessageDialog(null, virkne);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Radusies kluda!");
		}
	}

	public static void main(String[] args) {
		
		String izvele;
		
		do {
		izvele = JOptionPane.showInputDialog("1 - Pasutit picu | 2 - Apskatit picu | stop - Apstadinat programmu");
		izvele=izvele.toLowerCase();
		
		switch(izvele) {
		
		case "1":
				pasutitPicu();
			break;
		case "2":
				apskatitPicu();
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
