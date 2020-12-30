package com.davidsalter.richfaces.actions;

import java.io.IOException;
import javax.ejb.Local;
import org.richfaces.event.UploadEvent;

/**
 * Sample source code for Chapter 6 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Local
public interface RichFacesDemo {
    
    public String testCalendar();
    public void uploadListener(UploadEvent event) throws IOException;

}
