# Rijkshuisstijl Android app skeleton

Skeleton for developing an Android app that conforms to the guidelines for
developing an app for an institution of the government of the Netherlands
(Rijkshuisstijl).

It makes sure the app is displayed using the correct fonts, colors and layout.

This skeleton was developed at <a href="http://www.icalab.nl">ICA-lab</a>,
a development office of the 
<a href="http://www.han.nl/international/english/about-han/organisation/faculties-and-institutes/information-technology-media-communication">Academy of Information Technology, Media and Communication (ICA)</a> of 
<a href="http://www.han.nl/international/english/">HAN University of Applied Sciences</a>.

## Installation / usage

1. Download as is, remove the .git directory and refactor the package name to
reflect your own package.

2. Edit colors.xml to use the required color scheme.

3. Replace the following files with files that are appropriate for your app
   (all in res/drawable-xxxhdpi):
   * rh\_footer\_text.png
   * rh\_header\_main\_menu.png

4. Add buttons and other content to the start screen activity: modify
   layout/rh_start_screen.xml as needed and wire everything up in
   RHStartScreen.java.

5. Add menu items to rh_menu_fragment.xml and wire them up in
   RHMenuFragment.java.

6. Make sure all your activities extend from RHActivity.java.

7. In your own layout xml files ONLY supply layout for everything that will be
   displayed between the header and the footer.

## Notes

* Android uses a system font for the contents of a web view. To make sure web
  views are displayed in the correct font, use the
  RHFormatForWebView::format(String content) method.
* There are two different layout files for the start screen. This is because
  the metrics are slightly different on large devices.

