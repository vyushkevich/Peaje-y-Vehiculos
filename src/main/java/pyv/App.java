package pyv;

import pyv.controller.TollController;

public class App {
    public static void main(String[] args) {
        TollController controller = new TollController();
        controller.start();
    }
}
