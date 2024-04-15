package Event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.security.KeyException;

public class MovingBall extends JFrame { // 窗口
    MyPanel mp = null;
    public static void main(String[] args) {
        MovingBall ballMove = new MovingBall();
    }
    public MovingBall() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp); // 窗口 JFrame 对象可以监听键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

// 面板, 可以画出小球
// 接口 KeyListener 监听键盘事件
class MyPanel extends JPanel implements KeyListener {
    // 为了让小球可以移动, 把小球左上角的坐标设置为变量;
    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20); // 默认黑色
    }

    /**
     * 监听键盘的字符输出, 当键盘有字符输出时该方法会被触发 */
    @Override
    public void keyTyped(KeyEvent e) {

    }

    /**
     * 按下某一个键时该方法会被触发 */
    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println((char)e.getKeyCode() + "被按下");
        // 根据用户按下的不同案件来处理小球的移动行为 (上下左右)
        // 在 Java 中每一个案件都有一个值 (public static final int), 称为 KeyCode.
        if (e.getKeyCode() == KeyEvent.VK_DOWN) { // KetEvent.VK_Down 方向键下对应的 KeyCode.
            y += 10;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= 10;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= 10;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += 10;
        }

        // 重绘面板以刷新界面
        this.repaint();
    }

    /**
     * 释放某个按键时该方法被触发 */
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
