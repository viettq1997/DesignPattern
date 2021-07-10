package behaviorDesignPattern.observerDesignPattern.New.Notifiers;

import behaviorDesignPattern.observerDesignPattern.New.VideoData;
import behaviorDesignPattern.observerDesignPattern.New.Base.Observer;
import behaviorDesignPattern.observerDesignPattern.New.Base.Subject;

public class YoutubeNotifier extends Observer {

    public YoutubeNotifier(Subject _subject) {
        subject = _subject;
        subject.attachObserver(this);
    }

    @Override
    public void Notify(Object arg) {
        if (this.subject instanceof VideoData) {
            VideoData videoData = (VideoData) subject;
            System.out.println("Notifi all subscriber via Youtube with new Data"+ 
                                "\n\t Name: " + videoData.getTitle() +
                                "\n\tDescription: " + videoData.getDescription() +
                                "\n\tFile name: " + videoData.getFileName());
        }
        
    }

    // public void Notify(String title, String description, String fileName) {
    //     System.out.println(String.format("Notifi all subscriber via Youtube with new Data"+ 
    //                                     "\n\t Name: {0}" + 
    //                                     "\n\tDescription: {1}" +
    //                                     "\n\tFile name: {2}", title, description, fileName));
        
    // }
    
}
