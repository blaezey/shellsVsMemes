
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.net.URL;

public class Ground {
	private int x = 0,y = 150, sx = 0, sy = 0;
	private Image img, shopui; // image of the frog
	private AffineTransform tx = AffineTransform.getTranslateInstance(x, y);
	private AffineTransform stx = AffineTransform.getTranslateInstance(sx, sy);
	
	public Ground() {
		img = getImage("/imgs/ground.png"); //load the image based on the filename "Background.png"
		shopui = getImage("/imgs/shopui.png");
		init(x, y);      //initialize the picture location
		initS(sx, sy);
	}
	
	
	public void paint(Graphics g) {
		//using a Graphics2D to draw images
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, tx, null);
		g2.drawImage(shopui, stx, null);
	}
	
	
	private void init(double a, double b) {
		tx.setToTranslation(a, b);
		tx.scale(1, 1);
		
	}

	private void initS(double a, double b) {
		stx.setToTranslation(a, b);
		stx.scale(1, 1);
	}

	// converts image to make it drawable in paint
	private Image getImage(String path) {
		Image tempImage = null;
		try {
			URL imageURL = Ground.class.getResource(path);
			tempImage = Toolkit.getDefaultToolkit().getImage(imageURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tempImage;
	}
}
