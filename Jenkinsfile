node('jenkins-slave') {
     stage('test pipeline') {
        sh(script: """
                    echo "Hello"
                    git clone https://github.com/santannaf/sse-web-mvc.git
                    docker build -t test .

                   """)
    }
}