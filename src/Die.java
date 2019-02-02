import java.util.ArrayList;
import java.util.Random;

public class Die {

    private int sides;
    private int face_value;

    Die(int s){
        if (sides <= 1) {
            throw new IllegalArgumentException();
        } else {
            sides = s;
            face_value = 1;
        }
    }

    public int getSides(){
        return sides;
    }

    public int getFace_value(){
        return face_value;
    }

    public int roll(){
        Random rng = new Random();
        int rollRes = rng.nextInt(getSides()+1);
        face_value = rollRes;
        return rollRes;
    }

    public int rollRange(int min, int max) {
        Random rng = new Random();
        int rollRes = rng.nextInt(max+1 - min) + min;
        face_value = rollRes;
        return rollRes;
    }
}

