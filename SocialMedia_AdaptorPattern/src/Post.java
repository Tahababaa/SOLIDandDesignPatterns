public class Post {

    private final String id;
    private final String content;
    private final Long userId;
    private final Long timestamp;

    public Post(String id, String content,Long userId, Long timestamp){
        this.id=id;
        this.content=content;
        this.userId=userId;
        this.timestamp=timestamp;
    }

    public String getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                ", timestamp=" + timestamp +
                '}';
    }
}
