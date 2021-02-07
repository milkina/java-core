package quality;

public class TestHtml {
    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuilder stringBuilder = new StringBuilder();
        if (pageData.hasAttribute("Test")) {
            if (includeSuiteSetup) {
                WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage("SuiteSetup", wikiPage);
                if (suiteSetup != null) {
                    WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    String pagePathName = PathParser.render(pagePath);
                    stringBuilder.append("!include-setup .");
                    stringBuilder.append(pagePathName);
                    stringBuilder.append("\n");
                }
            }
            WikiPage setup = PageCrawlerImpl.getInheritedPage("Setup", wikiPage);
            if (setup != null) {
                WikiPagePath setUpPath = wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setUpPath);
                stringBuilder.append("!include-setup .");
                stringBuilder.append(setupPathName);
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append(pageData.getContent());
        if (pageData.hasAttribute("Test")) {
            WikiPage tearDown = PageCrawlerImpl.getInheritedPage("tearDown", wikiPage);
            if (tearDown != null) {
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(tearDown);
                String tearDownPathName = PathParser.render(tearDownPath);
                stringBuilder.append("!include-teardown .");
                stringBuilder.append(tearDownPathName);
                stringBuilder.append("\n");
            }
            if (includeSuiteSetup) {
                WikiPage suiteTearDown = PageCrawlerImpl.getInheritedPage("SuiteTearDown", wikiPage);
                if (tearDown != null) {
                    WikiPagePath pagePath = wikiPage.getPageCrawler().getFullPath(suiteTearDown);
                    String pagePathName = PathParser.render(pagePath);
                    stringBuilder.append("!include-teardown .");
                    stringBuilder.append(pagePathName);
                    stringBuilder.append("\n");
                }
            }
        }
        pageData.setContent(stringBuilder.toString());
        return pageData.getHtml();
    }
}
