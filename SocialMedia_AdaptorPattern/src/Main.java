public class Main {

    public static void main(String[] args) {

        InstagramApi instagramApi = new InstagramApi();

        SocialMediaClient instagramAdapter =
                new InstagramAdapter(instagramApi);

        SocialMediaService service =
                new SocialMediaService(instagramAdapter);

        service.publish(
                101L,
                "Learning Adapter Design Pattern!"
        );

        service.showPosts(101L);
    }
}