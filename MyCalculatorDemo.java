import java.awt.*;
import java.awt.event.*;
public class MyCalculatorDemo extends Frame implements ActionListener
{
	boolean flag=true;
float a,b,c;
char op;
  TextField txtres;
  Panel p1,p2,mp;
  Button btnMC,btnMR,btnMS,btnMplus,btnMmins,btnarrow,btnCE,btnC,btnplusmins,btnsqrt,
       btnseven,btneight,btnnine,btndiv,btnper,btnfour,btnfive,btnsix,btnmulti,btnonebyx,
       btnone,btntwo,btnthree,btnmins,btnzero,btndot,btnplus,btnequal;

  public MyCalculatorDemo()
    {

    txtres=new TextField(50);
    btnMC=new Button("MC");
    btnMR=new Button("MR");
    btnMS=new Button("MS");
    btnMplus=new Button("M+");
    btnMmins=new Button("M-");
    btnarrow=new Button("<-");
    btnCE=new Button("CE");
    btnC=new Button("C");
    btnplusmins=new Button("+_");
    btnsqrt=new Button("sqrt");
    btnseven=new Button("7");
    btneight=new Button("8");
    btnnine=new Button("9");
    btndiv=new Button("/");
    btnper=new Button("%");
    btnfour=new Button("4");
    btnfive=new Button("5");
    btnsix=new Button("6");
     btnmulti=new Button("*");
    btnonebyx=new Button("1/x");
    btnone=new Button("1");
    btntwo=new Button("2");
    btnthree=new Button("3");
    btnmins=new Button("-");
    btnzero=new Button("0");
    btndot=new Button(".");
    btnplus=new Button("+");
    btnequal=new Button("=");

    p1=new Panel();
    p2=new Panel(new GridLayout(7,4,8,8));
    mp=new Panel(new BorderLayout());
    setLayout(new FlowLayout());

    p1.add(txtres);
    p2.add(btnMC);
    p2.add(btnMR);
    p2.add(btnMS);
    p2.add(btnMplus);
    p2.add(btnMmins);
    p2.add(btnarrow);
    p2.add(btnCE);
    p2.add(btnC);
    p2.add(btnplusmins);
    p2.add(btnsqrt);
    p2.add(btnseven);
    p2.add(btneight);
    p2.add(btnnine);
    p2.add(btndiv);
    p2.add(btnper);
    p2.add(btnfour);
    p2.add(btnfive);
    p2.add(btnsix);
    p2.add(btnmulti);
    p2.add(btnonebyx);
    p2.add(btnone);
    p2.add(btntwo);
    p2.add(btnthree);
    p2.add(btnmins);
    p2.add(btnzero);
    p2.add(btndot);
    p2.add(btnplus);
    p2.add(btnequal);
    mp.add(p1,BorderLayout.NORTH);
    mp.add(p2,BorderLayout.CENTER);
    add(mp);
    setTitle("MyCalculatorDemo");
    setBounds(200,200,500,400);
    setVisible(true);
   btnMC.addActionListener(this);
   btnMS.addActionListener(this);
   btnMR.addActionListener(this);
   btnMplus.addActionListener(this);
   btnMmins.addActionListener(this);
   btnarrow.addActionListener(this);
   btnCE.addActionListener(this);
   btnC.addActionListener(this);
   btnplusmins .addActionListener(this);
    btnsqrt.addActionListener(this);
    btnseven.addActionListener(this);
   btneight.addActionListener(this);
    btnnine.addActionListener(this);
    btndiv.addActionListener(this);
    btnper.addActionListener(this);
    btnfour.addActionListener(this);
    btnfive.addActionListener(this);
    btnsix.addActionListener(this);
    btnmulti.addActionListener(this);
    btnonebyx.addActionListener(this);
    btnone.addActionListener(this);
    btntwo.addActionListener(this);
    btnthree.addActionListener(this);
    btnmins.addActionListener(this);
    btnzero.addActionListener(this);
    btndot.addActionListener(this);
    btnplus.addActionListener(this);
    btnequal.addActionListener(this);

    addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);
		}
		});
	}
	public void shownum(int num)
	{
		txtres.setText(txtres.getText()+num);
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==btnone)
{
	shownum(1);
	}
	if(ae.getSource()==btntwo)
	{
		shownum(2);
	}
	if(ae.getSource()==btnthree)
	{
		shownum(3);
	}
	if(ae.getSource()==btnfour)
	{
		shownum(4);
	}
	if(ae.getSource()==btnfive)
	{
		shownum(5);
	}
	if(ae.getSource()==btnsix)
	{
		shownum(6);
	}
	if(ae.getSource()==btnseven)
	{
		shownum(7);
	}
	if(ae.getSource()==btneight)
	{
		shownum(8);
	}
	if(ae.getSource()==btnnine)
	{
		shownum(9);
	}
	if(ae.getSource()==btnzero)
	{
		shownum(0);
	}
if(ae.getSource()==btnplus)
	{
      a=Float.parseFloat(txtres.getText());
	op='+';
	txtres.setText("");
	flag=true;
	}
	if(ae.getSource()==btndot)
	{
		String str=txtres.getText();
		if(flag)
		{
			txtres.setText(txtres.getText()+".");
			flag=false;
			}
		}
	if(ae.getSource()==btnmins)
		{
	      a=Float.parseFloat(txtres.getText());
		op='-';
		txtres.setText("");
	flag=true;
}
	if(ae.getSource()==btnmulti)
		{
	      a=Float.parseFloat(txtres.getText());
		op='*';
		txtres.setText("");
	flag=true;
	}
	if(ae.getSource()==btndiv)
		{
	      a=Float.parseFloat(txtres.getText());
		op='/';
		txtres.setText("");
	flag=true;
	}
	if(ae.getSource()==btnper)
			{
		      b=Float.parseFloat(txtres.getText());
			c=a*b/100;
			txtres.setText(""+c);
		flag=true;
	}
	if(ae.getSource()==btnsqrt)
	{
	 a=Float.parseFloat(txtres.getText());
	 txtres.setText("");
 }
 if(ae.getSource()==btnCE)
 {
	 String str=txtres.getText();
	 if(str.length()!=0)
	 {
		 String res=str.substring(0,str.length()-1);
		 txtres.setText(""+res);
		 }
	 }
	  if(ae.getSource()==btnC)
	  {
	 	 String str=txtres.getText();
	 	 if(str.length()!=0)
	 	 {
	 		 String res=str.substring(0,str.length()-1);
	 		 txtres.setText(""+res);
	 		 }
	 }
	  if(ae.getSource()==btnMC)
	  {
	 	 String str=txtres.getText();
	 	 if(str.length()!=0)
	 	 {
	 		 String res=str.substring(0,str.length()-1);
	 		 txtres.setText(""+res);
	 		 }
	 }
	  if(ae.getSource()==btnMR)
	  {
	 	 String str=txtres.getText();
	 	 if(str.length()!=0)
	 	 {
	 		 String res=str.substring(0,str.length()-1);
	 		 txtres.setText(""+res);
	 		 }
	 }
	  if(ae.getSource()==btnMS)
	  {
	 	 String str=txtres.getText();
	 	 if(str.length()!=0)
	 	 {
	 		 String res=str.substring(0,str.length()-1);
	 		 txtres.setText(""+res);
	 		 }
	 }
	  if(ae.getSource()==btnMplus)
	  {
	 	 String str=txtres.getText();
	 	 if(str.length()!=0)
	 	 {
	 		 String res=str.substring(0,str.length()-1);
	 		 txtres.setText(""+res);
	 		 }
	 }
	  if(ae.getSource()==btnMmins)
	  {
	 	 String str=txtres.getText();
	 	 if(str.length()!=0)
	 	 {
	 		 String res=str.substring(0,str.length()-1);
	 		 txtres.setText(""+res);
	 		 }
	 }
	if(ae.getSource()==btnequal)
		{
	      b=Float.parseFloat(txtres.getText());

		txtres.setText("");
		switch (op)
		{
			case'+':c=a+b;
			txtres.setText(""+c);
			break;
			case'-':c=a-b;
			txtres.setText(""+c);
			break;
			case'*':c=a*b;
				txtres.setText(""+c);
			break;
			case'/':c=a/b;
				txtres.setText(""+c);
			break;

			}
	}
			}


public static void main(String args[])
{
	new MyCalculatorDemo();
}
}