/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassing;

/**
 *
 * @author ASHIQUL HASAN SHAKIL
 */
public class Network {
    String technology;
    String Wlan;
    String bluethooth;
    boolean gps;
    boolean nfc;
    String radio;
    String usb;
    
    Network(){
        technology = "GSM/HSPA/LTE";
        Wlan = "Wi-Fi 802.11 b/g/n, Wi-Fi Direct, hotspot";
        bluethooth = "4.1, A2DP";
        gps = true;
        nfc = true;
        radio = "FM radio, RDS, recording";
        usb = "microUSB 2.0, USB On-The-Go";
    }
    public Network(String t, String w, String b, boolean g, boolean n, String r, String u){
        this.technology = t;
        this.Wlan = w;
        this.bluethooth = b;
        this.gps = g;
        this.nfc = n;
        this.radio = r;
        this.usb = u;
    }
    
    public void printNetwork(){
        System.out.println("Network -");
        System.out.println(" Technology : " + technology );
        System.out.println(" Wlan       : " + Wlan );
        System.out.println(" Bluethooth : " + bluethooth );
        System.out.print(" GPS        :");
        if( gps){
            System.out.println(" YES");
        }
        else{
            System.out.println(" NO");
        }
        System.out.print(" NFC        :");
        if( nfc){
            System.out.println(" YES");
        }
        else{
            System.out.println(" NO");
        }
        
        System.out.println(" Radio      : " + radio );
        System.out.println(" USB        : " + usb );
    }
}
