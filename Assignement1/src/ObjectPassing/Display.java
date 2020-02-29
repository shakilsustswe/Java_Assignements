
package ObjectPassing;
public class Display {

    String type;
    float higth;
    float weigh;
    int px1;
    int px2;

    Display() {
        type = "Super AMOLED capacitive touchscreen, 16M colors";
        higth = 5f;
        weigh = 65.5f;
        px1 = 700;
        px2 = 1200;
    }

    public Display(String s, float h, float w, int p, int q) {
        this.type = s;
        this.higth = h;
        this.weigh = w;
        this.px1 = p;
        this.px2 = q;
    }
    
    public void printDisplay(){
        System.out.println("Display -");
        System.out.println(" Type       : " + type);
        System.out.println(" Size       : " + higth + " inches, " + weigh + " cm * cm");
        System.out.println(" Resulation : " + px1 + " X " + px2 + " pixels");
    }

}
