
package ObjectPassing;

class Camera {
  
   int selfie;
    int main_camera;
    String feature;
    Camera(){
        selfie = 5;
        main_camera = 13;
        feature = "LED flash";
    }
    public Camera(int s, int m, String str){
        this.selfie = s;
        this.main_camera = m;
        this.feature = str;
    }
    
    public void printCamera(){
        System.out.println("Camera -");
        System.out.println(" Selfie Ca  : " + selfie+ " MP");
        System.out.println(" Main camera: " + main_camera + " MP");
        System.out.println(" Feature    : " + feature );
    }
}
