import java.util.Random;
import java.util.Scanner;

public class Computer {

    /*Создать класс компьютер.
Поля:
- процессор
- оперативка
- жесткий диск
- ресурс полных циклов работы (включений/выключений)
Методы:
- метод описание(вывод всех полей)
- метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1),
 вы вводите число с клавиатуры, если угадали комп выключается, если нет сгорает.Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
- выключить (аналогично включению)
- при превышении лимита ресурса комп сгорает*/

    String name = "";
    String processor = "";
    int operativ;
    int disk ;
    int cikl ;
int i=0;
    Random rd = new Random();
    Scanner vvod = new Scanner(System.in);

    Computer(String name, int cikl) {
        this.name = name;
        this.cikl = cikl;
    }


    public void setOperativ(Operativ a) {

        this.operativ += a.volume;

    }

    public void setDisk(Hard h) {
        this.disk += h.volume;
    }

    public void setProcessor(Processor p) {
        this.processor = p.name;
    }

    public String vivod() {
        String vivod = name + " Oперативка " + operativ + " Gb." + " Processor :" + processor + ". Hard: " + disk;

        return vivod;
    }

    public void on() {

        int chislo = rd.nextInt(1);
        System.out.println(chislo);
        System.out.println("Введите число:");
        int i = vvod.nextInt();
if(this.i==1){System.out.println("Компьютер уже включен");}
else {
    if (cikl == 0) {
        System.out.println(" Превышение лимита ресурса комп сгорает");
    } else {
        if (chislo != i || cikl > 5) {
            System.out.print("Fire!!!");
        } else {
            System.out.print("Welcom!!!");
            this.cikl--;
this.i=1;
        }
    }

}
    }

    public void off() {
        int chislo = rd.nextInt(1);
        System.out.println(chislo);
        System.out.println("Введите число:");
        int i = vvod.nextInt();
if(this.i==0){System.out.println("Компьютер уже выключен");}
else {
    if (chislo != i) {
        System.out.print("Fire!!!");
    } else {
        System.out.print("Good Bye");

    }
}
    }

}
