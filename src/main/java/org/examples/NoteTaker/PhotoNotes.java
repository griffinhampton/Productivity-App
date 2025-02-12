package org.examples.NoteTaker;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import org.examples.NoteTaker.enums.users.userClasses.IuserClasses;

public class PhotoNotes {
    IuserClasses userClasses;
    List<Image> images = new ArrayList<>();
    File file;
    Image image;
    public PhotoNotes(File file) throws IOException {
        this.file = file;
        image = ImageIO.read(file);
    }
    public void addImage(Image image){
        images.add(image);
    }
    public List<Image> getImages(){
        return images;
    }
    public File getFile(){
        return file;
    }
    public Image getImage(){
        return image;
    }

}
