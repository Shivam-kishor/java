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
         l1.setBounds(200,100,250,30);
         l1.setFont(tf);
         l1.setForeground(Color.RED);
         add(l1);
          
          Label l2=new Label("First number");
         l2.setBounds(100,150,150,20);
         l2.setFont(lf);
         l2.setForeground(Color.WHITE);
         add(l2);

         TextField t1=new TextField();
          t1.setBounds(200,150,250,20);
         t1.setFont(ttf);
         t1.setForeground(Color.WHITE);
         add(t1);         

               
          Label l3=new Label("Secnd number");
         l3.setBounds(100,200,150,20);
         l3.setFont(lf);
  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       l3.setForeground(Color.WHITE);
         add(l3);

         TextField t2=new TextField();
          t2.setBounds(200,200,250,20);
         t2.setFont(ttf);
         t2.setForeground(Color.WHITE);
         add(t2); 

          Button b1=new Button("+");
          b1.setBounds(80,250,85,30);
          b1.setFont(lf);
          b1.setBackground(Color.RED);
          b1.setForeground(Color.WHITE);
          add(b1);
          Button b2=new Button("-");
          b2.setBounds(170,250,100,30);
          b2.setFont(lf);
          b2.setBackground(Color.GREEN);
          b2.setForeground(Color.WHITE);
          add(b2);

                Button b3=new Button("*");
          b3.setBounds(270,250,110,30);
          b3.setFont(lf);;
          b3.setForeground(Color.YELLOW);
       b3.setBackground(Color.RED);
          add(b3);
            Button b4=new Button("/");
          b4.setBounds(380,250,120,30);
          b4.setFont(lf);
          b4.setBackground(Color.BLUE);
          b4.setForeground(Color.WHITE);
          add(b4);

          addWindowListener(new WindowAdapter(){
          	public void windowClosing(WindowEvent we)
          	{
          		System.exit(0);
          	}
          });
 	}
 }


 class frame1 
 {
 	public static void main(String[] args) {
 		reg aa=new reg();
 	}
 }