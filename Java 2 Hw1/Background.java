import javax.swing.*;
import java.awt.*;


public class Background extends JPanel {
    Main gameWindow;
    private long lastFrameTime;
    private Timer timer;

    Background(Main gameWindow) {
        this.gameWindow = gameWindow;
        lastFrameTime = System.nanoTime();
        final Color color = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
        );
        setBackground(color);
        timer = new Timer(1000, e -> {
            final Color color1 = new Color(
                    (int)(Math.random()*255),
                    (int)(Math.random()*255),
                    (int)(Math.random()*255)
            );

            setBackground(color1);
        });
        timer.setRepeats(true);
        timer.start();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        long currentTime = System.nanoTime();
        float delta = (currentTime - lastFrameTime) * 0.00000001f;
        lastFrameTime = currentTime;
        try {
            Thread.sleep(17);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        gameWindow.onDrawFrame(this, g, delta);
        repaint();
    }

    public int getLeft() {
        return 0;
    }

    public int getRight() {
        return getWidth() - 1;
    }

    public int getTop() {
        return 0;
    }

    public int getBottom() {
        return getHeight() - 1;
    }
}
