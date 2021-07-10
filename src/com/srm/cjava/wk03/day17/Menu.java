package com.srm.cjava.wk03.day17;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class Menu implements Runnable {
    private JFrame frame;

    public void run() {
        createAndShowGui();
    }

    private void createAndShowGui() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setJMenuBar(createMenuBar());
        frame.setSize(400, 350);
        frame.setUndecorated(true);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    private JMenu createEditMenu() {
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        editMenu.add(cutItem);
        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem);

        return editMenu;
    }

    private JMenu createFileMenu() {
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New Window");
        fileMenu.add(newItem);
        JMenuItem m2 = new JMenuItem("Open File");
        fileMenu.add(m2);
        JMenuItem m3 = new JMenuItem("Open Window");
        fileMenu.add(m3);
        JMenuItem m4 = new JMenuItem("Save");
        fileMenu.add(m4);
        JMenuItem m5 = new JMenuItem("Save As");
        fileMenu.add(m5);
        JMenuItem m6 = new JMenuItem("Close");
        fileMenu.add(m6);
        JMenuItem m7 = new JMenuItem("Close Workspace");
        fileMenu.add(m7);
        return fileMenu;
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());

        return menuBar;
    }

    public static void main(String[] args) {
        UIManager.put("MenuBar.background", Color.LIGHT_GRAY);
        EventQueue.invokeLater(new Menu());
    }
}