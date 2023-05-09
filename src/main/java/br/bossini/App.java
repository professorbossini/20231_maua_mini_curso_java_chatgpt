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
            String resposta = chatGPTClient.responderPergunta(OPENAI_API_KEY, "Qual a capital do Brasil?");
            JOptionPane.showMessageDialog(null, resposta);
        }
        catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha técnica, tente novamente mais tarde");
        }
    }
}
