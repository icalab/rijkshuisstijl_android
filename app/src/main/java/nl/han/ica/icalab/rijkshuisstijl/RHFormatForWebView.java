package nl.han.ica.icalab.rijkshuisstijl;

/**
 * Helper class that contains a function for wrapping a string in such a way that it is displayed
 * in Rijkshuisstijl format inside a webview.
 */
public class RHFormatForWebView {
    private static final String webViewStartHtml = "<html>\n" +
            "<head>\n" +
            "<style type=\"text/css\">\n" +
            "@font-face {\n" +
            "    font-family: BodyFont;\n" +
            "    src: url(\"file:///android_asset/fonts/RijksoverheidSansText-Regular_2_0.otf\")\n" +
            "}\n" +
            "@font-face {\n" +
            "    font-family: HeaderFont;\n" +
            "    src: url(\"file:///android_asset/fonts/RijksoverheidSansHeading-Bold_2_0.otf\")\n" +
            "}\n" +
            "body {\n" +
            "    font-family: BodyFont;\n" +
            "    font-size: medium;\n" +
            "    text-align: justify;\n" +
            "}\n" +
            "</style>\n" +
            "</head>\n" +
            "<body>";

    private static final String webViewEndHtml = "</body></html>";

    /**
     * Wrap a string with a rh_header and rh_footer so it is displayed in Rijkshuisstijl format
     * @param content the string to wrap
     * @return the wrapped string
     */
    public static final String format(String content) {
        return RHFormatForWebView.webViewStartHtml + content + RHFormatForWebView.webViewEndHtml;
    }
}
