import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
class vehicle extends JFrame implements ActionListener
{
  JButton b1;
  JButton b2;
  JLabel l1,l2,l3,label,bg;
  JButton b3,b4;
  JFrame f;
  JTextField tf1,tf2;
  JPasswordField pass;
  JButton back;
  vehicle()
  {
    f=new JFrame();
   f.setTitle("Vehicle Identification System");
   JLabel title=new JLabel("VEHICLE IDENTIFICATION SYSTEM");
   title.setForeground(Color.WHITE);
   title.setFont(new Font("Serif", Font.BOLD, 45));
   title.setBounds(200,120,900,150);
   l1=new JLabel("Login as");
   l1.setForeground(Color.BLUE);
   l1.setFont(new Font("SanSerif", Font.ITALIC, 35));
   l1.setBounds(600,220,200,250);
   b1=new JButton("Staff");
   b1.setFont(new Font("SanSerif", Font.ITALIC, 30));
   b1.setBackground(Color.ORANGE);
   b1.setBounds(350,450,150,60);
   b2=new JButton("Customer");
   b2.setBackground(Color.CYAN);
   b2.setFont(new Font("SanSerif", Font.ITALIC, 20));
   b2.setBounds(550,450,150,60);
   b3=new JButton("Police");
   b3.setBackground(Color.MAGENTA);
   b3.setFont(new Font("SanSerif", Font.ITALIC, 30));
   b3.setBounds(750,450,150,60);
ImageIcon im=new ImageIcon("car.jpg");
Image img=im.getImage();
Image temp=img.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);
im=new ImageIcon(temp);
JLabel bg=new JLabel("",im,JLabel.CENTER);
bg.setBounds(0,0,1620,880);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   f.add(l1);
   f.add(b1);
   f.add(b2);
   f.add(b3);
   f.add(title);
   f.add(bg);
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
      l2=new JLabel("UserID");
      l2.setFont(new Font("SanSerif", Font.BOLD,30));
      l2.setBounds(700,170,150,100);
      l3=new JLabel("Password");
      l3.setFont(new Font("SanSerif", Font.BOLD, 30));
      l3.setBounds(700,370,150,100);
      tf1=new JTextField(25);
      tf1.setFont(new Font("SanSerif", Font.ITALIC,20));
      tf1.setBounds(1000,200,200,50);
      pass=new JPasswordField();
      pass.setFont(new Font("SanSerif", Font.BOLD,20));
      pass.setBounds(1000,400,200,50);
      JCheckBox jc1=new JCheckBox("Show Password");
      jc1.setBounds(1000,500,150,50);
      jc1.addActionListener(new ActionListener(){
        public  void actionPerformed(ActionEvent g)
        {
          if(jc1.isSelected())
          {
            pass.setEchoChar((char)0);
          }
        else
        {
          pass.setEchoChar('*');
          pass.setFont(new Font("SanSerif", Font.BOLD, 45));

        }
        }
      });
      p.add(jc1);
      ImageIcon ic=new ImageIcon("Login.png");
      Image ico=ic.getImage();
      Image tem=ico.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ic=new ImageIcon(tem);
      JLabel bf=new JLabel("",ic,JLabel.CENTER);
      bf.setBounds(250,200,256,271);
      b4=new JButton("Sign in");
      b4.setBounds(850,700,150,50);
      back=new JButton("Back");
      back.setBounds(850,800,150,50);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        f.setVisible(true);
        p.setVisible(false);
      }
    });






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
      p.setVisible(false);
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
      back=new JButton("Back");
      back.setBounds(850,800,150,50);
      page.add(back);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        p.setVisible(true);
        page.setVisible(false);
      }
    });
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
          back=new JButton("Back");
          back.setBounds(850,800,150,50);
          c.add(back);
          back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            page.setVisible(true);
            c.setVisible(false);
          }
        });
          owner_details.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            JFrame o=new JFrame();
            o.setTitle("Owner Details");

            String[] columns= {" Detail"," Data"};
            Object[][] data={{"Name","Ravi Teja"},{"Phone Number","7382118037"},{"DOB","30-10-1999"},{"Address","D:No:1-12-123,KPHB Colony,Kukatpally,Hyderabad-500072"}};
             JTable jt = new JTable(data,columns);
             jt.setBounds(20,20,900,300);
             DefaultTableModel model = new DefaultTableModel(data,columns);
                   model.setColumnIdentifiers(columns);
                   jt.setModel(model);
            jt.setBackground(Color.WHITE);
            Font font = new Font("",1,22);
            jt.setFont(font);
            jt.setRowHeight(30);



         JTextField cname = new JTextField();
         cname.setBounds(400,500,300,80);
         JLabel cn=new JLabel("Enter name      :");
         cn.setBounds(100,500,200,80);
   JTextField cphone = new JTextField();
         cphone.setBounds(400,600,300,80);
         JLabel cp=new JLabel("Enter phone number       :");
         cp.setBounds(100,600,200,80);
   JTextField  cdob= new JTextField();
     cdob.setBounds(400,700,300,80);
         JLabel cdo=new JLabel("Enter DOB             :");
         cdo.setBounds(100,700,300,80);
   JTextField cAddress = new JTextField();
     cAddress.setBounds(400,800,300,80);
   JLabel ca=new JLabel("Enter Address :");
   ca.setBounds(100,800,300,80);
   JLabel ph1=new JLabel();
   ph1.setBounds(900,750,30,20);
   back=new JButton("Back");
   back.setBounds(900,800,200,50);
   back.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e)
   {
     c.setVisible(true);
     o.setVisible(false);
   }
 });
         JButton btnUpdate = new JButton("Update");
         btnUpdate.setBounds(900,650,200,60);
         JScrollPane pane = new JScrollPane(jt);
         pane.setBounds(0, 0, 1900, 1000);

            o.add(pane);
            o.add(btnUpdate);
            //o.add(bi);
            o.add(cname);
           o.add(cn);
           o.add(back);
            o.add(cphone);
            o.add(cp);
            o.add(cdob);
           o.add(cdo);
            o.add(cAddress);
            o.add(ca);
            o.add(ph1);

               o.add(pane);

            o.setSize(1920,1080);
            o.setLayout(null);
            o.setVisible(true);
              o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.setVisible(false);





            jt.addMouseListener(new MouseAdapter(){


            public void mouseClicked(MouseEvent e){


                int i = jt.getSelectedColumn();

                cname.setText(model.getValueAt(0, i).toString());
                cphone.setText(model.getValueAt(1, i).toString());
                cdob.setText(model.getValueAt(2, i).toString());
                cAddress.setText(model.getValueAt(3, i).toString());

            }
          });



            btnUpdate.addActionListener(new ActionListener(){


                public void actionPerformed(ActionEvent e) {

                    int i = jt.getSelectedColumn();

                    if(i >= 0)
                    {
                       model.setValueAt(cname.getText(), 0, i);
                       model.setValueAt(cphone.getText(), 1, i);
                       model.setValueAt(cdob.getText(), 2, i);
                       model.setValueAt(cAddress.getText(), 3, i);

       }
                    else{
                        System.out.println("Update Error");
                    }
                }
            });
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            JFrame o=new JFrame();
            o.setTitle("Vehicle Details");

            String[] columns= {" Detail"," Data"};
      Object[][] data={{"Vehcle","Swift"},{"Vehicle Color","Blue"},{"Date Of Resgistration","26-11-2016"},{"Insurance Expiry","21-1-2020"},{"Challan payment Due","2000" }};
             JTable jt = new JTable(data,columns);
             jt.setBounds(20,20,900,300);
             DefaultTableModel model = new DefaultTableModel(data,columns);
                   model.setColumnIdentifiers(columns);
                   jt.setModel(model);
            jt.setBackground(Color.WHITE);
            Font font = new Font("",1,22);
            jt.setFont(font);
            jt.setRowHeight(30);
            JScrollPane pane = new JScrollPane(jt);
            pane.setBounds(0, 0, 1900, 1000);

            back=new JButton("Back");
            back.setBounds(900,800,200,50);
            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              c.setVisible(true);
              o.setVisible(false);
            }
          });
            o.add(back);
            o.add(pane);
            o.setLayout(null);
            o.setSize(1920,1080);
            o.setVisible(true);
              o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.setVisible(false);

             //ImageIcon I=new ImageIcon("ravi.jpg");
         //Image Im=I.getImage();
         //Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
         //I=new ImageIcon(te);
         //JLabel bi=new JLabel("",I,JLabel.CENTER);
         //bi.setBounds(700,200,160,180);


          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
          c.setSize(1920,1080);
          c.setLayout(null);
          c.setVisible(true);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          page.setVisible(false);


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
          JButton Vehicle_details=new JButton("Vehicle Details");
          Vehicle_details.setBounds(600,500,300,80);
          back=new JButton("Back");
          back.setBounds(850,800,150,50);
          c.add(back);
          back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            page.setVisible(true);
            c.setVisible(false);
          }
        });
          owner_details.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            JFrame o=new JFrame();
            o.setTitle("Owner Details");

            String[] columns= {" Detail"," Data"};
      Object[][] data={{"Name","Pavan Sai"},{"Phone Number","9493694912"},{"DOB","21-10-1994"},{"Address","D:No:2-22,Vijaynagar Colony,Hyderabad,Telangana-500072"}};
             JTable jt = new JTable(data,columns);
             jt.setBounds(20,20,900,300);
             DefaultTableModel model = new DefaultTableModel(data,columns);
                   model.setColumnIdentifiers(columns);
                   jt.setModel(model);
            jt.setBackground(Color.WHITE);
            Font font = new Font("",1,22);
            jt.setFont(font);
            jt.setRowHeight(30);
             //ImageIcon I=new ImageIcon("ravi.jpg");
         //Image Im=I.getImage();
         //Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
         //I=new ImageIcon(te);
         //JLabel bi=new JLabel("",I,JLabel.CENTER);
         //bi.setBounds(700,200,160,180);

         JTextField cname = new JTextField();
         cname.setBounds(400,500,300,80);
         JLabel cn=new JLabel("Enter name      :");
         cn.setBounds(100,500,200,80);
   JTextField cphone = new JTextField();
         cphone.setBounds(400,600,300,80);
         JLabel cp=new JLabel("Enter phone number       :");
         cp.setBounds(100,600,200,80);
   JTextField  cdob= new JTextField();
     cdob.setBounds(400,700,300,80);
         JLabel cdo=new JLabel("Enter DOB             :");
         cdo.setBounds(100,700,300,80);
   JTextField cAddress = new JTextField();
     cAddress.setBounds(400,800,300,80);
   JLabel ca=new JLabel("Enter Address :");
   ca.setBounds(100,800,300,80);

         JButton btnUpdate = new JButton("Update");
         btnUpdate.setBounds(900,650,300,60);
         JScrollPane pane = new JScrollPane(jt);
         pane.setBounds(0, 0, 1900, 1000);
         back=new JButton("Back");
         back.setBounds(850,800,150,50);
         c.add(back);
         back.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
         {
           c.setVisible(true);
           o.setVisible(false);
         }
       });
            o.add(back);
            o.add(btnUpdate);
            //o.add(bi);
            o.add(cname);
           o.add(cn);
            o.add(cphone);
            o.add(cp);
            o.add(cdob);
           o.add(cdo);
            o.add(cAddress);
            o.add(ca);
               o.add(pane);
            o.setSize(1920,1080);
            o.setLayout(null);
            o.setVisible(true);
            o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.setVisible(false);
            jt.addMouseListener(new MouseAdapter(){


            public void mouseClicked(MouseEvent e){


                int i = jt.getSelectedColumn();

                cname.setText(model.getValueAt(0, i).toString());
                cphone.setText(model.getValueAt(1, i).toString());
                cdob.setText(model.getValueAt(2, i).toString());
                cAddress.setText(model.getValueAt(3, i).toString());

            }
            });
            btnUpdate.addActionListener(new ActionListener(){


                public void actionPerformed(ActionEvent e) {

                    int i = jt.getSelectedColumn();

                    if(i >= 0)
                    {
                       model.setValueAt(cname.getText(), 0, i);
                       model.setValueAt(cphone.getText(), 1, i);
                       model.setValueAt(cdob.getText(), 2, i);
                       model.setValueAt(cAddress.getText(), 3, i);

       }

                }
            });
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            JFrame o=new JFrame();
            o.setTitle("Vehicle Details");

            String[] columns= {" Detail"," Data"};
      Object[][] data={{"Vehcle","Unicorn"},{"Vehicle Color","Black"},{"Date Of Resgistration","02-01-2017"},{"Insurance Expiry","12-12-2020"},{"Challan payment Due","1000" }};
             JTable jt = new JTable(data,columns);
             jt.setBounds(20,20,900,300);
             DefaultTableModel model = new DefaultTableModel(data,columns);
                   model.setColumnIdentifiers(columns);
                   jt.setModel(model);
            jt.setBackground(Color.WHITE);
            Font font = new Font("",1,22);
            jt.setFont(font);
            jt.setRowHeight(30);
            JScrollPane pane = new JScrollPane(jt);
            pane.setBounds(0, 0, 1900, 1000);
            back=new JButton("Back");
            back.setBounds(850,800,150,50);
            c.add(back);
            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              page.setVisible(true);
              c.setVisible(false);
            }
          });
            o.add(back);
            o.add(pane);
            o.setLayout(null);
            o.setSize(1920,1080);
            o.setVisible(true);
            c.setVisible(false);
          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
          Vehicle_details.setBounds(600,600,300,80);
          back=new JButton("Back");
          back.setBounds(850,800,150,50);
          c.add(back);
          back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            page.setVisible(true);
            c.setVisible(false);
          }
        });
          owner_details.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            JFrame o=new JFrame();
          o.setTitle("Owner Details");

          String[] columns= {" Detail"," Data"};
         Object[][] data={{"Name","Ram"},{"Phone Number","73821194912"},{"DOB","06-06-1989"},{"Address","D:No:1-22/65,Vidyaynagar,Nallakunta,Telangana-500044"}};
           JTable jt = new JTable(data,columns);
           jt.setBounds(20,20,900,300);
           DefaultTableModel model = new DefaultTableModel(data,columns);
                 model.setColumnIdentifiers(columns);
                 jt.setModel(model);
          jt.setBackground(Color.WHITE);
          Font font = new Font("",1,22);
          jt.setFont(font);
          jt.setRowHeight(30);
           //ImageIcon I=new ImageIcon("ravi.jpg");
       //Image Im=I.getImage();
       //Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
       //I=new ImageIcon(te);
       //JLabel bi=new JLabel("",I,JLabel.CENTER);
       //bi.setBounds(700,200,160,180);

       JTextField cname = new JTextField();
       cname.setBounds(400,500,300,80);
       JLabel cn=new JLabel("Enter name      :");
       cn.setBounds(100,500,200,80);
 JTextField cphone = new JTextField();
       cphone.setBounds(400,600,300,80);
       JLabel cp=new JLabel("Enter phone number       :");
       cp.setBounds(100,600,200,80);
 JTextField  cdob= new JTextField();
   cdob.setBounds(400,700,300,80);
       JLabel cdo=new JLabel("Enter DOB             :");
       cdo.setBounds(100,700,300,80);
 JTextField cAddress = new JTextField();
   cAddress.setBounds(400,800,300,80);
 JLabel ca=new JLabel("Enter Address :");
 ca.setBounds(100,800,300,80);

       JButton btnUpdate = new JButton("Update");
       btnUpdate.setBounds(900,650,300,60);
       JScrollPane pane = new JScrollPane(jt);
       pane.setBounds(0, 0, 1900, 1000);
       back=new JButton("Back");
       back.setBounds(900,800,200,50);
       back.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e)
       {
         c.setVisible(true);
         o.setVisible(false);
       }
     });
          o.add(back);
          o.add(btnUpdate);
          //o.add(bi);
          o.add(cname);
         o.add(cn);
          o.add(cphone);
          o.add(cp);
          o.add(cdob);
         o.add(cdo);
          o.add(cAddress);
          o.add(ca);
             o.add(pane);
          o.setSize(1920,1080);
          o.setLayout(null);
          o.setVisible(true);
            o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          c.setVisible(false);
          jt.addMouseListener(new MouseAdapter(){


          public void mouseClicked(MouseEvent e){


              int i = jt.getSelectedColumn();

              cname.setText(model.getValueAt(0, i).toString());
              cphone.setText(model.getValueAt(1, i).toString());
              cdob.setText(model.getValueAt(2, i).toString());
              cAddress.setText(model.getValueAt(3, i).toString());

          }
          });
          btnUpdate.addActionListener(new ActionListener(){


              public void actionPerformed(ActionEvent e) {

                  int i = jt.getSelectedColumn();

                  if(i >= 0)
                  {
                     model.setValueAt(cname.getText(), 0, i);
                     model.setValueAt(cphone.getText(), 1, i);
                     model.setValueAt(cdob.getText(), 2, i);
                     model.setValueAt(cAddress.getText(), 3, i);

     }
                  else{
                      System.out.println("Update Error");
                  }
              }
          });
          }
          });
          Vehicle_details.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            JFrame o=new JFrame();
            o.setTitle("Vehicle Details");

            String[] columns= {" Detail"," Data"};
      Object[][] data={{"Vehcle","JCB"},{"Vehicle Color","Yellow"},{"Date Of Resgistration","15-05-2013"},{"Insurance Expiry","06-09-2019"},{"Challan payment Due","1170" }};
             JTable jt = new JTable(data,columns);
             jt.setBounds(20,20,900,300);
             DefaultTableModel model = new DefaultTableModel(data,columns);
                   model.setColumnIdentifiers(columns);
                   jt.setModel(model);
            jt.setBackground(Color.WHITE);
            Font font = new Font("",1,22);
            jt.setFont(font);
            jt.setRowHeight(30);
            JScrollPane pane = new JScrollPane(jt);
            pane.setBounds(0, 0, 1900, 1000);
            back=new JButton("Back");
            back.setBounds(900,800,200,50);
            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              c.setVisible(true);
              o.setVisible(false);
            }
          });
            o.add(back);
            o.add(pane);
            o.setLayout(null);
            o.setSize(1920,1080);
            o.setVisible(true);
              o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c.setVisible(false);
          }
          });
          c.add(Vehicle_details);
          c.add(owner_details);
          c.setSize(1920,1080);
          c.setLayout(null);

            c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
       JFrame f3=new JFrame();
       f3.setTitle("Login Error");
       JLabel err=new JLabel("Invalid Username or Password");
       err.setFont(new Font("Serif", Font.BOLD, 20));

       err.setForeground(Color.RED);
       err.setBounds(150,550,400,60);
       f3.add(err);
       ImageIcon imna=new ImageIcon("log.gif");
       Image imgen=imna.getImage();
       Image temp=imgen.getScaledInstance(300,300,Image.SCALE_SMOOTH);
       imna=new ImageIcon(temp);
       JLabel bgl=new JLabel("",imna,JLabel.CENTER);
       bgl.setBounds(70,40,200,150);
       f3.add(bgl);

       f3.setSize(800,800);
       f3.setVisible(true);
    }
   }
   });
   ImageIcon imnn=new ImageIcon("man.jpg");
   Image imgen=imnn.getImage();
   Image temp=imgen.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);
    imnn=new ImageIcon(temp);
    JLabel bg2=new JLabel("",imnn,JLabel.CENTER);
     bg2.setBounds(0,0,1920,1080);
      p.add(l2);
      p.add(l3);
      p.add(tf1);
      p.add(pass);
      p.add(b4);
      p.add(back);
      p.add(bf);
      p.add(bg2);
      p.getContentPane().setBackground(Color.BLACK);
      p.setSize(1920,1080);
      p.setLayout(null);
      p.setVisible(true);
      f.setVisible(false);
      p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




   //Customer
    else if(ae.getSource()==b2)
    {

      JFrame p=new JFrame();
      p.setTitle("Customer");
      l2=new JLabel("UserName");
      l2.setFont(new Font("Serif", Font.BOLD, 30));
      l2.setBounds(700,200,150,100);
      l2.setForeground(Color.GREEN);
      l3=new JLabel("Password");
      l3.setFont(new Font("Serif", Font.BOLD, 30));
      l3.setBounds(700,400,150,100);
       l3.setForeground(Color.GREEN);
      tf1=new JTextField();
      tf1.setFont(new Font("SanSerif", Font.ITALIC,20));
      tf1.setBounds(1000,220,200,50);
      pass=new JPasswordField();
      pass.setFont(new Font("SanSerif", Font.ITALIC,20));
      pass.setBounds(1000,420,200,50);
      JCheckBox jc1=new JCheckBox("Show Password");
      jc1.setBounds(1000,500,150,50);
      jc1.addActionListener(new ActionListener(){
        public  void actionPerformed(ActionEvent g)
        {
          if(jc1.isSelected())
          {
            pass.setEchoChar((char)0);
          }
        else
        {
          pass.setEchoChar('*');
          pass.setFont(new Font("SanSerif", Font.BOLD, 45));

        }
        }
      });
      p.add(jc1);
       ImageIcon ic=new ImageIcon("Login.png");
      Image ico=ic.getImage();
      Image tem=ico.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ic=new ImageIcon(tem);
      JLabel bf=new JLabel("",ic,JLabel.CENTER);
      bf.setBounds(250,200,256,271);
      b4=new JButton("Login");
      b4.setBounds(850,600,150,60);
      back=new JButton("Back");
      back.setBounds(850,800,150,50);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        f.setVisible(true);
        p.setVisible(false);
      }
    });

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
      p.setVisible(false);
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
      back=new JButton("Back");
      back.setBounds(850,800,150,50);


      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        p.setVisible(true);
        page.setVisible(false);
      }
    });
      no.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ev)
     {
       String no1=veh_no.getText();
       if(no1.equals("TS09A9999"))
       {
         JFrame o=new JFrame();
         o.setTitle("Owner Details");

         String[] columns= {" Detail"," Data"};
   Object[][] data={{"Aadhar No","4791 2659 8542"},{"License Validity Date","16-02-2021"},{"Insurancce Expiry Date","21-01-2020"},{"Challan Due","2000"}};
          JTable jt = new JTable(data,columns);
          jt.setBounds(20,20,900,300);
          DefaultTableModel model = new DefaultTableModel(data,columns);
                model.setColumnIdentifiers(columns);
                jt.setModel(model);
         jt.setBackground(Color.WHITE);
         Font font = new Font("",1,22);
         jt.setFont(font);
         jt.setRowHeight(30);
          //ImageIcon I=new ImageIcon("ravi.jpg");
      //Image Im=I.getImage();
      //Image te=Im.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      //I=new ImageIcon(te);
      //JLabel bi=new JLabel("",I,JLabel.CENTER);
      //bi.setBounds(700,200,160,180);




      JScrollPane pane = new JScrollPane(jt);
      pane.setBounds(0, 0, 1900, 1000);
      back=new JButton("Back");
      back.setBounds(700,600,200,50);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        page.setVisible(true);
        o.setVisible(false);
      }
    });
          o.add(back);
            o.add(pane);
         o.setSize(1920,1080);
         o.setLayout(null);
         o.setVisible(true);
         o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        page.setVisible(false);

       }
       if(no1.equals("TS09A6666"))
       {
         JFrame o=new JFrame();
         o.setTitle("Owner Details");

         String[] columns= {" Detail"," Data"};
   Object[][] data={{"Aadhar No","2556 1256 8219 "},{"License Validity Date","20-06-2022"},{"Insurancce Expiry Date","12-12-2020"},{"Challan Due","1000"}};
          JTable jt = new JTable(data,columns);
          jt.setBounds(20,20,900,300);
          DefaultTableModel model = new DefaultTableModel(data,columns);
                model.setColumnIdentifiers(columns);
                jt.setModel(model);
         jt.setBackground(Color.WHITE);
         Font font = new Font("",1,22);
         jt.setFont(font);
         jt.setRowHeight(30);




      JScrollPane pane = new JScrollPane(jt);
      pane.setBounds(0, 0, 1900, 1000);
      back=new JButton("Back");
      back.setBounds(900,800,200,50);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        page.setVisible(true);
        o.setVisible(false);
      }
    });
          o.add(back);
            o.add(pane);
         o.setSize(1920,1080);
         o.setLayout(null);
         o.setVisible(true);
          o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         page.setVisible(false);

       }
       if(no1.equals("TS091A2356"))
       {
         JFrame o=new JFrame();
         o.setTitle("Owner Details");

         String[] columns= {" Detail"," Data"};
   Object[][] data={{"Aadhar No","1568 2234 9654"},{"License Validity Date","18-11-2025"},{"Insurancce Expiry Date","06-09-2019"},{"Challan Due","1700"}};
          JTable jt = new JTable(data,columns);
          jt.setBounds(20,20,900,300);
          DefaultTableModel model = new DefaultTableModel(data,columns);
                model.setColumnIdentifiers(columns);
                jt.setModel(model);
         jt.setBackground(Color.WHITE);
         Font font = new Font("",1,22);
         jt.setFont(font);
         jt.setRowHeight(30);




      JScrollPane pane = new JScrollPane(jt);
      pane.setBounds(0, 0, 1900, 1000);
      back=new JButton("Back");
      back.setBounds(900,800,200,50);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        page.setVisible(true);
        o.setVisible(false);
      }
    });
        o.add(back);
            o.add(pane);
         o.setSize(1920,1080);
         o.setLayout(null);
         o.setVisible(true);
         o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         page.setVisible(false);


       }

       else
       {
         JLabel warn=new JLabel("Enter Valid number");

         warn.setForeground(Color.RED);
         warn.setBounds(800,720,200,50);
         page.add(warn);
       }
}});




         page.add(label);

       page.add(label2);
      page.add(veh_no);
          page.add(back);
      page.add(no);
        page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
      else
      {
        JFrame f3=new JFrame();
        f3.setTitle("Login Error");
        JLabel err=new JLabel("Invalid Username or Password");
        err.setFont(new Font("Serif", Font.BOLD, 20));

        err.setForeground(Color.RED);
        err.setBounds(150,550,400,60);
        f3.add(err);
        ImageIcon imna=new ImageIcon("log.gif");
        Image imgen=imna.getImage();
        Image temp=imgen.getScaledInstance(300,300,Image.SCALE_SMOOTH);
        imna=new ImageIcon(temp);
        JLabel bgl=new JLabel("",imna,JLabel.CENTER);
        bgl.setBounds(70,40,200,150);
        f3.add(bgl);

        f3.setSize(800,800);
        f3.setVisible(true);
    }
   }
   });
   ImageIcon id=new ImageIcon("audi.jpg");
Image immg=id.getImage();
Image temp=immg.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);
id=new ImageIcon(temp);
JLabel bgh=new JLabel("",id,JLabel.CENTER);
bgh.setBounds(0,0,1920,1080);
      p.add(l2);
      p.add(l3);
      p.add(tf1);
      p.add(pass);

     p.add(back);
      p.add(b4);
      p.add(bf);
      p.add(bgh);
      p.setSize(1920,1080);
      p.getContentPane().setBackground(Color.GRAY);
      p.setLayout(null);
      p.setVisible(true);
      f.setVisible(false);
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
l2.setForeground(Color.RED);
      l3=new JLabel("Password");
      l3.setFont(new Font("SanSerif", Font.ITALIC, 30));
      l3.setBounds(700,400,150,100);
l3.setForeground(Color.RED);
      tf1=new JTextField();
      tf1.setFont(new Font("SanSerif", Font.ITALIC,20));
      tf1.setBounds(1000,220,200,50);
      pass=new JPasswordField();
      pass.setFont(new Font("SanSerif", Font.BOLD,20));
      pass.setBounds(1000,420,200,50);
      JCheckBox jc1=new JCheckBox("Show Password");
      jc1.setBounds(1000,500,150,50);
      jc1.addActionListener(new ActionListener(){
        public  void actionPerformed(ActionEvent g)
        {
          if(jc1.isSelected())
          {
            pass.setEchoChar((char)0);
          }
        else
        {
          pass.setEchoChar('*');
          pass.setFont(new Font("SanSerif", Font.BOLD, 45));

        }
        }
      });
      p.add(jc1);
      ImageIcon ic=new ImageIcon("Login.png");
      Image ico=ic.getImage();
      Image tem=ico.getScaledInstance(200,200,Image.SCALE_SMOOTH);
      ic=new ImageIcon(tem);
      JLabel bf=new JLabel("",ic,JLabel.CENTER);
      bf.setBounds(250,200,256,271);
      back=new JButton("Back");
      back.setBounds(850,800,150,50);
      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        f.setVisible(true);
        p.setVisible(false);
      }
    });


      b4=new JButton("Login");
      b4.setBounds(850,600,150,50);
      b4.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e)
     {

      String value1=tf1.getText();
      String value2=pass.getText();
      if (value1.equals("Peak") && value2.equals("Blind")||value1.equals("Kevin") && value2.equals("Spacey"))
      {


      JFrame page=new JFrame();
      page.setSize(1920,1080);
      page.setTitle("Input Details");
      page.setLayout(null);
      page.setVisible(true);
      p.setVisible(false);
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
      back=new JButton("Back");
      back.setBounds(700,800,250,50);

      back.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
        p.setVisible(true);
        page.setVisible(false);
      }
    });
      page.add(back);
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

          JLabel Address=new JLabel("Address:D:No:1-12-123,KPHB Colony,Kukatpally,Hyderabad-500072");


          Address.setBounds(100,450,400,80);
          JLabel pay=new JLabel("Challan due:2000 ");
          pay.setBounds(100,550,200,80);
          back=new JButton("Back");
          back.setBounds(850,800,150,50);

          back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            page.setVisible(true);
            s.setVisible(false);
          }
        });
          s.add(back);
          JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          vw.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:HYD07513\nDate:24-May-2018\nPlace of Violation:Jeedimetla\nVoilation:Signal Crossing,Fine Amount:1000\n\nEChallan No:HYD076669\nDate:24-April-2019\nPlace of Violation:SR Nagar\nVoilation:Rash Driving,Fine Amount:1000");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            back=new JButton("Back");
            back.setBounds(850,800,150,50);

            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              s.setVisible(true);
              nr.setVisible(false);
            }
          });
          nr.add(back);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
            nr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            s.setVisible(false);

          }
         });

          s.add(Owner_name);
          s.add(Phone_Number);
          //s.add(cross);
          s.add(pay);
          s.add(Address);
          s.add(vw);
          s.setSize(1920,1080);
          s.setLayout(null);
          s.setVisible(true);
          s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          page.setVisible(false);

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

          JLabel Addr=new JLabel("Address:D:No:2-22,Vijaynagar Colony,Hyderabad,Telangana-500072");

          Addr.setBounds(100,450,400,80);
          JLabel pen=new JLabel("Challan:1000 due ");
          pen.setBounds(100,550,200,80);
          back=new JButton("Back");
          back.setBounds(850,800,150,50);

          back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            page.setVisible(true);
            k.setVisible(false);
          }
        });
          k.add(back);
          JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          vw.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:CYB07625\nDate:18-September-2017\nPlace of Violation:ORR Dundigal\nVoilation:Over Speeeding,Fine Amount:1000\n\n");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            back=new JButton("Back");
            back.setBounds(850,800,150,50);

            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              k.setVisible(true);
              nr.setVisible(false);
            }
          });
           nr.add(back);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
            nr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            k.setVisible(false);
          }
         });

          k.add(Owner_nam);
          k.add(Phone_Numbe);
          //k.add(mistake);
          k.add(pen);
          k.add(Addr);
          k.add(vw);
          k.setSize(1920,1080);
          k.setLayout(null);
          k.setVisible(true);
          k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          page.setVisible(false);

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

          JLabel Addr=new JLabel("Address:D:No:1-22/65,Vidyaynagar,Nallakunta,Telangana-500044");

          Addr.setBounds(100,450,400,80);
          JLabel pen=new JLabel("Challan:1700 due ");
          pen.setBounds(100,550,200,80);
           JButton vw=new JButton("View Details");
          vw.setBounds(400,550,200,80);
          back=new JButton("Back");
          back.setBounds(850,800,150,50);

          back.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            k.setVisible(true);
            page.setVisible(false);
          }
        });
        k.add(back);
          vw.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e)
          {
            JFrame nr=new JFrame();
            nr.setTitle("Details");
            JTextArea TA=new JTextArea("EChallan No:HYD07526\nDate:17-Jan-2018\nPlace of Violation:Nizampet\nVoilation:OverSpeeding\nFine Amount:500\n\nEChallan No:CYD076669\nDate:24-April-2019\nPlace of Violation:KPHB\nVoilation:Wrong Route\nFine Amount:1000,EChallan No:HYD075223\nDate:16-Feb-2019\nPlace of Violation:Nizampet\nVoilation:disobedience of Orders,Fine Amount:200\n\n");
            TA.setFont(new Font("SanSerif", Font.BOLD, 30));
            TA.setBounds(20,20,1800,1000);
            back=new JButton("Back");
            back.setBounds(850,800,150,50);

            back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
              k.setVisible(true);
              nr.setVisible(false);
            }
          });
            nr.add(back);
            nr.add(TA);
            nr.setLayout(null);
            nr.setSize(1920,1080);
            nr.setVisible(true);
            nr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            k.setVisible(false);
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
          k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          page.setVisible(false);

       }

       else
       {
         JLabel warn=new JLabel("Enter Valid number");
         warn.setForeground(Color.RED);
         warn.setBounds(800,600,200,80);
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
        JFrame f3=new JFrame();
        f3.setTitle("Login Error");
        JLabel err=new JLabel("Invalid Username or Password");
        err.setFont(new Font("Serif", Font.BOLD, 20));

        err.setForeground(Color.RED);
        err.setBounds(150,550,400,60);
        f3.add(err);
        ImageIcon imna=new ImageIcon("log.gif");
        Image imgen=imna.getImage();
        Image temp=imgen.getScaledInstance(300,300,Image.SCALE_SMOOTH);
        imna=new ImageIcon(temp);
        JLabel bgl=new JLabel("",imna,JLabel.CENTER);
        bgl.setBounds(70,40,200,150);
        f3.add(bgl);

        f3.setSize(800,800);
        f3.setVisible(true);
    }
   }
   });
   ImageIcon imn=new ImageIcon("pol.jpg");
Image imge=imn.getImage();
Image temp=imge.getScaledInstance(1920,1080,Image.SCALE_SMOOTH);
imn=new ImageIcon(temp);
JLabel bgl=new JLabel("",imn,JLabel.CENTER);
bgl.setBounds(0,0,1920,1080);
      p.add(l2);
      p.add(l3);
      p.add(tf1);
        p.add(back);
      p.add(pass);
      p.add(b4);
      p.add(bf);
      p.add(bgl);
      p.setSize(1920,1080);
      p.getContentPane().setBackground(Color.YELLOW);
      p.setLayout(null);
      p.setVisible(true);

       f.setVisible(false);
      p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

}


 public static void main(String[] args)
 {
   new  vehicle();
 }
}
