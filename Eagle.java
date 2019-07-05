public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if(!isFlying() && this.altitude == 0){
            this.flying = true;
            System.out.printf("%s take off the sky *Floch floch floch* and sing : %s %n" ,  this.getName() , this.sing());
        }
    }

    @Override
    public int ascend(int meters) {
        if (isFlying()) {
            this.altitude += meters;
            System.out.printf("%s flyes upward, depths : %s %n", this.getName(), this.altitude);
            if (this.altitude > 120) {
                System.out.printf("Wouaaaaaaaaah!!!! %s see an Unicorn and glide with her few secondes ...%nGliding with an Unicorn!!! ", this.getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.glide();
            }
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (isFlying() && this.altitude > 0){
            this.altitude -= meters;
            System.out.printf("%s flyes downward, depths : %s %n" , this.getName() , this.altitude);
        }
        else{
            this.glide();
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (isFlying() && this.altitude <= 1){
            System.out.printf("%s land and sing : %s %n" , this.getName() , this.sing());
        }
        else{
            System.out.printf("%s start to land %n" , this.getName());
        }
    }

    @Override
    public void glide() {
        System.out.printf("%s glide! Flllllsssshhhhhhhhhhhhhhhh!!! %s %n" , this.getName() , this.sing() , this.sing());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
