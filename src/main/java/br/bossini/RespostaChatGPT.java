package br.bossini;

import java.util.List;

@lombok.Getter
@lombok.Setter
public class RespostaChatGPT {
  private List<Choice> choices;
}
