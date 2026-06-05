package Sistema_de_Delivery_de_Restaurante.entities;

public class Autenticador {

    private Sistema_De_Delivery_De_Restaurante.entities.Usuario usuarioCadastro;

    public Autenticador(Sistema_De_Delivery_De_Restaurante.entities.Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public boolean autenticar(String login, String senha) {
        return usuarioCadastro.getLogin().equals(login)
                && usuarioCadastro.getSenha().equals(senha);
    }
}