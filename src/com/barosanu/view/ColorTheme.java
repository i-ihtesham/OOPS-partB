package com.barosanu.view;

public enum ColorTheme {
    LIGHT,
    DEFAULT,
    DARK,
    DRACULA;

    public static String getCssPath(ColorTheme colorTheme){
        switch (colorTheme) {
            case LIGHT:
                return "css/themeLight.css";
            case DEFAULT:
                return "css/themeDefault.css";
            case DARK:
                return "css/themeDark.css";
            case DRACULA:
                return "css/dracula.css";
            default:
                return null;
        }
    }

}