package WithInterface;

public class Crocodile extends Animal implements Predetor{
    @Override
    public String getFood() {
        return "peach";
    }
}
