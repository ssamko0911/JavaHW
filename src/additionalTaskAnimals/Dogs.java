package additionalTaskAnimals;

public class Dogs extends Predators implements TreeClimebeable {

    @Override
    public void climbe() {
        System.out.println("\nСобаки могут залезть на дерево, если ствол под наклоном минимум 60 градусов.");
    }
}
