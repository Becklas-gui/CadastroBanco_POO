
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Janela extends JFrame {

    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf, jlTipoConta;
    private JTextField jtAgencia, jtConta, jtNome, jtEndereco, jtTelefone, jtCpf;
    private JRadioButton jrCorrente, jrPoupanca;
    private ButtonGroup bgTipoConta;
    private JButton jbConsultar, jbAtualizar, jbFechar;
    //Cria janela

    public Janela() {
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal com degrade
        JPanel painelPrincipal = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(0, 0, Color.BLACK, 0, getHeight(), Color.DARK_GRAY);
                g2.setPaint(gp);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        painelPrincipal.setBorder(BorderFactory.createLineBorder(Color.RED, 4, true));//Borda por puro estilo
        painelPrincipal.setLayout(null);
        setContentPane(painelPrincipal);

        centralizar();
        criarComponentes(painelPrincipal);
        setVisible(true);
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
    }

    // Cria e posiciona todos os componentes na janela
    private void criarComponentes(JPanel painel) {
        Font fonte = new Font("Arial", Font.BOLD, 12);

        jlAgencia = new JLabel("Código da Agência:");
        jlAgencia.setForeground(Color.WHITE);
        jlAgencia.setFont(fonte);
        jlAgencia.setBounds(10, 10, 110, 18);
        painel.add(jlAgencia);


        jtAgencia = criarTextField("Ex: 1234", 125, 10, 50, 20, painel);
        //Conta
        jlConta = new JLabel("Número da Conta:");
        jlConta.setForeground(Color.WHITE);
        jlConta.setFont(fonte);
        jlConta.setBounds(205, 10, 105, 18);
        painel.add(jlConta);

        jtConta = criarTextField("Ex: 56789-0", 315, 10, 60, 20, painel);
        //Nome
        jlNome = new JLabel("Nome:");
        jlNome.setForeground(Color.WHITE);
        jlNome.setFont(fonte);
        jlNome.setBounds(10, 40, 80, 18);
        painel.add(jlNome);

        jtNome = criarTextField("Digite seu nome:", 100, 40, 275, 20, painel);
        //Endereço
        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setForeground(Color.WHITE);
        jlEndereco.setFont(fonte);
        jlEndereco.setBounds(10, 70, 80, 18);
        painel.add(jlEndereco);

        jtEndereco = criarTextField("Digite seu endereço:", 100, 70, 275, 20, painel);
        //Telefone
        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setForeground(Color.WHITE);
        jlTelefone.setFont(fonte);
        jlTelefone.setBounds(10, 100, 80, 18);
        painel.add(jlTelefone);

        jtTelefone = criarTextField("(XX) XXXX-XXXX", 100, 100, 120, 20, painel);
        //CPF
        jlCpf = new JLabel("CPF:");
        jlCpf.setForeground(Color.WHITE);
        jlCpf.setFont(fonte);
        jlCpf.setBounds(230, 100, 50, 18);
        painel.add(jlCpf);

        jtCpf = criarTextField("XXX.XXX.XXX-XX", 270, 100, 105, 20, painel);

        //Tipos de Conta
        jlTipoConta = new JLabel("Tipo de Conta");
        jlTipoConta.setForeground(Color.WHITE);
        jlTipoConta.setFont(fonte);
        jlTipoConta.setBounds(10, 130, 100, 18);
        painel.add(jlTipoConta);

        jrCorrente = new JRadioButton("Conta Corrente");
        jrCorrente.setForeground(Color.WHITE);
        jrCorrente.setBackground(Color.BLACK);
        jrCorrente.setBounds(120, 130, 120, 20);
        painel.add(jrCorrente);

        jrPoupanca = new JRadioButton("Conta Poupança");
        jrPoupanca.setForeground(Color.WHITE);
        jrPoupanca.setBackground(Color.BLACK);
        jrPoupanca.setBounds(250, 130, 125, 20);
        painel.add(jrPoupanca);

        bgTipoConta = new ButtonGroup();
        bgTipoConta.add(jrCorrente);
        bgTipoConta.add(jrPoupanca);

        // Botões com efeito hover
        jbConsultar = criarBotao("Consultar", 50, 170, 90, 25, painel);
        jbAtualizar = criarBotao("Atualizar", 150, 170, 90, 25, painel);
        jbFechar = criarBotao("Fechar", 250, 170, 90, 25, painel);
    }

    // Cria JTextField com placeholder
    private JTextField criarTextField(String placeholder, int x, int y, int w, int h, JPanel painel) {
        JTextField tf = new JTextField(placeholder);
        tf.setBounds(x, y, w, h);
        tf.setBackground(Color.DARK_GRAY);
        tf.setForeground(Color.LIGHT_GRAY);
        tf.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (tf.getText().equals(placeholder)) {
                    tf.setText("");
                    tf.setForeground(Color.WHITE);
                }
            }
            public void focusLost(FocusEvent e) {
                if (tf.getText().isEmpty()) {
                    tf.setText(placeholder);
                    tf.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        painel.add(tf);
        return tf;
    }

    // Cria JButton com efeito hover
    private JButton criarBotao(String texto, int x, int y, int w, int h, JPanel painel) {
        JButton btn = new JButton(texto);
        btn.setBounds(x, y, w, h);
        btn.setBackground(Color.DARK_GRAY);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(MouseEvent e) {//Hover pra ficar bonitinho
                btn.setBackground(Color.RED);
            }
            public void mouseExited(MouseEvent e) {
                btn.setBackground(Color.DARK_GRAY);
            }
        });
        painel.add(btn);
        return btn;
    }

    public static void main(String[] args) {
        new Janela();
    }
}

