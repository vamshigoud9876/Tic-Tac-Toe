//author: vamshi
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code="tiktaktoe" width=750 height=1000>
</applet>
*/
public class tiktaktoe extends Applet implements ActionListener
{Button b1=new Button("");
Button b2=new Button("");
Button b3=new Button("");
Button b4=new Button("");
Button b5=new Button("");
Button b6=new Button("");
Button b7=new Button("");
Button b8=new Button("");
Button b9=new Button("");
Button b10=new Button("restart");
Button bpl=new Button("play");
Button bpa=new Button("pause");
Button undo=new Button("undo");

boolean b;
int turn=0;
int b11=0,b22=0,b33=0,b44=0,b55=0,b66=0,b77=0,b88=0,b99=0;
public void init()
{
setLayout(null);

b1.setBackground(Color.cyan);
b2.setBackground(Color.cyan);
b3.setBackground(Color.cyan);
b4.setBackground(Color.cyan);
b5.setBackground(Color.cyan);
b6.setBackground(Color.cyan);
b7.setBackground(Color.cyan);
b8.setBackground(Color.cyan);
b9.setBackground(Color.cyan);
bpl.setBackground(Color.orange);
bpa.setBackground(Color.orange);

Font f1=new Font("arial",Font.ITALIC+Font.BOLD,60);
Font f2=new Font("arial",Font.BOLD,30);
b1.setFont(f1);
b2.setFont(f1);
b3.setFont(f1);
b4.setFont(f1);
b5.setFont(f1);
b6.setFont(f1);
b7.setFont(f1);
b8.setFont(f1);
b9.setFont(f1);
b10.setFont(f2);
bpl.setFont(f2);
bpa.setFont(f2);
undo.setFont(f2);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
bpl.addActionListener(this);
bpa.addActionListener(this);
undo.addActionListener(this);
this.addMouseMotionListener(new Mouse1(this));

b1.setBounds(0,0,250,250);
b2.setBounds(250,0,250,250);
b3.setBounds(500,0,250,250);
b4.setBounds(0,250,250,250);
b5.setBounds(250,250,250,250);
b6.setBounds(500,250,250,250);
b7.setBounds(0,500,250,250);
b8.setBounds(250,500,250,250);
b9.setBounds(500,500,250,250);
b10.setBounds(290,800,150,50);
bpl.setBounds(57,800,150,50);
bpa.setBounds(521,800,150,50);
undo.setBounds(294,868,150,50);


b1.setEnabled(b);
b2.setEnabled(b);
b3.setEnabled(b);
b4.setEnabled(b);
b5.setEnabled(b);
b6.setEnabled(b);
b7.setEnabled(b);
b8.setEnabled(b); 
b9.setEnabled(b);

add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(bpl);
add(bpa);
add(undo);
}

//---------------------------------------------------------------------------------------
Button un=new Button("");
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()!=bpl && ae.getSource()!=bpa && ae.getSource()!=b10 && ae.getSource()!=undo)
	un=(Button)ae.getSource();
if(ae.getSource()==undo)
{
un.setLabel("");
}
if(ae.getActionCommand()=="play")
{b=true;
}
if(ae.getActionCommand()=="pause")
{b=false;}


b1.setEnabled(b);
b2.setEnabled(b);
b3.setEnabled(b);
b4.setEnabled(b);
b5.setEnabled(b);
b6.setEnabled(b);
b7.setEnabled(b);
b8.setEnabled(b); 
b9.setEnabled(b);

if(turn==0)
{if(ae.getSource()==b1 && b11==0)
{b1.setLabel("X");
turn=1;
b11=1;

}
else if(ae.getSource()==b2 && b22==0)
{b2.setLabel("X");
turn=1;
b22=1;
}
else if(ae.getSource()==b3 && b33==0)
{b3.setLabel("X");
turn=1;
b33=1;
}
else if(ae.getSource()==b4 && b44==0)
{b4.setLabel("X");
b44=1;
turn=1;
}
else if(ae.getSource()==b5 && b55==0)
{b5.setLabel("X");
turn=1;
b55=1;
}
else if(ae.getSource()==b6 && b66==0)
{b6.setLabel("X");
turn=1;
b66=1;
}
else if(ae.getSource()==b7 && b77==0)
{b7.setLabel("X");
b77=1;
turn=1;
}
else if(ae.getSource()==b8 && b88==0)
{b8.setLabel("X");
b88=1;
turn=1;
}
else if(ae.getSource()==b9 && b99==0)
{b9.setLabel("X");
b99=1;
turn=1;
}
}
else if(turn==1)
{if(ae.getSource()==b1 && b11==0)
{b1.setLabel("O");
turn=0;
b11=1;
}
else if(ae.getSource()==b2 && b22==0)
{b2.setLabel("O");
turn=0;
b22=1;
}
else if(ae.getSource()==b3 && b33==0)
{b3.setLabel("O");
turn=0;
b33=1;
}
else if(ae.getSource()==b4 && b44==0)
{b4.setLabel("O");
turn=0;
b44=1;
}
else if(ae.getSource()==b5 && b55==0)
{b5.setLabel("O");
turn=0;
b55=1;
}
else if(ae.getSource()==b6 && b66==0)
{b6.setLabel("O");
turn=0;
b66=1;
}
else if(ae.getSource()==b7 && b77==0)
{b7.setLabel("O");
turn=0;
b77=1;
}
else if(ae.getSource()==b8 && b88==0)
{b8.setLabel("O");
b88=1;
turn=0;
}
else if(ae.getSource()==b9 && b99==0)
{b9.setLabel("O");
b99=1;
turn=0;
}
}
if((b1.getLabel()=="X"&&b4.getLabel()=="X"&&b7.getLabel()=="X") || 
(b7.getLabel()=="X"&&b5.getLabel()=="X"&&b3.getLabel()=="X") ||
(b7.getLabel()=="X"&&b8.getLabel()=="X"&&b9.getLabel()=="X") ||
(b1.getLabel()=="X"&&b5.getLabel()=="X"&&b9.getLabel()=="X") ||
(b3.getLabel()=="X"&&b6.getLabel()=="X"&&b9.getLabel()=="X") ||
(b3.getLabel()=="X"&&b5.getLabel()=="X"&&b7.getLabel()=="X") ||
(b1.getLabel()=="X"&&b2.getLabel()=="X"&&b3.getLabel()=="X") ||
(b2.getLabel()=="X"&&b5.getLabel()=="X"&&b8.getLabel()=="X") ||
(b4.getLabel()=="X"&&b5.getLabel()=="X"&&b6.getLabel()=="X"))
{try{Thread.sleep(100);}catch(Exception e){}
b5.setLabel("X won");
turn=2;
} 

//for O
if((b1.getLabel()=="O"&&b4.getLabel()=="O"&&b7.getLabel()=="O") ||
(b7.getLabel()=="O"&&b5.getLabel()=="O"&&b3.getLabel()=="O") ||
(b7.getLabel()=="O"&&b8.getLabel()=="O"&&b9.getLabel()=="O") ||
(b1.getLabel()=="O"&&b5.getLabel()=="O"&&b9.getLabel()=="O") ||
(b3.getLabel()=="O"&&b6.getLabel()=="O"&&b9.getLabel()=="O") ||
(b3.getLabel()=="O"&&b5.getLabel()=="O"&&b7.getLabel()=="O") ||
(b1.getLabel()=="O"&&b2.getLabel()=="O"&&b3.getLabel()=="O") ||
(b2.getLabel()=="O"&&b5.getLabel()=="O"&&b8.getLabel()=="O") ||
(b4.getLabel()=="O"&&b5.getLabel()=="O"&&b6.getLabel()=="O"))
{try{Thread.sleep(100);}catch(Exception e){}
b5.setLabel("O won");
turn=2;
} 

if((b5.getLabel()=="O won") || (b5.getLabel()=="X won"))
{b1.setLabel("");b2.setLabel("");b3.setLabel("");b4.setLabel("");
b6.setLabel("");b7.setLabel("");b8.setLabel("");b9.setLabel("");
}

if(ae.getActionCommand()=="restart")
{b1.setLabel("");b2.setLabel("");b3.setLabel("");b4.setLabel("");
b6.setLabel("");b7.setLabel("");b8.setLabel("");b9.setLabel("");b5.setLabel("");
turn=0;
b11=b22=b33=b44=b55=b66=b77=b88=b99=0;
}}}

class Mouse1 extends MouseAdapter
{static tiktaktoe appp;
Mouse1(tiktaktoe app)
{appp=app;}
public void mouseMoved(MouseEvent me)
{appp.showStatus("moving at "+me.getX()+" "+me.getY());

}
}
