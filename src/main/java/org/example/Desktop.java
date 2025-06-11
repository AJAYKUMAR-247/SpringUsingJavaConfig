package org.example;

public class Desktop implements Computer {

    private int desktopId;

    public int getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(int desktopId) {
        this.desktopId = desktopId;
    }

    @Override
    public void compile() {
        System.out.println("Computer - Desktop");
    }

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "desktopId=" + desktopId +
                '}';
    }
}
