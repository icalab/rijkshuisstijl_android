package nl.han.ica.icalab.rijkshuisstijl;

/**
 * To use the official Rijkshuisstijl fonts, the Application class needs to be overridden.
 * Code taken from here:
 * http://stackoverflow.com/questions/2711858/is-it-possible-to-set-font-for-entire-application
 */
public final class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RHFontsOverride.setDefaultFont(this, "DEFAULT", "fonts/RijksoverheidSansText-Regular_2_0.otf");
        RHFontsOverride.setDefaultFont(this, "DEFAULT_BOLD", "fonts/RijksoverheidSansText-Bold_2_0.otf");
        // Serif fonts are rarely used, but they should be available.
        RHFontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/RijksoverheidSerif-Regular_2_0.otf");
        // "Serif" is used in all sorts of headings and menus by default. So it makes sense to set it to a sensible default for that use.
        RHFontsOverride.setDefaultFont(this, "SERIF", "fonts/RijksoverheidSansHeading-Bold_2_0.otf");
        RHFontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/RijksoverheidSansText-Regular_2_0.otf");
    }
}