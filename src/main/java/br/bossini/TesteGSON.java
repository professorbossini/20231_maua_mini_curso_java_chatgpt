package br.bossini;

import com.google.gson.Gson;

public class TesteGSON {
  public static void main(String[] args) {
    RequisicaoChatGPT requisicaoChatGPT = new RequisicaoChatGPT("text-davinci-003", "Qual a capital do Brasil?", 5);
    Gson gson = new Gson();
    String json = gson.toJson(requisicaoChatGPT);
    System.out.println(json);
  }  
}
