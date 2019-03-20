package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void placeholder() throws Exception {
        assertThat(2, equalTo(2));
    }

    @Test
    public void testPerformSlideShow() throws Exception {
        TestJPhotoFrame frame = new TestJPhotoFrame("Test Frame", new JPhotoCollection());
        ActionEvent slideShow = new ActionEvent("source", 0 , JPhotoMenu.A_SLIDESHOW);
        frame.actionPerformed(slideShow);

        ActionEvent quickPreview = new ActionEvent("source", 0 , JPhotoMenu.A_QUICK_PREVIEW);
        frame.actionPerformed(quickPreview);
    }


}