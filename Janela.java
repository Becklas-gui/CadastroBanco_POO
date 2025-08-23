/*import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    // Labels
    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf, jlTipoConta;

    // TextFields
    private JTextField jtAgencia, jtConta, jtNome, jtEndereco, jtTelefone, jtCpf;

    // RadioButtons
    private JRadioButton jrCorrente, jrPoupanca;
    private ButtonGroup bgTipoConta;

    // Botões
    private JButton jbConsultar, jbAtualizar, jbFechar;

    public Janela() {
        // Configuraçoes basicas da janela

        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // E autoexplicativo eu acho, centraliza a janela
        centralizar();

       
        criarComponentes();

        // Torna visivel
        setVisible(true);
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    private void criarComponentes() {

        // Codigo da Agencia

        jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
        getContentPane().add(jlAgencia);

        jtAgencia = new JTextField();
        jtAgencia.setBounds(125, 10, 50, 20);
        getContentPane().add(jtAgencia);

        // Número da Conta
        jlConta = new JLabel("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        getContentPane().add(jlConta);

        jtConta = new JTextField();
        jtConta.setBounds(315, 10, 60, 20);
        getContentPane().add(jtConta);

        // Nome
        jlNome = new JLabel("Nome");
        jlNome.setBounds(10, 40, 80, 18);
        getContentPane().add(jlNome);

        jtNome = new JTextField();
        jtNome.setBounds(100, 40, 275, 20);
        getContentPane().add(jtNome);

        // Endereço
        jlEndereco = new JLabel("Endereço");
        jlEndereco.setBounds(10, 70, 80, 18);
        getContentPane().add(jlEndereco);

        jtEndereco = new JTextField();
        jtEndereco.setBounds(100, 70, 275, 20);
        getContentPane().add(jtEndereco);

        // Telefone
        jlTelefone = new JLabel("Telefone");
        jlTelefone.setBounds(10, 100, 80, 18);
        getContentPane().add(jlTelefone);

        jtTelefone = new JTextField();
        jtTelefone.setBounds(100, 100, 120, 20);
        getContentPane().add(jtTelefone);

        // CPF
        jlCpf = new JLabel("CPF");
        jlCpf.setBounds(230, 100, 50, 18);
        getContentPane().add(jlCpf);

        jtCpf = new JTextField();
        jtCpf.setBounds(270, 100, 105, 20);
        getContentPane().add(jtCpf);

        // Tipo de Conta
        jlTipoConta = new JLabel("Tipo de Conta");
        jlTipoConta.setBounds(10, 130, 100, 18);
        getContentPane().add(jlTipoConta);

        jrCorrente = new JRadioButton("Conta Corrente");
        jrCorrente.setBounds(120, 130, 120, 20);
        getContentPane().add(jrCorrente);

        jrPoupanca = new JRadioButton("Conta Poupança");
        jrPoupanca.setBounds(250, 130, 125, 20);
        getContentPane().add(jrPoupanca);

        // Agrupa RadioButtons
        bgTipoConta = new ButtonGroup();
        bgTipoConta.add(jrCorrente);
        bgTipoConta.add(jrPoupanca);

        // Botoes
        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(50, 170, 90, 25);
        getContentPane().add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(150, 170, 90, 25);
        getContentPane().add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(250, 170, 90, 25);
        getContentPane().add(jbFechar);
    }

    public static void main(String[] args) {
        new Janela();
    }
}*/

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    // Labels
    private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf, jlTipoConta;
    // TextFields
    private JTextField jtAgencia, jtConta, jtNome, jtEndereco, jtTelefone, jtCpf;
    // RadioButtons
    private JRadioButton jrCorrente, jrPoupanca;
    private ButtonGroup bgTipoConta;
    // Botões
    private JButton jbConsultar, jbAtualizar, jbFechar;

    public Janela() {
        // Configurações básicas da janela
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel principal para customização
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.BLACK); // Fundo preto
        painelPrincipal.setBorder(BorderFactory.createLineBorder(Color.RED, 2)); // Borda vermelha
        painelPrincipal.setLayout(null); 
        setContentPane(painelPrincipal);

        centralizar();
        criarComponentes(painelPrincipal);

        setVisible(true);
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width) / 2,
                (screen.height - janela.height) / 2);
    }

    private void criarComponentes(JPanel painel) {
        // Método para criar componentes com texto branco
        jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setForeground(Color.WHITE);
        jlAgencia.setBounds(10, 10, 110, 18);
        painel.add(jlAgencia);

        jtAgencia = new JTextField();
        jtAgencia.setBackground(Color.DARK_GRAY);
        jtAgencia.setForeground(Color.WHITE);
        jtAgencia.setBounds(125, 10, 50, 20);
        painel.add(jtAgencia);

        jlConta = new JLabel("Número da Conta");
        jlConta.setForeground(Color.WHITE);
        jlConta.setBounds(205, 10, 105, 18);
        painel.add(jlConta);

        jtConta = new JTextField();
        jtConta.setBackground(Color.DARK_GRAY);
        jtConta.setForeground(Color.WHITE);
        jtConta.setBounds(315, 10, 60, 20);
        painel.add(jtConta);

        jlNome = new JLabel("Nome");
        jlNome.setForeground(Color.WHITE);
        jlNome.setBounds(10, 40, 80, 18);
        painel.add(jlNome);

        jtNome = new JTextField();
        jtNome.setBackground(Color.DARK_GRAY);
        jtNome.setForeground(Color.WHITE);
        jtNome.setBounds(100, 40, 275, 20);
        painel.add(jtNome);

        jlEndereco = new JLabel("Endereço");
        jlEndereco.setForeground(Color.WHITE);
        jlEndereco.setBounds(10, 70, 80, 18);
        painel.add(jlEndereco);

        jtEndereco = new JTextField();
        jtEndereco.setBackground(Color.DARK_GRAY);
        jtEndereco.setForeground(Color.WHITE);
        jtEndereco.setBounds(100, 70, 275, 20);
        painel.add(jtEndereco);

        jlTelefone = new JLabel("Telefone");
        jlTelefone.setForeground(Color.WHITE);
        jlTelefone.setBounds(10, 100, 80, 18);
        painel.add(jlTelefone);

        jtTelefone = new JTextField();
        jtTelefone.setBackground(Color.DARK_GRAY);
        jtTelefone.setForeground(Color.WHITE);
        jtTelefone.setBounds(100, 100, 120, 20);
        painel.add(jtTelefone);

        jlCpf = new JLabel("CPF");
        jlCpf.setForeground(Color.WHITE);
        jlCpf.setBounds(230, 100, 50, 18);
        painel.add(jlCpf);

        jtCpf = new JTextField();
        jtCpf.setBackground(Color.DARK_GRAY);
        jtCpf.setForeground(Color.WHITE);
        jtCpf.setBounds(270, 100, 105, 20);
        painel.add(jtCpf);

        jlTipoConta = new JLabel("Tipo de Conta");
        jlTipoConta.setForeground(Color.WHITE);
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

        jbConsultar = new JButton("Consultar");
        jbConsultar.setBackground(Color.DARK_GRAY);
        jbConsultar.setForeground(Color.WHITE);
        jbConsultar.setBounds(50, 170, 90, 25);
        painel.add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBackground(Color.DARK_GRAY);
        jbAtualizar.setForeground(Color.WHITE);
        jbAtualizar.setBounds(150, 170, 90, 25);
        painel.add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBackground(Color.DARK_GRAY);
        jbFechar.setForeground(Color.WHITE);
        jbFechar.setBounds(250, 170, 90, 25);
        painel.add(jbFechar);
    }

    public static void main(String[] args) {
        new Janela();
    }
}

