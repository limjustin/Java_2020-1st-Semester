public class PNGModule implements ImageViewerInterface {
    public String getName() {
        return "PNG Module";
    }

    public void show(String fileName) {
        System.out.println("PNG image loading: " + fileName);
    }

    public String getExtension() {
        return "PNG";
    }
}
