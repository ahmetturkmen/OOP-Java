package tr.ahmetturkmen.HW4;
import java.awt.Color;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args){
        JFrame appFrame=new JFrame("Popular Tetris Shapes ");
        DrawPanel drawPanel=new DrawPanel();
        appFrame.add(drawPanel);
        drawPanel.buildShape();
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appFrame.setVisible(true);
        appFrame.setSize(800,800);
        
    }
    
    
    
}
