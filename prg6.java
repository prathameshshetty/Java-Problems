class Vehicle
{
    protected int speed;

    public Vehicle()
    {
        this.speed=0;
    }

    public int getSpeed(){
        return speed;
    }

    public void speedUp(){
        speed+=10;
    }

}


class Car extends Vehicle{
    @Override
    public void speedUp(){
        speed+=22;
    }
}


class Bike extends Vehicle{
    @Override
    public void speedUp(){
        speed += 12;
    }
}

public class prg6 {
       public static void main(String[] args) {
        {
            Car car=new Car();

            Bike bike=    new Bike();

            System.out.println(car.getSpeed()+ " "+ bike.getSpeed());
            car.speedUp();
            bike.speedUp();
            System.out.println(car.getSpeed()+ " "+ bike.getSpeed());
        }
    }

}
