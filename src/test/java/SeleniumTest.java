import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SeleniumTest {
    @Before //veiksmai, kurie bus atliekami pries kiekviena testa
    public void setup(){
        Selenium.setup();   //suranda webdriveri, uzkrauna url ir kt.
    }

    @Test
    @Order(1)
    public void getResults(){
        Selenium.search("Baranauskas");
        //pirmas parametras bus expected, antras - actual
        Assert.assertEquals(116000, Selenium.getResults());
    }

    @Test
    @Order(2)
    public void searchByKeywordTest(){
        Selenium.search("Baranauskas");
    }



    @After
    public void close(){
        Selenium.close();
    }
}
