package com.lazan.maven.transform;

import java.io.File;

import org.apache.maven.model.Model;

/**
 * Created by Lance on 15/11/2017.
 */
public interface ProjectContext {
    Model getProject();
    File getPomXml();
    String getGroupId();
    String getArtifactId();
    String getVersion();
    String getProjectPath();
    String getGav();
}
