
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"

            sudo usermod -aG docker jenkins
            sudo chmod 777 /var/run/docker.sock

            docker run --rm alpine /bin/sh -c "echo hello world"
        """)
    }
}