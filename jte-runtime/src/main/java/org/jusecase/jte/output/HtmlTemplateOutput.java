package org.jusecase.jte.output;

import org.jusecase.jte.TemplateOutput;

@SuppressWarnings("unused") // By generated template code
public interface HtmlTemplateOutput extends TemplateOutput {

    void writeTagBodyUserContent(String value, String tagName);

    default void writeTagBodyUserContent(boolean value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(byte value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(short value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(int value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(long value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(float value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(double value, String tagName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagBodyUserContent(char value, String tagName) {
        writeTagBodyUserContent(String.valueOf(value), tagName);
    }

    void writeTagAttributeUserContent(String value, String tagName, String attributeName);

    default void writeTagAttributeUserContent(boolean value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(byte value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(short value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(int value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(long value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(float value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(double value, String tagName, String attributeName) {
        writeContent(String.valueOf(value));
    }

    default void writeTagAttributeUserContent(char value, String tagName, String attributeName) {
        writeTagAttributeUserContent(String.valueOf(value), tagName, attributeName);
    }
}
