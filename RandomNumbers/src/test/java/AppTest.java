
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
   
    App _sut; 

    @Test
    public void testApp() {
    assertTrue(true);
    }

    @Test
   public void testHelloWorld(){
    _sut = new App(); 
    assertTrue(_sut.HelloWorld()); 
   }

}

