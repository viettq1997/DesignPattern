package BehaviorDesignPattern.ObserverDesignPattern.New.Notifiers;

import BehaviorDesignPattern.ObserverDesignPattern.New.VideoData;
import BehaviorDesignPattern.ObserverDesignPattern.New.Base.Observer;
import BehaviorDesignPattern.ObserverDesignPattern.New.Base.Subject;

public class EmailNotifier extends Observer {

    public EmailNotifier(Subject _subject) {
        subject = _subject;
        subject.attachObserver(this);
    }

    @Override
    public void Notify(Object arg) {
        if (subject instanceof VideoData) {
            VideoData videoData = (VideoData) subject;
            System.out.println("Notifi all subscriber via Email with new Data"+ 
                                "\n\t Name: " + videoData.getTitle() +
                                "\n\tDescription: " + videoData.getDescription() +
                                "\n\tFile name: " + videoData.getFileName());
        }
        
    }

    // public void Notify(String title, String description, String fileName) {
    //     System.out.println(String.format("Notifi all subscriber via Email with new Data"+ 
    //                                     "\n\t Name: {0}" + 
    //                                     "\n\tDescription: {1}" +
    //                                     "\n\tFile name: {2}", title, description, fileName));
    // }
    
}
