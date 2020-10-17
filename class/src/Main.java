import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] student = new Student[5];
        student[0] = new Student();
        student[1] = new Student("Свиридов","821",2,3,4,5,3,4);
        student[2] = new Student("Шевченко","531",3,3,4,3,4,5);
        student[3] = new Student("Лапов","121",2,4,4,4,5,5);
        student[4] = new Student("Савченко","931",3,5,4,4,4,4);

        for (int a=0; a<5; a++){
            student[a].first();
            System.out.println();
        }

    }
}

class Student{
    String priz;
    String number;
    int kurs;
    int oc1;
    int oc2;
    int oc3;
    int oc4;
    int oc5;

    Student(String p, String n, int k, int o1, int o2, int o3, int o4, int o5){
        priz=p;
        number=n;
        kurs=k;
        oc1=o1;
        oc2=o2;
        oc3=o3;
        oc4=o4;
        oc5=o5;
    }
    Student() {
        priz="Иванов";
        number="711";
        kurs=1;
        oc1=5;
        oc2=4;
        oc3=4;
        oc4=5;
        oc5=5;

    }
    void first(){
        System.out.println(priz+"");
        System.out.print(number+" группа ");
        System.out.print(kurs+" курс ");
    }

}