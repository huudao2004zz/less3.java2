public class Race {
    public static void main(String[] args) {
        //creat an aray of runnable RaceCar object
        RaceCar[] cars = new RaceCar[5];
        cars[0] = new RaceCar(10, "mario");
        cars[1] = new RaceCar(10, "songoku");
        cars[2] = new RaceCar(10, "Herman");
        cars[3] = new RaceCar(10, "Doraemon");
        cars[4] = new RaceCar(10, "hoang phi hong");
        //start racing
        for (int i = 0; i < 5; i++)
            cars[i].start();

    }
}
