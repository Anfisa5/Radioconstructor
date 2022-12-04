import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest2 {
    @Test
    public void test1() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(15);
        int expected = 15;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void test3() {

        Radio radio = new Radio(30);

        int expected = 29;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);


    }
}

