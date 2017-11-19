package com.lazan.maven.transform.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.maven.model.Model;
import org.gradle.api.Project;

import com.lazan.maven.transform.FreemarkerTemplate;
import com.lazan.maven.transform.ProjectContext;
import com.lazan.maven.transform.ProjectTransformModel;
import com.lazan.maven.transform.Template;

public class ProjectTransformModelImpl implements ProjectTransformModel {
    private final Project project;
    private Function<Model, String> outputPathFunction;
    private List<Template> templates = new ArrayList<>();
    private Map<String, Function<ProjectContext, Object>> contextFunctions = new LinkedHashMap<>();

    public ProjectTransformModelImpl(Project project) {
        this.project = project;
    }

    @Override
    public void outputPath(Function<Model, String> outputPathFunction) {
        this.outputPathFunction = outputPathFunction;
    }

    @Override
    public void freemarkerTemplate(String templatePath) {
        template(new FreemarkerTemplate(templatePath));
    }

    @Override
    public void template(Template template) {
        templates.add(template);
    }

    @Override
    public void context(String contextKey, Function<ProjectContext, Object> contextFunction) {
        contextFunctions.put(contextKey, contextFunction);
    }

    public Function<Model, String> getOutputPathFunction() {
        return outputPathFunction;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public Map<String, Function<ProjectContext, Object>> getContextFunctions() {
        return contextFunctions;
    }
}
