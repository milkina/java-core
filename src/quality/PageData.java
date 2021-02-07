package quality;

public class PageData {
    private WikiPage wikiPage;

    public WikiPage getWikiPage() {
        return wikiPage;
    }

    public void setWikiPage(WikiPage wikiPage) {
        this.wikiPage = wikiPage;
    }

    public boolean hasAttribute(String attribute) {
        return false;
    }

    public String getContent() {
        return "";
    }

    public void setContent(String string) {

    }

    public String getHtml(){
        return "";
    }
}
