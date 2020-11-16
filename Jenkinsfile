node('jenkins-slave') {
     stage('test pipeline') {
      agent {
            docker { image 'maven:3.6.0-alpine' }
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