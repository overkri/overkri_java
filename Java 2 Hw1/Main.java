
import javax.swing.*;
import java.awt.*;

 public class Main extends JFrame {
     private static final int POS_X = 600;
     private static final int POS_Y = 200;
     private static final int WINWOW_WIDTH = 800;
     private static final int WINDOW_HEIGHT = 600;
     private Sprite[] sprites = new Sprite[10];
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
             @Override
             public void run() {
                 new Main();
             }
         });
     }
     Main(){
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         setBounds(POS_X, POS_Y, WINWOW_WIDTH, WINDOW_HEIGHT);
         setTitle("Circles!");
         setVisible(true);
         Background background = new Background(this);
         initApplication();
         add(background, BorderLayout.CENTER);
     }
     void initApplication(){
         for (int i = 0; i < sprites.length ; i++) {
             sprites[i]= new Ball();

         }

     }
     void onDrawFrame(Background bground, Graphics g,  float deltaTime){
         update(bground, deltaTime);
         render(bground, g);
     }
     private void update(Background bground, float deltaTime) {
         for (int i = 0; i < sprites.length; i++) {
             sprites[i].update(bground, deltaTime);

         }
     }
     private void render(Background bground, Graphics g){
         for (int i = 0; i < sprites.length; i++) {
             sprites[i].render(bground, g);

         }
     }
}