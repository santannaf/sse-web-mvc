
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"

            usermod -aG docker jenkins
            chmod 777 /var/run/docker.sock

            docker run  hello-world
        """)
    }
}