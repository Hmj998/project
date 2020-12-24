package bean;

import java.util.Date;

public class Content {
    private int id ;
    private String title;
    private String image1;
    private String conntents1;
    private String image2;
    private String conntents2;
    private String image3;
    private String conntents3;
    private int commentary;
    private int likeit;
    private Date releasadata;
    private String source;
    private int status;

    public Content() {

    }

    public Content(String title, String image1, String conntents1, String image2, String conntents2, String image3, String conntents3, int commentary, int likeit, Date releasadata, String source, int status) {
        this.title = title;
        this.image1 = image1;
        this.conntents1 = conntents1;
        this.image2 = image2;
        this.conntents2 = conntents2;
        this.image3 = image3;
        this.conntents3 = conntents3;
        this.commentary = commentary;
        this.likeit = likeit;
        this.releasadata = releasadata;
        this.source = source;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getConntents1() {
        return conntents1;
    }

    public void setConntents1(String conntents1) {
        this.conntents1 = conntents1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getConntents2() {
        return conntents2;
    }

    public void setConntents2(String conntents2) {
        this.conntents2 = conntents2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getConntents3() {
        return conntents3;
    }

    public void setConntents3(String conntents3) {
        this.conntents3 = conntents3;
    }

    public int getCommentary() {
        return commentary;
    }

    public void setCommentary(int commentary) {
        this.commentary = commentary;
    }

    public int getLikeit() {
        return likeit;
    }

    public void setLikeit(int likeit) {
        this.likeit = likeit;
    }

    public Date getReleasadata() {
        return releasadata;
    }

    public void setReleasadata(Date releasadata) {
        this.releasadata = releasadata;
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
}
