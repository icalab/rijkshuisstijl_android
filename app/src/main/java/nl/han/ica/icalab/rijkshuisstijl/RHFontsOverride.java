package nl.han.ica.icalab.rijkshuisstijl;

import java.lang.reflect.Field;
import android.content.Context;
import android.graphics.Typeface;

/**
 * Helper class for overriding a font in an app. Code taken from here:
 * http://stackoverflow.com/questions/2711858/is-it-possible-to-set-font-for-entire-application
 */
public final class RHFontsOverride {

    public static void setDefaultFont(Context context,
                                      String staticTypefaceFieldName, String fontAssetName) {
        final Typeface regular = Typeface.createFromAsset(context.getAssets(),
                fontAssetName);
        replaceFont(staticTypefaceFieldName, regular);
    }

    protected static void replaceFont(String staticTypefaceFieldName,
                                      final Typeface newTypeface) {
        try {
            final Field staticField = Typeface.class
                    .getDeclaredField(staticTypefaceFieldName);
            staticField.setAccessible(true);
            staticField.set(null, newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}