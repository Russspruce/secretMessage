public class Message {

  public String createSecret(String inputPhrase) {

    String secretPhrase =inputPhrase.replaceAll("[ae]", "_");

    return secretPhrase;
  }
}
