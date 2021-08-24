package WithInterface;

public class Tiger extends Animal implements Predetor {
    @Override
    public String getFood() {
        return "apple";
    }
}
