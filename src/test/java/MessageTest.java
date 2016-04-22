import org.junit.*;
import static org.junit.Assert.*;

public class MessageTest {

  @Test
  public void checkMessage_returnString_h_llo() {
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

  @Test
  public void checkSentence_returnString_longSentence() {
    Message testMessage = new Message();
    String expected = "Th_s _s _ m_ss_g_ _ wr_t_.";
    assertEquals(expected, testMessage.createSecret("This is a message I wrote."));
  }
}
