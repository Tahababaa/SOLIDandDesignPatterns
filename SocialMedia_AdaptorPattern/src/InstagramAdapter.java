import java.util.List;

public class InstagramAdapter implements  SocialMediaClient{
    private final InstagramApi instagramApi ;

    public InstagramAdapter(InstagramApi instagramApi){
        this.instagramApi= instagramApi;
    }

    @Override
    public List<Post> getPosts(Long userId) {
         List<InstagramPost> instagramPosts = instagramApi.fetchPosts(userId);

         return instagramPosts.stream()
                 .map(post-> new Post(
                         post.getPostId(),
                         post.getCaption(),
                         post.getAccountId(),
                         post.getCreatedAt()
                 ))
                 .toList();

    }

    @Override
    public void createPost(Long userId, String content) {
        instagramApi.publishPhoto(userId,content);

    }
}
