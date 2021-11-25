package HWFiveArrayList.TaskAdditional;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listOfTeachers = new ArrayList<>();
        listOfTeachers.add("Ирина Эдуардовна (зар.литература)");
        listOfTeachers.add("Валерий Алимович (физика)");
        listOfTeachers.add("Лидия Григорьевна (химия)");
        listOfTeachers.add("Тамара Алексеевна (история Украины)");
        listOfTeachers.add("Оксана Анатольевна (украинский язык\\литература)");
        listOfTeachers.add("Мария Ивановна (алгебра\\геометрия)");
        listOfTeachers.add("Людмила Тимофеевна (алгебра\\геометрия)");
        listOfTeachers.add("Земфира Романовна (русский язык\\литература)");
        listOfTeachers.add("Людмила Владимировна (география)");
        listOfTeachers.add("Виктор Федорович (физкультура)");
        listOfTeachers.add("Людмила Ивановна (физкультура)");
        listOfTeachers.add("Эмма Павловна (физкультура)");

        System.out.printf("Лучшим учителем на то время считаю учителя на позиции № %d."
                , listOfTeachers.indexOf("Валерий Алимович (физика)"));
        System.out.printf("\nУчителем, которым не был доволен на то время, считаю учителя на позиции № %d.\n"
                , listOfTeachers.indexOf("Лидия Григорьевна (химия)"));

        System.out.println("\nВывод списка всех учителей, которых вспомнил: ");
        for (String listOfTeacher : listOfTeachers) {
            System.out.println(listOfTeacher);
        }
    }
}
