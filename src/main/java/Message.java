public class Message {

  public String createSecret(String inputPhrase) {

    String secretPhrase =inputPhrase.replaceAll("(?i)[aeiou]", "_");

    return secretPhrase;
  }
}
