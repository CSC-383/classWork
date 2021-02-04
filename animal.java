package classwork;

interface pet {

    //int petAge = 10;
    void speak();

    int get_age();

    public void set_age();
}

public class animal {

    public static void main(String[] args) {
        cat catObj = new cat();
        dog dogObj = new dog();
        //catObj.speak();
        // catObj.set_age();
        // dogObj.speak();
        // dogObj.set_age();
        catObj.catDisplay();
        dogObj.dogDisplay();

    }

}
