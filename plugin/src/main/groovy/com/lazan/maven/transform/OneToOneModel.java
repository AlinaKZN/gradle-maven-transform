package com.lazan.maven.transform;

import org.gradle.api.file.FileCollection;
import org.apache.maven.model.Model;

import java.util.Collection;
import java.util.function.Function;

/**
 * Created by Lance on 11/11/2017.
 */
public interface OneToOneModel {
    void classpath(FileCollection classpath);
    void outputPath(Function<Model, String> outputFileFunction);
    void freemarkerTemplate(String templatePath);
    void template(Template template);
    void context(String contextKey, Function<ProjectContext, Object> contextFunction);
}
