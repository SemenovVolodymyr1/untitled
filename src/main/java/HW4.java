import java.util.Stack;

public class HW4 {
    public static void main(String[] args) {
        int count = 0;
        Stack<String> cars = new Stack<String>();
        cars.push("Subaru");
        cars.push("Mazda");
        cars.push("BMW");
        cars.push("Honda");
        cars.push("Lexus");

        for (String carsTest:cars) {
            if (carsTest.equals("Honda")){
                cars.remove(count);
            }
            count++;

            if (carsTest.isEmpty()){
                cars.clear();
            }
        }
        System.out.println("колличество автомобилей: "+ cars.size());
        System.out.println("Первый автомобиль в гараже: "+cars.peek());
        cars.pop();
        System.out.println("Количество оставшихся автомобилей: "+cars.size());
    }
}


