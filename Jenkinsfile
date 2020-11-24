
node('jenkins-slave') {

     stage('test pipeline') {
        sh(script: """
            echo "hello"
           git clone https://github.com/santannaf/sse-web-mvc.git
           cd ./sse-web-mvc

           docker build . -t test
        """)
    }
}