/**
 * Project Name:javaui1
 * File Name:Window.java
 * Package Name:cn.java.game
 * Date:上午9:52:09
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 *
*/

package cn.java.game;

import java.awt.Container;

import javax.swing.JFrame;

/**
 * Description: 程序启动窗口<br/>
 * Date: 上午9:52:09 <br/>
 * 
 * @author 丁鹏   QQ:2431475266
 * @version
 * @see
 */
public class Window {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("坦克大战&巨丁丁");
        jFrame.setBounds(300, 300, 600, 400);

        Container container = jFrame.getContentPane();
        GamePanel gamePanel = new GamePanel();
        container.add(gamePanel);
        jFrame.addKeyListener(gamePanel);
        Thread thread = new Thread(gamePanel);
        thread.start();

        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
