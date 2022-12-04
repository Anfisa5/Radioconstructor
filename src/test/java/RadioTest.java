import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    // 1.Номер текущей радиостанции может принимать значения только в пределах от 0 до 9.
    //4.Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера.
    //Для этого подойдёт один метод-сеттер с проверкой на допустимость номера станции.

    public void shouledSetCurrentRadioStation1() {


        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        station.setCurrentRadioStation(8);

        // проверка действительно ли текущая радиостанция 8
        int expected = 8;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    public void shouledSetCurrentRadioStation2() {
        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        station.setCurrentVolume(1);

        // проверка действительно ли текущая радиостанция 1
        int expected = 1;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetCurrentRadioStation3() {
        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        station.setCurrentRadioStation(10);

        // проверка действительно ли текущая радиостанция 0
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetCurrentRadioStation4() {
        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        // проверка действительно ли текущая радиостанция 0
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetCurrentRadioStation5() {
        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        station.setCurrentRadioStation(0);

        // проверка действительно ли текущая радиостанция 0
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouledSetCurrentRadioStation6() {
        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        station.setCurrentRadioStation(9);

        // проверка действительно ли текущая радиостанция 9
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    // 2.МЕТОД NEXT: если текущая радиостанция — 9 и клиент нажал на кнопку next на пульте,то текущей должна стать 0.
    // В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.

    public void NEXT1() {

        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        // попробуем положить номер текущей радиостанции 9
        station.setCurrentRadioStation(9);

        station.next();

        // проверка действительно ли текущая радиостанция 0
        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NEXT2() {

        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        // попробуем положить номер текущей радиостанции 8
        station.setCurrentRadioStation(8);

        station.next();

        // проверка действительно ли текущая радиостанция 9
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //3.МЕТОД PREV: если текущая радиостанция — 0 и клиент нажал на кнопку prev на пульте,то текущей должна стать 9.
    // в остальных случаях радио переключается просто на предыдущую станцию.

    public void PREV1() {

        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        // попробуем положить номер текущей радиостанции 0
        station.setCurrentRadioStation(0);

        station.prev();

        // проверка действительно ли текущая радиостанция 9
        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PREV2() {

        // создаем переменную радио и кладем в нее объект
        Radio station = new Radio();

        // попробуем положить номер текущей радиостанции 8
        station.setCurrentRadioStation(8);

        station.prev();

        // проверка действительно ли текущая радиостанция 7
        int expected = 7;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    //УРОВЕНЬ ГРОМКОСТИ ЗВУКА

    @Test
    // 1.Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 10

    public void shouleSetCurrentVolume1() {
        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        volume.setCurrentVolume(9);

        // проверка действительно ли текущий уровень звука 9
        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetCurrentVolume2() {
        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        volume.setCurrentVolume(11);

        // проверка действительно ли текущий уровень звука 0
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetCurrentVolume3() {
        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        // проверка действительно ли текущий уровень звука 1
        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetCurrentVolume4() {
        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);
        // проверка действительно ли текущий уровень звука 0
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //2. МЕТОД УВЕЛИЧЕНИЯ ГРОМКОСТИ ЗВУКА НА ОДИН: если уровень громкости звука достиг максимального значения,
    //то дальнейшее нажатие на +, не должно ни к чему приводить.

    public void increaseVolume1() {

        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        // попробуем положить ровнь громкости 9
        volume.setCurrentVolume(9);

        volume.increaseVolume();

        // проверка действительно ли текущий уровень звука 10
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2() {

        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        // попробуем положить максимальный уровнь громкости 10
        volume.setCurrentVolume(10);

        volume.increaseVolume();

        // проверка действительно ли текущий уровень звука 10
        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    //3.МЕТОД УМЕНЬШЕНИЯ ГРОМКОСТИ ЗВУКА НА ОДИН: если уровень громкости звука достиг минимального значения,
    // то дальнейшее нажатие на -, не должно ни к чему приводить.

    public void decreaseVolume1() {

        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        // попробуем положить уровнь громкости 9
        volume.setCurrentVolume(9);

        volume.decreaseVolume();

        // проверка действительно ли текущий уровень звука 8
        int expected = 8;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume2() {

        // создаем переменную уровень звука и кладем в нее объект
        Radio volume = new Radio();

        // попробуем положить минимальный уровнь громкости 0
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        // проверка действительно ли текущий уровень звука 0
        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
