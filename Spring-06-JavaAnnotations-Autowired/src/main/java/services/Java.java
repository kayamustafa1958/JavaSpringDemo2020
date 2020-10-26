package services;

import Interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    @Autowired
    private OfficeHours officeHours;

    // @Autowired  // if we do have more than one constructor we need to at least one autowired, if we have one no need to put @Autowired
    ////this is constructor injection
    // public Java(OfficeHours officeHours) {
    //   this.officeHours = officeHours;
    //}


   /* @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
*/

    public OfficeHours getOfficeHours(){
        return officeHours;
    }


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (30 + officeHours.getHours()));
    }
}