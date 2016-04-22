import org.junit.*;
import static org.junit.Assert.*;

public class MessageTest {

  @Test
  public void checkMessage_returnString_hllo() {
    Message testMessage = new Message();
    String expected = "h_ll_";
    assertEquals(expected, testMessage.createSecret("hello"));
  }

  @Test
  public void checkMessage_removeMultiple_h_v_() {
    Message testMessage = new Message();
    String expected = "h_v_";
    assertEquals(expected, testMessage.createSecret("have"));
  }

  @Test
  public void checkCapitalLetters_returnString_Open() {
    Message testMessage = new Message();
    String expected = "_p_n";
    assertEquals(expected, testMessage.createSecret("Open"));
  }
}
