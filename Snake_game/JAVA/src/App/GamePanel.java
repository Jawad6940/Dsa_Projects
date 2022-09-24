package App;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {
    //fixed sizes
    //panel1
    static final int SCREEN_WIDTH=700;
    static final int SCREEN_HEIGHT =700;
     //panel2
    //  static final int SCREEN_WIDTH=800;

    //block
    static final int UNIT_SIZE =25;
    //total blocks
    static final int GAME_UNIT =(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE;
    //delay time
    static final int DELAY =50;
    //position of snake body part
    static final int x[] =new int [GAME_UNIT];
    static final int y[] =new int [GAME_UNIT];
    //initial body
    int bodyParts=6;
    //apple definition
    int appleEaten;
    //position of apple
    int appleX;
    int appleY;
    //movement
    char direction='R'; //R,L,U,D
    //runnung or staic
    boolean running=false;
    Timer timer;
    Random random;

    GamePanel(){
        random = new Random();
        
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        
		
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
    }
    public void startGame(){
        newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
    }

    public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
    public void draw(Graphics g){
        //drawing grid for visualization
        if(running){
        //     for (int i = 0; i < SCREEN_HEIGHT/UNIT_SIZE; i++) {
        //     g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
        //     g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
        // }
        //colouring apple
        g.setColor(Color.red);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
        //color snake
        for (int i = 0; i <bodyParts; i++) {
            if(i==0){
                g.setColor(Color.green);
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
            else{
                g.setColor(new Color(45,180,0));
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        }
        //score
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,30));
        FontMetrics metrics1= getFontMetrics(g.getFont());
        g.drawString("Score: " + appleEaten, (SCREEN_WIDTH-metrics1.stringWidth("Score: " + appleEaten))/2, g.getFont().getSize());
    }
    else{
        gameOver(g);
        

    }
    }
    public void newApple(){
        appleX= random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY= random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }
    public void move(){

        for (int i = bodyParts; i >0; i--) {
            x[i]=x[i-1];
            y[i]=y[i-1];
            
        }
        switch (direction) {
            case 'R':
                x[0]=x[0]+UNIT_SIZE;
                break;
            case 'L':
                x[0]=x[0]-UNIT_SIZE;
                break;
            case 'U':
                y[0]=y[0]-UNIT_SIZE;
                break;
            case 'D':
                y[0]=y[0]+UNIT_SIZE;
                break;
        
            default:
                break;
        }
    }
    public void checkApple(){
        if(x[0]==appleX && y[0]==appleY){
            bodyParts++;
            appleEaten++;
            newApple(); 
        }
    }
    public void checkCollision(){
        //self collision
        for (int i = bodyParts; i >0; i--) {
           if(x[0]==x[i] && y[0]==y[i]){
            running= false;
           }
        }
        //boundary check
        // left 
        if(x[0]<0){
            running=false;
        }
        //right
        if(x[0]==SCREEN_WIDTH){
            running=false;
        }
        //top
        if(y[0]<0){
            running=false;
        }
        //down
        if(y[0]==SCREEN_HEIGHT){
            running=false;
        }
        if(!running){
            timer.stop();
        }
    }
    public void gameOver(Graphics g){
        //score
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,30));
        FontMetrics metrics1= getFontMetrics(g.getFont());
        g.drawString("Score: " + appleEaten, (SCREEN_WIDTH-metrics1.stringWidth("Score: " + appleEaten))/2, g.getFont().getSize());
        // game over text
        g.setColor(Color.red);
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        FontMetrics metrics2= getFontMetrics(g.getFont());
        g.drawString("Game Over", (SCREEN_WIDTH-metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(running){
            move();
            checkApple();
            checkCollision();
            
        }
        repaint();

    }
    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(direction!='R'){
                        // System.out.println("left");
                        direction='L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if(direction!='L'){
                        direction='R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if(direction!='D'){
                        direction='U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(direction!='U'){
                        direction='D';
                    }
                    break;
            
                default:
                    break;
            }
        }
    }

}
