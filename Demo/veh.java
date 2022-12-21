
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class vehicle extends JFrame implements ActionListener
{
  JButton b1;
  JButton b2;
  JLabel l1,l2,l3,label; 
  JButton b3,b4;
  JTextField tf1;
  JPasswordField pass;
  vehicle()
  { 
   JFrame f=new JFrame();
   f.setTitle("Vehicle Identification System");
   
   l1=new JLabel("Login as");
   l1.setForeground(Color.white);
   l1.setFont(new Font("SanSerif", Font.ITALIC, 45));
   l1.setBounds(600,220,200,250);
   b1=new JButton("Staff");
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
   f.getContentPane().setBackground(Color.BLACK);
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
      p.setTitle("Staff");
      l2=new JLabel("UserName");
      l2.setFont(new Font("Serif", Font.ITALIC,30));
      l2.setBounds(700,200,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("SanSerif", Font.ITALIC, 30));
      l3.setBounds(700,400,150,100);
      tf1=new JTextField(25);
      tf1.setBounds(1000,225,200,50);
      pass=new JPasswordField();
      
      pass.setBounds(1000,420,200,50);
      b4=new JButton("Sign in");
      b4.setBounds(850,600,150,50);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=pass.getText();
      if (value1.equals("Staff") && value2.equals("pass")||value1.equals("Ravi") && value2.equals("password"))
     {
      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel("Welcome:"+value1);
      label.setFont(new Font("SanSerif", Font.BOLD, 30));
      label.setBounds(600,100,350,80);
      JLabel veh=new JLabel("Enter the vehicle number");
      veh.setFont(new Font("SanSerif",Font.ITALIC,25));
      veh.setBounds(400,400,300,50);
      JTextField number=new JTextField();
      number.setBounds(900,400,250,50);
      JButton find=new JButton("Fetch Details"); 
      find.setBounds(700,600,250,50);
      page.add(label);
      page.add(veh);
      page.add(number);
      page.add(find);
     find.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent X)
     {
       String vn=number.getText();
       if(vn.equals("TS09A9999"))
       {
          JFrame c=new JFrame();
          c.setTitle("Owner Details");
          JLabel owner=new JLabel("Owner Name:Ravi Teja");
          owner.setBounds(100,150,200,80);
          JLabel ph=new JLabel("Phone number:7382118037" );
          ph.setBounds(100,250,200,80);
          JLabel email_id=new JLabel("Email ID:ravi.nalluri1998@gmail.com");
          email_id.setBounds(100,350,300,80);
          JLabel dob=new JLabel("Date of Birth:30-10-1999");
          dob.setBounds(100,450,200,80);
          JLabel veh_name=new JLabel("Vehicle Type:Car");
          veh_name.setBounds(100,550,200,80);
          JLabel colour=new JLabel("Color:White");
          colour.setBounds(100,650,200,80);
          JLabel dor=new JLabel("Date of registration:28-04-2018");
          dor.setBounds(100,750,200,80);
          JLabel Add=new JLabel("Address:Hyderabad");
          Add.setBounds(100,850,200,80);
          ImageIcon i=new ImageIcon("ravi.jpg");
          JButton j1=new JButton(i);
          j1.setBounds(500,250,155,177);
          c.add(owner);
          c.add(ph);
          c.add(j1);
          c.add(email_id);
          c.add(veh_name);
          c.add(colour);
          c.add(dob);
          c.add(dor);
          c.add(Add);
          
          c.setSize(1920,1080);
          c.setLayout(null);
          c.setVisible(true);
	
       }
       if(vn.equals("TS09A6666"))
       {
          JFrame c=new JFrame();
          c.setTitle("Details");
          JLabel owner=new JLabel("Owner Name:Pavan");
          owner.setBounds(100,150,200,80);
          JLabel ph=new JLabel("Phone number:9491454668" );
          ph.setBounds(100,250,200,80);
          JLabel email_id=new JLabel("Email ID:pavansai@gmail.com");
          email_id.setBounds(100,350,300,80);
          JLabel dob=new JLabel("Date of Birth:22-04-1998");
          dob.setBounds(100,450,200,80);
          JLabel veh_name=new JLabel("Vehicle Type:Bike");
          veh_name.setBounds(100,550,200,80);
          JLabel colour=new JLabel("Color:Red");
          colour.setBounds(100,650,200,80);
          JLabel dor=new JLabel("Date of registration:25-11-2016");
          dor.setBounds(100,750,200,80);
          JLabel Add=new JLabel("Address:Hyderabad");
          Add.setBounds(100,850,200,80);
          JLabel penalty=new JLabel("Challan:1000 due ");
          penalty.setBounds(100,950,200,80);
          c.add(owner);
          c.add(ph);
          c.add(email_id);
          c.add(veh_name);
          c.add(colour);
          c.add(dob);
          c.add(dor);
          c.add(Add);
          c.add(penalty);
          c.setSize(1920,1080);
          c.setLayout(null);
          c.setVisible(true);
	
	
       }
       else
       {
         JLabel warning=new JLabel("Enter Valid number");  
         warning.setForeground(Color.RED); 
         warning.setBounds(800,670,200,50);
         page.add(warning);
       }
}});
            

      
     }
      else
      {
       label=new JLabel("Incorrect Username or password");  
       label.setForeground(Color.RED);
       label.setBounds(800,700,200,40);
       p.add(label);
    } 
   }
   });
   
      p.add(l2);
      p.add(l3);
      p.add(tf1);
      p.add(pass);
      p.add(b4);
      p.getContentPane().setBackground(Color.GREEN);  
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
      tf1.setBounds(1000,220,200,50);
      pass=new JPasswordField(); 
      pass.setBounds(1000,420,200,50);
      b4=new JButton("Login");
      b4.setBounds(850,600,150,100);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=pass.getText();
      if (value1.equals("User") && value2.equals("Using"))
     {
      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel(" Welcome "+value1);
      label.setFont(new Font("SanSerif", Font.BOLD, 15));
      label.setBounds(800,200,400,100);
      JLabel label2=new JLabel("Enter the vehicle number:");
      label2.setBounds(500,400,250,50);
      JTextField veh_no=new JTextField();
      veh_no.setBounds(700,400,250,100);
      JButton no=new JButton("Fetch Details");
      no.setBounds(700,650,250,50);
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
         warn.setOpaque(true);
         warn.setForeground(Color.RED); 
         warn.setBounds(800,670,200,50);
         page.add(warn);
       }
}});
            

 
    //  page.setSize(1920,1080);
     // page.setLayout(null);
    //  page.setVisible(true);
        // label = new JLabel("Welcome:"+value1);
       //label.setFont(new Font("SanSerif", Font.ITALIC, 30));
      //label.setBounds(150,200,150,80);
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
      p.add(pass);
      p.add(b4);  
      p.setSize(1920,1080);
      p.getContentPane().setBackground(Color.RED);
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
      pass=new JPasswordField(); 
      pass.setBounds(1000,400,200,50);
      b4=new JButton("Login");
      b4.setBounds(850,600,150,50);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=pass.getText();
      if (value1.equals("Officer") && value2.equals("Office")||value1.equals("Kevin") && value2.equals("Spacey"))
      {
      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel(" Welcome "+value1);
      label.setFont(new Font("SanSerif", Font.BOLD, 15));
      label.setBounds(800,200,400,100);
      JLabel vehicle_num=new JLabel("Enter the vehicle number:");
      vehicle_num.setFont(new Font("SanSerif", Font.ITALIC, 15));
      vehicle_num.setBounds(500,400,250,50);
      JTextField veh_num=new JTextField();
      veh_num.setBounds(700,400,250,50);
      JButton cont=new JButton("Continue");
      cont.setBounds(700,650,250,50);
     cont.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent se)
     {
       String numb=veh_num.getText();
       if(numb.equals("TS09A9999"))
       {
          JFrame s=new JFrame();
          s.setTitle("Details");
          JLabel Owner_name=new JLabel("OwnerName:Ravi Teja");
           Owner_name.setBounds(100,150,200,80);
          JLabel Phone_Number=new JLabel("Phone number:7382118037" );
          Phone_Number.setBounds(100,250,200,80);
          JLabel cross=new JLabel("22 April 2019:Signal Crossing.Charges =Rs 2000");
          cross.setBounds(100,350,600,80);
         
          JLabel Address=new JLabel("Address:Hyderabad");

          Address.setBounds(100,450,200,80);
          JLabel pay=new JLabel("Challan:0 due ");
          pay.setBounds(100,550,200,80);
          s.add(Owner_name);
          s.add(Phone_Number);
          s.add(cross);
          s.add(pay);
          s.add(Address);
          s.setSize(1920,1080);
          s.setLayout(null);
          s.setVisible(true);
	
       }
      if(numb.equals("TS09A6666"))
       {
          JFrame k=new JFrame();
          k.setTitle("Details");
          JLabel Owner_nam=new JLabel("Owner Name:Pavan");
           Owner_nam.setBounds(100,150,200,80);
          JLabel Phone_Numbe=new JLabel("Phone number:738118036" );
          Phone_Numbe.setBounds(100,250,200,80);
          JLabel mistake=new JLabel("25 March 2019:Unauthorised Parking.Charges =Rs 500");
          mistake.setBounds(100,350,600,80);
         
          JLabel Addr=new JLabel("Address:Hyderabad");

          Addr.setBounds(100,450,200,80);
          JLabel pen=new JLabel("Challan:500 due ");
          pen.setBounds(100,550,200,80);
          k.add(Owner_nam);
          k.add(Phone_Numbe);
          k.add(mistake);
          k.add(pen);
          k.add(Addr);
          k.setSize(1920,1080);
          k.setLayout(null);
          k.setVisible(true);
	
       }
       
     
       else
       {
         JLabel warn=new JLabel("Enter Valid number");
         warn.setOpaque(true);  
         warn.setForeground(Color.RED); 
         warn.setBounds(800,800,100,80);
         page.add(warn);
       }
}});
            

 
    //  page.setSize(1920,1080);
     // page.setLayout(null);
    //  page.setVisible(true);
        // label = new JLabel("Welcome:"+value1);
       //label.setFont(new Font("SanSerif", Font.ITALIC, 30));
      //label.setBounds(150,200,150,80);
         page.add(label);  
       page.add(cont);
      page.add(vehicle_num);
      page.add(veh_num); 
     }
      else
      {
       label=new JLabel("Incorrect Username or password");   
        label.setOpaque(true);  
       label.setForeground(Color.RED); 
       label.setBounds(450,600,100,80);
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
      p.getContentPane().setBackground(Color.RED);
      p.setLayout(null);
      p.setVisible(true);
      p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}

  
 public static void main(String[] args)
 {
   new  vehicle();
 }
}