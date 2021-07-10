package behaviorDesignPattern.observerDesignPattern.Old;

import behaviorDesignPattern.observerDesignPattern.Old.notifier.EmailNotifier;
import behaviorDesignPattern.observerDesignPattern.Old.notifier.PhoneNotifier;
import behaviorDesignPattern.observerDesignPattern.Old.notifier.YoutubeNotifier;

public class VideoData {
    // region Private Properties
    private String title;
    private String description;
    private String fileName;
    private EmailNotifier emailNotifier;
    private PhoneNotifier phoneNotifier;
    private YoutubeNotifier youtubeNotifier;
    // endregion
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
        VideoDataChanged();
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
        VideoDataChanged();
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
        VideoDataChanged();
    }

    /**
     * Ở đây chúng ta thấy Class VideoData đang liên kết với các concrete class
     * Vi phạm chũ I và D trong Solid
     */
    public VideoData() {
        emailNotifier = new EmailNotifier();
        phoneNotifier = new PhoneNotifier();
        youtubeNotifier = new YoutubeNotifier();
    }

    private void VideoDataChanged() {
        String title = getTitle();
        String description = getDescription();
        String fileName = getFileName();

        emailNotifier.Notify(title, description, fileName);
        phoneNotifier.Notify(title, description, fileName);
        youtubeNotifier.Notify(title, description, fileName);
    }

    /**
     * Vấn đề ở đây là :
     * Khi muốn thêm một loại notifier nữa (ví dụ như là FacebookNotifier)
     * Hoặc muốn bỏ PhoneNotifier đi
     * thì chúng ta phải sửa class VideoData khá là nhiều -> vi phạm O trong solid
     */
}
