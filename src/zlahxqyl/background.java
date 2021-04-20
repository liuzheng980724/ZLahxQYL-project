package zlahxqyl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class background {
	
    public BufferedImage image;
    public background() {
    	try {
    		//image = ImageIO.read(new File("image/bground.png"));
    		image = ImageIO.read(new File("image/bground-withgrid.png"));
    		} catch (IOException e) {
			e.printStackTrace();
			}
    	}

}