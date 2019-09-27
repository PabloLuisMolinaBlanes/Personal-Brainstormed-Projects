import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.sound.sampled.DataLine;
import javax.sound.*;
public class Roma {
	static int points = 0;
	public static void main(String[] args) {
		String respuesta1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("¿Como se llaman las catacumbas donde estaban las tumbas de los papas?");
		respuesta1 = keyboard.nextLine();
		if (respuesta1.equals("Catacumbas de Calixto") || respuesta1.equals("Catacumbas de San Calixto")) {
			Audio.main("respuestacorrecta.wav");
			System.out.println("Tu respuesta es correcta");
			points++;
		} else {
			Audio.main("respuestaincorrecta.wav");
			System.out.println("Tu respuesta es incorrecta");
		}
		String respuesta2;
		System.out.println("¿Por quienes fueron criados los hermanos fundadores de Roma?");
		respuesta2 = keyboard.nextLine();
                if (respuesta2.equals("Lobos") || respuesta2.equals("lobos")) {
			Audio.main("respuestacorrecta.wav");
                        System.out.println("Tu respuesta es correcta"); 
                        points++;
		}  else {
			Audio.main("respuestaincorrecta.wav");
                        System.out.println("Tu respuesta es incorrecta"); 
		}
                String respuesta3;
		System.out.println("¿En que epoca cayo el Imperio Romano?");
		respuesta3 = keyboard.nextLine();
                if (respuesta3.equals("Edad Media")) {
			Audio.main("respuestacorrecta.wav");
                        System.out.println("Tu respuesta es correcta");
                        points++;
		} else {
			Audio.main("respuestaincorrecta.wav");
                        System.out.println("Tu respuesta es incorrecta");
                }
		System.out.println("Tienes "+points+" puntos de tres posibles");
		System.out.println("Tus respuestas han sido "+respuesta1+" "+respuesta2+" "+respuesta3);
	}
}
class Audio {
	public static void main(String args2) {
	try {	
	File respuesta = new File(args2);
	AudioInputStream audioStream = AudioSystem.getAudioInputStream(respuesta);
	AudioFormat wav = audioStream.getFormat();
	DataLine.Info info = new DataLine.Info(Clip.class, wav);
	Clip audioClip = (Clip) AudioSystem.getLine(info);
	audioClip.open(audioStream);
	audioClip.start();
	try {
		Thread.sleep(4000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}	
	audioClip.close();	
	audioStream.close();
		} catch (UnsupportedAudioFileException ex) {
			System.out.println("The specified audio file is not supported");
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
                	System.out.println("Audio line for playing back is unavailable");
                	ex.printStackTrace();
		} catch (IOException ex) {
                	System.out.println("Error playing the audio file");
               		ex.printStackTrace();
	}
    }
}
		

