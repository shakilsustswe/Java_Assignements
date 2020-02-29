
package ObjectPassing;

class MainClass{
    public static void main(String[] args){
        
        
        Body huaweibody = new Body(146.5f, 70.9f, 8.3f, 142.0f, 2);
        Display huaweidis = new Display("LCD capacitive touchscreen, 16M colors", 5.45f, 76.7f, 720, 1440);
        Platform huaweipla = new Platform ("Android 8.1 Oreo(Go edition); EMUI 8", "Mediatek MT6739(28nm)", "Quad-core 1.5 GHz Cortex-A53", "PowerVR GE8100");
        Camera huaweicam = new Camera (5, 8, "LED flash");
        Network huaweinet = new Network("GSM / HSPA / LTE","Wi-Fi 802.11 b/g/n", "v4.2, A2DP, LE", true, false, "FM radio", "microUSB 2.0");
        Memory huaweimem = new Memory("microSDXC (dedicated slot)", 1.0f, 8);
        
        MobilePhone huawei = new MobilePhone ("Huawei", huaweibody, huaweidis, huaweipla, huaweicam, huaweinet, huaweimem);
        huawei.printmobileinfo();  
        
        Body samsungbody = new Body(142.1f, 71.8f, 7.9f, 146f, 2);
        Display samsungidis = new Display("Super AMOLED capacitive touchscreen, 16M colors", 5.0f, 68.9f, 720, 1280);
        
        Platform samsungpla = new Platform ("Android 5.1 (Lollipop), upgradable to 6.0.1 (Marshmallow)", "Qualcomm MSM8916 Snapdragon 410 (28 nm)", "Qualcomm MSM8916 Snapdragon 410 (28 nm)", "Adreno 306");
        Camera samsungcam = new Camera (5, 13, "LED flash");
        Network samsungnet = new Network("GSM / HSPA / LTE","Wi-Fi 802.11 b/g/n", "v4.2, A2DP, LE", true, true, "FM radio", "microUSB 2.0");
        Memory samsungmem = new Memory("microSDXC (dedicated slot)", 1.5f, 8);
        
        
        
        MobilePhone samsung = new MobilePhone();

        
        
    }
    
}


