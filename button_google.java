import java.awt.*;    
import java.awt.event.*;
public class button_google {    
public static void main (String[] args) {   

    
    // create instance of frame with the label   
    Frame f = new Frame("Button Example");  
    Label b=new Label("hello");
     f.add(b);
    
    
    TextField a=new TextField( 80);
    a.setSize(180,150);
    a.setVisible(true);
   // a.setColor(Color.red);
    f.add(a);  
  
    // create instance of button with label  
    Button b1 = new Button("Click Here");   
  
    // set the position for the button in frame   
    b1.setBounds(50,100,80,30);    
  
    // add button to the frame  
    f.add(b1);    
    // set size, layout and visibility of frame  
    f.setSize(400,400);    
    f.setLayout(null);    
    f.setVisible(true);     
}    
}    