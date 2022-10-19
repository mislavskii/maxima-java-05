package org.example;

// TODO: 18.10.2022
//  Создать шаблон страницы с использованием тегов div, p, a, img
//  Использовать на странице не менее трех классов, подключенных к типу элемента, к id элемента
//  и через явное указание класса
//  Описать класс DynamicPage с методом createPage(String filename), который будет создавать html-файл
//  по шаблону Freemarker, используя данные из вспомогательного класса.
//  В качестве такого класса данных использовать класс Cat из модуля 3.

import freemarker.template.TemplateException;
import java.io.IOException;

public class App {
    public static void main( String[] args ) throws IOException, TemplateException {

        DynamicPage.createPage("www/cat.html");

    }
}
