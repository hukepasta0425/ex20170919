import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    public MainFrame(){init();}
    private Button btnExit = new Button("Exit");
    private void init(){
//        this.setLocation(100,120);
//        this.setSize(400,300);
        this.setBounds(100,120,400,300);
        this.setLayout(null);
        btnExit.setBounds(80,80,50,50);
        this.add(btnExit);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
