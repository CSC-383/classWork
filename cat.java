package classwork;

class cat implements pet {

    int catAge = 8;

    public void speak() {
        System.out.println(" meow meow \n");
    }

    public int get_age() {
        return catAge;
    }

    public void set_age() {

        System.out.println(" Cat age: " + catAge);
    }

    public void catDisplay() {
        System.out.println("Cat profile:");
        set_age();
        speak();

    }

}
