//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//class OnlineTest extends JFrame implements ActionListener
//{
//    JLabel l;
//    JRadioButton jb[]=new JRadioButton[5];
//    JButton b1,b2;
//    ButtonGroup bg;
//    int count=0,current=0,x=1,y=1,now=0;
//    int m[]=new int[10];
//    OnlineTest(String s)
//    {
//        super(s);
//        l=new JLabel();
//        add(l);
//        bg=new ButtonGroup();
//        for(int i=0;i<5;i++)
//        {
//            jb[i]=new JRadioButton();
//            add(jb[i]);
//            bg.add(jb[i]);
//        }
//        b1=new JButton("Next");
//        b2=new JButton("Bookmark");
//        b1.addActionListener(this);
//        b2.addActionListener(this);
//        add(b1);add(b2);
//        set();
//        l.setBounds(30,40,450,20);
//        jb[0].setBounds(50,80,100,20);
//        jb[1].setBounds(50,110,100,20);
//        jb[2].setBounds(50,140,100,20);
//        jb[3].setBounds(50,170,100,20);
//        b1.setBounds(100,240,100,30);
//        b2.setBounds(270,240,100,30);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLayout(null);
//        setLocation(250,100);
//        setVisible(true);
//        setSize(600,350);
//    }
//    public void actionPerformed(ActionEvent e)
//    {
//        if(e.getSource()==b1)
//        {
//            if(check())
//                count=count+1;
//            current++;
//            set();
//            if(current==9)
//            {
//                b1.setEnabled(false);
//                b2.setText("Result");
//            }
//        }
//        if(e.getActionCommand().equals("Bookmark"))
//        {
//            JButton bk=new JButton("Bookmark"+x);
//            bk.setBounds(480,20+30*x,100,30);
//            add(bk);
//            bk.addActionListener(this);
//            m[x]=current;
//            x++;
//            current++;
//            set();
//            if(current==9)
//                b2.setText("Result");
//            setVisible(false);
//            setVisible(true);
//        }
//        for(int i=0,y=1;i<x;i++,y++)
//        {
//            if(e.getActionCommand().equals("Bookmark"+y))
//            {
//                if(check())
//                    count=count+1;
//                now=current;
//                current=m[y];
//                set();
//                ((JButton)e.getSource()).setEnabled(false);
//                current=now;
//            }
//        }
//
//        if(e.getActionCommand().equals("Result"))
//        {
//            if(check())
//                count=count+1;
//            current++;
//            //System.out.println("correct ans="+count);
//            JOptionPane.showMessageDialog(this,"correct ans="+count);
//            System.exit(0);
//        }
//    }
//    void set()
//    {
//        jb[4].setSelected(true);
//        if(current==0)
//        {
//            l.setText("Que1: Microprocessor was invented by");
//            jb[0].setText("Alfred Nobel");jb[1].setText("Federico Faggin");jb[2].setText("Zacharias Janssen");jb[3].setText("Percy Spencer");
//        }
//        if(current==1)
//        {
//            l.setText("Que2: Who invented ball point pen?");
//            jb[0].setText("BIRO BROTHERS");jb[1].setText("WATERMAN BROTHERS");jb[2].setText("BICC BROTHERS");jb[3].setText("WRITE BROTHERS");
//        }
//        if(current==2)
//        {
//            l.setText("Que3: Television was invented by..");
//            jb[0].setText("SHOLES");jb[1].setText("J.L.BAIRD");jb[2].setText("SHOCLLEY");jb[3].setText("JOHN NAPIER");
//        }
//        if(current==3)
//        {
//            l.setText("Que4: Who invented Aeroplane");
//            jb[0].setText(" J. Robert Oppenheimer");jb[1].setText("Kirkpatrick Macmillan");jb[2].setText("Wallace Carothers");jb[3].setText("Orville & Wilbur Wright");
//        }
//        if(current==4)
//        {
//            l.setText("Que5: Who invented Air Conditioning?");
//            jb[0].setText("Willis Carrier");jb[1].setText("Ladislo Biro");jb[2].setText("Martin Cooper");jb[3].setText("Thomas Edison");
//        }
//        if(current==5)
//        {
//            l.setText("Who invented the internet?");
//            jb[0].setText("Robert E. Kahn and Vint Cerf");jb[1].setText("Philip Diehlt");jb[2].setText("William Sturgeon");jb[3].setText("Frederick Banting");
//        }
//        if(current==6)
//        {
//            l.setText("Que7: The existence of isotopes was discovered by");
//            jb[0].setText("Emil Kraepelin");jb[1].setText("Trofim Lysenko");jb[2].setText("Frederick Soddy");
//            jb[3].setText("Francis Galton");
//        }
//        if(current==7)
//        {
//            l.setText("Que8: Who invented the wireless remote control?");
//            jb[0].setText("Frank Nesso");jb[1].setText("Alexandre Alexeieff");jb[2].setText("Robert Adler");
//            jb[3].setText("Ami Argand");
//        }
//        if(current==8)
//        {
//            l.setText("Que9: Who invented the FM radio?");
//            jb[0].setText("Edwin Howard Armstrong");jb[1].setText(" Edward Henrik Armstrong");jb[2].setText("Louis Theroux");jb[3].setText("Adam Anter");
//        }
//        if(current==9)
//        {
//            l.setText("Que10: Who build the first modern motorcar?");
//            jb[0].setText("Daimler");jb[1].setText("Karl Benz");jb[2].setText("Henry Austin");
//            jb[3].setText("Henry Ford");
//        }
//        l.setBounds(30,40,450,20);
//        for(int i=0,j=0;i<=90;i+=30,j++)
//            jb[j].setBounds(50,80+i,200,20);
//    }
//    boolean check()
//    {
//        if(current==0)
//            return(jb[1].isSelected());
//        if(current==1)
//            return(jb[0].isSelected());
//        if(current==2)
//            return(jb[1].isSelected());
//        if(current==3)
//            return(jb[3].isSelected());
//        if(current==4)
//            return(jb[1].isSelected());
//        if(current==5)
//            return(jb[0].isSelected());
//        if(current==6)
//            return(jb[2].isSelected());
//        if(current==7)
//            return(jb[3].isSelected());
//        if(current==8)
//            return(jb[1].isSelected());
//        if(current==9)
//            return(jb[2].isSelected());
//        return false;
//    }
//    public static void main(String s[])
//    {
//        new OnlineTest("Online Test Of Java");
//    }
//}
//public int[] findPeakGrid(int[][] mat) {
//        int l=0;
//        int index=0;
//        int[] ans=new int[2];
//        int r=mat[0].length-1;
//        while(l<=r){
//        int mid=l+(r-l)/2;
//        int max=Integer.MAX_VALUE;
//        for (int i=0;i<mat.length;i++){
//        if (mat[i][mid]>max){
//        max=mat[i][mid];
//        index=i;
//        }
//        }
//        if ((mat[index][mid]>=mat[index-1][mid])&&(mat[index][mid]>=mat[index+1][mid])){
//        ans[0]=index;
//        ans[1]=mid;
//        }
//        else if(mat[index-1][mid]>mat[index][mid]){
//        r=mid-1;
//        }
//        else if(mat[index+1][mid]>mat[index][mid]){
//        l=mid+1;
//        }
//        }
//        return ans;
//        }
//        }