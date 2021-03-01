package quality;

public class TestHtmlFinal {
    public static String renderPageWithSetupsAndTearDown(PageData pageData, boolean isSuite) {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            includeSetupAndTearDownPages(pageData, isSuite);
        }
        return pageData.getHtml();
    }

    private static void includeSetupAndTearDownPages(PageData pageData, boolean isSuite) {
        //....
    }
}
