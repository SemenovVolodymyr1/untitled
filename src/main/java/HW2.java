import java.util.LinkedList;

public class HW2 {
    public static void main(String[] args) {
        LinkedList<String> planet=new LinkedList<String>();
        planet.add("Earth");
        planet.add("Mars");
        planet.add("Venus");
        planet.add("Pluto");
        planet.add("Mercury");
        planet.add("Saturn");

        System.out.println("Количество выбранных планет: "+planet.size());
        System.out.println("Список выбранных планет: "+planet);

        System.out.println("Планета подлежащая удалению: "+planet.get(3));
        planet.remove(3);
        System.out.println("Количество выбранных планет после очищения: "+planet.size());
        System.out.println("Список выбранных планет после очищения: "+planet);

        planet.clear();
        System.out.println("Количество планет после очищения: "+planet.size());


    }
}
