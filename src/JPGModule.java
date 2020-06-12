public class JPGModule implements ImageViewerInterface {
    public String getName() {
        return "JPG Module";
    }

    public void show(String fileName) {
        System.out.println("JPG image loading: " + fileName);
    }

    public String getExtension() {
        return "JPG";
    }
}
