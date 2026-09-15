import java.util.List;

public class SocialMediaService {

    private final SocialMediaClient client;

    public SocialMediaService(SocialMediaClient client){
        this.client=client;
    }

    public void publish(Long userId,String content){
        client.createPost(userId, content);
    }
    public void showPosts(Long userId){
        List<Post> posts = client.getPosts(userId);
        posts.forEach(System.out::println);
    }
}
