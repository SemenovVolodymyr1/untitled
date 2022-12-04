import java.util.PriorityQueue;

public class HW3 {
    public static void main(String[] args) {

        PriorityQueue<String> animal = new PriorityQueue<String>();
        animal.add("Bird");
        animal.add("Snake");
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Spider");

        System.out.println("Размер коллекции: "+animal.size());
        System.out.println("Первый элемент в коллекции: "+animal.peek());
        System.out.println("Возвращает и удаляет первый элемент в коллекции: "+ animal.poll());
        System.out.println("Размер коллекции после удаления: "+animal.size());
        System.out.println("Очищаем коллекцию.");
        animal.clear();
    }
}

