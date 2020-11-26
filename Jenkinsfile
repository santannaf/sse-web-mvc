
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"
            docker run --rm alpine /bin/sh -c "echo hello world"
        """)
    }
}