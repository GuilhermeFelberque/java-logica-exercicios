package Java_File_E_Buffered.Exportacao_De_Usuario_Do_Sistema_Integrando_POO_E_List.application;

import Java_File_E_Buffered.Exportacao_De_Usuario_Do_Sistema_Integrando_POO_E_List.entities.Usuario;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Usuario> lista = new ArrayList<>();
        lista.add(new Usuario("Jason", "jasongames143@gmail.com", 41));
        lista.add(new Usuario("Pitoco", "pitocoben10@gmail.com", 67));
        lista.add(new Usuario("Davi", "davifarmaaura@gmail.com", 10));
        lista.add(new Usuario("It", "mariogamer@gmail.com", 27));
        String arquivo = "\\C:\\Users\\Aluno_Tarde\\Desktopusuarios.csv.txt";
        File es = new File(arquivo);
        // PASSO 2: ESCREVER — salvar a lista no arquivo usuarios.csv
        // FileWriter abre/cria o arquivo
        // BufferedWriter deixa a escrita mais rápida e segura
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
        for (Usuario u : lista){
            // cada linha fica assim: Carlos;carlos@gmail.com;25
            bw.write(u.getNome()+";"+u.getEmail()+";"+u.getIdade());
            bw.newLine(); // pula para a próxima linha
        }
            System.out.println("Arquivo usuarios.csv gerado com sucesso!");
        }catch (IOException e){
            System.out.println("Erro ao escrever o arquivo: " + e.getMessage());
        }
        List<Usuario> usuariosLidos = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(es))) {
                String linha;
            while ((linha = br.readLine())!=null){
                String[] dados = linha.split(";");
                String nome = dados[0];
                String email = dados[1];
                int idade = Integer.parseInt(dados[2]);
                Usuario usuario = new Usuario(nome, email, idade);
                usuariosLidos.add(usuario);
            }
        }catch (IOException e){
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
    }
}