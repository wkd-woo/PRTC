package WithInterface;

public class Lion extends Animal implements Predetor{
    @Override
    public String getFood() {
        return "banana";
    }
}
