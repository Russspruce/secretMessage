import org.junit.*;
import static org.junit.Assert.*;

public class MessageTest {

  @Test
  public void checkMessage_returnString_hllo() {
    Message testMessage = new Message();
    String expected = "h_llo";
    assertEquals(expected, testMessage.createSecret("hello"));
  }

}
