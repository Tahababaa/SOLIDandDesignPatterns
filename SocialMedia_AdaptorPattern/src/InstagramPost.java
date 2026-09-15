public class InstagramPost {

    private final String postId;
    private final String caption;
    private final Long accountId;
    private final Long createdAt;

    public InstagramPost(String postId,String caption, Long accountId,Long createdAt){
        this.postId=postId;
        this.accountId=accountId;
        this.caption=caption;
        this.createdAt=createdAt;
    }

    public String getCaption() {
        return caption;
    }

    public String getPostId() {
        return postId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
}
