package com.novoda.simplechromecustomtabs.navigation;

import android.content.Context;

import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent;

class ExitAnimationsComposer implements Composer {

    private final Context context;
    @AnimRes
    private final int enterAnimationResId;
    @AnimRes
    private final int exitAnimationResId;

    public ExitAnimationsComposer(@NonNull Context context, @AnimRes int enterAnimationResId, @AnimRes int exitAnimationResId) {
        this.context = context;
        this.enterAnimationResId = enterAnimationResId;
        this.exitAnimationResId = exitAnimationResId;
    }

    @Override
    public CustomTabsIntent.Builder compose(CustomTabsIntent.Builder builder) {
        return builder.setExitAnimations(context, enterAnimationResId, exitAnimationResId);
    }

}
