package utils;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class StringUtils {
	

	public static void asciiArt(String chaine){
		
		BufferedImage image = new BufferedImage(144, 32, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setFont(new Font("Dialog", Font.PLAIN, 24));
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		graphics.drawString(chaine, 6, 24);
		
		for (int y = 0; y < 32; y++) {
			StringBuilder sb = new StringBuilder();
			for (int x = 0; x < 144; x++)
				sb.append(image.getRGB(x, y) == -16777216 ? " " : image.getRGB(x, y)== -1 ? "#" : "*");

			if (sb.toString().trim().isEmpty()) continue;
			System.out.println(sb);
		}
	
	}
	
	
//Exercice 2.1 -----------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public String str;
	public int n;
	
	public String repeter(){
		String chaine = "";
		for(int i = 0; i<n; i++){
			chaine +=str+"";
		}
		return chaine;
	}
	
	public StringUtils(String str, int n) {
		super();
		this.str = str;
		this.n = n;
	}

	@Override
	public String toString() {
		return "StringUtils [toString()=" + super.toString() + "]";
	}

	
	
//Exercice 2.2 : invoquer cette méthode ----------------------------------------------------------------------------------------------------------------------------------------------

	public static String transform(String chaine){
		return "###"+chaine+"###";
	}
	
	
//Exercice 2.3 : invoquer cette méthode ----------------------------------------------------------------------------------------------------------------------------------------------
	
	public int toInt(String chaine){
		return Integer.parseInt(chaine);
	}
	
	public StringUtils() {
		
	}
	
//Exercice 2.4 : invoquer cette méthode ----------------------------------------------------------------------------------------------------------------------------------------------
	
	public String toString(int chaine){
		return Integer.toString(chaine);
	}
	
	
}