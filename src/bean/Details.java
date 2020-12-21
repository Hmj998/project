package bean;

import java.util.Date;

public class Details {
    private  int id;
    private int cid;
    private String Content;
    private String source;
    private Date  relesadate;
    private int Status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getRelesadate() {
        return relesadate;
    }

    public void setRelesadate(Date relesadate) {
        this.relesadate = relesadate;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public Details(int cid, String content, String source, Date relesadate) {
        this.cid = cid;
        Content = content;
        this.source = source;
        this.relesadate = relesadate;
    }

    public Details() {
    }
}
