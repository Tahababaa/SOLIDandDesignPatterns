public interface SocialMediaClient {
    List<Post> getPosts(Long userId);
    void createPost(Long userId,String content);
}
