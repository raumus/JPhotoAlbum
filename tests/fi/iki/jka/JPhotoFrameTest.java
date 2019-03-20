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
        JPhotoFrame frame = new JPhotoFrame("Test Frame", new JPhotoCollection());
        ActionEvent ev = new ActionEvent("source", 0 , JPhotoMenu.A_SLIDESHOW);
        frame.actionPerformed(ev);
    }


}