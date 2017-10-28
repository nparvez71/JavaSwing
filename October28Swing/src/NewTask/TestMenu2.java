
package NewTask;

import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import javax.swing.*;

public class TestMenu2 extends JFrame{
    JMenuBar menuBar;
    JMenu menu1,menu2,menu3,menu4;
    JMenuItem item1,item2,item3,item4,item5;
    TestMenu2(){
        setLayout(null);
        setSize(600, 300);
    menuBar=new JMenuBar();
    menu1=new JMenu("File");
    menu2=new JMenu("New");
     menu1.add(item1);
      menu1.addSeparator();
    menu3=new JMenu("open");
    item3 =new JMenuItem("From Computer");
    menu3.add(item3);
    item4 =new JMenuItem("From remote");
    menu3.add(item4);
    item4=new 
      menu4=new JMenu("Exit");
       menu1.add(item2);
       menu2=new JMenu("Help");
       menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);
        menu1.setMnemonic('f');
          menu2.setMnemonic('h');
            menu3.setMnemonic('i');
              menu4.setMnemonic('s');
              item1.setAccelerator(keyStroke.getKeyStroke('N',CTRL_DOWN_MASK));
              item2.setAccelerator(keyStroke.getKeyStroke('N',CTRL_DOWN_MASK));
        
      
    }
}
