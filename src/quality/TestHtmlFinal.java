package quality;

public class TestHtmlFinal {
    public static String renderPageWithSetupsAndTearDown(PageData pageData, boolean isSuite) {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            includeSetupAndTeraDownPages(pageData, isSuite);
        }
        return pageData.getHtml();
    }

    private static void includeSetupAndTeraDownPages(PageData pageData, boolean isSuite) {
        //....
    }
}
