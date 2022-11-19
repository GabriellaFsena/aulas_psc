package jogoveia;

import javax.swing.*;
public class Login {
    public void show() {
        JFrame frame = new JFrame();
        frame.setSize(300,250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel lblUsuario = new JLabel("Usuário:");
        lblUsuario.setBounds(10,20,80,25);
        
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(80, 20, 150, 25);
        
        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(10,60,80,25);
            
        
        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(70,60, 210, 25);
        
        JButton btnEntrar = new JButton();
        btnEntrar.setText("Entrar");
        btnEntrar.setBounds(70,100,100,25);
        btnEntrar.addActionListener(e -> {;
        String usuario = txtUsuario.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        
        if("Gabi".equalsIgnoreCase(usuario) && "123".equalsIgnoreCase(senha)) {
            //instamciar a tela do jogo
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta");
        }
       
        
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblSenha);
        panel.add(txtSenha);
        panel.add(btnEntrar);
        
        
        JTextField txUsuario = new JTextField();
        txtUsuario.setBounds(80,20,150,25);
        
        panel.add(lblUsuario);
        
        frame.add(panel);
        frame.getRootPane().setDefaultButton(btnEntrar);
        frame.setVisible(true);
    
                

}