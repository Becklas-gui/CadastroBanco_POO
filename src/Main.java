import javax.swing.SwingUtilities;
import telas.Janela;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Janela janela = new Janela();
            janela.setVisible(true);
        });
    }
}