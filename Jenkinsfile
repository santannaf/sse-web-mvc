
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"
            git clone https://github.com/santannaf/sse-web-mvc.git
            cd ./sse-web-mvc

            #####docker build . -t test
            #####docker run --rm alpine /bin/sh -c "echo hello world"

            ###### sudo groupadd -g 10000 jenkins
            ###### sudo useradd -c "Jenkins user" -d /home/jenkins -u 10000 -g 10000 -m jenkins
            sudo usermod -aG docker jenkins
            sudo usermod -aG sudo jenkins

            sudo gpasswd -a jenkins docker

            sudo docker start

            sudo docker images
            sudo docker run --rm alpine /bin/sh -c "echo hello world"
        """)
    }
}