import java.util.Scanner;

enum Gender{
    male, female
}

public class Pacient {
    String Name;
    Gender Gender;

    Pacient(String name, Gender gender){
        Name=name;
        Gender=gender;
    }
    //Конструктор для ввода параметров вручную
    Pacient(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пациента:");
        System.out.print(">_");
        Name=scanner.nextLine();
        System.out.println();
        int s;
        System.out.println("Введите пол пациента:");
        System.out.println("[1] Мужской");
        System.out.println("[2] Женский");
        System.out.print(">_");
        s=scanner.nextInt();
        System.out.println();
        if(s==1){
            Gender= Gender.male;
        }
        else if(s==2){
            Gender= Gender.female;
        }

    }

    public Gender getGender() {
        return Gender;
    }

    public String getName() {
        return Name;
    }
}
