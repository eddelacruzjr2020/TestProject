import java.applet.Applet;
import java.awt.*;

/*<applet code=MovingImagesApplet width=500 height=800>
</applet>
*/

public class MovingImagesApplet extends Applet {
    private Image image1;
    private Image image2;
    private int positionX1;
    private int positionY1;
    private int positionX2;
    private int positionY2;

    public void init() {
        // Load your images
        image1 = getImage(getDocumentBase(), "boy.jpg");
        image2 = getImage(getDocumentBase(), "girl.jpg");

        // Set initial positions for the images
        positionX1 = 0;
        positionY1 = 0;
        positionX2 = getWidth() - image2.getWidth(this);
        positionY2 = getHeight() - image2.getHeight(this);
    }

    public void paint(Graphics g) {
        // Draw the images at their current positions
        g.drawImage(image1, positionX1, positionY1, this);
        g.drawImage(image2, positionX2, positionY2, this);
    }

    public void start() {
        // Move the images towards each other gradually
        for (int i = 0; i < 100; i++) {
            // Calculate the step size for each iteration
            int stepX = (positionX2 - positionX1) / 100;
            int stepY = (positionY2 - positionY1) / 100;

            // Update the positions of the images
            positionX1 += stepX;
            positionY1 += stepY;
            positionX2 -= stepX;
            positionY2 -= stepY;

            // Repaint the applet to show the updated positions
            repaint();

            // Delay for a short period (adjust as needed for desired speed)
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}