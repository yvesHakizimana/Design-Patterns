package strategy;

public class Main {
    public static void main(String[] args){
        var imageStorage = new ImageStorage();
        imageStorage.store("FileName", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
