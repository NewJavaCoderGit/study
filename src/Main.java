import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Вся программа на Java это классы и их взаимодействие
        //Взаимодействие осуществляется через объекты классов
        //Описав один раз какой-то класс, можно создать сколько угодно его объектов (если только нет необходимости нарочно ограничить такую возможность).
        //Описание класса хранится в файле (например, Student.java), а созданные объекты этого класса - в оперативной памяти,
        //в каком-то файле если мы их туда запишем, в базе данных и тд. Так как в нашем примере объекты никуда не сохраняются, они будут создаваться
        //при каждом запуске программы и удаляться при каждом ее завершении.

        //Если  в классе нет конструктора с параметрами, то объект можно создать так
        Student student = new Student();
        student.studentName = "Dima";
        student.stusentAge = 21;

        Student student2 = new Student();
        student2.studentName = "Lena";
        student2.stusentAge = 20;

        Student student3 = new Student();
        student3.studentName = "Fedor";
        student3.stusentAge = 22;

        //Если в классе есть конструктор с параметрами, то объект можно создать так
        Professor professor = new Professor("Aleksey", 48, "History");
        Professor professor2 = new Professor("Igor", 37, "Math");
        Professor professor3 = new Professor("Tatyana", 36, "Philosophy");

        //Представь, что нужно иметь 30 профессоров и 800 студентов. Очевидно, что второй вариант создания объектов компактнее и удобнее.
        //Конструкторы используются почти всегда. Первый вариант - когда заранее неизвестны значения параметров объекта

        //Создадим ArrayList студентов. Обрати внимание на <Student> между List и studentList.
        //Это называется дженерик и он определяет тип объектов, которые можно помещать в созданный список.
        //Формально его можно и не указывать, это не будет ошибкой и программа будет работать, но тогда в твой список можно будет
        //запихать что угодно - строку ("АБВГД"), число (128), объект (professor2). Как потом работать с таким списком? Как обрабатывать его элементы, если они будут разного типа
        // и требуют разных методов для обработки? Никак. Поэтому нужно использовать дженерик. Теперь если попытаться впихнуть в список что-то кроме объектов Student, будет ошибка.
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);

        //Теперь выведем на консоль содержимое нашего списка
        //Если сделать это так, то полуим ерунду.
        System.out.println("Стремный вывод:");
        System.out.println(studentList);
        System.out.println();

        //Это потому, что внутри нашего списка объекты, у которых какие-то свои поля. И такой способ не вдается в детали, что там за поля
        //и как красиво это все вывести на экран. Об этом мы должны позаботиться сами
        System.out.println("Теперь чуть получше:");
        System.out.println("Student name: " + studentList.get(1).studentName);
        System.out.println("Student age: " + studentList.get(1).stusentAge);
        System.out.println();

        //Выведем информацию о всех студентах в списке. Для этого используем цикл
        System.out.println("А теперь прям норм:");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Студент № " + (i + 1));
            System.out.println("Имя студента: " + studentList.get(i).studentName);
            System.out.println("Возраст студента: " + studentList.get(i).stusentAge);
            System.out.println("");
            System.out.println("- - - - - - - - - - - -");
        }


    }
}