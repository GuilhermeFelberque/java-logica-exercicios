package Java_File_E_Buffered.Diario_De_Jogos_Foco_em_Sintaxe_e_Fluxo_Básico.Aplication;

import Java_File_E_Buffered.Diario_De_Jogos_Foco_em_Sintaxe_e_Fluxo_Básico.entities.JogosSalvos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class
Menu {
    static void Menu (){
        List<JogosSalvos> list= List.of(
                new JogosSalvos("Valorante"),
                new JogosSalvos("Monster Hunter Rise"),
                new JogosSalvos("Repo"),
                new JogosSalvos("The Sims 3"),
                new JogosSalvos("Baldur Gates")
        );

        String path="C:\\Users\\Aluno_Tarde\\DesktopJogosSalvos.txt";
        try (BufferedWriter bw=new BufferedWriter(new FileWriter(path))){
            for (JogosSalvos line:list){
                bw.write(line.toString());
                bw.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
