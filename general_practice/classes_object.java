package general_practice;

class chicken {
    public void ingredientsRequired(String masala, int chickenInKg) {
        System.out.println("We need " + masala + " masala and " + chickenInKg + "kg chicken");
    }
}

public class classes_object {
    public static void main(String[] args) {
        chicken butterChicken = new chicken();
        butterChicken.ingredientsRequired("Haldi and Mirchi", 10);
    }
}
