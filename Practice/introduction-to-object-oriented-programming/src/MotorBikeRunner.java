public class MotorBikeRunner
{
    public static void main(String[] args)
    {
        MotorBike ducati = new MotorBike(99);
        MotorBike honda = new MotorBike(200);

        System.out.println(ducati.getSpeed());

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

        ducati.increaseSpeed(150);
        honda.setSpeed(100);

        ducati.decreaseSpeed(350);

        System.out.println(ducati.getSpeed());


//        System.out.println(honda.getSpeed());

//        int ducatiSpeed = ducati.getSpeed(); // get ducati speed
//        ducatiSpeed += 100; //increased it by 100
//        ducati.setSpeed(ducatiSpeed);// set it to ducati
//
//        int hondaSpeed = honda.getSpeed(); // get Honda speed
//        hondaSpeed += 100; //increased it by 100
//        ducati.setSpeed(hondaSpeed);// set it to Honda
//
//
//        //honda.setSpeed(80);
//        //System.out.println(honda.getSpeed());

    }
}
