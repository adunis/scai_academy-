
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import RandomNumbers.RandomNumberGenerator;
public class RandomNumberGeneratorTest {  
    RandomNumberGenerator _sut; 
    @Test
    public void testApp() {
    assertTrue(true);
    }

    @Test
   public void testGetRandomNumbers(){
    _sut = new RandomNumberGenerator();
    System.out.println(_sut.getRandomNumbers(10, 1, 20));
    assertNotNull(_sut.getRandomNumbers(5, 1, 20)); // How many numbers to generate | Minimum value generable | Maximum value generable 
   }

   @Test
   public void testGenerateRequestURL(){
       _sut = new RandomNumberGenerator();
    assertEquals("https://www.random.org/integers/?num=0&min=0&max=0&col=1&base=10&format=plain&rnd=new", _sut.generateRequestURL(0, 0, 0));
   }


}

