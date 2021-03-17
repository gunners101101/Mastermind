package codeBreaker;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import all necessary imports
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Point2D;
import java.awt.FontMetrics;
public class CircleButton extends JButton{ //create a class an extend JButton
    private Color color; //create color
    public CircleButton(String text, Color c){ //create constructor
        super(text); //set text for sizing
        setOpaque(false); 
        setFocusPainted(false);
        setBorderPainted(false);
        color = c; //set color as c
    }
    private int getDiameter(){ //create method to get diameter 
        int diameter = Math.min(getWidth(), getHeight()); //set diameter as either the width or height of the frame
        return diameter; //return diameter
    }
    public void paintComponent(Graphics g){ //create painting method
        int diameter = getDiameter(); //get diameter by calling method
        int radius = diameter/2; //get radius by dividing by 2
        g.setColor(color); //set color of component as indicated
        g.fillOval(getWidth()/2 - radius, getHeight()/2 - radius, diameter, diameter); //fill the circle and set the size
        FontMetrics metrics = g.getFontMetrics(getFont()); //get font metrics
        int stringWidth = metrics.stringWidth(getText()); //create variable for string width
        int stringHeight = metrics.getHeight(); //create variable for string height
        g.drawString(getText(), getWidth()/2 - stringWidth/2, getHeight()/2 + stringHeight/4); //draw string to help size the circle
    }
    public void setColor(Color c) {
        color = c; //set color as c
    }
}
