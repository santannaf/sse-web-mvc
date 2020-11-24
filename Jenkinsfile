
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"
            docker run hello-world
        """)
    }
}