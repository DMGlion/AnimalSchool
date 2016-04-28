package com.example.davidmgarcia6.animalschool;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by davidmgarcia6 on 28/04/16.
 */
public class ReplaceFont {
    public static void replaceDefaultFont(Context context, String nameOfFontBeingReplace, String nameOfFonInAsset){
        Typeface customFontTypeface = Typeface.createFromAsset(context.getAssets(),nameOfFonInAsset);
        replaceFont(nameOfFontBeingReplace, customFontTypeface);
    }

    private static void replaceFont(String nameOfFontBeingReplace, Typeface customFontTypeface) {
        try {
        Field myfield = Typeface.class.getDeclaredField(nameOfFontBeingReplace);
        myfield.setAccessible(true);
            myfield.set(null, customFontTypeface);
        } catch (NoSuchFieldException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
