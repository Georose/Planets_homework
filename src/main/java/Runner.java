public class Runner {
    public static void main(String[] args) {
        Planet planet = new Planet("Mars", 908973, "Boom! Mars has exploded.");
        String name = planet.getName();
        int size = planet.getSize();
        String explode = planet.explode();
        System.out.println(explode);



    }
}
