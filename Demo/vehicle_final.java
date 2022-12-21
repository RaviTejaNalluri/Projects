import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class vehicle extends JFrame implements ActionListener
{
  JButton b1;
  JButton b2;
  JLabel l1,l2,l3,label; 
  JButton b3,b4;
  JFrame f;
  JTextField tf1,tf2;
  JTextField pass;
  vehicle()
  { 
    f=new JFrame();
   f.setTitle("Vehicle Identification System");
   JLabel title=new JLabel("Vehicle Identification System");
   title.setForeground(Color.GREEN);
   title.setFont(new Font("SanSerif", Font.ITALIC, 70));
   title.setBounds(500,120,900,200);
   l1=new JLabel("Login as");
   l1.setForeground(Color.CYAN);
   l1.setFont(new Font("SanSerif", Font.ITALIC, 45));
   l1.setBounds(750,250,200,250);
   b1=new JButton("Staff");
   b1.setFont(new Font("SanSerif", Font.ITALIC, 30));
   b1.setBackground(Color.RED);
   b1.setBounds(600,550,150,60);
   b2=new JButton("Customer");
   b2.setBackground(Color.BLUE);
   b2.setFont(new Font("SanSerif", Font.ITALIC, 20));
   b2.setBounds(800,550,150,60);
   b3=new JButton("Police");
   b3.setBackground(Color.YELLOW);
   b3.setFont(new Font("SanSerif", Font.ITALIC, 30));
   b3.setBounds(1000,550,150,60);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   f.add(l1);
   f.add(b1);
   f.add(b2);
   f.add(b3);
   f.add(title);
   f.setSize(1920,1080);
   f.getContentPane().setBackground(Color.BLACK);
   f.setLayout(null);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public void actionPerformed(ActionEvent ae)
  {
    
    

    //For STAFF.Helps to get Owner and Vehicle information
    if(ae.getSource()==b1)
    {
      JFrame p=new JFrame();
      p.setTitle("Staff");
      l2=new JLabel("UserName");
      l2.setFont(new Font("SanSerif", Font.BOLD,30));
      l2.setBounds(700,200,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("SanSerif", Font.BOLD, 30));
      l3.setBounds(700,400,150,100);
      tf1=new JTextField(25);
      tf1.setFont(new Font("SanSerif", Font.ITALIC,20));
      tf1.setBounds(1000,225,200,50);
      pass=new JPasswordField();
      pass.setFont(new Font("SanSerif", Font.BOLD,20));
      pass.setBounds(1000,420,200,50);
      ImageIcon ic=new ImageIcon("Login.png"); 
      Image ico=ic.getImage();
      Image tem=ico.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ic=new ImageIcon(tem);
      JLabel bf=new JLabel("",ic,JLabel.CENTER);
      bf.setBounds(250,200,256,271);
      b4=new JButton("Sign in");
      b4.setBounds(850,600,150,50);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=pass.getText();
      if (value1.equals("17XJ1A0528") && value2.equals("Test1234")||value1.equals("17XJ1A0557") && value2.equals("Test@123")||value1.equals("17XJ") && value2.equals("Test123"))
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
      number.setFont(new Font("SanSerif",Font.ITALIC,25));
      number.setBounds(900,400,250,50);
      JButton find=new JButton("Fetch Details"); 
      find.setBounds(700,600,250,50);
      page.add(label);
      //page.add(bg);
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
          c.setTitle(" Details");
          JLabel view=new JLabel("View Details Of");
          view.setFont(new Font("SanSerif",Font.ITALIC,25));
          view.setBounds(600,300,400,80);
          c.add(view);
          JButton owner_details=new JButton("Owner Details");
          owner_details.setBounds(600,400,300,80);
          JButton Vehicle_details=new JButton("Vehicle Details");
          Vehicle_details.setBounds(600,500,300,80);
          owner_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame o=new JFrame();
             o.setTitle("Owner Details");
             JLabel on=new JLabel("Owner Name:RaviTeja");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Phone NUmber:7382118037");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dob=new JLabel("Date Of Birth:30-10-1999"); 
             dob.setFont(new Font("SanSerif",Font.ITALIC,25));
             dob.setBounds(100,350,600,80);
             JLabel Address=new JLabel("D:No-201,Street No-26,Kukatpally,Hyderabad-500072");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
              ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(700,200,160,180);
             o.add(on);
             o.add(op);
             o.add(dob);   
             o.add(Address);
             o.add(bi);
             o.setSize(1920,1080);
             o.setLayout(null);
             o.setVisible(true);
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame vd=new JFrame("Vehicle Detais");
             JLabel on=new JLabel("Vehicle:Swift");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Vehicle Color:Red");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dor=new JLabel("Date Of Registartion:3-10-2015");
              dor.setFont(new Font("SanSerif",Font.ITALIC,25));
             dor.setBounds(100,350,600,80);
             JLabel Address=new JLabel("Insurance Expiry Date:16-5-2022");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
             JLabel Challan=new JLabel("Payment Due:5000");
             Challan.setFont(new Font("SanSerif",Font.ITALIC,25));
             Challan.setBounds(100,550,700,80);
             vd.add(on);
             vd.add(op);
             vd.add(dor);   
             vd.add(Address);
             vd.add(Challan);
             vd.setSize(1920,1080);
             vd.setLayout(null);
             vd.setVisible(true);
          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
          c.setSize(1920,1080);
          c.setLayout(null);
          c.setVisible(true);
	
       }
       if(vn.equals("TS09A6666"))
       {
           JFrame c=new JFrame();
          c.setTitle(" Details");
          JLabel view=new JLabel("View Details Of");
          view.setFont(new Font("SanSerif",Font.ITALIC,25));
          view.setBounds(600,300,400,80);
          c.add(view);
          JButton owner_details=new JButton("Owner Details");
          owner_details.setBounds(600,400,300,80);
          JButton Vehicle_details=new JButton("Owner Details");
          Vehicle_details.setBounds(600,500,300,80);
          owner_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame od=new JFrame("Owner Details");
             JLabel on=new JLabel("Owner Name:Pavan");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Phone NUmber:9493694912");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dob=new JLabel("Date Of Birth:20-9-1986"); 
             dob.setFont(new Font("SanSerif",Font.ITALIC,25));
             dob.setBounds(100,350,600,80);
             JLabel Address=new JLabel("D:No-260,Street No-29,Secundrabad,Hyderabad-500072");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
              ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(700,200,160,180);
             od.add(on);
             od.add(op);
             od.add(dob);   
             od.add(Address);
             od.add(bi);
             od.setSize(1920,1080);
             od.setLayout(null);
             od.setVisible(true);
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame vd=new JFrame("Vehicle Detais");
             JLabel on=new JLabel("Vehicle:Unicorn");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Vehicle Color:Black");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dor=new JLabel("Date Of Registartion:12-5-2012");
              dor.setFont(new Font("SanSerif",Font.ITALIC,25));
             dor.setBounds(100,350,600,80);
             JLabel Address=new JLabel("Insurance Expiry Date:26-9-2020");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
             JLabel Challan=new JLabel("Payment Due:2000");
             Challan.setFont(new Font("SanSerif",Font.ITALIC,25));
             Challan.setBounds(100,550,700,80);
             vd.add(on);
             vd.add(op);
             vd.add(dor);   
             vd.add(Address);
             vd.add(Challan);
             vd.setSize(1920,1080);
             vd.setLayout(null);
             vd.setVisible(true);
          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
          c.setSize(1920,1080);
          c.setLayout(null);
          c.setVisible(true);
       }
        if(vn.equals("TS091A2356"))
       {
          JFrame c=new JFrame();
          c.setTitle(" Details");
          JLabel view=new JLabel("View Details Of");
          view.setFont(new Font("SanSerif",Font.ITALIC,25));
          view.setBounds(600,300,400,80);
          c.add(view);
          JButton owner_details=new JButton("Owner Details");
          owner_details.setBounds(600,400,300,80);
          JButton Vehicle_details=new JButton("Vehicle Details");
          Vehicle_details.setBounds(600,400,400,80);
          owner_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame od=new JFrame("Owner Details");
             JLabel on=new JLabel("Owner Name:Raju");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Phone NUmber:9949522659");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dob=new JLabel("Date Of Birth:16-1-1972"); 
             dob.setFont(new Font("SanSerif",Font.ITALIC,25));
             dob.setBounds(100,350,600,80);
             JLabel Address=new JLabel("D:No-12,Street No-1,Lingampally,Hyderabad-500072");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
              ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(700,200,160,180);
             od.add(on);
             od.add(op);
             od.add(dob);   
             od.add(Address);
             od.add(bi);
             od.setSize(1920,1080);
             od.setLayout(null);
             od.setVisible(true);
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame vd=new JFrame("Vehicle Detais");
             JLabel on=new JLabel("Vehicle:Splendour");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Vehicle Color:Gray");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dor=new JLabel("Date Of Registartion:16-4-2008");
              dor.setFont(new Font("SanSerif",Font.ITALIC,25));
             dor.setBounds(100,350,600,80);
             JLabel Address=new JLabel("Insurance Expiry Date:5-9-2026");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
             JLabel Challan=new JLabel("Payment Due:15000");
             Challan.setFont(new Font("SanSerif",Font.ITALIC,25));
             Challan.setBounds(100,550,700,80);
             vd.add(on);
             vd.add(op);
             vd.add(dor);   
             vd.add(Address);
             vd.add(Challan);
             vd.setSize(1920,1080);
             vd.setLayout(null);
             vd.setVisible(true);
          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
          c.setSize(1920,1080);
          c.setLayout(null);
          c.setVisible(true);
       }
        if(vn.equals("AP07N3626"))
       {
         JFrame c=new JFrame();
          c.setTitle(" Details");
          JLabel view=new JLabel("View Details Of");
          view.setFont(new Font("SanSerif",Font.ITALIC,25));
          view.setBounds(600,300,400,80);
          c.add(view);
          JButton owner_details=new JButton("Owner Details");
          owner_details.setBounds(600,400,300,80);
          JButton Vehicle_details=new JButton("Vehicle Details");
          Vehicle_details.setBounds(600,500,300,80);
          owner_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame od=new JFrame();
             od.setTitle("Owner Details");
             JLabel on=new JLabel("Owner Name:Sharath");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Phone NUmber:9553716312");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dob=new JLabel("Date Of Birth:28-12-1992"); 
             dob.setFont(new Font("SanSerif",Font.ITALIC,25));
             dob.setBounds(100,350,600,80);
             JLabel Address=new JLabel("D:No-556,Street No-12,Bahadurpally,Hyderabad-500072");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
              ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(700,200,160,180);
             od.add(on);
             od.add(op);
             od.add(dob); 
             od.add(bi);  
             od.add(Address);
             od.setSize(1920,1080);
             od.setLayout(null);
             od.setVisible(true);
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){ 
          public void actionPerformed(ActionEvent e)
          {
             JFrame vd=new JFrame("Vehicle Detais");
             JLabel on=new JLabel("Vehicle:Lorry");
             on.setFont(new Font("SanSerif",Font.ITALIC,25));
             on.setBounds(100,150,400,80);
             JLabel op=new JLabel("Vehicle Color:Brown");
             op.setFont(new Font("SanSerif",Font.ITALIC,25));
             op.setBounds(100,250,500,80);
             JLabel dor=new JLabel("Date Of Registartion:25-12-2010");
              dor.setFont(new Font("SanSerif",Font.ITALIC,25));
             dor.setBounds(100,350,600,80);
             JLabel Address=new JLabel("Insurance Expiry Date:2-12-2020");
             Address.setFont(new Font("SanSerif",Font.ITALIC,25));
             Address.setBounds(100,450,700,80);
             JLabel Challan=new JLabel("Payment Due:9000");
             Challan.setFont(new Font("SanSerif",Font.ITALIC,25));
             Challan.setBounds(100,550,700,80);
             vd.add(on);
             vd.add(op);
             vd.add(dor);   
             vd.add(Address);
             vd.add(Challan);
             vd.setSize(1920,1080);
             vd.setLayout(null);
             vd.setVisible(true);
          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
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
      p.add(bf);
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
      tf1.setFont(new Font("SanSerif", Font.ITALIC,20));
      tf1.setBounds(1000,220,200,50);
      pass=new JPasswordField(); 
      pass.setFont(new Font("SanSerif", Font.ITALIC,20));
      pass.setBounds(1000,420,200,50);
       ImageIcon ic=new ImageIcon("Login.png"); 
      Image ico=ic.getImage();
      Image tem=ico.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ic=new ImageIcon(tem);
      JLabel bf=new JLabel("",ic,JLabel.CENTER);
      bf.setBounds(250,200,256,271);
      b4=new JButton("Login");
      b4.setBounds(850,600,150,60);
      b4.addActionListener(new ActionListener(){ 
     public void actionPerformed(ActionEvent e)
     {
   
      String value1=tf1.getText();
      String value2=pass.getText();
      if (value1.equals("Inspirion") && value2.equals("Vehicle")||value1.equals("Raven") && value2.equals("Gone"))
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
      veh_no.setFont(new Font("SanSerif", Font.ITALIC,20));
      veh_no.setBounds(700,400,250,60);
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
          JLabel AN=new JLabel("AADHAR No:2364 5896 2641");
          AN.setFont(new Font("SanSerif", Font.ITALIC,20));
          AN.setBounds(100,150,700,80);
          JLabel LVD=new JLabel("License Validity Date:2-4-2022" );
          LVD.setFont(new Font("SanSerif", Font.ITALIC,20));
          LVD.setBounds(100,250,700,80);
          JLabel IED=new JLabel("Insurance Expiry Date:16-5-2022");
          IED.setFont(new Font("SanSerif", Font.ITALIC,20));
          IED.setBounds(100,350,900,80);
          JLabel challan=new JLabel("Challan Due:5000");
          challan.setFont(new Font("SanSerif", Font.ITALIC,20));
          challan.setBounds(100,450,600,80);
          ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(700,200,160,180);
          d.add(AN);
          d.add(LVD);
          d.add(IED);
          d.add(challan);
          d.add(bi);
          d.setSize(1920,1080);
          d.setLayout(null);
          d.setVisible(true);
	
       }
       if(no1.equals("TS09A6666"))
       {
          JFrame d=new JFrame();
          d.setTitle("Details");
          JLabel AN=new JLabel("AADHAR No:4682 1596 5489");
          AN.setFont(new Font("SanSerif", Font.ITALIC,20));
          AN.setBounds(100,150,700,80);
          JLabel LVD=new JLabel("License Validity Date:20-5-2020" );
          LVD.setFont(new Font("SanSerif", Font.ITALIC,20));
          LVD.setBounds(100,250,700,80);
          JLabel IED=new JLabel("Insurance Expiry Date:26-9-2020");
          IED.setFont(new Font("SanSerif", Font.ITALIC,20));
          IED.setBounds(100,350,700,80);
          JLabel challan=new JLabel("Challan Due:2000");
          challan.setFont(new Font("SanSerif", Font.ITALIC,20));
          challan.setBounds(100,550,600,80);
           ImageIcon I=new ImageIcon("pavan.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(500,200,160,180);
          d.add(AN);
          d.add(LVD);
          d.add(IED);
          d.add(challan);
          d.add(bi);
          d.setSize(1920,1080);
          d.setLayout(null);
          d.setVisible(true);
       }
       if(no1.equals("TS09D2356"))
       {
          JFrame d=new JFrame();
          d.setTitle("Details");
          JLabel AN=new JLabel("AADHAR No:9852 2654 9564");
          AN.setFont(new Font("SanSerif", Font.ITALIC,20));
          AN.setBounds(100,150,700,80);
          JLabel LVD=new JLabel("License Validity Date:16-9-2021" );
          LVD.setFont(new Font("SanSerif", Font.ITALIC,20));
          LVD.setBounds(100,250,700,80);
          JLabel IED=new JLabel("Insurance Expiry Date:5-9-2026");
          IED.setFont(new Font("SanSerif", Font.ITALIC,20));
          IED.setBounds(100,350,700,80);
          JLabel challan=new JLabel("Challan Due:15000");
          challan.setFont(new Font("SanSerif", Font.ITALIC,20));
          challan.setBounds(100,550,600,80);
          ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(500,200,160,180);
          d.add(AN);
          d.add(LVD);
          d.add(IED);
          d.add(bi);
          d.add(challan);
          d.setSize(1920,1080);
          d.setLayout(null);
          d.setVisible(true);
	
       }
       if(no1.equals("AP07N3626"))
       {
           JFrame d=new JFrame();
          d.setTitle("Details");
          JLabel AN=new JLabel("AADHAR No:1479 5621 6855");
          AN.setFont(new Font("SanSerif", Font.ITALIC,20));
          AN.setBounds(100,150,700,80);
          JLabel LVD=new JLabel("License Validity Date:15-8-2020" );
          LVD.setFont(new Font("SanSerif", Font.ITALIC,20));
          LVD.setBounds(100,250,700,80);
          JLabel IED=new JLabel("Insurance Expiry Date:2-12-2020");
          IED.setFont(new Font("SanSerif", Font.ITALIC,20));
          IED.setBounds(100,350,700,80);
          JLabel challan=new JLabel("Challan Due:9000");
          challan.setFont(new Font("SanSerif", Font.ITALIC,20));
          challan.setBounds(100,550,600,80);
           ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(500,200,160,180);
          d.add(AN);
          d.add(LVD);
          d.add(IED);
          d.add(challan);
          d.add(bi);
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
      p.add(bf); 
      p.setSize(1920,1080);
      p.getContentPane().setBackground(Color.ORANGE);
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
      l2.setFont(new Font("SanSerif", Font.ITALIC, 30));
      l2.setBounds(700,200,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("SanSerif", Font.ITALIC, 30));
      l3.setBounds(700,400,150,100);
      tf1=new JTextField();
      tf1.setFont(new Font("SanSerif", Font.ITALIC,20));
      tf1.setBounds(1000,220,200,50);
      pass=new JPasswordField(); 
      pass.setFont(new Font("SanSerif", Font.BOLD,20));
      pass.setBounds(1000,420,200,50);
      ImageIcon ic=new ImageIcon("Login.png"); 
      Image ico=ic.getImage();
      Image tem=ico.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ic=new ImageIcon(tem);
      JLabel bf=new JLabel("",ic,JLabel.CENTER);
      bf.setBounds(250,200,256,271);
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
      page.setTitle("Input Details");
      page.setLayout(null);
      page.setVisible(true);
      label = new JLabel(" Welcome "+value1);
      label.setFont(new Font("SanSerif", Font.BOLD, 30));
      label.setBounds(800,200,400,100);
      JLabel vehicle_num=new JLabel("Enter the vehicle number:");
      vehicle_num.setFont(new Font("SanSerif", Font.ITALIC, 20));
      vehicle_num.setBounds(500,400,250,50);
      JTextField veh_num=new JTextField();
      veh_num.setBounds(800,400,250,50);
      ImageIcon ifi=new ImageIcon("Traffic Logo.jpg"); 
      Image icone=ifi.getImage();
      Image tempe=icone.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ifi=new ImageIcon(tempe);
      JLabel bm=new JLabel("",ifi,JLabel.CENTER);
      bm.setBounds(0,0,256,271);

      page.add(bm);
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
          JLabel Owner_name=new JLabel("Owner Name:Ravi Teja");
           Owner_name.setBounds(100,150,200,80);
          JLabel Phone_Number=new JLabel("Phone number:7382118037" );
          Phone_Number.setBounds(100,250,200,80);
         // JLabel cross=new JLabel("22 April 2019:Signal Crossing.Charges =Rs 2000");
          //cross.setBounds(100,350,600,80);
         
          JLabel Address=new JLabel("Address:Hyderabad");
          

          Address.setBounds(100,450,200,80);
          JLabel pay=new JLabel("Challan due:5000 ");
          pay.setBounds(100,550,200,80);
          JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          vw.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:HYD07513\nDate:24-May-2018\n,Place of Violation:Jeedimetla\n,Voilation:Signal Crossing,Fine Amount:2000\n\nEChallan No:HYD076669\nDate:24-April-2019\n,Place of Violation:SR Nagar\n,Voilation:Rash Driving,Fine Amount:3000");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
          }
         });
          ImageIcon I=new ImageIcon("ravi.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(600,200,160,180);
          s.add(Owner_name);
          s.add(Phone_Number);
          //s.add(cross);
          s.add(pay);
          s.add(Address);
           s.add(bi);
          s.add(vw);
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
          JLabel Phone_Numbe=new JLabel("Phone number:9493634312" );
          Phone_Numbe.setBounds(100,250,200,80);
          //JLabel mistake=new JLabel("25 March 2019:Unauthorised Parking.Charges =Rs 2000");
          //mistake.setBounds(100,350,600,80);
         
          JLabel Addr=new JLabel("Address:Hyderabad");

          Addr.setBounds(100,450,200,80);
          JLabel pen=new JLabel("Challan:2000 due ");
          pen.setBounds(100,550,200,80);
          JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          vw.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:CYB07625\nDate:18-September-2017\n,Place of Violation:ORR Dundigal\n,Voilation:Over Speeeding,Fine Amount:2000\n\n");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
          }
         });
          ImageIcon I=new ImageIcon("pavan.jpg"); 
          Image Im=I.getImage();
          Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          I=new ImageIcon(te);
          JLabel bi=new JLabel("",I,JLabel.CENTER);
          bi.setBounds(600,200,160,180);
          k.add(Owner_nam);
          k.add(Phone_Numbe);
          //k.add(mistake);
          k.add(pen);
          k.add(bi);
          k.add(Addr);
          k.add(vw);
          k.setSize(1920,1080);
          k.setLayout(null);
          k.setVisible(true);
	
       }
       if(numb.equals("TS091A2356"))
       {
          JFrame k=new JFrame();
          k.setTitle("Details");
          JLabel Owner_nam=new JLabel("Owner Name:Raju");
           Owner_nam.setBounds(100,150,200,80);
          JLabel Phone_Numbe=new JLabel("Phone number:9445689123" );
          Phone_Numbe.setBounds(100,250,200,80);
          //JLabel mistake=new JLabel("25 March 2019:Unauthorised Parking.Charges =Rs 15000");
          //mistake.setBounds(100,350,600,80);
         
          JLabel Addr=new JLabel("Address:D.No-45,Street No-7,Kachiguda,Hyderabad");

          Addr.setBounds(100,450,200,80);
          JLabel pen=new JLabel("Challan:1000 due ");
          pen.setBounds(100,550,200,80);
           JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          vw.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:HYD07526\nDate:17-Jan-2018\n,Place of Violation:Nizampet\n,Voilation:OverSpeeding,Fine Amount:5000\n\nEChallan No:CYD076669\nDate:24-April-2019\n,Place of Violation:KPHB\n,Voilation:Wrong Route,Fine Amount:6000,EChallan No:HYD075223\nDate:16-Feb-2019\n,Place of Violation:Nizampet\n,Voilation:disobedience of Orders,Fine Amount:3000\n\n");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
          }
         });
          //ImageIcon I=new ImageIcon("pavan.jpg"); 
          //Image Im=I.getImage();
          //Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          //I=new ImageIcon(te);
          //JLabel bi=new JLabel("",I,JLabel.CENTER);
          //bi.setBounds(600,200,160,180);
          k.add(Owner_nam);
          k.add(Phone_Numbe);
          //k.add(mistake);
          k.add(pen);
          //k.add(bi);
          k.add(Addr);
          k.add(vw);
          k.setSize(1920,1080);
          k.setLayout(null);
          k.setVisible(true);
	
       }
       if(numb.equals("AP07N3626"))
       {
          JFrame k=new JFrame();
          k.setTitle("Details");
          JLabel Owner_nam=new JLabel("Owner Name:Sharath");
           Owner_nam.setBounds(100,150,200,80);
          JLabel Phone_Numbe=new JLabel("Phone number:949113625" );
          Phone_Numbe.setBounds(100,250,200,80);
          //JLabel mistake=new JLabel("25 March 2019:Rash Driving.Charges =Rs 9000");
          //mistake.setBounds(100,350,600,80);
         
          JLabel Addr=new JLabel("Address:D.No-201,Street No-7,Nallakunta,Hyderabad-500044");

          Addr.setBounds(100,450,200,80);
          JLabel pen=new JLabel("Challan:2000 due ");
          pen.setBounds(100,550,200,80);
          JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          vw.addActionListener(new ActionListener(){ 
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:CYB07625\nDate:26-June-2017\n,Place of Violation:Erragadda\n,Voilation:Rash Driving,Fine Amount:9000\n\n");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
          }
         });
          //ImageIcon I=new ImageIcon("pavan.jpg"); 
          //Image Im=I.getImage();
          //Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
          //I=new ImageIcon(te);
          //JLabel bi=new JLabel("",I,JLabel.CENTER);
          //bi.setBounds(600,200,160,180);
          k.add(Owner_nam);
          k.add(Phone_Numbe);
          //k.add(mistake);
          k.add(pen);
          //k.add(bi);
          k.add(Addr);
          k.add(vw);
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
      p.add(bf);
      p.setSize(1920,1080);
      p.getContentPane().setBackground(Color.YELLOW);
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