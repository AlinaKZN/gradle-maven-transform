dependencies {
<#list project.dependencies as d>
    compile '${d.groupId}:${d.artifactId}:${d.version}'
</#list>
}