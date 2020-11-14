node('jenkins-slave') {
     stage('test pipeline') {
        sh(script: """
                       docker run --rm alpine /bin/sh -c "echo hello world"
                   """)
    }
}