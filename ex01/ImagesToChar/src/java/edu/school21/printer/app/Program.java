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
			System.err.println("Wrong argument_2");
			System.exit(1);
		}
		try {
			URL u = new URL("file://" + new File("").getAbsolutePath() + "/src/resources/image.bmp");
			BufferedImage image = ImageIO.read(Logic.class.getResource("/resources/image.bmp"));
			Logic l = new Logic(image, args[0], args[1]);
			l.print();
		} catch (Exception ex) {
			ex.fillInStackTrace();
			System.err.println("Wrong argument_3");
			System.exit(1);
		}

	}
}
