package services;

import Interfaces.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Full time mentor is created");
    }
}
