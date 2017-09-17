package visitor;

import org.junit.Test;
import visitor.impl.CustomerA;
import visitor.impl.CustomerB;
import visitor.impl.Merchant;

public class MainTest {

    @Test
    public void visitorTest() throws Exception {
        Merchant m = new Merchant();
        CustomerA customerA = new CustomerA();
        CustomerB customerB = new CustomerB();

        m.accept(customerA);
        m.accept(customerB);
    }
}
