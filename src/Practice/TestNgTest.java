package Practice;

import org.junit.Assert;

public class TestNgTest {

    public void testSum() {
        System.out.println("first test");
        TestNgClass obj = new TestNgClass();
        int result = obj.sumNumber(1,2);
        Assert.assertEquals(result,3);
    }
}