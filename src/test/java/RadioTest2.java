import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest2 {
    @Test
    public void testMethodNext() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(15);
        radio.next();
        int expected = 16;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMethodPrev() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(15);
        radio.prev();
        int expected = 14;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void test1() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(29);
        int expected = 29;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
}

