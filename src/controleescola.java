
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class controleescola extends JFrame{
JLabel rotulo1, rotulo2, rotulo3;
JTextField texto1;
JPasswordField caixa;
JButton button1, button2, button3;
JComboBox lista;
String opcoes[]={"Aluno","Coordenação"};

        public controleescola(){
            super("Login");
            Container tela = getContentPane();
            setLayout(null);
            rotulo1 = new JLabel("Entrar como:");
            rotulo2 = new JLabel ("RM/ID");
            rotulo3 = new JLabel ("Senha");
            texto1 = new JTextField(10);
            caixa = new JPasswordField(10);
            button1 = new JButton("Entrar");
            button2 = new JButton("Cadastrar-se");
            button3 = new JButton("Recuperar Senha");
            lista = new JComboBox(opcoes);
            lista.setMaximumRowCount(2);
            rotulo1.setBounds(180,90,100,20);
            rotulo2.setBounds(180,150,100,20);
            rotulo3.setBounds(180,210,100,20);
            texto1.setBounds(180,170,150,20);
            caixa.setBounds(180,230,150,20);
            button1.setBounds(180,280,150,20);
            button2.setBounds(180,315,150,20);
            button3.setBounds(180,345,150,20);
            lista.setBounds(180,115,150,20);
            
            button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    cadastro cad = new cadastro();
          
     dispose();}});
            
            button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    senha senha = new senha ();
          
     dispose();}});
           
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(texto1);
            tela.add(caixa);
            tela.add(button1); 
            tela.add(button2);
            tela.add(button3);
            tela.add(lista);
            setSize(500,500);
            setVisible(true);
        }
        
               
    
    public static void main(String[] args) {
       controleescola app= new controleescola();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
