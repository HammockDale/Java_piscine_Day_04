package edu.school21.printer.app;

import edu.school21.printer.logic.Logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;

public class Program {
	public static void main(String[] args) throws IOException {
		if (args.length != 2 || args[0].length() != 1 || args[1].length() != 1) {
			System.err.println("Wrong argument");
			System.exit(1);
		}
		try {
			URL u = new URL("file://" + new File("").getAbsolutePath() + "/ImagesToChar/src/resources/image.bmp");
//			File f = new File(String.valueOf(Paths.get(u).normalize()));
//			System.out.println("/Users/hdale/Desktop/JAVA_Piscine/Java_04/ex01/ImagesToChar/src/resources/image.bmp");
//			System.out.println(f);
			URL u2 = new URL("file:///Users/hdale/Desktop/JAVA_Piscine/Java_04/ex01/ImagesToChar/src/resources/image.bmp");
			System.out.println(Logic.class.getResource("/../src/resources/image.bmp"));
			BufferedImage image = ImageIO.read(u);
//			BufferedImage image = ImageIO.read(Logic.class.getResource("/resources/image.bmp"));
			Logic l = new Logic(image, args[0], args[1]);
			l.print();
		} catch (Exception ex) {
			ex.fillInStackTrace();
			System.err.println("Wrong argument_3");
			System.exit(1);
		}

	}
}
