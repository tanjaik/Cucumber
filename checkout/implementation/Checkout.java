package implementation;
public class Checkout {
public void add(int count, int price) { }
}
public class CheckoutSteps { int bananaPrice = 0;
@Given("^the price of a \"(.*?)\" is (\\d+)c$")
public void thePriceOfAIsC(String name, int price) throws Throwable {
        bananaPrice = price;
    }