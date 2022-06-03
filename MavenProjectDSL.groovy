job('First-Maven-Project-Via-DSL') {
  description("First Maven job generated using DSL on ${new Date()}, the project is a small Maven project hosted on github.")
  scm {
    git("https://github.com/bkdevinci/Udemy_DevOps_Sample_Maven.git", 'master')
  }
  triggers {
    scm('* * * * *')
  }
  steps {
    maven('clean package', 'maven-samples/single-module/pom.xml')
  }
  publishers {
    archiveArtifacts '**/*.jar'
  }
}
