package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioDeRegistro extends JFrame {

    private JTextField campoNome;
    private JTextField campoEmail;
    private JPasswordField campoSenha;

    public FormularioDeRegistro() {
        setTitle("Formulário de Registro");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o painel principal
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 2));

        // Cria os rótulos e campos de texto
        JLabel rotuloNome = new JLabel("Nome:");
        campoNome = new JTextField(20);

        JLabel rotuloEmail = new JLabel("Email:");
        campoEmail = new JTextField(20);

        JLabel rotuloSenha = new JLabel("Senha:");
        campoSenha = new JPasswordField(20);

        // Cria o botão
        JButton botaoRegistrar = new JButton("Registrar");

        // Adiciona os componentes ao painel
        painel.add(rotuloNome);
        painel.add(campoNome);
        painel.add(rotuloEmail);
        painel.add(campoEmail);
        painel.add(rotuloSenha);
        painel.add(campoSenha);
        painel.add(botaoRegistrar);

        // Adiciona o painel ao frame
        add(painel);

        // ActionListener para o botão de registro
        botaoRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                String email = campoEmail.getText();
                String senha = new String(campoSenha.getPassword());

                // Realize aqui a lógica de registro
                // Você pode imprimir ou processar os dados informados conforme necessário

                System.out.println("Nome: " + nome);
                System.out.println("Email: " + email);
                System.out.println("Senha: " + senha);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FormularioDeRegistro().setVisible(true);
            }
        });
    }
}
