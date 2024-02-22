
public class Player {

    public int number = 0; // where the guess does

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Yo digo " + number);
    }
}

