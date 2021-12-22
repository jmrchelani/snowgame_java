/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jmrchelani
 */
public class SnowFlake {
    int x,y;
    
    static int totalFalls = 0;
    
    SnowFlake(int a, int b) {
        x=a; y=b;
    }
    
    public void fall() {
        SnowFlake.totalFalls++;
//        if(this.y >= 400) return;
        if(SnowFlake.totalFalls < 100) this.y += 10;
        else if(SnowFlake.totalFalls < 200) this.y += 20;
        else if(SnowFlake.totalFalls < 300) this.y += 30;
        else this.y += 50;
    }
    
    public void reset(int x) {
        this.x = x;
        y = 0;
    }
    
    
}
