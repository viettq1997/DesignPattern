package behaviorDesignPattern.observerDesignPattern.Old;

public class Program {
    public static void main(String[] args) {
        VideoData videoData = new VideoData();
        videoData.setTitle("Observer design pattern: analyze");
        System.out.println("updated title");
        videoData.setDescription("New description");
    }
}
