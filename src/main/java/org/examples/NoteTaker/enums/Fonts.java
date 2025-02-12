package org.examples.NoteTaker.enums;

import java.awt.Font;

public enum Fonts {
    ARIAL(new Font("Arial", Font.PLAIN,12)),
    ARIALHEADER(new Font("Arial", Font.BOLD,24)),
    TIMES_NEW_ROMAN(new Font("Times New Roman", Font.PLAIN, 12)),
    TIMES_HEADER(new Font("Times New Roman", Font.BOLD, 24)),
    COURIER_NEW(new Font("Courier New", Font.PLAIN, 12)),
    VERDANA(new Font("Verdana", Font.PLAIN, 12)),
    COURIER_NEW_HEADER(new Font("Courier New", Font.BOLD, 24)),
    VERDANA_HEADER(new Font("Verdana", Font.BOLD, 24)),
    GEORGIA(new Font("Georgia", Font.PLAIN | Font.ITALIC, 12)),
    GEORGIA_HEADER(new Font("Georgia", Font.BOLD | Font.ITALIC, 24));

    private final Font font;
    Fonts(Font font) {
        this.font = font;
    }

    public Font getFont() {
        return font;
    }


}
