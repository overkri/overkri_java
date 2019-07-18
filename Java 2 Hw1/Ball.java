import java.awt.*;

public class Ball extends Sprite {
    private float vy = 150+ (float) (Math.random() * 100f);
    private float vx = 100+ (float) (Math.random() * 100f);
    private final Color color = new Color(
            (int)(Math.random()*255),
            (int)(Math.random()*255),
            (int)(Math.random()*255)
    );
    Ball() {
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
    }

    @Override
    void update(Background bground, float deltaTime) {
        super.update(bground, deltaTime);
        x += deltaTime * vx;
        y += deltaTime * vy;
        if (getLeft()<bground.getLeft()){
            setLeft(bground.getLeft());
            vx=-vx;
        }
        if (getRight()>bground.getRight()){
            setRight(bground.getRight());
            vx=-vx;
        }
        if (getTop()<bground.getTop()){
            setTop(bground.getTop());
            vy=-vy;
        }
        if (getBottom()>bground.getBottom()){
            setBottom(bground.getBottom());
            vy=-vy;
        }

    }

    @Override
    void render(Background bground, Graphics g) {
        g.setColor(color);
        g.fillOval((int)getLeft(), (int)getTop(), (int)getWidth(), (int)getHeight());
    }
}
