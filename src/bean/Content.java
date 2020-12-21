package bean;

import java.util.Date;

public class Content {
    private int Cid;
    private String title;
    private String content;
    private String imagepath;
    private int commentary;
    private int likely;
    private Date releasadate ;
    private String source;
    private int status;

    public int getCid() {
        return Cid;
    }

    public void setCid(int cid) {
        Cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public int getCommentary() {
        return commentary;
    }

    public void setCommentary(int commentary) {
        this.commentary = commentary;
    }

    public int getLikely() {
        return likely;
    }

    public void setLikely(int likely) {
        this.likely = likely;
    }

    public Date getReleasadate() {
        return releasadate;
    }

    public void setReleasadate(Date releasadate) {
        this.releasadate = releasadate;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Content(int cid, String title, String content, String imagepath, int commentary, int likely, Date releasadate, String source, int status) {
        Cid = cid;
        this.title = title;
        this.content = content;
        this.imagepath = imagepath;
        this.commentary = commentary;
        this.likely = likely;
        this.releasadate = releasadate;
        this.source = source;
        this.status = status;
    }

    public Content(String title, String content, String imagepath, int commentary, int likely, Date releasadate, String source) {
        this.title = title;
        this.content = content;
        this.imagepath = imagepath;
        this.commentary = commentary;
        this.likely = likely;
        this.releasadate = releasadate;
        this.source = source;
    }

    public Content() {
    }
}
