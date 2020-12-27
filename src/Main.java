import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;
//        В этом задании я использовал очередь потому что это самый подходящий интерфейс,
//        поскольку Интерфейс Queue расширяет Collection и объявляет поведение очередей,
//        которые представляют собой список с дисциплиной "первый вошел, первый вышел" (FIFO)

public class Main {
    public static void main(String[] args) {

        Queue<Pacient> likar = new LinkedList<>();
        int y=0;
        Scanner scanner = new Scanner(System.in);
        //Добавляем пациентов
        while(y!=2){
            Pacient p=new Pacient();
            likar.offer(p);
            System.out.println("Добавить еще пациентов в очередь?");
            System.out.println("[1] Да");
            System.out.println("[2] Нет");
            y=scanner.nextInt();

        }
        System.out.println("Введите кол-во пациентов, которых примет доктор:");
        do {
            y = scanner.nextInt();
        }while (y>likar.size()&y>0);
        int m=0,f=0;
        //Врач принимает пациентов и собирает  статистику
        for (int i=0;i<y;i++){
            System.out.println("Имя: " +(String)( likar.peek().getName())+" пол: "+(Gender)(likar.peek().getGender()));
            if((Gender) (likar.peek().getGender())==Gender.female){
                f+=1;
            }
            else{
                m+=1;
            }
            likar.poll();
        }
        System.out.println("Итого на приеме было: "+m+" мужчин "+f+" представителей женского пола");

    }
}