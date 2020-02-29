
package ObjectPassing;

public class Platform {
    String os;
    String chipset;
    String cpu;
    String gpu;
    Platform(){
        os = "Android";
        chipset = "Qualcomm MSM8916 Snapdragon";
        cpu = "Quad-core 1.2 GHz Cortex-A53";
        gpu = "Adreno 306";
    }
    public Platform(String os, String chip, String cpu, String gpu)
    {
        this.os = os;
        this.chipset = chip;
        this.cpu = cpu;
        this.gpu = gpu;
    }
    
    public void printplatform(){
        System.out.println("Platform -");
        System.out.println(" OP         : " + os);
        System.out.println(" Chipset    : " + chipset );
        System.out.println(" CPU        : " + cpu);
        System.out.println(" GPU        : " + gpu);
    }
}
