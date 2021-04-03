# strict-font-scale-android

## Usage

Use it in any activity.

For example if you are using NavigationDrawer or BottomNavigation, you have one main activity (MainActivity.class). Add the following lines:
```
 override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(newBase)
        StrictFontSizeHelper.setStrictScaleFontSize(this, newBase)
    }
    ```
