package BehaviorDesignPattern.ObserverDesignPattern.New;

import BehaviorDesignPattern.ObserverDesignPattern.New.Notifiers.EmailNotifier;
import BehaviorDesignPattern.ObserverDesignPattern.New.Notifiers.FacebookNotifier;
import BehaviorDesignPattern.ObserverDesignPattern.New.Notifiers.PhoneNotifier;
import BehaviorDesignPattern.ObserverDesignPattern.New.Notifiers.YoutubeNotifier;

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
