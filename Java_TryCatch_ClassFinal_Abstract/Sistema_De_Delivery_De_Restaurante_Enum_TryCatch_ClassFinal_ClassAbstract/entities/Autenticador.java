package Java_TryCatch_ClassFinal_Abstract.Sistema_De_Delivery_De_Restaurante_Enum_TryCatch_ClassFinal_ClassAbstract.entities;

public class Autenticador {
    private Usuario usuarioCadastro;

    public Autenticador(Usuario usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }

    public boolean autenticar(String login, String senha) {
        return usuarioCadastro.getLogin().equals(login) && usuarioCadastro.getSenha().equals(senha);
    }
}
