// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;
//
//
//
//
//    }
//
//}

public class Lab06vst extends Applet
{
    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        for (int R = 0; R<=100; R++) {
           Random rand = new Random();
            int x1 = rand.nextInt(390) +10;
            int x2 = rand.nextInt(390) +10;
            int y1 = rand.nextInt(290) +10;
            int y2 = rand.nextInt(290) +10;

            int redColor = rand.nextInt(255);
            int greenColor = rand.nextInt(255);
            int blueColor = rand.nextInt(255);
            g.setColor (new Color(redColor, greenColor, blueColor));


            g.drawLine(x1, y1, x2, y2);
        }

        // Draw Random Squares
        for (int R = 0; R<=100; R++) {
          Random rand = new Random();
            int x12 = rand.nextInt(340) + 400;
            int width = 50;
            int y12 = rand.nextInt(240) + 10;
            int height = 50;

            int redColor = rand.nextInt(255);
            int greenColor = rand.nextInt(255);
            int blueColor = rand.nextInt(255);
            g.setColor (new Color(redColor, greenColor, blueColor));

            g.fillRect(x12, y12, width, height);
        }

        // Draw Random Circles
        for (int R = 0; R<=100; R++) {
          Random rand = new Random();
            int circSize = rand.nextInt(5)+1;
            int width = 100/circSize;
            int x13 = rand.nextInt(390 - width) + 10;
            int height = 100/circSize;
            int y13 = rand.nextInt(290 - height) + 300;

            int redColor = rand.nextInt(255);
            int greenColor = rand.nextInt(255);
            int blueColor = rand.nextInt(255);
            g.setColor (new Color(redColor, greenColor, blueColor));

            g.drawOval(x13, y13, width, height);
        }


        // Draw 3-D Box
        Random rand = new Random();
            int redColor = rand.nextInt(255);
            int greenColor = rand.nextInt(255);
            int blueColor = rand.nextInt(255);
            g.setColor (new Color(redColor, greenColor, blueColor));

          Polygon square = new Polygon();
            square.addPoint(600,400);
            square.addPoint(650,400);
            square.addPoint(650,450);
            square.addPoint(600,450);
            g.fillPolygon(square);

            int rdColor = rand.nextInt(255);
            int grnColor = rand.nextInt(255);
            int bluColor = rand.nextInt(255);
            g.setColor (new Color(rdColor, grnColor, bluColor));

          Polygon Para = new Polygon();
            Para.addPoint(600,400);
            Para.addPoint(600,450);
            Para.addPoint(550,425);
            Para.addPoint(550,375);
            g.fillPolygon(Para);


            int rColor = rand.nextInt(255);
            int gColor = rand.nextInt(255);
            int bColor = rand.nextInt(255);
            g.setColor (new Color(rColor, gColor, bColor));

          Polygon Back = new Polygon();
            Back.addPoint(600,400);
            Back.addPoint(600,375);
            Back.addPoint(550,375);
            g.fillPolygon(Back);
            int rC = rand.nextInt(255);
            int gC = rand.nextInt(255);
            int bC = rand.nextInt(255);
            g.setColor (new Color(rC, gC, bC));

          Polygon Side = new Polygon();
            Side.addPoint(600,400);
            Side.addPoint(650,400);
            Side.addPoint(600,375);
            g.fillPolygon(Side);



    }

}



    
 