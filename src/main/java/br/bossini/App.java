package br.bossini;
import javax.swing.JOptionPane;

import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.fluent.*;
public class App {
    public static void main(String[] args) {
        try {
            Configurations configurations = new Configurations();
            Configuration config = null;
            config = configurations.properties("config.properties");
            String OPENAI_API_KEY = config.getString("OPENAI_API_KEY");
            var chatGPTClient = new ChatGPTClient();
            String perguntaCriada = chatGPTClient.criarPergunta(
                OPENAI_API_KEY,
                "Java",
                "Múltipla Escolha",
                "Fácil",
                "Qual o resultado da expressão 2 + 2?"
            );
            JOptionPane.showMessageDialog(null, perguntaCriada);
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha técnica, tente novamente mais tarde");
        }
    }
}
