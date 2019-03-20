package fi.iki.jka;

public class TestJPhotoFrame extends JPhotoFrame {

    protected int interval = 0;

    @Override
    protected void init(String frameName, JPhotoCollection photos) throws Exception {
        super.photos = photos;
        super.list = new JPhotoList(photos, 190);
    }

    public TestJPhotoFrame(String frameName, JPhotoCollection photos) throws Exception {
        super(frameName, photos);
    }

    @Override
    protected void performSlideShow(JPhotoCollection photos, JPhotoList list, int interval, String cmd) {
        this.interval = interval;
    }
}
