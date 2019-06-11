public class TemplateMethodDemo {

    public static void main(String[] args) {

        Automobile automobile = new PaganiZonda();

        automobile.CreateAutomobile();
        System.out.println("==================");

        automobile = new ToyotaCamry();
        automobile.CreateAutomobile();
    }
}
