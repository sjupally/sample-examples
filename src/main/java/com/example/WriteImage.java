package com.example;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class WriteImage {
	public static void main(String[] args) throws IOException {
		URL url = new URL("http://www.othiemann.info/wp-content/uploads/2013/09/IMG_06392.jpg");

		// read image direct from url
		BufferedImage image = ImageIO.read(url);

		// write image to outputstream
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(image, "jpg", baos);
		baos.flush();

		// get bytes
		byte[] imageByteArray = baos.toByteArray();

		// Write Image into File system - Make sure you update the path
		FileOutputStream imageOutFile = new FileOutputStream("http://172.20.128.21/" + "test.png");
		imageOutFile.write(imageByteArray);

		imageOutFile.close();

		System.out.println("Image Successfully Stored");
	}
}
