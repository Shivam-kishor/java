import java.awt.*;
import java.awt.event.*;
 class reg extends Frame{
 	reg()
 	{
 		super("Registration form");
 		setSize(600,500);
 		setLayout(null);
 		setVisible(true);

        Color fc=new Color(69,58,49);
        setBackground(fc);

        Font tf=new Font("arail",Font.BOLD,25);
         Font lf=new Font("arail",Font.PLAIN,20);
         Font ttf=new Font("arail",Font.PLAIN,15);


         Label l1=new Label("Registration form");
         l1.setBounds(200,150,250,30);
         l1.setFont(tf);
         l1.setForeground(Color.WHITE);
         add(l1);


          addWindowListener(new WindowAdapter(){
          	public void windowClosing(WindowEvent we)
          	{
          		System.exit(0);
          	}
          });
 	}
 }


 class frameforvs
 {
 	public static void main(String[] args) {
 		reg aa=new reg();
 	}
 }