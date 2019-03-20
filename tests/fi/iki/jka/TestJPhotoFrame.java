package fi.iki.jka;

import org.junit.Assert;

public class TestJPhotoFrame extends JPhotoFrame {
    public TestJPhotoFrame(String frameName, JPhotoCollection photos) throws Exception {
        super(frameName, photos);
    }

    @Override
    protected void performSlideShow(JPhotoCollection photos, JPhotoList list, int interval, String cmd) {
        if (cmd.equals(JPhotoMenu.A_SLIDESHOW)){
            Assert.assertEquals(5000, interval);
        } else if (cmd.equals(JPhotoMenu.A_QUICK_PREVIEW)){
            Assert.assertEquals(1000, interval);
        }
    }
}
