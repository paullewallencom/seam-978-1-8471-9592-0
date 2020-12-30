package com.davidsalter.richfaces.actions;

import com.davidsalter.richfaces.entity.Demo;
import java.io.File;
import java.io.IOException;
import javax.ejb.Stateless;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;

/**
 * Sample source code for Chapter 6 of "Developing Seam 2.x Web Applications"
 * See http://www.packtpub.com/seam-2-x-web-development/book
 * 
 * @author david
 * @version 1.0
 *
 */
@Stateless
@Name("richFacesDemo")
public class RichFacesDemoAction implements RichFacesDemo {

    @In(create=true)
    private Demo demo;


    public String testCalendar() {
        System.out.println(demo.getTheDate());
        return "";
    }

    public void uploadListener(UploadEvent event) throws IOException {
        UploadItem item = event.getUploadItem();

        if (item.isTempFile()) {
            File file = item.getFile();

            String name = file.getAbsolutePath();
            System.out.println("Temporary File."+name);
        } else {
            System.out.println("Byte Array");
        }
        System.out.println(item.getFileSize() + " bytes.");
        
        System.out.println("file uploaded '#0' "+ item.getFileName());
    }
}
