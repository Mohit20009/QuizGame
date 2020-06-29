package quiz_game;
import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
public class Quiz_Game {

    public static void main(String[] args) {
        Game ob= new Game();
    }
}
    class Game extends JFrame implements ActionListener
    {
        static int i=0, l=1,k=0;
        private static String Q[]= new String[20];
        private  static String Ae[]= new String[20];
        private  static String Bf[]= new String[20];
        private  static String Cg[]= new String[20];
        private  static String Dh[]= new String[20];
        private static String Oo[]= new String[20];
        private static String TA[]= new String[4];
        private static String TB[]= new String[4];
        private static String TC[]= new String[4];
        private static String TD[]= new String[4];
        private static int score[]= new int[20];
        static int i1=0, l1=1, z=0;
        private static String Q1[]= new String[20];
        private static String Ae1[]= new String[20];
        private  static String Bf1[]= new String[20];
        private  static String Cg1[]= new String[20];
        private static String Dh1[]= new String[20];
        private  static String Oo1[]= new String[20];
        static int i2=0, l2=1, y=0;
        private  static String Q2[]= new String[20];
        private static String Ae2[]= new String[20];
        private  static String Bf2[]= new String[20];
        private static String Cg2[]= new String[20];
        private static String Dh2[]= new String[20];
        private static String Oo2[]= new String[20];
        
        static int interval,interval1,interval2 ;
         
        private static int score1[]= new int[20];
        private static int score2[]= new int[20];
        static int QTT=1,da=0,db=0,dc=0,dd=0;
        static int QTT1=1,da1=0,db1=0,dc1=0,dd1=0;
        static int QTT2=1,da2=0,db2=0,dc2=0,dd2=0;
        static int sa, sb,sc,sd;
        static Timer timer, timer1,timer2;
        JButton a,b,c;
        JPanel p;

       public Game()
       {  
           GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          a= new JButton("Quizmaster");
          a.setFont(new Font("Times", 0, 30));
          b= new JButton("Quizzers");
         b.setFont(new Font("Times", 0, 30));
           c=new JButton("Exit");
           c.setFont(new Font("Times", 0, 30));
           add(a);  add(b); add(c);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );
           a.addActionListener(this);
           b.addActionListener(this);
           c.addActionListener(this);
           setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
           setFont(new Font("Arial", 0, 20));
          setVisible(true);
          setSize(500,500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           
          
       }
       public void actionPerformed(ActionEvent ae)
       {
            if (ae.getSource() == a) {
            new aa();
        }
        if (ae.getSource() == b) {
            new ab();
        }
        if(ae.getSource()==c){
           System.exit(0);
        }

       }
     
       
       class aa extends JFrame implements ActionListener
       {
           JLabel d;
           JButton e,f,g,h,i;
           public aa()
           {
           GroupLayout layout = new GroupLayout(getContentPane());
           getContentPane().setLayout(layout);
           d= new JLabel("Select an AGE GROUP"); 
           e= new JButton("10-13");
           f= new JButton("14-16");
           g=new JButton("17-18");
           h=new JButton("Close");
           i=new JButton("Exit");
           add(d);
           add(e);
           add(f);
           add(g);
           add(h);
           add(i);
           layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(h)
                        .addGap(64, 64, 64)
                        .addComponent(i))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
           e.addActionListener(this);
           f.addActionListener(this);
           g.addActionListener(this);
           h.addActionListener(this);
           i.addActionListener(this);
       setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
           setFont(new Font("Arial", 0, 20));
          setVisible(true);
          setSize(500,500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
           }
          
           
           public void actionPerformed(ActionEvent ag)
           {
               if(ag.getSource()==e)
                   new aaa();
               if(ag.getSource()==f)
                   new aab();
               if(ag.getSource()==g)
                   new aac();
               if(ag.getSource()==h)
                   dispose();
               if(ag.getSource()==i)
                   System.exit(0);
           }
       }
       class aaa extends JFrame implements ActionListener
               {
    JList List;
    JTextField a, A,B,C,D,O ;
    JLabel e,f,g,h, o,d;
    JButton Add, ListB,Close;
    public aaa(){
         GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        Add= new JButton("AddQ");
        add(Add);
        ListB= new JButton("List");
        add(ListB);
        Close= new JButton("Close");
        add(Close);
         layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

         Add.addActionListener(this);
         ListB.addActionListener(this);
         Close.addActionListener(this);
        setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Add)
           new A();
        if(e.getSource()==ListB)
            new B();
        if(e.getSource()==Close)
            dispose();
    }
    class A extends JFrame implements ActionListener
    {
        JButton kk,c;
        
        public A()
        {
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        kk= new JButton("Add");
        add(kk);
        d= new JLabel(l+"of 20 ");
        add(d);
         a=new JTextField(20);
         add(a);
         e= new JLabel("Enter Option A:");
        add(e);
         A=new JTextField(10);
         add(A);
         A.setText(" ");
         f= new JLabel("Enter Option B:");
        add(f);
         B=new JTextField(10);
         add(B);
         B.setText(" ");
         g= new JLabel("Enter Option C:");
        add(g);
         C=new JTextField(10);
         add(C);
         C.setText(" ");
         h= new JLabel("Enter Option D:");
        add(h);
         D=new JTextField(10);
         add(D);
         D.setText(" ");
         o= new JLabel("Enter Correct Option:");
        add(o);
         O=new JTextField(10);
         add(O);
         O.setText("");
         c= new JButton("Close");
         add(c);
         kk.addActionListener(this);
                  c.addActionListener(this);
          layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(C))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(c))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(kk)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g)
                    .addComponent(h)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kk)
                    .addComponent(c))
                .addGap(132, 132, 132))
        );
          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent f){
            if(f.getSource()==kk)
            {
                  if(l<20)
                  {
                   array();
                    l++;
                    i++;
                    A nn= new A();   
                  }
                  else
                  {
                      dispose();
                      new AC();
                  }           
            }
            if(f.getSource()==c)
                dispose();
        }
                public void array()
               {     
                Q[i]=a.getText();
                Ae[i]=A.getText();
                 Bf[i]=B.getText();
                  Cg[i]=C.getText();
                   Dh[i]=D.getText();
                   Oo[i]=O.getText();
             dispose();
              }
        class AC extends JFrame implements ActionListener{
        JLabel lim;
        JButton ok;
            public AC()
        {
            GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
          lim= new JLabel("You have entered all the questions");
          add(lim);
          ok= new JButton("Ok");
          add(ok);
          ok.addActionListener(this);
          layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lim, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addContainerGap(11, Short.MAX_VALUE))
        );
          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(250,250);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
            public void actionPerformed(ActionEvent ol)
            {
                if(ol.getSource()==ok)
                    dispose();
            }
    }
    }
   
    class B extends JFrame implements ActionListener{
       JButton Edit,Delete,Close;
       int j,m;
       JScrollPane jScrollPane1;
        public B()
        {
            jScrollPane1 = new JScrollPane();
            GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
           Edit=new JButton("Edit");
           Delete= new JButton("Delete");
           Close= new JButton("Close");
            List= new JList(Q);
            add(Edit);
            add(Delete);
            add(Close);
            
                 Edit.addActionListener(this);
         Delete.addActionListener(this);
              Close.addActionListener(this);
         
              List.setVisibleRowCount(5);
             List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
             j= List.getSelectedIndex();
              add(new JScrollPane(List));
             List.setListData(Q);
             add(List);
             jScrollPane1.setViewportView(List);
            
            layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Close)
                    .addComponent(Delete)
                    .addComponent(Edit))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Edit)
                .addGap(30, 30, 30)
                .addComponent(Delete)
                .addGap(30, 30, 30)
                .addComponent(Close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
          setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
       @Override
        public void actionPerformed(ActionEvent hh)
        {
            if(hh.getSource()==Edit)
                new  Edt();
            if(hh.getSource()==Delete)
                new Delete();
            if(hh.getSource()==Close)
                dispose();
        }
        class Edt extends JFrame implements ActionListener {
            JButton EA,Close;
            int p;
            public Edt(){
              GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        EA= new JButton("Add");
        add(EA);
         a=new JTextField(20);
         add(a);
         e= new JLabel("Enter Option A:");
        add(e);
         A=new JTextField(10);
         add(A);
         A.setText(" ");
         f= new JLabel("Enter Option B:");
        add(f);
         B=new JTextField(10);
         add(B);
         B.setText(" ");
         g= new JLabel("Enter Option C:");
        add(g);
         C=new JTextField(10);
         add(C);
         C.setText(" ");
         h= new JLabel("Enter Option D:");
        add(h);
         D=new JTextField(10);
         add(D);
         D.setText(" ");
         o= new JLabel("Enter Correct Option:");
        add(o);
         O=new JTextField(10);
         add(O);
         O.setText(" ");
         Close= new JButton("Close");
         add(Close);
         EA.addActionListener(this);
                  Close.addActionListener(this);
     layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(173, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(C))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Close)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(EA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g)
                    .addComponent(h)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EA)
                    .addComponent(Close))
                .addGap(132, 132, 132))
        );


          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            public void actionPerformed(ActionEvent ea)
            {
                if(ea.getSource()==EA)
                {
                    p=List.getSelectedIndex();
            Q[p]="";
            Ae[p]="";
            Bf[p]="";
            Cg[p]="";
            Dh[p]="";
            Oo[p]="";
            Q[p]=a.getText();
                Ae[p]=A.getText();
                 Bf[p]=B.getText();
                  Cg[p]=C.getText();
                   Dh[p]=D.getText();
                   Oo[p]=O.getText();
                 
                  List.setListData(Q);
                 
                }
                if(ea.getSource()==Close)
                    dispose();
            }
           
        }
        class Delete{
            public Delete(){
              int tt,p,ll;
              String t;
              t="";
              p=List.getSelectedIndex();
              for (tt=p;tt<19;tt++)
              {
                  ll=tt+1;
                t=Q[ll];
                Q[tt]=t;
                Q[ll]="";
                t=Ae[ll];
                Ae[tt]=t;
                Ae[ll]="";     
            t=Bf[ll];
                Bf[tt]=t;
                Bf[ll]="";
            t=Cg[ll];
                Cg[tt]=t;
                Cg[ll]="";
            t=Dh[ll];
                Dh[tt]=t;
                Dh[ll]="";
           t=Oo[ll];
                Oo[tt]=t;
                Oo[ll]="";
            t="";
                  }
                  B dd=new B();
              dispose();
              }
              
            
            }
            
        }
    }
       class aab extends JFrame implements ActionListener
       {
               
         JList List;
    JTextField a, A,B,C,D,O ;
    JLabel e,f,g,h, o,d;
    JButton Add, ListB,close;
    public aab(){
         
       GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        Add= new JButton("AddQ");
        add(Add);
        ListB= new JButton("List");
        add(ListB);
        close= new JButton("Close");
        add(close);
        
         
         layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

         Add.addActionListener(this);
         ListB.addActionListener(this);
         close.addActionListener(this);
        setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Add)
           new A();
        if(e.getSource()==ListB)
            new B();
        if(e.getSource()==close)
            dispose();
    }
    class A extends JFrame implements ActionListener
    {
        JButton k,c;
        
        public A()
        {
                 GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        k= new JButton("Add");
        add(k);
        d= new JLabel(l1+"of 20 ");
        add(d);
         a=new JTextField(20);
         add(a);
         e= new JLabel("Enter Option A:");
        add(e);
         A=new JTextField(10);
         add(A);
         A.setText(" ");
         f= new JLabel("Enter Option B:");
        add(f);
         B=new JTextField(10);
         add(B);
         B.setText(" ");
         g= new JLabel("Enter Option C:");
        add(g);
         C=new JTextField(10);
         add(C);
         C.setText(" ");
         h= new JLabel("Enter Option D:");
        add(h);
         D=new JTextField(10);
         add(D);
         D.setText(" ");
         o= new JLabel("Enter Correct Option:");
        add(o);
         O=new JTextField(10);
         add(O);
         O.setText("");
         c= new JButton("Close");
         add(c);
         k.addActionListener(this);
                  c.addActionListener(this);
          layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(C))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(c))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(k)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g)
                    .addComponent(h)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(k)
                    .addComponent(c))
                .addGap(132, 132, 132))
        );
          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent f){
            if(f.getSource()==k)
            {
                   
                    if(l1<20)
                  {
                   array();
                    l1++;
                    i1++;
                    A nn= new A();   
                  }
                  else
                  {
                      dispose();
                      new AC();
                  }       
            }
            if(f.getSource()==c)
                dispose();
        }
         public void array()
    {
         
       Q1[i1]=a.getText();
                Ae1[i1]=A.getText();
                 Bf1[i1]=B.getText();
                  Cg1[i1]=C.getText();
                   Dh1[i1]=D.getText();
                   Oo1[i1]=O.getText();
             dispose();
        
    }
        class AC extends JFrame implements ActionListener{
        JLabel lim;
        JButton ok;
            public AC()
        {
            GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
          lim= new JLabel("You have entered all the questions");
          add(lim);
          ok= new JButton("Ok");
          add(ok);
          ok.addActionListener(this);
          layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lim, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addContainerGap(11, Short.MAX_VALUE))
        );
          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(200,100);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
            public void actionPerformed(ActionEvent ol)
            {
                if(ol.getSource()==ok)
                    dispose();
            }
    }
    }
 class B extends JFrame implements ActionListener{
       JButton Edit,Delete,Close;
       int j,m;
       JScrollPane jScrollPane1;
        public B()
        {
            jScrollPane1 = new JScrollPane();
            GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
           Edit=new JButton("Edit");
           Delete= new JButton("Delete");
           Close= new JButton("Close");
            List= new JList(Q1);
            add(Edit);
            add(Delete);
            add(Close);
            
                 Edit.addActionListener(this);
         Delete.addActionListener(this);
              Close.addActionListener(this);
         
              List.setVisibleRowCount(5);
             List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
             j= List.getSelectedIndex();
              add(new JScrollPane(List));
             List.setListData(Q1);
             add(List);
             jScrollPane1.setViewportView(List);
            
            layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Close)
                    .addComponent(Delete)
                    .addComponent(Edit))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Edit)
                .addGap(30, 30, 30)
                .addComponent(Delete)
                .addGap(30, 30, 30)
                .addComponent(Close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
          setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
       @Override
        public void actionPerformed(ActionEvent hh)
        {
            if(hh.getSource()==Edit)
                new  Edt();
            if(hh.getSource()==Delete)
                new Delete();
            if(hh.getSource()==Close)
                dispose();
        }
        class Edt extends JFrame implements ActionListener {
            JButton EA,Close;
            int p;
            public Edt(){
              GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        EA= new JButton("Add");
        add(EA);
         a=new JTextField(20);
         add(a);
         e= new JLabel("Enter Option A:");
        add(e);
         A=new JTextField(10);
         add(A);
         A.setText(" ");
         f= new JLabel("Enter Option B:");
        add(f);
         B=new JTextField(10);
         add(B);
         B.setText(" ");
         g= new JLabel("Enter Option C:");
        add(g);
         C=new JTextField(10);
         add(C);
         C.setText(" ");
         h= new JLabel("Enter Option D:");
        add(h);
         D=new JTextField(10);
         add(D);
         D.setText(" ");
         o= new JLabel("Enter Correct Option:");
        add(o);
         O=new JTextField(10);
         add(O);
         O.setText(" ");
         Close= new JButton("Close");
         add(Close);
         EA.addActionListener(this);
                  Close.addActionListener(this);
     layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(173, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(C))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Close)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(EA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g)
                    .addComponent(h)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EA)
                    .addComponent(Close))
                .addGap(132, 132, 132))
        );


          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            public void actionPerformed(ActionEvent ea)
            {
                if(ea.getSource()==EA)
                {
                    p=List.getSelectedIndex();
            Q1[p]="";
            Ae1[p]="";
            Bf1[p]="";
            Cg1[p]="";
            Dh1[p]="";
            Oo1[p]="";
            Q1[p]=a.getText();
                Ae1[p]=A.getText();
                 Bf1[p]=B.getText();
                  Cg1[p]=C.getText();
                   Dh1[p]=D.getText();
                   Oo1[p]=O.getText();
                  List.setListData(Q1);
                 
                }
                if(ea.getSource()==Close)
                    dispose();
            }
           
        }
        class Delete{
            public Delete(){
               int tt,p,ll;
              String t;
              t="";
              p=List.getSelectedIndex();
              for (tt=p;tt<19;tt++)
              {
                  ll=tt+1;
                t=Q1[ll];
                Q1[tt]=t;
                Q1[ll]="";
                t=Ae1[ll];
                Ae1[tt]=t;
                Ae1[ll]="";     
            t=Bf1[ll];
                Bf1[tt]=t;
                Bf1[ll]="";
            t=Cg1[ll];
                Cg1[tt]=t;
                Cg1[ll]="";
            t=Dh1[ll];
                Dh1[tt]=t;
                Dh1[ll]="";
           t=Oo1[ll];
                Oo1[tt]=t;
                Oo1[ll]="";
            t="";
                  }
                  B dd=new B();
              dispose();
              }
              
            
            }
            
        }
       }
      class aac extends JFrame implements ActionListener
       {
            JList List;
    JTextField a, A,B,C,D,O ;
    JLabel e,f,g,h, o,d;
    JButton Add, ListB,Close;
    public aac(){
         
        GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        Add= new JButton("AddQ");
        add(Add);
        ListB= new JButton("List");
        add(ListB);
        Close= new JButton("Close");
        add(Close);
         layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

         Add.addActionListener(this);
         ListB.addActionListener(this);
         Close.addActionListener(this);
        setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
    
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Add)
           new A();
        if(e.getSource()==ListB)
            new B();
        if(e.getSource()==Close)
            dispose();
    }
    class A extends JFrame implements ActionListener
    {
        JButton kk,c;
        
        public A()
        {
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        kk= new JButton("Add");
        add(kk);
        d= new JLabel(l2+"of 20 ");
        add(d);
         a=new JTextField(20);
         add(a);
         e= new JLabel("Enter Option A:");
        add(e);
         A=new JTextField(10);
         add(A);
         A.setText(" ");
         f= new JLabel("Enter Option B:");
        add(f);
         B=new JTextField(10);
         add(B);
         B.setText(" ");
         g= new JLabel("Enter Option C:");
        add(g);
         C=new JTextField(10);
         add(C);
         C.setText(" ");
         h= new JLabel("Enter Option D:");
        add(h);
         D=new JTextField(10);
         add(D);
         D.setText(" ");
         o= new JLabel("Enter Correct Option:");
        add(o);
         O=new JTextField(10);
         add(O);
         O.setText("");
         c= new JButton("Close");
         add(c);
         kk.addActionListener(this);
                  c.addActionListener(this);
          layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(C))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(c))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(kk)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g)
                    .addComponent(h)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kk)
                    .addComponent(c))
                .addGap(132, 132, 132))
        );
          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent f){
            if(f.getSource()==kk)
            {
                  if(l<20)
                  {
                   array();
                    l2++;
                    i2++;
                    A nn= new A();   
                  }
                  else
                  {
                      dispose();
                      new AC();
                  }           
            }
            if(f.getSource()==c)
                dispose();
        }
                public void array()
               {     
                Q2[i2]=a.getText();
                Ae2[i2]=A.getText();
                 Bf2[i2]=B.getText();
                  Cg2[i2]=C.getText();
                   Dh2[i2]=D.getText();
                   Oo2[i2]=O.getText();
             dispose();
              }
        class AC extends JFrame implements ActionListener{
        JLabel lim;
        JButton ok;
            public AC()
        {
            GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
          lim= new JLabel("You have entered all the questions");
          add(lim);
          ok= new JButton("Ok");
          add(ok);
          ok.addActionListener(this);
          layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lim, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lim, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ok)
                .addContainerGap(11, Short.MAX_VALUE))
        );
          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(200,100);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
            public void actionPerformed(ActionEvent ol)
            {
                if(ol.getSource()==ok)
                    dispose();
            }
    }
    }
   
    class B extends JFrame implements ActionListener{
       JButton Edit,Delete,Close;
       int j,m;
       JScrollPane jScrollPane1;
        public B()
        {
            jScrollPane1 = new JScrollPane();
            GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
           Edit=new JButton("Edit");
           Delete= new JButton("Delete");
           Close= new JButton("Close");
            List= new JList(Q2);
            add(Edit);
            add(Delete);
            add(Close);
            
                 Edit.addActionListener(this);
         Delete.addActionListener(this);
              Close.addActionListener(this);
         
              List.setVisibleRowCount(5);
             List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             
             j= List.getSelectedIndex();
              add(new JScrollPane(List));
             List.setListData(Q2);
             add(List);
             jScrollPane1.setViewportView(List);
            
            layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Close)
                    .addComponent(Delete)
                    .addComponent(Edit))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Edit)
                .addGap(30, 30, 30)
                .addComponent(Delete)
                .addGap(30, 30, 30)
                .addComponent(Close)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
          setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
       @Override
        public void actionPerformed(ActionEvent hh)
        {
            if(hh.getSource()==Edit)
                new  Edt();
            if(hh.getSource()==Delete)
                new Delete();
            if(hh.getSource()==Close)
                dispose();
        }
        class Edt extends JFrame implements ActionListener {
            JButton EA,Close;
            int p;
            public Edt(){
              GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        EA= new JButton("Add");
        add(EA);
         a=new JTextField(20);
         add(a);
         e= new JLabel("Enter Option A:");
        add(e);
         A=new JTextField(10);
         add(A);
         A.setText(" ");
         f= new JLabel("Enter Option B:");
        add(f);
         B=new JTextField(10);
         add(B);
         B.setText(" ");
         g= new JLabel("Enter Option C:");
        add(g);
         C=new JTextField(10);
         add(C);
         C.setText(" ");
         h= new JLabel("Enter Option D:");
        add(h);
         D=new JTextField(10);
         add(D);
         D.setText(" ");
         o= new JLabel("Enter Correct Option:");
        add(o);
         O=new JTextField(10);
         add(O);
         O.setText(" ");
         Close= new JButton("Close");
         add(Close);
         EA.addActionListener(this);
                  Close.addActionListener(this);
     layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(o, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(173, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(C))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                    .addComponent(h, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(Close)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(EA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f)
                    .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g)
                    .addComponent(h)
                    .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o)
                    .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EA)
                    .addComponent(Close))
                .addGap(132, 132, 132))
        );


          setTitle("QUIZ GAME");
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
            public void actionPerformed(ActionEvent ea)
            {
                if(ea.getSource()==EA)
                {
                    p=List.getSelectedIndex();
            Q2[p]="";
            Ae2[p]="";
            Bf2[p]="";
            Cg2[p]="";
            Dh2[p]="";
            Oo2[p]="";
            Q2[p]=a.getText();
                Ae2[p]=A.getText();
                 Bf2[p]=B.getText();
                  Cg2[p]=C.getText();
                   Dh2[p]=D.getText();
                   Oo2[p]=O.getText();
                 
                  List.setListData(Q2);
                 
                }
                if(ea.getSource()==Close)
                    dispose();
            }
           
        }
        class Delete{
            public Delete(){
              int tt,p,ll;
              String t;
              t="";
              p=List.getSelectedIndex();
              for (tt=p;tt<19;tt++)
              {
                  ll=tt+1;
                t=Q2[ll];
                Q2[tt]=t;
                Q2[ll]="";
                t=Ae2[ll];
                Ae2[tt]=t;
                Ae2[ll]="";     
            t=Bf2[ll];
                Bf2[tt]=t;
                Bf2[ll]="";
            t=Cg2[ll];
                Cg2[tt]=t;
                Cg2[ll]="";
            t=Dh2[ll];
                Dh2[tt]=t;
                Dh2[ll]="";
           t=Oo2[ll];
                Oo2[tt]=t;
                Oo2[ll]="";
            t="";
                  }
                  B dd=new B();
              dispose();
              }     
            }
            
        }
    }

       class ab extends JFrame implements ActionListener
       {
    JButton Play,Team, ListB, Close, Exit;
    JLabel JP;
    public ab()
    {
        GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
        Play= new JButton("Play!!!");
        Team= new JButton("Create Team");
        ListB= new JButton("Team List");
        Close= new JButton("Back");
        Exit= new JButton("Quit");
        JP= new JLabel();
        
        add(Play);
        add(Team);
        add(ListB);
        add(Close);
        add(Exit);
        add(JP);
        JP.setIcon(new javax.swing.ImageIcon("/Users/mohitjain/Desktop/QUIZ GAME/image.jpg"));
        JP.setText("Welcome to the Quiz Game");
        JP.setFont(new Font("Arial", 0, 17));
      layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(ListB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Team, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JP, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Team, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(ListB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JP)
                        .addGap(71, 71, 71)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        
           Play.addActionListener(this);
         ListB.addActionListener(this);
         Team.addActionListener(this);
         Close.addActionListener(this);
            Exit.addActionListener(this);
            
        setTitle("QUIZ GAME");
         
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==Play)
            new P();
        if(a.getSource()==Team)
            new T();
        if(a.getSource()==ListB)
            new L();
        if(a.getSource()==Close)
            dispose();
        if(a.getSource()==Exit)
            System.exit(0);
    }
    class P extends JFrame implements ActionListener{
        JButton Start,Close,Exit;
        JRadioButton A1, A2, A3,A4,A5;
        JTextArea Rules;
        public P(){
            
            GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          Rules= new JTextArea();

        Rules.setText("1. Every question is direct one and in total every \n    team gets 5 questions to answer. \n2. For each question a team gets 30sec, where the\n    team need to choose one out the four given \n    options.\n3. All questions are worth 10 points.\n4. No points awarded for wrong answer.\n5. If a team cannot answer a question or answers \n    incorrectly, the quizmaster gives the correct \n    answer and moves on to the next question. The \n    other team is not given the opportunity.\n6. Scores to be displayed after the quiz.\n7. The team with highest points at the end is \n    declared as winner.\n8. If there is a tie between any team, the \n    Quizmaster will then conduct the tie breaker \n    round and then declare the team as winner. \n9. Any kind of misconduct ways of playing can \n    result in the disqualification of the team.\n10. Any kind of misbehaviour by any player, team, \n      or the audience can led to the abandon of \n      the game. \n");

          A1= new JRadioButton("Age Group 10-13");
          A2=new JRadioButton("Age Group 14-16");
          A3=new JRadioButton("Age Group 17-18");
          A4=new JRadioButton("Agree");
          A5=new JRadioButton("Disagree");
          Start= new JButton("Start");
         Close= new JButton("Back");
          Exit= new JButton("Quit");
          add(Rules);
          add(A1);
          add(A2);
          add(A3);
          add(A4);
          add(A5);
          add(Start);
          add(Close);
          add(Exit);
           layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(Exit)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(A5))
                    .addComponent(Rules, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1)
                    .addComponent(A3)
                    .addComponent(A2))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A1)
                        .addGap(65, 65, 65)
                        .addComponent(A2)
                        .addGap(65, 65, 65)
                        .addComponent(A3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rules, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(A4)
                            .addComponent(A5))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
         A1.addActionListener(this);
         A2.addActionListener(this);
         A3.addActionListener(this);
         A4.addActionListener(this);
         A5.addActionListener(this);
         Start.addActionListener(this);
         Close.addActionListener(this);
         Exit.addActionListener(this);
         setTitle("QUIZ GAME");
          
          setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
          setFont(new Font("Arial", 0, 12));
          setVisible(true);
          setSize(500, 500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent c)
        {   
           
                if((c.getSource()==Start))
                {
                  if(A4.isSelected())
                  {
                      if(A1.isSelected())
                        new Game1();
                    if(A2.isSelected())
                        new Game2();
                    if(A3.isSelected())
                        new Game3();
                  }
                  else if(A5.isSelected())
                  {
                      System.exit(0);
                  }
                    
                }   
                if((c.getSource()==Close))
                    dispose();
                if((c.getSource()==Exit))
                    System.exit(0);
        }
        class Game1 extends JFrame implements ActionListener{
          JButton Next,Exit;
          JLabel Question, Answer,Time,QT;
          JRadioButton OA,OB,OC, OD;
            public Game1()
            {
                GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
                String s="";
                
                Question= new JLabel("Question:"+Q[k]);
                add(Question);
                OA=new JRadioButton("A)"+Ae[k]);
                add(OA);
                OB= new JRadioButton("B)"+Bf[k]);
                add(OB);
                OC=new JRadioButton("C)"+Cg[k]);
                add(OC);
                OD= new JRadioButton("D)"+Dh[k]);
                add(OD);
                Next= new JButton("Next");
                add(Next);
                Answer= new JLabel();
                add(Answer);
                Exit= new JButton("Quit");
                add(Exit);
                Time= new JLabel("Timeleft:30");
                add(Time);
                if((QTT==1)||(QTT==5)||(QTT==9)||(QTT==13)||(QTT==17))
                {
                    s= "Team A";
                }
                else
                if((QTT==2)||(QTT==6)||(QTT==10)||(QTT==14)||(QTT==18))
                {
                    s="Team B";
                }
                else
                if((QTT==3)||(QTT==7)||(QTT==11)||(QTT==15)||(QTT==19))
                {
                    s="Team C";
                }
                else
                if((QTT==4)||(QTT==8)||(QTT==12)||(QTT==16)||(QTT==20))
                {
                    s="Team D";
                }
                QT= new JLabel("Question for team:"+s);
                add(QT);
                int delay = 1000;
                int period = 1000;
                int tt=30;
                timer = new Timer();
                interval = tt;
                timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                  Time.setText("Timeleft:"+setInterval());
                 }
                }, delay, period);
                
                layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OA)
                    .addComponent(OB))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OC)
                    .addComponent(OD))
                .addGap(43, 43, 43)
                .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
                OA.addActionListener(this);
                OB.addActionListener(this);
                OC.addActionListener(this);
                OD.addActionListener(this);
                Next.addActionListener(this);
                Exit.addActionListener(this);
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
           private final int setInterval() {
            if (interval == 1)
               timer.cancel();
              return --interval;
             }
            public void actionPerformed(ActionEvent ff)
            {
                
                
                if(ff.getSource()==OA)
                {
                    if(("a".equals(Oo[k]))||("A".equals(Oo[k])))
                    {
                        Answer.setText("Correct  10points!!");
                      score[QTT-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                        score[QTT-1]=0;
                    }
                    
                }
                else if(ff.getSource()==OB)
                {
                    if(("b".equals(Oo[k]))||("B".equals(Oo[k])))
                    {          
                  Answer.setText("Correct  10points!!");
                   score[QTT-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                        score[QTT-1]=0;
                    }
                }
                else  if(ff.getSource()==OC)
                {
                    if(("c".equals(Oo[k]))||("C".equals(Oo[k])))
                    {    
                        Answer.setText("Correct  10points!!");
                    score[QTT-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                       score[QTT-1]=0;
                    }
                }
                else if(ff.getSource()==OD)
                {
                    if(("d".equals(Oo[k]))||("D".equals(Oo[k])))
                    {   
                        Answer.setText("Correct  10points!!");
                   score[QTT-1]=10;
                    }
                    else{
                        Answer.setText("Incorrect");
                        score[QTT-1]=0;
                    }
                }  
                if(ff.getSource()==Next)
                {
                    timer.cancel();
                       if((QTT==1)||(QTT==5)||(QTT==9)||(QTT==13)||(QTT==17))
                {
                   da= da+score[QTT-1];
                }
                else
                if((QTT==2)||(QTT==6)||(QTT==10)||(QTT==14)||(QTT==18))
                {
                    db=db+score[QTT-1];
                }
                else
                if((QTT==3)||(QTT==7)||(QTT==11)||(QTT==15)||(QTT==19))
                {
                   dc=dc+score[QTT-1];
                }
                else
                if((QTT==4)||(QTT==8)||(QTT==12)||(QTT==16)||(QTT==20))
                {
                   dd=dd+score[QTT-1];
                }
                     QTT++;
                    if(QTT<=20)
                    {
                         
                        k++;
                        dispose();
                        Game1 s= new Game1();
                    }
                    else
                        new Result();
                   
                }
                if((ff.getSource()==Exit))
                    System.exit(0);
            }
            class Result extends JFrame implements ActionListener{
                JLabel taa,tbb,tcc,tdd, winner;
                JButton close;
                public Result()
                {
                    GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                taa= new JLabel("Team A"+da);
                add(taa);
                tbb= new JLabel("Team B"+db);
                add(tbb);
                tcc= new JLabel("Team C"+dc);
                add(tcc);
                tdd= new JLabel("Team D"+dd);
                add(tdd);
                close= new JButton("Exit");
                add(close);
                winner= new JLabel("");
                add(winner);
                if((da==db)&&(da==dc)&&(da==dd))
                {
                 winner.setText("Tie between all four teams");
                 
                }
                else if((da==db)&&(da==dc)&&(da!=dd)) 
                {
                   winner.setText("Tie between Teams: A,B&C");
                }
                else if((da==db)&&(da!=dc)&&(da==dd))
                {
                         winner.setText("Tie between Teams: A,B&D");
                }
                else if((da!=db)&&(da==dc)&&(da==dd))
                {
                             winner.setText("Tie between Teams: A,C&D");
                }
                else if((da==db))
                {
                    winner.setText("Tie between Teams: A&B");
                }
                else if((da>db)&&(da>dc)&&(da>dd))
                        {
                            winner.setText("Team A winner");
                        }
                else if((db>da)&&(db>dc)&&(db>dd))
                        {
                            winner.setText("Team B winner");
                        }
                else if((dc>db)&&(dc>da)&&(dc>dd))
                        {
                            winner.setText("Team C winner");
                        }
                else if((dd>db)&&(dd>dc)&&(dd>da))
                        {
                            winner.setText("Team D winner");
                        }
                    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcc, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(taa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbb, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(tdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
                close.addActionListener(this);
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                public void actionPerformed(ActionEvent fff)
                {
                    if(fff.getSource()==close)
                        System.exit(0);
                }
            }
        }
        class Game2 extends JFrame implements ActionListener{
          JButton Next,Exit;
          JLabel Question, Answer,Time,QT;
          JRadioButton OA,OB,OC, OD;
     
            public Game2()
            {  GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
                String s="";
                
                Question= new JLabel("Question:"+Q[k]);
                add(Question);
                OA=new JRadioButton("A)"+Ae[k]);
                add(OA);
                OB= new JRadioButton("B)"+Bf[k]);
                add(OB);
                OC=new JRadioButton("C)"+Cg[k]);
                add(OC);
                OD= new JRadioButton("D)"+Dh[k]);
                add(OD);
                Next= new JButton("Next");
                add(Next);
                Answer= new JLabel();
                add(Answer);
                Exit= new JButton("Quit");
                add(Exit);
                Time= new JLabel("Timeleft:30");
                add(Time);
                if((QTT1==1)||(QTT1==5)||(QTT1==9)||(QTT1==13)||(QTT1==17))
                {
                    s= "Team A";
                }
                if((QTT1==2)||(QTT1==6)||(QTT1==10)||(QTT1==14)||(QTT1==18))
                {
                    s="Team B";
                }
                if((QTT1==3)||(QTT1==7)||(QTT1==11)||(QTT1==15)||(QTT1==19))
                {
                    s="Team C";
                }
                if((QTT1==4)||(QTT1==8)||(QTT1==12)||(QTT1==16)||(QTT1==20))
                {
                    s="Team D";
                }
                QT= new JLabel("Question for team:"+s);
                add(QT);
                int delay = 1000;
                int period = 1000;
                int tt=30;
                timer1 = new Timer();
                interval1 = tt;
                timer1.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                  Time.setText("Timeleft:"+setInterval());
                 }
                }, delay, period);
                  layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OA)
                    .addComponent(OB))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OC)
                    .addComponent(OD))
                .addGap(43, 43, 43)
                .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
                OA.addActionListener(this);
                OB.addActionListener(this);
                OC.addActionListener(this);
                OD.addActionListener(this);
                Next.addActionListener(this);
                Exit.addActionListener(this);
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
                         private final int setInterval() {
            if (interval1 == 1)
               timer1.cancel();
              return --interval1;
             }
            public void actionPerformed(ActionEvent ff)
            {
                  if(ff.getSource()==OA)
                {
                    if(("a".equals(Oo1[z]))||("A".equals(Oo1[z])))
                    {
                        Answer.setText("Correct  10points!!");
                      score1[QTT1-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                        score1[QTT1-1]=0;
                    }
                    
                }
                else if(ff.getSource()==OB)
                {
                    if(("b".equals(Oo1[z]))||("B".equals(Oo1[z])))
                    {          
                  Answer.setText("Correct  10points!!");
                   score1[QTT1-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                        score1[QTT1-1]=0;
                    }
                }
                else  if(ff.getSource()==OC)
                {
                    if(("c".equals(Oo1[z]))||("C".equals(Oo1[z])))
                    {    
                        Answer.setText("Correct  10points!!");
                    score1[QTT1-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                       score1[QTT1-1]=0;
                    }
                }
                else if(ff.getSource()==OD)
                {
                    if(("d".equals(Oo1[z]))||("D".equals(Oo1[z])))
                    {   
                        Answer.setText("Correct  10points!!");
                   score1[QTT1-1]=10;
                    }
                    else{
                        Answer.setText("Incorrect");
                        score1[QTT1-1]=0;
                    }
                }  
                if(ff.getSource()==Next)
                {
                    timer.cancel();
                       if((QTT1==1)||(QTT1==5)||(QTT1==9)||(QTT1==13)||(QTT1==17))
                {
                   da1= da1+score1[QTT1-1];
                }
                else
                if((QTT1==2)||(QTT1==6)||(QTT1==10)||(QTT1==14)||(QTT1==18))
                {
                    db1=db1+score1[QTT1-1];
                }
                else
                if((QTT1==3)||(QTT1==7)||(QTT1==11)||(QTT1==15)||(QTT1==19))
                {
                   dc1=dc1+score1[QTT1-1];
                }
                else
                if((QTT1==4)||(QTT1==8)||(QTT1==12)||(QTT1==16)||(QTT1==20))
                {
                   dd1=dd1+score1[QTT1-1];
                }
                     QTT1++;
                    if(QTT1<=20)
                    {
                         
                        z++; 
                        Game2 s= new Game2();
                    }
                    else
                        new Result();
                   
                }
                if((ff.getSource()==Exit))
                    System.exit(0);
               
            }
             class Result extends JFrame implements ActionListener{
                  JLabel taa,tbb,tcc,tdd, winner;
                  JButton close;
                public Result()
                {
                    GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                taa= new JLabel("Team A"+da);
                add(taa);
                tbb= new JLabel("Team B"+db);
                add(tbb);
                tcc= new JLabel("Team C"+dc);
                add(tcc);
                tdd= new JLabel("Team D"+dd);
                add(tdd);
                close= new JButton("Exit");
                add(close);
                winner= new JLabel("");
                add(winner);
                if((da==db)&&(da==dc)&&(da==dd))
                {
                 winner.setText("Tie between all four teams");
                 
                }
                else if((da==db)&&(da==dc)&&(da!=dd)) 
                {
                   winner.setText("Winner Team B");
                }
                else if((da==db)&&(da!=dc)&&(da==dd))
                {
                         winner.setText("Winner Team C");
                }
                else if((da!=db)&&(da==dc)&&(da==dd))
                {
                             winner.setText("Winner Team D");
                }
                else if((da>db)&&(da>dc)&&(da>dd))
                        {
                            winner.setText("Team A winner");
                        }
                else if((db>da)&&(db>dc)&&(db>dd))
                        {
                            winner.setText("Team B winner");
                        }
                else if((dc>db)&&(dc>da)&&(dc>dd))
                        {
                            winner.setText("Team C winner");
                        }
                else if((dd>db)&&(dd>dc)&&(dd>da))
                        {
                            winner.setText("Team D winner");
                        }
                    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcc, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(taa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbb, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(tdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
                close.addActionListener(this);
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                public void actionPerformed(ActionEvent fff)
                {
                    if(fff.getSource()==close)
                        System.exit(0);
                }
                }
            }
        }
        class Game3 extends JFrame implements ActionListener{
          JButton Next,Exit;
          JLabel Question, Answer,Time,QT;
          JRadioButton OA,OB,OC, OD;
          public Game3(){
                GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
                String s="";
                
                Question= new JLabel("Question:"+Q2[k]);
                add(Question);
                OA=new JRadioButton("A)"+Ae2[k]);
                add(OA);
                OB= new JRadioButton("B)"+Bf2[k]);
                add(OB);
                OC=new JRadioButton("C)"+Cg2[k]);
                add(OC);
                OD= new JRadioButton("D)"+Dh2[k]);
                add(OD);
                Next= new JButton("Next");
                add(Next);
                Answer= new JLabel();
                add(Answer);
                Exit= new JButton("Quit");
                add(Exit);
                Time= new JLabel("Timeleft:30");
                add(Time);
                if((QTT2==1)||(QTT2==5)||(QTT2==9)||(QTT2==13)||(QTT2==17))
                {
                    s= "Team A";
                }
                if((QTT2==2)||(QTT2==6)||(QTT2==10)||(QTT2==14)||(QTT2==18))
                {
                    s="Team B";
                }
                if((QTT2==3)||(QTT2==7)||(QTT2==11)||(QTT2==15)||(QTT2==19))
                {
                    s="Team C";
                }
                if((QTT2==4)||(QTT2==8)||(QTT2==12)||(QTT2==16)||(QTT2==20))
                {
                    s="Team D";
                }
                QT= new JLabel("Question for team:"+s);
                add(QT);
                int delay = 1000;
                int period = 1000;
                int tt=30;
                timer2 = new Timer();
                interval2 = tt;
                timer2.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                  Time.setText("Timeleft:"+setInterval());
                 }
                }, delay, period);
                     layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OC, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OD, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Time, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OA)
                    .addComponent(OB))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OC)
                    .addComponent(OD))
                .addGap(43, 43, 43)
                .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
     
                
                OA.addActionListener(this);
                OB.addActionListener(this);
                OC.addActionListener(this);
                OD.addActionListener(this);
                Next.addActionListener(this);
                Exit.addActionListener(this);
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
             private final int setInterval() {
            if (interval2 == 1)
               timer2.cancel();
              return --interval2;
             }
            public void actionPerformed(ActionEvent ff)
            {
                  if(ff.getSource()==OA)
                {
                    if(("a".equals(Oo2[y]))||("A".equals(Oo2[y])))
                    {
                        Answer.setText("Correct  10points!!");
                      score2[QTT2-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                        score2[QTT2-1]=0;
                    }
                    
                }
                else if(ff.getSource()==OB)
                {
                    if(("b".equals(Oo2[y]))||("B".equals(Oo2[y])))
                    {          
                  Answer.setText("Correct  10points!!");
                   score2[QTT2-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                        score2[QTT2-1]=0;
                    }
                }
                else  if(ff.getSource()==OC)
                {
                    if(("c".equals(Oo2[y]))||("C".equals(Oo2[y])))
                    {    
                        Answer.setText("Correct  10points!!");
                    score2[QTT2-1]=10;
                    }
                    else
                    {
                        Answer.setText("Incorrect");
                       score2[QTT2-1]=0;
                    }
                }
                else if(ff.getSource()==OD)
                {
                    if(("d".equals(Oo2[y]))||("D".equals(Oo2[y])))
                    {   
                        Answer.setText("Correct  10points!!");
                   score2[QTT2-1]=10;
                    }
                    else{
                        Answer.setText("Incorrect");
                        score2[QTT2-1]=0;
                    }
                }  
                if(ff.getSource()==Next)
                {
                    timer.cancel();
                       if((QTT2==1)||(QTT2==5)||(QTT2==9)||(QTT2==13)||(QTT2==17))
                {
                   da2= da2+score2[QTT2-1];
                }
                else
                if((QTT2==2)||(QTT2==6)||(QTT2==10)||(QTT2==14)||(QTT2==18))
                {
                    db2=db2+score2[QTT2-1];
                }
                else
                if((QTT2==3)||(QTT2==7)||(QTT2==11)||(QTT2==15)||(QTT2==19))
                {
                   dc2=dc2+score2[QTT2-1];
                }
                else
                if((QTT2==4)||(QTT2==8)||(QTT2==12)||(QTT2==16)||(QTT2==20))
                {
                   dd2=dd2+score2[QTT2-1];
                }
                     QTT2++;
                    if(QTT2<=20)
                    {
                         
                        y++; 
                        Game3 s= new Game3();
                    }
                    else
                        new Result();
                   
                }
            }
            class Result extends JFrame implements ActionListener{
                  JLabel taa,tbb,tcc,tdd, winner;
                  JButton close;
                public Result()
                {
                    GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                taa= new JLabel("Team A"+da);
                add(taa);
                tbb= new JLabel("Team B"+db);
                add(tbb);
                tcc= new JLabel("Team C"+dc);
                add(tcc);
                tdd= new JLabel("Team D"+dd);
                add(tdd);
                close= new JButton("Exit");
                add(close);
                winner= new JLabel("");
                add(winner);
                if((da==db)&&(da==dc)&&(da==dd))
                {
                 winner.setText("Tie between all four teams");
                 
                }
                else if((da==db)&&(da==dc)&&(da!=dd)) 
                {
                   winner.setText("Tie between Teams: A,B&C");
                }
                else if((da==db)&&(da!=dc)&&(da==dd))
                {
                         winner.setText("Tie between Teams: A,B&D");
                }
                else if((da!=db)&&(da==dc)&&(da==dd))
                {
                             winner.setText("Tie between Teams: A,C&D");
                }
                else if((da==db))
                {
                    winner.setText("Tie between Teams: A&B");
                }
                else if((da>db)&&(da>dc)&&(da>dd))
                        {
                            winner.setText("Team A winner");
                        }
                else if((db>da)&&(db>dc)&&(db>dd))
                        {
                            winner.setText("Team B winner");
                        }
                else if((dc>db)&&(dc>da)&&(dc>dd))
                        {
                            winner.setText("Team C winner");
                        }
                else if((dd>db)&&(dd>dc)&&(dd>da))
                        {
                            winner.setText("Team D winner");
                        }
                    layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcc, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(taa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tbb, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(tdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(winner, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
                close.addActionListener(this);
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                public void actionPerformed(ActionEvent fff)
                {
                    if(fff.getSource()==close)
                        System.exit(0);
                }
            }       
            }
    }
        class T extends JFrame implements ActionListener{
            JLabel TeamA,TeamB, TeamC,TeamD;
            JTextArea A1,A2, A3,A4, B1,B2,B3,B4,C1,C2,C3,C4,D1,D2,D3,D4;
            JButton Enter,Close;
            public T(){
                GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
                TeamA= new JLabel("TeamA:");
                TeamB= new JLabel("TeamB:");
                TeamC= new JLabel("TeamC:");
                TeamD= new JLabel("TeamD:");
                A1= new JTextArea("Enter Player Name");
                A1.setFont(new Font("Arial", 0,10));
                A2= new JTextArea("Enter Player Name");
                A2.setFont(new Font("Arial", 0,10));
                A3= new JTextArea("Enter Player Name");
                A3.setFont(new Font("Arial", 0,10));
                A4= new JTextArea("Enter Player Name");
                A4.setFont(new Font("Arial", 0,10));
                 B1= new JTextArea("Enter Player Name");
                 B1.setFont(new Font("Arial", 0,10));
                B2= new JTextArea("Enter Player Name");
                B2.setFont(new Font("Arial", 0,10));
                B3= new JTextArea("Enter Player Name");
                B3.setFont(new Font("Arial", 0,10));
                B4= new JTextArea("Enter Player Name");
                B4.setFont(new Font("Arial", 0,10));
                 C1= new JTextArea("Enter Player Name");
                 C1.setFont(new Font("Arial", 0,10));
                C2= new JTextArea("Enter Player Name");
                C2.setFont(new Font("Arial", 0,10));
                C3= new JTextArea("Enter Player Name");
                C3.setFont(new Font("Arial", 0,10));
                C4= new JTextArea("Enter Player Name");
                C4.setFont(new Font("Arial", 0,10));
                 D1= new JTextArea("Enter Player Name");
                 D1.setFont(new Font("Arial", 0,10));
                D2= new JTextArea("Enter Player Name");
                D2.setFont(new Font("Arial", 0,10));
                D3= new JTextArea("Enter Player Name");
                D3.setFont(new Font("Arial", 0,10));
                D4= new JTextArea("Enter Player Name");
                D4.setFont(new Font("Arial", 0,10));
                Enter= new JButton("Add");
                Close= new JButton("Close");
                add(TeamA);
                add(A1);
                add(A2);
                add(A3);
                add(A4);
                add(TeamB);
                add(B1);
                add(B2);
                add(B3);
                add(B4);
                add(TeamC);
                add(C1);
                add(C2);
                add(C3);
                add(C4);
                add(TeamD);
                add(D1);
                add(D2);
                add(D3);
                add(D4);
                add(Enter);
                add(Close); 
                Enter.addActionListener(this);
                Close.addActionListener(this);
      layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(TeamA, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(TeamB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(TeamC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(D1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(TeamD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeamD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             }
            public void actionPerformed(ActionEvent a)
            {
                if(a.getSource()==Enter)
                    new Enter();
                if(a.getSource()==Close)
                    dispose();
            }
            class Enter{
                public Enter(){
                    TA[0]=A1.getText();
                    TA[1]=A2.getText();
                    TA[2]=A3.getText();
                    TA[3]=A4.getText();
                    TB[0]=B1.getText();
                    TB[1]=B2.getText();
                    TB[2]=B3.getText();
                    TB[3]=B4.getText();
                    TC[0]=C1.getText();
                    TC[1]=C2.getText();
                    TC[2]=C3.getText();
                    TC[3]=C4.getText();
                    TD[0]=D1.getText();
                    TD[1]=D2.getText();
                    TD[2]=D3.getText();
                    TD[3]=D4.getText();
                    
                    A1.setText("");
                    A2.setText("");
                    A3.setText("");
                    A4.setText("");
                     B1.setText("");
                    B2.setText("");
                    B3.setText("");
                    B4.setText("");
                     C1.setText("");
                    C2.setText("");
                    C3.setText("");
                    C4.setText("");
                     D1.setText("");
                    D2.setText("");
                    D3.setText("");
                    D4.setText("");  
                }
            }
    }
    class L extends JFrame implements ActionListener{
        JList TeamA,TeamB,TeamC,TeamD;
        JLabel LA,LB,LC,LD;
        JButton Close;
        public L(){
            GroupLayout layout = new GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
                LA=new JLabel("TeamA");
                LB=new JLabel("TeamB");
                LC=new JLabel("TeamC");
                LD=new JLabel("TeamD");
                TeamA= new JList(TA);
                TeamB=new JList(TB);
                TeamC= new JList(TC);
                TeamD= new JList(TD);
                Close= new JButton("Close");
                add(LA);
                add(LB);
                add(LC);
                add(LD);
                add(TeamA);
                add(TeamB);
                add(TeamC);
                add(TeamD);
                add(Close);
              getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamA)
                    .addComponent(LA, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamB)
                    .addComponent(LB, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamC)
                    .addComponent(LC, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamD)
                    .addComponent(LD, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LA, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(LC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TeamB)
                    .addComponent(TeamC)
                    .addComponent(TeamD)
                    .addComponent(TeamA))
                .addGap(84, 84, 84)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
                Close.addActionListener(this);
              
                setTitle("QUIZ GAME");
                setForeground(Color.getHSBColor(0.9f, 0.8f, 0.6f));
                setFont(new Font("Arial", 0, 12));
                setVisible(true);
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        public void actionPerformed(ActionEvent d)
            {
            if(d.getSource()==Close)
                dispose();
            }
        }   
    }