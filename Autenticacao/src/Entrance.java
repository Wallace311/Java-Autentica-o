import javax.swing.*;
import java.awt.event.ActionListener;

public class Entrance {
    private JLabel lbl1, lbl2, lbl3, lbl4, lbl5;
    private JTextField tf1,tf2;
    private JButton btn1, btn2;





    public Entrance (){
        JFrame tela = new JFrame("Painel de Controle");
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(800, 600);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.setLayout(null);

        btn1 = new JButton();
        btn1.setBounds(20,20,150,45);
        btn1.setVisible(true);
        btn1.setText("Inicio");

        tela.add(btn1);

    }





}
