package com.lazan.maven.transform;

import java.util.Collection;

import org.apache.maven.model.Dependency;
import org.apache.maven.model.Model;

/**
 * Created by Lance on 15/11/2017.
 */
public interface ProjectsContext {
    Collection<ProjectContext> getProjectContexts();
    boolean isProject(Dependency dependency);
    ProjectContext getProjectContext(Dependency dependency);
    Collection<Model> getProjects();
}
