import com.sun.jdi.event.MethodEntryEvent;
import implementation.Mentor;
import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {
        FullTimeMentor fullTime=new FullTimeMentor();
        PartTimeMentor partTime=new PartTimeMentor();
        MentorAccount mentor=new MentorAccount(fullTime);
        MentorAccount mentor2=new MentorAccount(partTime);
        mentor.manageAccount();
        mentor2.manageAccount();

    }
}
