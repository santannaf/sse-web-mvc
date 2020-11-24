
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"
            docker run -v /var/run/docker.sock:/var/run/docker.sock hello-world
        """)
    }
}