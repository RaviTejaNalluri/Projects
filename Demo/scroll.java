import javax.swing.*;  
class Scroll
{  
Scroll(){  
    JFrame f= new JFrame("Scrollbar Example");  
 JScrollBar s=new JScrollBar();  
s.setBounds(370,10, 10,100);  
f.add(s);  
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String args[])  
{  
new Scroll();  
}}  







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
      b4.setBounds(850,600,150,100);
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
      label = new JLabel("Welcome:"+value1);
      label.setBounds(800,200,400,100);
      JLabel lab=new JLabel("Enter the vehicle number");
      lab.setBounds(500,400,250,50);
      JTextField tf3=new JTextField();
      tf3.setBounds(800,400,250,50);
      JButton cont=new JButton("Continue");
      cont.setBounds(600,650,250,50);
      cont.addActionListener(new ActionListener(){
    
      
      page.add(lab);
      page.add(tf3);
      page.add(cont);
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
      p.add(pass);
      p.add(b4);  
      p.setSize(1920,1080);
      p.getContentPane().setBackground(Color.ORANGE);
      p.setLayout(null);
      p.setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
  }