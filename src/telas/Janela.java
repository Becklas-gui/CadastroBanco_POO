
package telas;

import func.function;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import obj.Clientes;
import obj.Conta;

    public class Janela extends JFrame {
        private JLabel jlAgencia, jlConta, jlNome, jlEndereco, jlTelefone, jlCpf;
        private JTextField jtfAgencia, jtfConta, jtfNome, jtfEndereco, jtfTelefone, jtfCpf;
        private JSeparator jSeparator01, jSeparator02;// aquelas linhas lá
        private JRadioButton jrbCorrente, jrbPoupanca;
        private ButtonGroup bgContas;
        private JButton jbConsultar, jbAtualizar, jbFechar;
        private JPanel panel;

    // Objetos para armazenar os dados consultados
    
    private Clientes cliente;

     private Conta conta;

    public Janela() {
        setTitle("Java Swing - Desenvolvimento de Sistemas");
        setSize(400, 255);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        centralizar();

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createLineBorder(Color.RED, 2, true));

        setContentPane(panel);

        criarComponentes();
        configurarBotoes();
    }

    private void criarComponentes() {
        Font fonte = new Font("Arial", Font.BOLD, 12);

        jlAgencia = new JLabel("Código da Agência");
        jlAgencia.setBounds(10, 10, 110, 18);
         jlAgencia.setForeground(Color.WHITE);
        jlAgencia.setFont(fonte);
        panel.add(jlAgencia);


        jtfAgencia = new JTextField();
        jtfAgencia.setBounds(125, 10, 50, 20);
            jtfAgencia.setBackground(Color.DARK_GRAY);
            jtfAgencia.setForeground(Color.WHITE);
        panel.add(jtfAgencia);


        jlConta = new JLabel("Número da Conta");
        jlConta.setBounds(205, 10, 105, 18);
        jlConta.setForeground(Color.WHITE);
        jlConta.setFont(fonte);
        panel.add(jlConta);


        jtfConta = new JTextField();
        jtfConta.setBounds(315, 10, 60, 20);
        jtfConta.setBackground(Color.DARK_GRAY);
        jtfConta.setForeground(Color.WHITE);
        panel.add(jtfConta);


        jSeparator01 = new JSeparator();
        jSeparator01.setBounds(10, 40, 365, 10);

        panel.add(jSeparator01);

        jlNome = new JLabel("Nome:");
        jlNome.setBounds(10, 50, 60, 18);
        jlNome.setHorizontalAlignment(SwingConstants.RIGHT);
        jlNome.setForeground(Color.WHITE);
        jlNome.setFont(fonte);
        panel.add(jlNome);


        jtfNome = new JTextField();
        jtfNome.setBounds(75, 50, 300, 20);
            jtfNome.setBackground(Color.DARK_GRAY);
            jtfNome.setForeground(Color.WHITE);
        panel.add(jtfNome);


        jlEndereco = new JLabel("Endereço:");
        jlEndereco.setBounds(10, 75, 60, 18);
        jlEndereco.setHorizontalAlignment(SwingConstants.RIGHT);
         jlEndereco.setForeground(Color.WHITE);
        jlEndereco.setFont(fonte);
        panel.add(jlEndereco);


        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(75, 75, 300, 20);
        jtfEndereco.setBackground(Color.DARK_GRAY);
        jtfEndereco.setForeground(Color.WHITE);
        panel.add(jtfEndereco);

        jlTelefone = new JLabel("Telefone:");
        jlTelefone.setBounds(10, 100, 60, 18);
        jlTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
         jlTelefone.setForeground(Color.WHITE);
        
        jlTelefone.setFont(fonte);
        panel.add(jlTelefone);

        jtfTelefone = new JTextField();
        jtfTelefone.setBounds(75, 100, 300, 20);
        jtfTelefone.setBackground(Color.DARK_GRAY);
        jtfTelefone.setForeground(Color.WHITE);
        panel.add(jtfTelefone);

        jlCpf = new JLabel("CPF:");
        jlCpf.setBounds(10, 125, 60, 18);
        jlCpf.setHorizontalAlignment(SwingConstants.RIGHT);
         jlCpf.setForeground(Color.WHITE);
        jlCpf.setFont(fonte);
        panel.add(jlCpf);

        jtfCpf = new JTextField();
        jtfCpf.setBounds(75, 125, 300, 20);
        jtfCpf.setBackground(Color.DARK_GRAY);
        jtfCpf.setForeground(Color.WHITE);
        panel.add(jtfCpf);

        jrbCorrente = new JRadioButton("Conta Corrente");
        jrbCorrente.setBounds(100, 150, 111, 20);
        jrbCorrente.setMnemonic(KeyEvent.VK_C);
        jrbCorrente.setSelected(true);
        jrbCorrente.setBackground(Color.BLACK);
        jrbCorrente.setForeground(Color.WHITE);
        panel.add(jrbCorrente);

        jrbPoupanca = new JRadioButton("Conta Poupança");
        jrbPoupanca.setBounds(225, 150, 118, 20);
        jrbPoupanca.setMnemonic(KeyEvent.VK_P);
        jrbPoupanca.setBackground(Color.BLACK);
        jrbPoupanca.setForeground(Color.WHITE);

        panel.add(jrbPoupanca);

        bgContas = new ButtonGroup();
        bgContas.add(jrbCorrente);
        bgContas.add(jrbPoupanca);

        jSeparator02 = new JSeparator();
        jSeparator02.setBounds(10, 180, 365, 10);
        panel.add(jSeparator02);

        jbConsultar = new JButton("Consultar");
        jbConsultar.setBounds(35, 190, 100, 23);
        jbConsultar.setMnemonic(KeyEvent.VK_S);
        jbConsultar.setBackground(Color.LIGHT_GRAY);
        panel.add(jbConsultar);

        jbAtualizar = new JButton("Atualizar");
        jbAtualizar.setBounds(145, 190, 100, 23);
        jbAtualizar.setMnemonic(KeyEvent.VK_A);
        jbAtualizar.setEnabled(false);
        jbAtualizar.setBackground(Color.LIGHT_GRAY);
        panel.add(jbAtualizar);

        jbFechar = new JButton("Fechar");
        jbFechar.setBounds(255, 190, 100, 23);
        jbFechar.setMnemonic(KeyEvent.VK_F);
        jbFechar.setBackground(Color.LIGHT_GRAY);
        panel.add(jbFechar);
    }

    private void configurarBotoes() {
        // Botão de consultar
        jbConsultar.addActionListener(e -> {



            // Validação do CPF
            if (!function.validarCpf(jtfCpf.getText())) {
              JOptionPane.showMessageDialog(this, "CPF inválido, certifique-se de conter 11 números.");
                return;
            }

            // Cria cliente
            cliente = new Clientes(
                jtfNome.getText(),
                jtfEndereco.getText(),
                jtfTelefone.getText(),
                jtfCpf.getText()
            );

            // Cria conta

            int agencia = Integer.parseInt(jtfAgencia.getText());
            int numero = Integer.parseInt(jtfConta.getText());
            String tipo = jrbCorrente.isSelected() ? "Corrente" : "Poupanca";
            conta = new Conta(agencia, numero, tipo);

            // Mostrar dados consultados
            JOptionPane.showMessageDialog(this,
                "Dados inseridos:\n" +
                "Cliente: " + cliente.getNome() +
                "\nCPF: " + cliente.getCpf() +
                "\nTelefone: " + cliente.getTelefone() +
                "\nConta: " + conta.getNumero() +
                "\nTipo: " + conta.getTipo()
            );

            jbAtualizar.setEnabled(true);
        });

        // Botão de atualizar

        jbAtualizar.addActionListener(e -> {
            if (cliente == null || conta == null) {
                JOptionPane.showMessageDialog(this, "Nenhum dado existente");
                return;
            }

            // Atualiza os dados dos objetos com os valores da tela
            cliente.setNome(jtfNome.getText());
            cliente.setEndereco(jtfEndereco.getText());
            cliente.setTelefone(jtfTelefone.getText());
            cliente.setCpf(jtfCpf.getText());

            conta.setAgencia(Integer.parseInt(jtfAgencia.getText()));
            conta.setNumero(Integer.parseInt(jtfConta.getText()));
            conta.setTipo(jrbCorrente.isSelected() ? "Corrente" : "Poupanca");

            JOptionPane.showMessageDialog(this,
                "Dados atualizados!\n" +
                "Cliente: " + cliente.getNome() +
                "\nCPF: " + cliente.getCpf() +
                "\nTelefone: " + cliente.getTelefone() +
                "\nConta: " + conta.getNumero() +
                "\nTipo: " + conta.getTipo()
            );
        });

        // Botão pra fechar
        jbFechar.addActionListener(e -> System.exit(0));
    }

    private void centralizar() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
         Dimension janela = getSize();
        if (janela.height > screen.height) setSize(janela.width, screen.height);
        if (janela.width > screen.width) setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2,
                    (screen.height - janela.height) / 2);
    }
}
