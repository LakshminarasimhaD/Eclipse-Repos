package com.multithreading;

class MSW extends Thread {
    public void run() {
        if (getName().equals("TYPE")) {
            typing();
        } else if (getName().equals("SPELLCHECK")) { // Fixed missing parentheses
            spellChecking(); // Fixed incorrect method name
        } else {
            autoSaving();
        }
    }

    void typing() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Typing in process");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void spellChecking() { // Fixed method name mismatch
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Spell checking in process");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void autoSaving() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Auto Saving in process");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class MSWord {
    public static void main(String[] args) {
        MSW ms1 = new MSW();
        MSW ms2 = new MSW();
        MSW ms3 = new MSW();

        ms1.setName("TYPE");
        ms2.setName("SPELLCHECK");
        ms3.setName("AUTOSAVE");

        ms1.start();
        ms2.start();
        ms3.start();
    }
}
