import java.util.List;

public class InstagramApi {
    public List<InstagramPost> fetchPosts(long accountId){
        return List.of(
                new InstagramPost(
                        "101",
                        "hELLO from Instagram",
                        accountId,
                        123456789L

                )
        );
    }
    public void publishPhoto(Long accountId, String caption){
        System.out.println("Publishing Instagram photo: "+caption);
    }
}
