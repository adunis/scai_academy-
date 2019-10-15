package corso;

import org.junit.Test;
import static org.junit.Assert.*;

public class ifAnagramTest{

    CheckIfAnagram _sut; 

    @Test
    public void testifAnagramFalse() {
        _sut = new CheckIfAnagram();
        assertFalse(_sut.isAnagram("str1", "str2"));
    }

    @Test
    public void testifAnagramEquals() {
        _sut = new CheckIfAnagram();
        assertFalse(_sut.isAnagram("str1", "str1"));
    }

    @Test
    public void testifAnagramTrue() {
        _sut = new CheckIfAnagram();
        assertTrue(_sut.isAnagram("str1", "1str"));
    }
}
