node('jenkins-slave') {
    stages {
        stage ('Clean Package') {
            agent {
                docker { image 'maven:3-alpine' }
            }
            steps {
                sh(script: """
                    echo "Hello"
                    git clone https://github.com/santannaf/sse-web-mvc.git
                    cd ./sse-web-mvc
                    mvn clean package
                """)
            }
        }
    }
}