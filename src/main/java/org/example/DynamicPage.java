package org.example;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DynamicPage {

    public static void createPage(String filename) throws IOException, TemplateException {

        FileWriter writer = new FileWriter(filename, false);

        String templatesPath = App.class.getClassLoader().getResource("templates").getPath();
        Configuration config = new Configuration(Configuration.VERSION_2_3_31);
        config.setDirectoryForTemplateLoading(new File(templatesPath));
        config.setDefaultEncoding("UTF-8");

        Map root = new HashMap<>();
        root.put("title", "Данные кота");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя кота: ");
        String catName = scanner.nextLine();
        System.out.print("Его вес: ");
        int catWeight = scanner.nextInt();
        System.out.print("Сердитый (1) или дружелюбный (0)? ");
        boolean angry = scanner.nextInt() != 0;

        Cat cat = new Cat(catName, catWeight, angry);

        root.put("cat", cat);

        Template template = config.getTemplate("index.html");
        template.process(root, writer);

        writer.flush();
        writer.close();

    }

}
