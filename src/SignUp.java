import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class SignUp implements ActionListener {

    HashMap<String,String> SignUpInfos = new HashMap<>();

    JFrame frame = new JFrame();
    JTextField Name = new JTextField();
    JPasswordField Pass = new JPasswordField();
    JButton SignUp = new JButton("Sign-Up");
    JButton Clear = new JButton("Clear");
    JLabel NameLabel = new JLabel("User Name: ");
    JLabel PassLabel = new JLabel("Password: ");
    JLabel MsgLabel = new JLabel();

    public SignUp(HashMap<String, String> signUpInfos) {
        SignUpInfos = signUpInfos;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,480);
        frame.setLayout(null);
        frame.setVisible(true);

        NameLabel.setBounds(45,45,110,35);
        NameLabel.setFont(new Font(null , Font.BOLD , 15));

        Name.setBounds(45,90,310,60);
        Name.setFont(new Font(null , Font.ITALIC , 25));

        PassLabel.setBounds(45,150,180,35);
        PassLabel.setFont(new Font(null , Font.BOLD , 15));

        Pass.setBounds(45,200,310,60);

        SignUp.setBounds(50,275,140,60);
        SignUp.setFont(new Font(null , Font.BOLD , 15));
        SignUp.addActionListener(this);

        Clear.setBounds(235,275,110,60);
        Clear.setFont(new Font(null , Font.BOLD , 15));
        Clear.addActionListener(this);

        MsgLabel.setBounds(45,352,310,25);
        MsgLabel.setFont(new Font(null, Font.CENTER_BASELINE,18));

        frame.add(NameLabel);
        frame.add(Name);
        frame.add(PassLabel);
        frame.add(Pass);
        frame.add(SignUp);
        frame.add(Clear);
        frame.add(MsgLabel);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Clear){
            Name.setText("");
            Pass.setText("");
        }
        if (e.getSource()==SignUp){
            String TempName = Name.getText();
            String TempPassword = String.valueOf(Pass.getPassword());
            SignUpInfos.put(TempName,TempPassword);
            MsgLabel.setText("Done Signing Up....");
            /*int i=0;
            while(i<1000000){
                i++;
            } instead we will do something to make a delay of 1sec */
            MsgLabel.setForeground(Color.GREEN);
            Welcome welcome = new Welcome();
        }
    }
}
