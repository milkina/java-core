package quality;

public class TestHtmlRefactored {
    public static String renderPageWithSetupsAndTearDown(PageData pageData, boolean isSuite) {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuilder newPageContent = new StringBuilder();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTearDownPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml();
    }

    private static void includeSetupPages(WikiPage testPage, StringBuilder newPageContent, boolean isSuite) {
        //....
    }

    private static void includeTearDownPages(WikiPage testPage, StringBuilder newPageContent, boolean isSuite) {
        //...
    }
}
