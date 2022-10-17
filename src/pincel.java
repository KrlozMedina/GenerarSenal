/*
 * pincel.java
 *
 * 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.awt.*;
/**
 *
 * @author Alejandro
 */
public class pincel extends Canvas {
    
    grafos  form1;
    int px ,py ,pxx, pyy;
  int a1 , b1,c1,d1, e1,f1,g1,h1, i1,j1, k1,l1, m1,n1,o1,a2 , b2,c2,d2, e2,f2,g2,h2, i2,j2, k2,l2, m2,n2,o2;
    /** Creates a new instance of pincel */
    public pincel(grafos    R) {
        this.form1 = R;
    }

    public void repintar(int a1, int b1, int c1, int d1, int e1, int f1, int g1, int h1, int i1, int j1, int k1, int l1, int m1, int n1, int o1,
            int a2, int b2, int c2, int d2, int e2, int f2, int g2, int h2, int i2, int j2, int k2, int l2, int m2, int n2, int o2){
        this.a1 = a1;
        this.b1= b1;
        this.c1 = c1;
        this.d1 = d1;
        this.e1 = e1;
        this.f1 = f1;        
        this.g1 = g1;
        this.h1 = h1;
        this.i1 = i1;
        this.j1 = j1;
        this.k1 = k1;
        this.l1 = l1;
        this.m1 = m1;
        this.n1 = n1;
        this.o1 = o1;
        this.a2 = a2;
        this.b2= b2;
        this.c2 = c2;
        this.d2 = d2;
        this.e2 = e2;
        this.f2 = f2;        
        this.g2 = g2;
        this.h2 = h2;
        this.i2 = i2;
        this.j2 = j2;
        this.k2 = k2;
        this.l2 = l2;
        this.m2 = m2;
        this.n2 = n2;
        this.o2 = o2;

                
    }
   
    
     public void paint (Graphics lapiz){ // Metodo de pintado 
    //Canvas papel = this;
         lapiz.setColor(new Color (0,0,255));
     lapiz.drawLine(0,150,400,150);
     lapiz.drawLine(200,0,200,300);
     lapiz.setColor(new Color(255,255,0));
     
     lapiz.drawLine(a1 ,   100,a2 ,    100);
     lapiz.drawLine(b1 ,  100,b2 ,    200);
     lapiz.drawLine(c1 ,  200,c2,    200);
     lapiz.drawLine(d1,  200,d2,    100);
     lapiz.drawLine(e1,  100,e2,    100);
     lapiz.drawLine(f1,  100,f2,    200);
     lapiz.drawLine(g1,  200,g2,    200);

     //aqui esta la mitad de la grafica.

     lapiz.drawLine(h1,  200,h2,    100);
     lapiz.drawLine(i1,  100,i2,    100);
     lapiz.drawLine(j1,  100,j2,    200);
     lapiz.drawLine(k1,  200,k2,    200);
     lapiz.drawLine(l1,  200,l2,    100);
     lapiz.drawLine(m1,  100,m2,    100);
     lapiz.drawLine(n1,  100,n2,    200);
     lapiz.drawLine(o1,  200,o2,    200);


    }
     
     }
    

   
    



