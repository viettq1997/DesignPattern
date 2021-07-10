package behaviorDesignPattern.observerDesignPattern.New;

import behaviorDesignPattern.observerDesignPattern.New.Notifiers.EmailNotifier;
import behaviorDesignPattern.observerDesignPattern.New.Notifiers.FacebookNotifier;
import behaviorDesignPattern.observerDesignPattern.New.Notifiers.PhoneNotifier;
import behaviorDesignPattern.observerDesignPattern.New.Notifiers.YoutubeNotifier;

public class Program {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        new EmailNotifier(videoData);
        new PhoneNotifier(videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);
        videoData.setTitle("Observer design pattern");

        videoData.detachObserver(youtubeNotifier);
        System.out.println("------------------------");
        videoData.setDescription("viettq description");

        System.out.println("------------------------");
        new FacebookNotifier(videoData);
        videoData.setFileName("a very good file");
    }
}