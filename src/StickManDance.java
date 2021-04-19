import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * StickMan Drawing
 * @author - Donald
 * @version - 04/17/21
 */ 
public class Drawing extends JPanel {

    int delay = 300; //milliseconds
    int r = 0;
    
    public static void main(String[] a) {
         JFrame f = new JFrame();
        f.setContentPane(new Drawing());
        f.setSize(600, 400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true); 
    }

    ActionListener taskPerformer = new ActionListener(){
        public void actionPerformed(ActionEvent evt) {
            ++r;
            repaint();
            if(r ==4){
                r = 0;
            }
            time.restart();
        }
    };

    Timer time = new Timer(delay, taskPerformer);
    
    public void paintComponent(Graphics g){

        // this statement required
        super.paintComponent(g);

        // optional: paint the background color (default is white)
        setBackground(Color.CYAN);
        // display words
        g.setColor(Color.BLACK);
        g.drawString("DANCE PARTY!", 250, 20);
        
        if(r == 0){
            setBackground(Color.RED);
            drawDanceA(g);
            time.start();
        }
        if(r == 1){
            setBackground(Color.YELLOW);
            drawDanceB(g);
        }
        if(r == 2){
            setBackground(Color.GREEN);
            drawDanceC(g);
        }
        if(r == 3){
            setBackground(Color.CYAN);
            drawDanceD(g);
        }

    
    }
    
    public void drawDanceA(Graphics g) {
        g.fillRect( 130,30, 40,40 );      // Draw head
        g.drawLine( 150,70, 150,80 );     // Draw neck
        g.drawLine( 150,80, 150,193 );    // Draw body
        g.drawLine( 150,130, 250,130 );   // Draw right arm
        g.drawLine( 250,130, 250,70 );
        g.drawLine( 100,130, 40,190 );    // Draw left arm
        g.drawLine( 100,130, 150,130 );
        g.drawLine( 150,190, 95,320 );    // Draw left leg
        g.drawLine( 95,320, 75,320 );
        g.drawLine( 150,190, 205,320 );   // Draw right leg
        g.drawLine( 205,320, 225,320 );
    }
    
    public void drawDanceB(Graphics g) {
        g.fillRect( 130,50, 40,40 );      // Draw head
        g.drawLine( 150,150, 150,80 );     // Draw neck
        g.drawLine( 150,80, 150,193 );    // Draw body
        g.drawLine( 150,130, 250,130 );   // Draw right arm
        g.drawLine( 250,130, 250,190 );

        g.drawLine( 100,130, 40,190 );    // Draw left arm
        g.drawLine( 100,130, 150,130 );
        g.drawLine( 150,190, 95,320 );    // Draw left leg
        g.drawLine( 95,320, 75,320 );
        g.drawLine( 150,190, 205,320 );   // Draw right leg
        g.drawLine( 205,320, 225,300 );
    }
    
    public void drawDanceC(Graphics g) {
        g.fillRect( 130,30, 40,40 );      // Draw head
        g.drawLine( 150,70, 150,80 );     // Draw neck
        g.drawLine( 150,80, 150,193 );    // Draw body
        g.drawLine( 150,130, 250,130 );   // Draw right arm
        g.drawLine( 250,130, 250,70 );
        g.drawLine( 100,130, 40,70 );    // Draw left arm
        g.drawLine( 100,130, 150,130 );
        g.drawLine( 150,190, 95,320 );    // Draw left leg
        g.drawLine( 95,320, 75,320 );
        g.drawLine( 150,190, 205,320 );   // Draw right leg
        g.drawLine( 205,320, 225,320 );
    }
    
    public void drawDanceD(Graphics g) {
        g.fillRect( 130,50, 40,40 );      // Draw head
        g.drawLine( 150,70, 150,80 );     // Draw neck
        g.drawLine( 150,80, 150,193 );    // Draw body
        g.drawLine( 150,130, 250,130 );   // Draw right arm
        g.drawLine( 250,130, 250,70 );
        g.drawLine( 100,130, 40,190 );    // Draw left arm
        g.drawLine( 100,130, 150,130 );
        g.drawLine( 150,190, 95,320 );    // Draw left leg
        g.drawLine( 95,320, 75,320 );
        g.drawLine( 150,190, 205,320 );   // Draw right leg
        g.drawLine( 205,320, 225,300 );
    }
    
}
}
