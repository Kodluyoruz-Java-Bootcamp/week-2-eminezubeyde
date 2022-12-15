package medium.model;

import java.time.LocalDateTime;

public class Blog {

    private String title;
    private String story;
    private String topic;
    private LocalDateTime publishedDate;

    public Blog(String title, String story, String topic) {
        this.title = title;
        this.story = story;
        this.topic = topic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate;
    }
}
