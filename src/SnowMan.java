
import java.awt.Rectangle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jmrchelani
 */
public class SnowMan {
    
    static final int MAX_SNOWFLAKES_MISSED = 3;
    
    MainWindow window;
    
    int snowflakesMissed = 0;
    int snowflakesCatched = 0;
    int x,y;
    
    SnowMan(int a, int b, MainWindow window) {
        x=a; y=b;
        this.window = window;
    }
    
    public void moveLeft() {
        if(this.x <= 0) return;
        this.x -= 10;
    }
    
    public void moveRight() {
        if(this.x >= 610) return;
        this.x += 10;
    }
    
    public void catchSnowflake() {
        this.snowflakesCatched++;
       
    }
    
    public void missSnowflake() {
        this.snowflakesMissed++;
        
        if(this.snowflakesMissed >= MAX_SNOWFLAKES_MISSED) {
            _onMissMaximumSnowflakes(this);
        }
    }
    
    public boolean canCatch(SnowFlake s) {
        
        
    
        if(Math.abs(s.x - this.x) <= 22 && Math.abs(s.y - this.y) <= 22) {
            return true;
        }
        return false;
    }

    void _onMissMaximumSnowflakes(SnowMan aThis) {
        this.window.gameOver();
    }
}
