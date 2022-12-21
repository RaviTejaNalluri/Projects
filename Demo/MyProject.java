import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class vehicle extends JFrame implements ActionListener
{
  JButton b1;
  JButton b2;
  JLabel l1,l2,l3,label; 
  JButton b3,b4;
  JTextField tf1,tf2;
  JPasswordField pass;
  vehicle()
  { 
   JFrame f=new JFrame();
   f.setTitle("Vehicle Identification System");
   
   l1=new JLabel("Login as");
   l1.setBounds(600,220,200,250);
   b1=new JButton("Administrator");
   b1.setBackground(Color.RED);
   b1.setBounds(450,450,120,60);
   b2=new JButton("Customer");
   b2.setBackground(Color.BLUE);
   b2.setBounds(650,450,150,60);
   b3=new JButton("Police");
   b3.setBackground(Color.YELLOW);
   b3.setBounds(850,450,150,60);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   f.add(l1);
   f.add(b1);
   f.add(b2);
   f.add(b3);
   f.setSize(1920,1080);
   f.getContentPane().setBackground(Color.GRAY);
   f.setLayout(null);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent ae)
  {



    //Adminstrator
    if(ae.getSource()==b1)
    {
      JFrame p=new JFrame();
      p.setTitle("Administator");
      l2=new JLabel("UserName");
      l2.setFont(new Font("Serif", Font.ITALIC, 30));
      l2.setBounds(700,200,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("Serif", Font.ITALIC, 30));
      l3.setBounds(700,400,150,100);
      tf1=new JTextField(25);
      tf1.setBounds(1000,200,200,50);
      pass=new JPasswordField();
      pass.setBounds(1000,400,200,50);
     
      b4=new JButton("Sign in");
      b4.setBounds(850,600,150,60);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=tf2.getText();
      if (value1.equals("Admin") && value2.equals("pass"))
     {
      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel("Welcome:"+value1);
      label.setFont(new Font("Serif", Font.ITALIC, 15));
      label.setBounds(150,200,150,80);
      JLabel register=new JLabel("Vehicles registered by"+" "+value1);
      register.setBounds(100,25,200,80);
       JLabel v_no=new JLabel("Vehicle Number:TS09A9999");
       v_no.setBounds(100,100,200,80);
       JLabel name=new JLabel("Name:Ravi Teja");
       name.setBounds(100,200,200,80);
       JLabel Phone=new JLabel("Phone number:7382118037" );
       Phone.setBounds(100,300,200,80);
       JLabel email=new JLabel("Email ID:ravi.nalluri1998@gmail.com");
       email.setBounds(100,400,300,80);
       JLabel Address=new JLabel("Address:Hyderabad");
       Address.setBounds(100,500,200,80);
       page.add(register);
       page.add(v_no);
       page.add(label);  
       page.add(name);
       page.add(Phone);
       page.add(email);
       page.add(Address);
      
     }
      else
      {
       label=new JLabel("Incorrect Username or password");   
       label.setBackground(Color.RED);
       label.setBounds(600,900,200,200);
       p.add(label);
    } 
   }
   });
   
      p.add(l2);
      p.add(l3);
      p.add(tf1);
      p.add(pass);
      p.add(b4);  
      p.setSize(1920,1080);
      p.setLayout(null);
      p.setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    



   //Customer 
    else if(ae.getSource()==b2)
    {
     
      JFrame p=new JFrame();
      p.setTitle("Customer");
      l2=new JLabel("UserName");
      l2.setFont(new Font("Serif", Font.ITALIC, 30));
      l2.setBounds(700,200,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("Serif", Font.ITALIC, 30));
      l3.setBounds(700,400,150,100);
      tf1=new JTextField();
      tf1.setBounds(1000,200,200,50);
      tf2=new JTextField();
      tf2.setBounds(1000,400,200,50);
      b4=new JButton("Login");
      b4.setBounds(850,600,150,100);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=tf2.getText();
      if (value1.equals("User") && value2.equals("Using"))
     {
      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel(" Welcome "+value1);
      label.setFont(new Font("Serif", Font.ITALIC, 15));
      label.setBounds(600,200,200,100);
      JLabel label2=new JLabel("Enter the vehicle number:");
      label2.setBounds(500,400,250,50);
      JTextField veh_no=new JTextField();
      veh_no.setBounds(700,400,250,100);
      JButton no=new JButton("Fetch Details");
      no.setBounds(800,650,250,50);
      no.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ev)
     {
       String no1=veh_no.getText();
       if(no1.equals("TS09A9999"))
       {
          JFrame d=new JFrame();
          d.setTitle("Details");
          JLabel name=new JLabel("Name:Ravi Teja");
          name.setBounds(100,150,200,80);
          JLabel Phone=new JLabel("Phone number:7382118037" );
          Phone.setBounds(100,250,200,80);
          JLabel email=new JLabel("Email ID:ravi.nalluri1998@gmail.com");
          email.setBounds(100,350,300,80);
          JLabel Address=new JLabel("Address:Hyderabad");

          Address.setBounds(100,450,200,80);
          JLabel challan=new JLabel("Challan:1000 due ");
          challan.setBounds(100,550,200,80);
          d.add(name);
          d.add(Phone);
          d.add(email);
          d.add(Address);
          d.add(challan);
          d.setSize(1920,1080);
          d.setLayout(null);
          d.setVisible(true);
	
       }
       if(no1.equals("TS09A6666"))
       {
          JFrame d=new JFrame();
          d.setTitle("Details");
          JLabel name=new JLabel("Name:Pavan");
          name.setBounds(100,150,200,80);
          JLabel Phone=new JLabel("Phone number:9493694912" );
          Phone.setBounds(100,250,200,80);
          JLabel email=new JLabel("Email ID:pavansai@gmail.com");
          email.setBounds(100,350,300,80);
          JLabel Address=new JLabel("Address:Guntur");

          Address.setBounds(100,450,200,80);
          JLabel challan=new JLabel("Challan:5000 to be paid ");
          challan.setBounds(100,550,200,80);
          d.add(name);
          d.add(Phone);
          d.add(email);
          d.add(Address);
          d.add(challan);
          d.setSize(1920,1080);
          d.setLayout(null);
          d.setVisible(true);
	
       }
       else
       {
         JLabel warn=new JLabel("Enter Valid number");  
         warn.setBackground(Color.RED); 
         warn.setBounds(800,800,100,80);
         page.add(warn);
       }
}});
            

 
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
         label = new JLabel("Welcome:"+value1);
       label.setFont(new Font("Serif", Font.ITALIC, 30));
      label.setBounds(150,200,150,80);
         page.add(label);  
       page.add(label2);
      page.add(veh_no);
      page.add(no); 
     }
      else
      {
       label=new JLabel("Incorrect Username or password");   
       label.setBounds(450,600,100,80);
       p.add(label);
    } 
   }
   });
   
      p.add(l2);
      p.add(l3);
      p.add(tf1);
      p.add(tf2);
      p.add(b4);  
      p.setSize(1920,1080);
      p.setLayout(null);
      p.setVisible(true);
      p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }




  //Police
    else if(ae.getSource()==b3)
    {
     
      JFrame p=new JFrame();
      p.setTitle("Police");
      l2=new JLabel("UserName");
      l2.setFont(new Font("Serif", Font.ITALIC, 30));
      l2.setBounds(700,200,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("Serif", Font.ITALIC, 30));
      l3.setBounds(700,400,150,100);
      tf1=new JTextField();
      tf1.setBounds(1000,200,200,50);
      tf2=new JTextField();
      tf2.setBounds(1000,400,200,50);
      b4=new JButton("Login");
      b4.setBounds(850,600,150,100);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=tf2.getText();
      if (value1.equals("Officer") && value2.equals("Office"))
     {
      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel("Welcome:"+value1);
      label.setBounds(150,200,150,80);
      page.add(label);  
     }
      else
      {
       label=new JLabel("Incorrect Username or password");   
       label.setBounds(450,600,100,80);
       p.add(label);
    } 
   }
   });
   
      p.add(l2);
      p.add(l3);
      p.add(tf1);
      p.add(tf2);
      p.add(b4);  
      p.setSize(1920,1080);
      p.setLayout(null);
      p.setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  }
 public static void main(String[] args)
 {
   new  vehicle();
 }
}