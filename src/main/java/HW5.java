import java.util.HashMap;
import java.util.Map;

public class HW5 {
    public static void main(String[] args) {
        HashMap<String, Integer> workers = new HashMap<String, Integer>();
        workers.put("Petrov", 1985);
        workers.put("Sidorov", 1960);
        workers.put("Pushkin", 1993);
        workers.put("Ivanov", 2000);
        workers.put("Stepanov", 2005);

String name ="";
        System.out.println("Общее количество работников: " + workers.size());

        for (int i = 0; i <10 ; i++) {

    for (Map.Entry<String, Integer> entry : workers.entrySet()) {
        if (entry.getValue() < 2005 && entry.getValue() > 1975) {
        } else {
        name = entry.getKey();
        }
    }
            workers.remove(name);
}
        System.out.println("Количество работников после сокращения: " + workers.size());
        System.out.println("Работники после сокращения: ");
        for (Map.Entry<String, Integer> entryTest : workers.entrySet()) {
            System.out.println(entryTest.getKey());
        }
        System.out.println("Сокращение прошло успешно, очищаем коллекцию!");
        workers.clear();
    }
}


