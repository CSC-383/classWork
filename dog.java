package classwork;

class dog implements pet {

    int dogAge = 10;

    public void speak() {
        System.out.println(" Bark Bark\n");
    }

    public int get_age() {

        return dogAge;
    }

    public void set_age() {

        System.out.println(" Dog age: " + dogAge);
    }

    public void dogDisplay() {
        System.out.println("Dog profile:");
        set_age();
        speak();

    }

}
