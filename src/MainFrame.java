import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
    public MainFrame(){init();}
    private Button btnExit = new Button("Exit");
    private Button btnAdd = new Button("Add");
    private Label lab = new Label("0");
    private int n=0;
    private void init(){
//        this.setLocation(100,120);
//        this.setSize(400,300);
        this.setLayout(null);
        this.setBackground(new Color (129, 242, 255));
        btnExit.setBackground(Color.red);
        btnAdd.setBackground(Color.green);

        this.setBounds(100,120,400,300);
        btnExit.setBounds(280,180,50,50);
        btnAdd.setBounds(280,150,50,50);
        lab.setBounds(180,150,50,50);

        this.add(btnExit);
        this.add(btnAdd);
        this.add(lab);

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
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n++;
                lab.setText(Integer.toString(n));
            }
        });
    }
}
