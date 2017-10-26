package me.aoa4eva;

public class Tab {
    private String title;
    private String url;


    public Tab()
    {

    }

    public Tab(String tabTitle, String tabUrl)
    {
        this.title=tabTitle;
        this.url=tabUrl;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
