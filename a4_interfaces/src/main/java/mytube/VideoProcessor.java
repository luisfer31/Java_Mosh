package mytube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDataBase dataBase;

    public VideoProcessor(VideoEncoder encoder, VideoDataBase dataBase) {
        this.encoder = encoder;
        this.dataBase = dataBase;
    }


    public void process(Video video){
        encoder.encode(video);
        dataBase.store(video);

        var emailService = new EmailService();
//        emailService.sendEmail(video.getUser());
    }
}
