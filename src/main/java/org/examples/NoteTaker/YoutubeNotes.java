package org.examples.NoteTaker;


import java.net.URL;
import org.examples.NoteTaker.enums.users.userClasses.IuserClasses;

public class YoutubeNotes {
    IuserClasses userClasses;
    URL url;
    public YoutubeNotes(URL url) {
        this.url = url;
    }
    public URL getUrl() {
        return url;
    }
    public void setUrl(URL url) {
        this.url = url;
    }


}
