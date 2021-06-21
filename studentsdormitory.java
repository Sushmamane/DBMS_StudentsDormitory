import javax.swing.*;

import java.awt.event.*;  
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
public class STUDORM implements ActionListener {
JFrame f= new JFrame("MAIN PAGE");
JLabel l1,l2, l3, l4, l5, l6,l;
JTextField tf1,tf2,tf3,tf4,tf5,tf6;
JButton bu;
JLabel ll1,ll2, ll3, ll4, ll5, ll6,ll;
JTextField tff1,tff2,tff3,tff4,tff5,tff6;
JLabel li1,li2, li3, li4, li5, li6,li;
JTextField tif1,tif2,tif3,tif4,tif5,tif6;  
    JButton bu1,bu2;
    JLabel L1,L2, L3, L4, L5, L6,L;
    JTextField TF1,TF2,TF3,TF4,TF5,TF6;
    JButton BU;
    JLabel LL1,LL2, LL3, LL4, LL5, LL6,LL;
    JTextField TFF1,TFF2,TFF3,TFF4,TFF5,TFF6;
    JLabel LI1,LI2, LI3, LI4, LI5, LI6,LI;
    JTextField TIF1,TIF2,TIF3,TIF4,TIF5,TIF6;  
    JLabel L01,L22, L33, L44, L55;
    JTextField TF11,TF22,TF33,TF44,TF55;
    JButton BU11;
    JLabel L001,L220, L330, L440, L550; //L6,L;
    JTextField TF111,TF222,TF333,TF444,TF555,TF666;
    JButton BU101;
        JButton BU1,BU2;
        JLabel LI11,LI22, LI33, LI44, LI55, LI66;
        JTextField TIF11,TIF22,TIF33,TIF44,TIF55,TIF66;
        JButton BU202;
        //students
     JLabel jl,jl1,jl2,jl3,jl4,jl5,jl6;
       JTextField jte1,jte2,jte3,jte4,jte5,jte6,jte7;
       JButton jbu1,jbu2,jbu3;
       JLabel jl01,jl11,jl22,jl33,jl44,jl55,jl66;
       JTextField jte11,jt22,jte33,jte44,jte55,jte66,jte77;
       JLabel jl001,jl111,jl222,jl333,jl444,jl555,jl666;
       JTextField jte111,jt222,jte333,jte444,jte555,jte666,jte777;
       //guests
       JLabel jla,jla1,jla2,jla3,jla4,jla5,jla6,jla7;
       JTextField jtex1,jtex2,jtex3,jtex4,jtex5,jtex6,jtex7;
       JButton jbut1,jbut2,jbut3;
       JLabel jla01,jla11,jla22,jla33,jla44,jla55,jla66;
       JTextField jtex11,jtex22,jtex33,jtex44,jtex55,jtex66,jtex77;
       JLabel jla001,jla111,jla222,jla333,jla444,jla555,jla666;
       JTextField jtex111,jtex222,jtex333,jtex444,jtex555,jtex666,jtex777;
       //staff
       JLabel jlab,jlab1,jlab2,jlab3,jlab4,jlab5,jlab6;
       JTextField jtext1,jtext2,jtext3,jtext4,jtext5,jtext6,jtext7;
       JButton jbutt1,jbutt2,jbutt3;
       JLabel jlab01,jlab11,jlab22,jlab33,jlab44,jlab55,jlab66;
       JTextField jtext11,jtext22,jtext33,jtext44,jtext55,jtext66,jtext77;
       JLabel jlab001,jlab111,jlab222,jlab333,jlab444,jlab555,jlab666;
       JTextField jtext111,jtext222,jtext333,jtext444,jtext555,jtext666,jtext777;
       //fee
       JLabel label1,label2,label3,label4,label5;
       JTextField field1,field2,field3,field4,field5;
       JButton button1,button2;
       
    Connection con;
        Statement stmt;
    JFrame p=new JFrame("admin insert");
JFrame q=new JFrame("admin modify");
JFrame r=new JFrame("admin delete");
JFrame s=new JFrame("dormitory insert");
JFrame t=new JFrame("dormitory modify");
JFrame p1=new JFrame("dormitory delete");
JFrame q1=new JFrame("insert room");
JFrame r1=new JFrame("modify room");
JFrame s1=new JFrame("delete room");
JFrame p2=new JFrame("insert student");
JFrame q2=new JFrame("modify student");
JFrame r2=new JFrame("delete student");
JFrame p3=new JFrame("insert guest");
JFrame q3=new JFrame("modify guest");
JFrame r3=new JFrame("delete guest");
JFrame p4=new JFrame("insert staff");
JFrame q4=new JFrame("modify staff");
JFrame r4=new JFrame("delete staff");
JFrame p5=new JFrame("insert fee");
JFrame q5=new JFrame("modify fee");
JFrame r5=new JFrame("delete fee");
JMenuBar mb=new JMenuBar();  
        JMenu menu=new JMenu("ADMIN");
JMenu menu1=new JMenu("DORMITORY");
JMenu menu2=new JMenu("ROOM");  
JMenuItem i1=new JMenuItem("insert admin");
		
        JMenuItem i2=new JMenuItem("modify admin");  
        JMenuItem i3=new JMenuItem("delete admin");
JMenuItem i4=new JMenuItem("insert dorm");  
        JMenuItem i5=new JMenuItem("modify dorm");
JMenuItem i6=new JMenuItem("delete dorm");  
        JMenuItem i7=new JMenuItem("insert room");  
        JMenuItem i8=new JMenuItem("modify room");  
        JMenuItem i9=new JMenuItem("delete room");  
JMenu menu3=new JMenu("STUDENT");  
        JMenuItem a=new JMenuItem("insert student");  
        JMenuItem b=new JMenuItem("modify student");  
        JMenuItem c=new JMenuItem("delete student");  
JMenu menu4=new JMenu("GUEST");  
        JMenuItem a1=new JMenuItem("insert guest");  
        JMenuItem b1=new JMenuItem("modify guest");  
        JMenuItem c1=new JMenuItem("delete guest");  
JMenu menu5=new JMenu("STAFF");  
        JMenuItem a2=new JMenuItem("insert staff");  
        JMenuItem b2=new JMenuItem("modify staff");  
        JMenuItem c2=new JMenuItem("delete staff");
        JMenu menu6=new JMenu("FEE");  
        JMenuItem a3=new JMenuItem("insert fee");  
        JMenuItem b3=new JMenuItem("modify fee");  
        JMenuItem c3=new JMenuItem("delete fee");
        STUDORM(){
   l1=new JLabel("  WELCOME TO STUDENTS DORMITORY  ");  
   l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
   l1.setBounds(20,100,664,76);      
        menu.setForeground(Color.BLACK);
        menu.add(i1);  
        menu.add(i2);  
        menu.add(i3);    
        mb.add(menu);    
        menu1.setForeground(Color.BLACK);
        menu1.add(i4);  
        menu1.add(i5);  
        menu1.add(i6);    
        mb.add(menu1);
        menu2.setForeground(Color.BLACK);
        menu2.add(i7);  
        menu2.add(i8);  
        menu2.add(i9);    
        mb.add(menu2);
        menu3.setForeground(Color.BLACK);
        menu3.add(a);  
        menu3.add(b);  
        menu3.add(c);    
        mb.add(menu3);
        menu4.setForeground(Color.BLACK);
        menu4.add(a1);  
        menu4.add(b1);  
        menu4.add(c1);    
        mb.add(menu4);  
        menu5.setForeground(Color.BLACK);
        menu5.add(a2);  
        menu5.add(b2);  
        menu5.add(c2);    
        mb.add(menu5);
        menu6.setForeground(Color.BLACK);
        menu6.add(a3);  
        menu6.add(b3);  
        menu6.add(c3);    
        mb.add(menu6);
f.getContentPane().setForeground(Color.GRAY);
f.getContentPane().setBackground(Color.CYAN);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q.getContentPane().setBackground(Color.PINK);
r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
r.getContentPane().setBackground(Color.PINK);
f.getContentPane().add(l1);  
        f.setJMenuBar(mb);  
        f.setSize(793,486);  
        f.getContentPane().setLayout(null);  
        f.setVisible(true);
        p.setSize(700,555);
p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p.getContentPane().setBackground(Color.PINK);
q.setSize(700,700);
r.setSize(700,700);
s.setSize(800,800);
s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s.getContentPane().setBackground(Color.YELLOW);
t.setSize(800,800);
t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
t.getContentPane().setBackground(Color.YELLOW);
p1.setSize(800,800);
p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p1.getContentPane().setBackground(Color.YELLOW);
q1.setSize(700,700);
q1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q1.getContentPane().setBackground(Color.LIGHT_GRAY);
r1.setSize(700,700);  
r1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
r1.getContentPane().setBackground(Color.LIGHT_GRAY);
s1.setSize(700,700);
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
s1.getContentPane().setBackground(Color.LIGHT_GRAY);
p2.setSize(700,700);
p2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p2.getContentPane().setBackground(Color.ORANGE);
q2.setSize(700,700);
q2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q2.getContentPane().setBackground(Color.ORANGE);
r2.setSize(700,700);
r2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
r2.getContentPane().setBackground(Color.ORANGE);
p3.setSize(700,700);
p3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p3.getContentPane().setBackground(Color.CYAN);
q3.setSize(700,700);
q3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q3.getContentPane().setBackground(Color.CYAN);
r3.setSize(700,700);
r3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
r3.getContentPane().setBackground(Color.CYAN);
p4.setSize(700,700);
p4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p4.getContentPane().setBackground(Color.GRAY);
q4.setSize(700,700);
q4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q4.getContentPane().setBackground(Color.GRAY);
r4.setSize(700,700);
r4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
r4.getContentPane().setBackground(Color.GRAY);
p5.setSize(700,700);
p5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p5.getContentPane().setBackground(Color.GREEN);
q5.setSize(700,700);
q5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
q5.getContentPane().setBackground(Color.GREEN);
r5.setSize(700,700);
r5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
r5.getContentPane().setBackground(Color.GREEN);





bu=new JButton("SUBMIT_ADMIN");
bu.setFont(new Font("Tahoma", Font.PLAIN, 14));
bu.setBackground(Color.WHITE);
l=new JLabel("    ADMIN INSERTION");
l.setFont(new Font("Tahoma", Font.PLAIN, 18));
l.setVerticalAlignment(SwingConstants.TOP);
l.setBounds(100, 30, 400, 30);
l2 = new JLabel("ADMIN_Id:");  
l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l3 = new JLabel("ADMIN_Name:");  
       l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l4 = new JLabel("ADMIN_MOB:");  
       l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      
tf1 = new JTextField();  
       tf2 = new JTextField();  
       tf3 = new JTextField();  
     
       l2.setBounds(80, 70, 200, 30);  
       l3.setBounds(80, 110, 200, 30);  
       l4.setBounds(80, 150, 200, 30);  
         
       tf1.setBounds(300, 70, 200, 30);  
       tf2.setBounds(300, 110, 200, 30);  
       tf3.setBounds(300, 150, 200, 30);  
       //tf4.setBounds(300, 190, 200, 30);  
       //tf5.setBounds(300, 230, 200, 30);
       bu.setBounds(170, 350, 150, 30);
p.getContentPane().add(tf1);p.getContentPane().add(tf2);p.getContentPane().add(tf3);
//p.getContentPane().add(tf4);p.getContentPane().add(tf5);
p.getContentPane().add(bu);p.getContentPane().add(l2);p.getContentPane().add(l3);p.getContentPane().add(l4);
//p.getContentPane().add(l5);p.getContentPane().add(l6);
p.getContentPane().add(l);
bu.addActionListener(this);

bu1=new JButton("MODIFY_ADMIN");
bu1.setFont(new Font("Tahoma", Font.PLAIN, 14));
bu1.setBackground(Color.WHITE);
ll=new JLabel("    ADMIN MODIFICATION");
ll.setFont(new Font("Tahoma", Font.PLAIN, 16));
ll.setVerticalAlignment(SwingConstants.TOP);
ll.setBounds(100, 30, 400, 30);
ll2 = new JLabel("ADMIN_Id:");  
ll2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll3 = new JLabel("ADMIN_Name:");  
       ll3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll4 = new JLabel("ADMIN_mob:");  
       ll4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      /* ll5 = new JLabel("Password:");  
       ll5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll6 = new JLabel("Address:");
       ll6.setFont(new Font("Tahoma", Font.PLAIN, 14)); */
       tff1 = new JTextField();  
       tff2 = new JTextField();  
       tff3 = new JTextField();  
      // tff4 = new JTextField();  
       //tff5 = new JTextField();
       ll2.setBounds(80, 70, 200, 30);  
       ll3.setBounds(80, 110, 200, 30);  
       ll4.setBounds(80, 150, 200, 30);  
      // ll5.setBounds(80, 190, 200, 30);
//ll6.setBounds(80, 230, 200, 30);  
       tff1.setBounds(300, 70, 200, 30);  
       tff2.setBounds(300, 110, 200, 30);  
       tff3.setBounds(300, 150, 200, 30);  
       //tff4.setBounds(300, 190, 200, 30);  
       //tff5.setBounds(300, 230, 200, 30);
       bu1.setBounds(170, 350, 150, 30);
q.getContentPane().add(tff1);q.getContentPane().add(tff2);q.getContentPane().add(tff3);
//q.getContentPane().add(tff4);q.getContentPane().add(tff5);
q.getContentPane().add(bu1);q.getContentPane().add(ll2);q.getContentPane().add(ll3);q.getContentPane().add(ll4);
//q.getContentPane().add(ll5);q.getContentPane().add(ll6);
q.getContentPane().add(ll);
bu1.addActionListener(this);

bu2=new JButton("DELETE_ADMIN");
bu2.setFont(new Font("Tahoma", Font.PLAIN, 14));
bu2.setBackground(Color.WHITE);
li=new JLabel("   ADMIN DELETION");
li.setFont(new Font("Tahoma", Font.PLAIN, 18));
li.setVerticalAlignment(SwingConstants.TOP);
li.setBounds(100, 30, 400, 30);
li2 = new JLabel("ADMIN_Id:");  
li2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li3 = new JLabel("ADMIN_Name:");  
       li3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li4 = new JLabel("ADMIN_mob:");  
       li4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       /*li5 = new JLabel("Password:");  
       li5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li6 = new JLabel("Address:");
       li6.setFont(new Font("Tahoma", Font.PLAIN, 14)); */
tif1 = new JTextField();  
       tif2 = new JTextField();  
       tif3 = new JTextField();  
       //tif4 = new JTextField();  
       //tif5 = new JTextField();
       li2.setBounds(80, 70, 200, 30);  
       li3.setBounds(80, 110, 200, 30);  
       li4.setBounds(80, 150, 200, 30);  
       //li5.setBounds(80, 190, 200, 30);
//li6.setBounds(80, 230, 200, 30);  
       tif1.setBounds(300, 70, 200, 30);  
       tif2.setBounds(300, 110, 200, 30);  
       tif3.setBounds(300, 150, 200, 30);  
      // tif4.setBounds(300, 190, 200, 30);  
       //tif5.setBounds(300, 230, 200, 30);
       bu2.setBounds(170, 350, 150, 30);
r.getContentPane().add(tif1);r.getContentPane().add(tif2);r.getContentPane().add(tif3);
//r.getContentPane().add(tif4);r.getContentPane().add(tif5);
r.getContentPane().add(bu2);r.getContentPane().add(li2);r.getContentPane().add(li3);r.getContentPane().add(li4);
//r.getContentPane().add(li5);r.getContentPane().add(li6);
r.getContentPane().add(li);
bu2.addActionListener(this);

BU=new JButton("SUBMIT_DORM");
BU.setFont(new Font("Tahoma", Font.PLAIN, 14));
BU.setBackground(Color.WHITE);
L=new JLabel("   DORMITORY INSERTION");
L.setFont(new Font("Tahoma", Font.PLAIN, 18));
L.setVerticalAlignment(SwingConstants.TOP);
L.setBounds(100, 30, 400, 30);
L2 = new JLabel("DORM_Id:");  
L2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L3 = new JLabel("NO.OF STU");  
       L3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L4 = new JLabel("NO.OF ROOMS:");  
       L4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L5 = new JLabel("DORM_ADDR:");  
       L5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       TF1 = new JTextField();  
       TF2 = new JTextField();  
       TF3 = new JTextField();  
       TF4 = new JTextField();  
       //tf5 = new JTextField();
       L2.setBounds(80, 70, 200, 30);  
       L3.setBounds(80, 110, 200, 30);  
       L4.setBounds(80, 150, 200, 30);  
       L5.setBounds(80, 190, 200, 30);
//l6.setBounds(80, 230, 200, 30);  
       TF1.setBounds(300, 70, 200, 30);  
       TF2.setBounds(300, 110, 200, 30);  
       TF3.setBounds(300, 150, 200, 30);  
       TF4.setBounds(300, 190, 200, 30);  
       //tf5.setBounds(300, 230, 200, 30);
       BU.setBounds(170, 350, 150, 30);
s.getContentPane().add(TF1);s.getContentPane().add(TF2);s.getContentPane().add(TF3);
s.getContentPane().add(TF4);
//p.getContentPane().add(tf5);
s.getContentPane().add(BU);s.getContentPane().add(L2);s.getContentPane().add(L3);s.getContentPane().add(L4);
s.getContentPane().add(L5);
//p.getContentPane().add(l6);
s.getContentPane().add(L);
BU.addActionListener(this);


BU1=new JButton("MODIFY_DORM");
BU1.setFont(new Font("Tahoma", Font.PLAIN, 14));
BU1.setBackground(Color.WHITE);
LL=new JLabel("    DORM MODIFICATION");
LL.setFont(new Font("Tahoma", Font.PLAIN, 16));
LL.setVerticalAlignment(SwingConstants.TOP);
LL.setBounds(100, 30, 400, 30);
LL2 = new JLabel("DORM_Id:");  
LL2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LL3 = new JLabel("NO.OF STU:");  
       LL3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LL4 = new JLabel("NO.OF ROOMS:");  
       LL4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      LL5 = new JLabel("DORM_ADDR");  
       LL5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       //ll6 = new JLabel("Address:");
       //ll6.setFont(new Font("Tahoma", Font.PLAIN, 14)); */
       TFF1 = new JTextField();  
       TFF2 = new JTextField();  
       TFF3 = new JTextField();  
      TFF4 = new JTextField();  
       //tff5 = new JTextField();
       LL2.setBounds(80, 70, 200, 30);  
       LL3.setBounds(80, 110, 200, 30);  
       LL4.setBounds(80, 150, 200, 30);  
      LL5.setBounds(80, 190, 200, 30);
//ll6.setBounds(80, 230, 200, 30);  
       TFF1.setBounds(300, 70, 200, 30);  
       TFF2.setBounds(300, 110, 200, 30);  
       TFF3.setBounds(300, 150, 200, 30);  
       TFF4.setBounds(300, 190, 200, 30);  
       //tff5.setBounds(300, 230, 200, 30);
       BU1.setBounds(170, 350, 150, 30);
t.getContentPane().add(TFF1);t.getContentPane().add(TFF2);t.getContentPane().add(TFF3);
t.getContentPane().add(TFF4);
//q.getContentPane().add(tff5);
t.getContentPane().add(BU1);t.getContentPane().add(LL2);t.getContentPane().add(LL3);t.getContentPane().add(LL4);
t.getContentPane().add(LL5);
//q.getContentPane().add(ll6);
t.getContentPane().add(LL);
BU1.addActionListener(this);




BU2=new JButton("DELETE_dorm");
BU2.setFont(new Font("Tahoma", Font.PLAIN, 14));
BU2.setBackground(Color.WHITE);
LI=new JLabel("   DORMITORY DELETION");
LI.setFont(new Font("Tahoma", Font.PLAIN, 18));
LI.setVerticalAlignment(SwingConstants.TOP);
LI.setBounds(100, 30, 400, 30);
LI2 = new JLabel("DORM_Id:");  
LI2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LI3 = new JLabel("NO.OF STU:");  
       LI3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LI4 = new JLabel("NO.OF ROOMS:");  
       LI4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LI5 = new JLabel("DORM_ADDR:");  
       LI5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       //li6 = new JLabel("Address:");
       //li6.setFont(new Font("Tahoma", Font.PLAIN, 14)); */
        TIF1 = new JTextField();  
       TIF2 = new JTextField();  
       TIF3 = new JTextField();  
       TIF4 = new JTextField();  
       //tif5 = new JTextField();
       LI2.setBounds(80, 70, 200, 30);  
       LI3.setBounds(80, 110, 200, 30);  
       LI4.setBounds(80, 150, 200, 30);  
       LI5.setBounds(80, 190, 200, 30);
//li6.setBounds(80, 230, 200, 30);  
       TIF1.setBounds(300, 70, 200, 30);  
       TIF2.setBounds(300, 110, 200, 30);  
       TIF3.setBounds(300, 150, 200, 30);  
        TIF4.setBounds(300, 190, 200, 30);  
       //tif5.setBounds(300, 230, 200, 30);
       BU2.setBounds(170, 350, 150, 30);
p1.getContentPane().add(TIF1);p1.getContentPane().add(TIF2);p1.getContentPane().add(TIF3);
p1.getContentPane().add(TIF4);
//r.getContentPane().add(tif5);
p1.getContentPane().add(BU2);p1.getContentPane().add(LI2);p1.getContentPane().add(LI3);p1.getContentPane().add(LI4);
p1.getContentPane().add(LI5);
//r.getContentPane().add(li6);
p1.getContentPane().add(LI);


BU11=new JButton("SUBMIT_ROOM");
BU11.setFont(new Font("Tahoma", Font.PLAIN, 14));
BU11.setBackground(Color.WHITE);
L01=new JLabel("   ROOM INSERTION");
L01.setFont(new Font("Tahoma", Font.PLAIN, 18));
L01.setVerticalAlignment(SwingConstants.TOP);
L01.setBounds(100, 30, 400, 30);
L22 = new JLabel("ROOM_Id:");  
L22.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L33 = new JLabel("NO.OF BEDS");  
       L33.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L44 = new JLabel("NO.OF STUD:");  
       L44.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L55 = new JLabel("Rooms_CONDI:");  
       L55.setFont(new Font("Tahoma", Font.PLAIN, 14));
       TF11 = new JTextField();  
       TF22 = new JTextField();  
       TF33 = new JTextField();  
       TF44 = new JTextField();  
       //tf5 = new JTextField();
       L22.setBounds(80, 70, 200, 30);  
       L33.setBounds(80, 110, 200, 30);  
       L44.setBounds(80, 150, 200, 30);  
       L55.setBounds(80, 190, 200, 30);
//l6.setBounds(80, 230, 200, 30);  
       TF11.setBounds(300, 70, 200, 30);  
       TF22.setBounds(300, 110, 200, 30);  
       TF33.setBounds(300, 150, 200, 30);  
       TF44.setBounds(300, 190, 200, 30);  
       //tf5.setBounds(300, 230, 200, 30);
       BU11.setBounds(170, 350, 150, 30);
q1.getContentPane().add(TF11);q1.getContentPane().add(TF22);q1.getContentPane().add(TF33);
q1.getContentPane().add(TF44);
//p.getContentPane().add(tf5);
q1.getContentPane().add(BU11);q1.getContentPane().add(L22);q1.getContentPane().add(L33);q1.getContentPane().add(L44);
q1.getContentPane().add(L55);
//p.getContentPane().add(l6);
q1.getContentPane().add(L01);
BU11.addActionListener(this);
//modify room
BU101=new JButton("MODIFY_ROOM");
BU101.setFont(new Font("Tahoma", Font.PLAIN, 14));
BU101.setBackground(Color.WHITE);
L001=new JLabel("   ROOM MODIFICATION");
L001.setFont(new Font("Tahoma", Font.PLAIN, 18));
L001.setVerticalAlignment(SwingConstants.TOP);
L001.setBounds(100, 30, 400, 30);
L220 = new JLabel("ROOM_Id:");  
L220.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L330= new JLabel("NO.OF BEDS");  
       L330.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L440 = new JLabel("NO.OF STUD:");  
       L440.setFont(new Font("Tahoma", Font.PLAIN, 14));
       L550 = new JLabel("Rooms_CONDI:");  
       L550.setFont(new Font("Tahoma", Font.PLAIN, 14));
       TF111 = new JTextField();  
       TF222 = new JTextField();  
       TF333 = new JTextField();  
       TF444 = new JTextField();  
       //tf5 = new JTextField();
       L220.setBounds(80, 70, 200, 30);  
       L330.setBounds(80, 110, 200, 30);  
       L440.setBounds(80, 150, 200, 30);  
       L550.setBounds(80, 190, 200, 30);
//l6.setBounds(80, 230, 200, 30);  
       TF111.setBounds(300, 70, 200, 30);  
       TF222.setBounds(300, 110, 200, 30);  
       TF333.setBounds(300, 150, 200, 30);  
       TF444.setBounds(300, 190, 200, 30);  
       //tf5.setBounds(300, 230, 200, 30);
       BU101.setBounds(170, 350, 150, 30);
r1.getContentPane().add(TF111);r1.getContentPane().add(TF222);r1.getContentPane().add(TF333);
r1.getContentPane().add(TF444);
//p.getContentPane().add(tf5);
r1.getContentPane().add(BU101);r1.getContentPane().add(L220);r1.getContentPane().add(L330);r1.getContentPane().add(L440);
r1.getContentPane().add(L550);
//p.getContentPane().add(l6);
r1.getContentPane().add(L001);
BU101.addActionListener(this);

BU202=new JButton("DELETE_room");
BU202.setFont(new Font("Tahoma", Font.PLAIN, 14));
BU202.setBackground(Color.WHITE);
LI11=new JLabel("  ROOM DELETION");
LI11.setFont(new Font("Tahoma", Font.PLAIN, 18));
LI11.setVerticalAlignment(SwingConstants.TOP);
LI11.setBounds(100, 30, 400, 30);
LI22 = new JLabel("Room_Id:");  
LI22.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LI33 = new JLabel("NO.OF BEDS:");  
       LI33.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LI44 = new JLabel("NO.OF STUD:");  
       LI44.setFont(new Font("Tahoma", Font.PLAIN, 14));
       LI55 = new JLabel("ROOM_CONDI:");  
       LI55.setFont(new Font("Tahoma", Font.PLAIN, 14));
       //li6 = new JLabel("Address:");
       //li6.setFont(new Font("Tahoma", Font.PLAIN, 14)); */
        TIF11 = new JTextField();  
       TIF22 = new JTextField();  
       TIF33 = new JTextField();  
       TIF44 = new JTextField();  
       //tif5 = new JTextField();
       LI22.setBounds(80, 70, 200, 30);  
       LI33.setBounds(80, 110, 200, 30);  
       LI44.setBounds(80, 150, 200, 30);  
       LI55.setBounds(80, 190, 200, 30);
//li6.setBounds(80, 230, 200, 30);  
       TIF11.setBounds(300, 70, 200, 30);  
       TIF22.setBounds(300, 110, 200, 30);  
       TIF33.setBounds(300, 150, 200, 30);  
        TIF44.setBounds(300, 190, 200, 30);  
       //tif5.setBounds(300, 230, 200, 30);
       BU202.setBounds(170, 350, 150, 30);
s1.getContentPane().add(TIF11);s1.getContentPane().add(TIF22);s1.getContentPane().add(TIF33);
s1.getContentPane().add(TIF44);
//r.getContentPane().add(tif5);
s1.getContentPane().add(BU202);s1.getContentPane().add(LI22);s1.getContentPane().add(LI33);s1.getContentPane().add(LI44);
s1.getContentPane().add(LI55);
//r.getContentPane().add(li6);
s1.getContentPane().add(LI11);
BU202.addActionListener(this);

//inser student
jbu1=new JButton("SUBMIT_STUD");
jbu1.setFont(new Font("Tahoma", Font.PLAIN, 14));
jbu1.setBackground(Color.WHITE);
jl=new JLabel("   STUDENT INSERTION");
jl.setFont(new Font("Tahoma", Font.PLAIN, 18));
jl.setVerticalAlignment(SwingConstants.TOP);
jl.setBounds(100, 30, 400, 30);
jl1 = new JLabel("STU_Id:");  
jl1.setFont(new Font("Tahoma", Font.PLAIN, 14));                          //GOV_ID,ROOM_ID
       jl2 = new JLabel("STU_NAME");  
       jl2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       jl3 = new JLabel("GAU_NAME:");  
       jl3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       jl4 = new JLabel("STU_MOB:");  
       jl4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       jl5 = new JLabel("GOV_ID:");
       jl5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       jl6 = new JLabel("ROOM_ID:");
       jl6.setFont(new Font("Tahoma", Font.PLAIN, 14));
       jte1 = new JTextField();  
       jte2 = new JTextField();  
       jte3 = new JTextField();  
       jte4 = new JTextField();  
       jte5 = new JTextField();
       jte6 = new JTextField();
       jl1.setBounds(80, 70, 200, 30);  
       jl2.setBounds(80, 110, 200, 30);  
       jl3.setBounds(80, 150, 200, 30);  
       jl4.setBounds(80, 190, 200, 30);
       jl5.setBounds(80, 230, 200, 30);  
       jl6.setBounds(80, 260, 200, 30);
       jte1.setBounds(300, 70, 200, 30);  
       jte2.setBounds(300, 110, 200, 30);  
       jte3.setBounds(300, 150, 200, 30);  
       jte4.setBounds(300, 190, 200, 30);  
       jte5.setBounds(300, 230, 200, 30);
       jte6.setBounds(300, 260, 200, 30);
       jbu1.setBounds(170, 350, 150, 30);
p2.getContentPane().add(jte1);p2.getContentPane().add(jte2);p2.getContentPane().add(jte3);
p2.getContentPane().add(jte4);p2.getContentPane().add(jte5);p2.getContentPane().add(jte6);

p2.getContentPane().add(jbu1);p2.getContentPane().add(jl1);p2.getContentPane().add(jl2);p2.getContentPane().add(jl3);
p2.getContentPane().add(jl4);p2.getContentPane().add(jl5);p2.getContentPane().add(jl6);
p2.getContentPane().add(jl);
jbu1.addActionListener(this);
//do here modify and delete of student

//insert guests
jbut1=new JButton("SUBMIT_GUEST");
jbut1.setFont(new Font("Tahoma", Font.PLAIN, 14));
jbut1.setBackground(Color.WHITE);
jla=new JLabel(" GUEST INSERTION");
jla.setFont(new Font("Tahoma", Font.PLAIN, 18));
jla.setVerticalAlignment(SwingConstants.TOP);
jla.setBounds(100, 30, 400, 30);
jla1 = new JLabel("DATE:");  
jla1.setFont(new Font("Tahoma", Font.PLAIN, 14));                          
     jla2 = new JLabel("GUEST_NAME");  
     jla2.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jla3 = new JLabel("STU_ID:");  
     jla3.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jla4 = new JLabel("TIME_IN:");  
     jla4.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jla5 = new JLabel("TIME_OUT:");
     jla5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    // jla6 = new JLabel("ROOM_ID:");
     //jla6.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jtex1 = new JTextField();  
     jtex2 = new JTextField();  
     jtex3 = new JTextField();  
     jtex4 = new JTextField();  
     jtex5 = new JTextField();
     //jte6 = new JTextField();
     jla1.setBounds(80, 70, 200, 30);  
     jla2.setBounds(80, 110, 200, 30);  
     jla3.setBounds(80, 150, 200, 30);  
     jla4.setBounds(80, 190, 200, 30);
      jla5.setBounds(80, 230, 200, 30);  
     //jl6.setBounds(80,260,200,30);
      jtex1.setBounds(300, 70, 200, 30);  
     jtex2.setBounds(300, 110, 200, 30);  
     jtex3.setBounds(300, 150, 200, 30);  
     jtex4.setBounds(300, 190, 200, 30);  
     jtex5.setBounds(300, 230, 200, 30);
    // jtex6.setBounds(300, 260, 200, 30);
     jbut1.setBounds(170, 350, 150, 30);
p3.getContentPane().add(jtex1);p3.getContentPane().add(jtex2);p3.getContentPane().add(jtex3);
p3.getContentPane().add(jtex4);p3.getContentPane().add(jtex5);//p3.getContentPane().add(jtex6);

p3.getContentPane().add(jbut1);p3.getContentPane().add(jla1);p3.getContentPane().add(jla2);p3.getContentPane().add(jla3);
p3.getContentPane().add(jla4);p3.getContentPane().add(jla5);
p3.getContentPane().add(jla);

jbut1.addActionListener(this);

//do modify and delete guests

//insert staff
jbutt1=new JButton("SUBMIT_STAFF");
jbutt1.setFont(new Font("Tahoma", Font.PLAIN, 14));
jbutt1.setBackground(Color.WHITE);
jlab=new JLabel(" STAFF INSERTION");
jlab.setFont(new Font("Tahoma", Font.PLAIN, 18));
jlab.setVerticalAlignment(SwingConstants.TOP);
jlab.setBounds(100, 30, 400, 30);//DO FROM HERE
jlab1 = new JLabel("STAFF_ID:");  
jlab1.setFont(new Font("Tahoma", Font.PLAIN, 14));                          //GOV_ID,ROOM_ID
     jlab2 = new JLabel("STAFF_NAME:");  
     jlab2.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jlab3 = new JLabel("STAFF_MOB:");  
     jlab3.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jlab4 = new JLabel("STAFF_ADD:");  
     jlab4.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jlab5 = new JLabel("SALARY:");
     jlab5.setFont(new Font("Tahoma", Font.PLAIN, 14));
    // jla6 = new JLabel("ROOM_ID:");
     //jla6.setFont(new Font("Tahoma", Font.PLAIN, 14));
     jtext1 = new JTextField();  
     jtext2 = new JTextField();  
     jtext3 = new JTextField();  
     jtext4 = new JTextField();  
     jtext5 = new JTextField();
     //jte6 = new JTextField();
     jlab1.setBounds(80, 70, 200, 30);  
     jlab2.setBounds(80, 110, 200, 30);  
     jlab3.setBounds(80, 150, 200, 30);  
     jlab4.setBounds(80, 190, 200, 30);
     jlab5.setBounds(80, 230, 200, 30);  
     //jl6.setBounds(80,260,200,30);
      jtext1.setBounds(300, 70, 200, 30);  
     jtext2.setBounds(300, 110, 200, 30);  
     jtext3.setBounds(300, 150, 200, 30);  
     jtext4.setBounds(300, 190, 200, 30);  
     jtext5.setBounds(300, 230, 200, 30);
    // jtext6.setBounds(300, 260, 200, 30);
     jbutt1.setBounds(170, 350, 150, 30);
p4.getContentPane().add(jtext1);p4.getContentPane().add(jtext2);p4.getContentPane().add(jtext3);
p4.getContentPane().add(jtext4);p4.getContentPane().add(jtext5);//p4.getContentPane().add(jtext6);

p4.getContentPane().add(jbutt1);p4.getContentPane().add(jlab1);p4.getContentPane().add(jlab2);p4.getContentPane().add(jlab3);
p4.getContentPane().add(jlab4);p4.getContentPane().add(jlab5);p4.getContentPane().add(jlab);

jbutt1.addActionListener(this);

//do modify and delete of staff

//insert fee
button1=new JButton("SUBMIT_FEE");
button1.setFont(new Font("Tahoma", Font.PLAIN, 14));
button1.setBackground(Color.WHITE);
label1=new JLabel("    FEE INSERTION");
label1.setFont(new Font("Tahoma", Font.PLAIN, 18));
label1.setVerticalAlignment(SwingConstants.TOP);
label1.setBounds(100, 30, 400, 30);
label2 = new JLabel("Month:");  
label2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       label3 = new JLabel("IS FEE paid:");  
       label3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       label4 = new JLabel("STU_ID:");  
       label4.setFont(new Font("Tahoma", Font.PLAIN, 14));
      
field1 = new JTextField();  
       field2 = new JTextField();  
       field3 = new JTextField();  
     
       label2.setBounds(80, 70, 200, 30);  
       label3.setBounds(80, 110, 200, 30);  
       label4.setBounds(80, 150, 200, 30);  
         
       field1.setBounds(300, 70, 200, 30);  
       field2.setBounds(300, 110, 200, 30);  
       field3.setBounds(300, 150, 200, 30);  
       //tf4.setBounds(300, 190, 200, 30);  
       //tf5.setBounds(300, 230, 200, 30);
       button1.setBounds(170, 350, 150, 30);
p5.getContentPane().add(field1);p5.getContentPane().add(field2);p5.getContentPane().add(field3);
//p.getContentPane().add(tf4);p.getContentPane().add(tf5);
p5.getContentPane().add(button1);p5.getContentPane().add(label2);p5.getContentPane().add(label3);p5.getContentPane().add(label4);
//p.getContentPane().add(l5);p.getContentPane().add(l6);
p5.getContentPane().add(label1);
button1.addActionListener(this);







i1.addActionListener(this);
i2.addActionListener(this);
i3.addActionListener(this);
i4.addActionListener(this);
i5.addActionListener(this);
i6.addActionListener(this);
i7.addActionListener(this);
i8.addActionListener(this);
i9.addActionListener(this);
a.addActionListener(this);
b.addActionListener(this);
c.addActionListener(this);
a1.addActionListener(this);
b1.addActionListener(this);
c1.addActionListener(this);
a2.addActionListener(this);
b2.addActionListener(this);
c2.addActionListener(this);
a3.addActionListener(this);
b3.addActionListener(this);
c3.addActionListener(this);


}

public void actionPerformed(ActionEvent e) {    
if(e.getSource()==i1) {
p.setVisible(true);
bu.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = tf1.getText();  
           String s2 = tf2.getText();  
           String s3 =  tf3.getText();
           //String s4 = tf4.getText();  
           //String s5 = tf5.getText();  
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into admin values(?,?,?)");  
                   ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   //ps.setString(4, s4);  
                   //ps.setString(5, s5);  
           
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(bu, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception ex)  
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(bu, "not possible");  
           }  
         }  
         
}
});
 }
if(e.getSource()==i2){
q.setVisible(true);
bu1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x=0;  
           String s1 = tff1.getText();  
           String s2 = tff2.getText();  
           String s3 = tff3.getText();
          // String s4 = tff4.getText();  
           //String s5 = tff5.getText();  
           //String s6 = tff6.getText();  
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");
   //String query="update admin set admin_name=? ,admin_mob=? "+"where admin_id=?";
    PreparedStatement ps = con.prepareStatement("update admin set admin_name=? ,admin_mob=? where admin_id=?");  
                  ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   //ps.setString(4, s5);  
                   //ps.setString(5, s1);
                   //ResultSet rs = 
                    ps.executeUpdate();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(bu1, "Data Updated Successfully");  
                   }  
               }  
               catch (Exception ex)  
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(bu1, "not possible");  
           }  
         }  
         
}
});

}
if(e.getSource()==i3) {
r.setVisible(true);
String s1 = tif1.getText();
bu2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
        {  
           int x = 0;   
           //String s1 = tif1.getText();
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");
String query="delete from admin where admin_id=?";
    PreparedStatement ps = con.prepareStatement(query);
                   ps.setString(1, s1);  
                   //ResultSet rs =
                   ps.executeUpdate();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(bu2, "Data Deleted Successfully");  
                   }  
//conn.close();
               }  
               catch (Exception ex)  
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(bu2, "not possible");  
           }  
         }  
         
}
});

}
//public void actionPerformed(ActionEvent e) {
if(e.getSource()==i4) {
s.setVisible(true);
BU.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s11 = TF1.getText();  
           String s22 = TF2.getText();  
           String s33 =  TF3.getText();
           String s44 = TF4.getText();  
           //String s5 = tf5.getText();  
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into dormitory values(?,?,?,?)");  
                   ps.setString(1, s11);  
                   ps.setString(2, s22);  
                   ps.setString(3, s33);  
                   ps.setString(4, s44);  
                   //ps.setString(5, s5);  
           
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(BU, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception ex1)  
               {  
                   System.out.println(ex1);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(BU, "not possible");  
           }  
         }  
         
}
});
 }

if(e.getSource()==i5) {      
t.setVisible(true);
BU1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s111 = TFF1.getText();  
           String s222 = TFF2.getText();  
           String s333 = TFF3.getText();
           String s444 = TFF4.getText();  
           //String s5 = tff5.getText();  
           //String s6 = tff6.getText();  
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");
   String query="update dormitory set ns=? , nr =?, dorm_add=? "+"where DORM_ID=?";
    PreparedStatement ps = con.prepareStatement(query);  
                  ps.setString(1, s111);  
                   ps.setString(2, s222);  
                   ps.setString(3, s333);  
                   ps.setString(4, s444);  
                   //ps.setString(5, s1);
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(BU1, "Data Updated Successfully");  
                   }  
               }  
               catch (Exception ex2)  
               {  
                   System.out.println(ex2);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(BU1, "not possible");  
           }  
         }  
         
}
});

}
if(e.getSource()==i6) {   
p1.setVisible(true);
String s1 = TIF1.getText();
BU2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
        {  
           int x = 0;   
         
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");
                   String query="delete from dormitory where dorm_id=?";
                     PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, s1);  
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(BU2, "Data Deleted Successfully");  
                   }  

               }  
               catch (Exception ex3)  
               {  
                   System.out.println(ex3);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(BU2, "not possible");  
           }  
         }  
         
}
});

}

if(e.getSource()==i7) {
q1.setVisible(true);
BU11.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s01 = TF11.getText();  
           String s02 = TF22.getText();  
           String s03 =  TF33.getText();
           String s04 = TF44.getText();  
           //String s5 = tf5.getText();  
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into room values(?,?,?,?)");  
                   ps.setString(1, s01);  
                   ps.setString(2, s02);  
                   ps.setString(3, s03);  
                   ps.setString(4, s04);  
                   //ps.setString(5, s5);  
           
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(BU11, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception exa1)  
               {  
                   System.out.println(exa1);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(BU11, "not possible");  
           }  
         }  
         
}
});
 }


if(e.getSource()==i8) {      
r1.setVisible(true);
BU101.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String a1 = TF111.getText();  
           String a2 = TF222.getText();  
           String a3 = TF333.getText();
           String a4 = TF444.getText();  
           //String s5 = tff5.getText();  
           //String s6 = tff6.getText();  
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");
   String query="update room  set nbr=? , nsr =?, con=? "+"where room_id=?";
    PreparedStatement ps = con.prepareStatement(query);  
                  ps.setString(1, a1);  
                   ps.setString(2, a2);  
                   ps.setString(3, a3);  
                   ps.setString(4, a4);  
                   //ps.setString(5, s1);
                   //ResultSet rs = 
                   ps.executeUpdate();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(BU101, "Data Updated Successfully");  
                   }  
               }  
               catch (Exception eexa2)  
               {  
                   System.out.println(eexa2);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(BU101, "not possible");  
           }  
         }  
         
}
});
}

if(e.getSource()==i9) {
s1.setVisible(true);
String s1 = TIF11.getText();
BU202.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
        {  
           int x = 0;   
           //String s1 = tif1.getText();
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");
String query="delete from room where room_id=?";
    PreparedStatement ps = con.prepareStatement(query);
ps.setString(1, s1);  
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(BU202, "Data Deleted Successfully");  
                   }  
//conn.close();
               }  
               catch (Exception ex)  
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(BU202, "not possible");  
           }  
         }  
         
}
});

}
if(e.getSource()==a) {    
p2.setVisible(true);
jbu1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = jte1.getText();  
           String s2 = jte2.getText();  
           String s3 =  jte3.getText();
           String s4 = jte4.getText();  
           String s5 = jte5.getText(); 
           String s6 = jte6.getText();
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into stud values(?,?,?,?,?,?)");  
                   ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   ps.setString(4, s4);  
                   ps.setString(5, s5);  
                   ps.setString(6, s6);
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(jbu1, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception exb)  
               {  
                   System.out.println(exb);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(jbu1, "not possible");  
           }  
         }  
         
}
});
 }



if(e.getSource()==b)        
q2.setVisible(true);
if(e.getSource()==c)        
r2.setVisible(true);
if(e.getSource()==a1) {	
p3.setVisible(true);
jbut1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = jtex1.getText();  
           String s2 = jtex2.getText();  
           String s3 =  jtex3.getText();
           String s4 = jtex4.getText();  
           String s5 = jtex5.getText(); 
           //String s6 = jtex6.getText();
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into guest values(?,?,?,?,?)");  
                   ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   ps.setString(4, s4);  
                   ps.setString(5, s5);  
                   //ps.setString(6, s6);
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(jbut1, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception exb1)  
               {  
                   System.out.println(exb1);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(jbut1, "not possible");  
           }  
         }  
         
}
});
 }


if(e.getSource()==b1)        
q3.setVisible(true);
if(e.getSource()==c1)        
r3.setVisible(true);
if(e.getSource()==a2) {      
p4.setVisible(true);
jbutt1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = jtext1.getText();  
           String s2 = jtext2.getText();  
           String s3 =  jtext3.getText();
           String s4 = jtext4.getText();  
           String s5 = jtext5.getText(); 
           //String s6 = jtext6.getText();
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into staff values(?,?,?,?,?)");  
                   ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   ps.setString(4, s4);  
                   ps.setString(5, s5);  
                   //ps.setString(6, s6);
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(jbutt1, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception exb3)  
               {  
                   System.out.println(exb3);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(jbutt1, "not possible");  
           }  
         }  
         
}
});
 }





if(e.getSource()==b2)        
q4.setVisible(true);
if(e.getSource()==c2)        
r4.setVisible(true);

if(e.getSource()==a3) {        
p5.setVisible(true);
button1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = field1.getText();  
           String s2 = field2.getText();  
           String s3 =  field3.getText();
           //String s4 = tf4.getText();  
           //String s5 = tf5.getText();  
           
           if (true)
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sushma","vasavi");  
                   PreparedStatement ps = con.prepareStatement("insert into fee values(?,?,?)");  
                   ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   //ps.setString(4, s4);  
                   //ps.setString(5, s5);  
           
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)  
                   {  
                       JOptionPane.showMessageDialog(button1, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception exi)  
               {  
                   System.out.println(exi);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(button1, "not possible");  
           }  
         }  
         
}
});
 }

if(e.getSource()==b3)        
q5.setVisible(true);
if(e.getSource()==c3)        
r5.setVisible(true);





}


public static void main(String[] args) {

new STUDORM();
}

}