
package ObjectPassing;

public class Memory {
    String sd;
    float ram;
    int rom;
    Memory(){
        sd = "microSDXC (dedicated slot)";
        ram = 1.8f;
        rom = 8;
    }
    public Memory(String sd, float f, int r){
        this.sd = sd;
        this.ram = f;
        this.rom = r;
    }
    
    public void printMemory(){
        System.out.println("Memory -");
        System.out.println(" Card Sort  : " + sd);
        System.out.println(" RAM        : " + ram + " GB");
        System.out.println(" ROM        : " + rom + " GB");
       
    }
}
