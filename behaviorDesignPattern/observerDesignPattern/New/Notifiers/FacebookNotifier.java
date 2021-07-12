package behaviorDesignPattern.ObserverDesignPattern.New.Notifiers;

import behaviorDesignPattern.ObserverDesignPattern.New.VideoData;
import behaviorDesignPattern.ObserverDesignPattern.New.Base.Observer;
import behaviorDesignPattern.ObserverDesignPattern.New.Base.Subject;

public class FacebookNotifier extends Observer {

    public FacebookNotifier(Subject _subject) {
        subject = _subject;
        subject.attachObserver(this);
    }

    @Override
    public void Notify(Object arg) {
        if (subject instanceof VideoData) {
            VideoData videoData = (VideoData) subject;
            System.out.println("Notifi all subscriber via Facebook with new Data"+ 
                                "\n\t Name: " + videoData.getTitle() +
                                "\n\tDescription: " + videoData.getDescription() +
                                "\n\tFile name: " + videoData.getFileName());
        }
        
    }
    
}
