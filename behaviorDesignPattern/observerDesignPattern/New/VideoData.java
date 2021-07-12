package behaviorDesignPattern.ObserverDesignPattern.New;

import behaviorDesignPattern.ObserverDesignPattern.New.Base.Subject;

public class VideoData extends Subject {
    // region Private Properties
    private String title;
    private String description;
    private String fileName;
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

    private void VideoDataChanged() {
        NotifyObserver(null);
    }
}
