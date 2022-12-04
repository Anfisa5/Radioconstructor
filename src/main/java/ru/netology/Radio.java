package ru.netology;

public class Radio {

    //переменная для количества радиостанций
    private int number;

    //переменная для радиостанции с максимальным номером
    private int maxRadioStation;

    //переменная для текущей радиостанции
    private int currentRadioStation;
    // переменная для громкости звука
    private int currentVolume;

    // конструктор без параментров
    public Radio() {
       maxRadioStation = 9;
    }

    // конструктор с параметром количество радиостанций
    public Radio(int number) {
       this.maxRadioStation = number  -1;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    //ИНФОРМАЦИЯ ДЛЯ ТЕКУЩЕЙ РАДИОСТАНЦИИ
    // 1.Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций не включительно.

    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    // 2.МЕТОД NEXT: если текущая радиостанция 9 и клиент нажал на кнопку next на пульте, то текущей должна стать 0.
    // В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    // 3.МЕТОД PREV: Если текущая радиостанция 0 и клиент нажал на кнопку prev на пульте, то текущей должна стать 9.
    // в остальных случаях радио переключается просто на предыдущую станцию.
    public void prev() {

        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    // 4.Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера.
    // Для этого подойдёт один метод-сеттер с проверкой на допустимость номера станции.
    // см.п.1 <<ТЕКУЩАЯ РАДИОСТАНЦИЯ>>


    //ИНФОРМАЦИЯ ДЛЯ УРОВНЯ ГРОМКОСТИ
    // 1.Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 10
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    //2. МЕТОД УВЕЛИЧЕНИЯ ГРОМКОСТИ ЗВУКА НА ОДИН: если уровень громкости звука достиг максимального значения,
    //то дальнейшее нажатие на +, не должно ни к чему приводить.
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    //3.МЕТОД УМЕНЬШЕНИЯ ГРОМКОСТИ ЗВУКА НА ОДИН: если уровень громкости звука достиг минимального значения,
    // то дальнейшее нажатие на -, не должно ни к чему приводить.
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}