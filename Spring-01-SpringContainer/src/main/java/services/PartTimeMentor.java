package services;

import Interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount() {
        System.out.println("Part time mentor account is created");
    }
}
