package ObjectPassing;

public class Body {

    float length;
    float weigth;
    float hight;
    float weigh;
    int no_of_sim;

    Body() {
        length = 10f;
        weigth = 5f;
        hight = 0.2f;
        weigh = 150.0f;
        no_of_sim = 2;
    }

    public Body(float len, float w, float h, float wi, int sim) {
        this.length = len;
        this.weigth = w;
        this.hight = h;
        this.weigh = wi;
        this.no_of_sim = sim;

    }

    public void printdetails() {
        System.out.println("Body -");
        System.out.println(" Dimensions : " + length + " X " + weigth + " X " + hight + "mm");
        System.out.println(" Weight     : " + weigh + "g");
        System.out.println(" SIM        : " + no_of_sim + " micro sim");
    }
}
