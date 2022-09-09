import java.awt.*;
public class frame
{
public static void main(String args[])                            //(string []args)

											//(string[] args)

                                                                  //(string args[])
{
Frame s=new Frame("my New frame VISIBLE ON TITLE BAR");
Label b=new Label("hi! VISIBLE at CENTER ➡️ ON PROMPT WINDOW",Label.CENTER);
s.add(b);
s.setSize(500,800);
s.setVisible(true);
}
}