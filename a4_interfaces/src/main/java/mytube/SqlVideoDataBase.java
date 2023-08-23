package mytube;

public class SqlVideoDataBase implements VideoDataBase {
//    @Override
    public void Store(Video video){
        System.out.println("Storing video metadata");
        System.out.println("Title: " +video.getTitle());
        System.out.println("File Name: " +video.getFileName());
        System.out.println("Done!\n");
    }


    @Override
    public void store(Video video) {

    }
}
