node('jenkins-slave') {
     stage('test pipeline') {
          sh(script: """
                      echo "Hello"
                      git clone https://github.com/santannaf/sse-web-mvc.git
                      cd ./sse-web-mvc
                      docker build -f Dockerfile -t sse-web-mvc .
                     """)
      }
}