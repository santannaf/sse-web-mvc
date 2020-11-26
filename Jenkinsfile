
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"

            ##sudo useradd -c "Jenkins user" -d /home/jenkins -u 10000 -g 10000 -m jenkins
            ##usermod -aG docker jenkins
            ##usermod -aG sudo jenkins
            ##chmod 777 /var/run/docker.sock

            docker run  hello-world
        """)
    }
}