# strict-font-scale-android

## Usage

Use it in any activity.

For example if you are using NavigationDrawer, you have one main activity (MainActivity.class). Add the folowing lines:
```
 override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(newBase)
        StrictFontSizeHelper.setStrictScaleFontSize(this, newBase)
    }
    ```
