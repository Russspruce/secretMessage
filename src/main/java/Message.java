public class Message {

  public String createSecret(String inputPhrase) {

    String secretPhrase =inputPhrase.replaceAll("e", "-");

    return secretPhrase;
  }
}
