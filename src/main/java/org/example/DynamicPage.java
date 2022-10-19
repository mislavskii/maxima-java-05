package org.example;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DynamicPage {

    public static void createPage(String filename) throws IOException, TemplateException {

        FileWriter writer = new FileWriter(filename, false);

        String templatesPath = App.class.getClassLoader().getResource("templates").getPath();
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
        writer.close();

    }

}
