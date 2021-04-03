package tell.hu.gcuser.helpers

import android.app.Activity
import android.content.Context
import android.content.res.Configuration

object StrictFontSizeHelper {
    /**
     * Default scale size is 1.0f.
     * Use this value if you don't want any effect from the android system font size to your font size setting.
     * */
    fun setStrictScaleFontSize(activity: Activity, context: Context, scale: Float = 1.0f) {
        val newOverride = Configuration(context.resources?.configuration)
        newOverride.fontScale = scale
        activity.applyOverrideConfiguration(newOverride)
    }
}