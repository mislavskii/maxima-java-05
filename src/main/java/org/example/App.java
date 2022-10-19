package org.example;

// TODO: 18.10.2022
//  Создать шаблон страницы с использованием тегов div, p, a, img
//  Использовать на странице не менее трех классов, подключенных к типу элемента, к id элемента
//  и через явное указание класса
//  Описать класс DynamicPage с методом createPage(String filename), который будет создавать html-файл
//  по шаблону Freemarker, используя данные из вспомогательного класса.
//  В качестве такого класса данных использовать класс Cat из модуля 3.

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main( String[] args ) throws IOException, TemplateException {

/*        FileWriter writer = new FileWriter("www/result.html", false);

        String templatesPath = "templates";
        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setDirectoryForTemplateLoading(new File(templatesPath));
        config.setDefaultEncoding("UTF-8");

        Map root = new HashMap<>();
        root.put("title", "Данные кота");

        Cat cat = new Cat("Мурзик", 6, true);

        root.put("cat", cat);

        Template template = config.getTemplate("index.html");
        template.process(root, writer);

        writer.flush();
        writer.close();*/

        DynamicPage.createPage("cat.html");

    }
}
