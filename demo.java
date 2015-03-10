import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;


public class demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("start!");
		//create the detector
		CannyEdgeDetector detector = new CannyEdgeDetector();

		//adjust its parameters as desired
		detector.setLowThreshold(0.5f);
		detector.setHighThreshold(5f);

		//apply it to an image
		
		detector.setSourceImage(ImageIO.read(new File("pig1.jpg")));
		detector.process();
	
		BufferedImage edges = detector.getEdgesImage();
		// print edge data
		ArrayList<Cell> edgeData = detector.getEdgeData();
		
		for(int i = 0; i < edgeData.size(); i ++){
			System.out.println(edgeData.get(i).X + " - " + edgeData.get(i).Y);
		}
		
		System.out.println(ImageIO.write(edges, "png", new File("output.png")));
		System.out.println("end");
	
	}

}
