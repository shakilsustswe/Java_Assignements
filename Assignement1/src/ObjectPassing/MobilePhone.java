
package ObjectPassing;

public class MobilePhone {
    String brand_name;
    Body setbody;
    Display dis;
    Platform pla;
    Camera camera;
    Network net;
    Memory mem;
    
    MobilePhone(){
        brand_name = "SAMSUNG : ";
        setbody = new Body();
        dis = new Display();
        pla = new Platform();
        camera = new Camera();
        net = new Network();
        mem = new Memory();
    }
    
    
    MobilePhone ( String name, Body b, Display d, Platform p, Camera c, Network n, Memory m )
    {
        this.brand_name = name ;
        this.setbody = b;
        this.dis = d;
        this.pla = p;
        this.camera = c;
        this.net = n;
        this.mem = m ;
    }
    public void setmobiledata ( String name, Body b, Display d, Platform p, Camera c, Network n, Memory m ){
        brand_name = name ;
        setbody = b;
        dis = d;
        pla = p;
        camera = c;
        net = n;
        mem = m ;
    }
    
    public void printmobileinfo(){
        System.out.println(brand_name);
        setbody.printdetails();
        dis.printDisplay();
        pla.printplatform();
        camera.printCamera();
        net.printNetwork();
        mem.printMemory();
    }
    
}
