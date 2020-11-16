node('jenkins-slave') {
      agent {
            docker { image 'maven:3-alpine' }
      }
     stage('test pipeline') {
          sh(script: """
                      echo "Hello"
                      git clone https://github.com/santannaf/sse-web-mvc.git
                      cd ./sse-web-mvc
                      mvn clean package
                     """)
      }
}