pipeline {
    agent any
      stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        
        stage('Build') {
            steps {
                sh 'clean install -DskipTests=true' 
            }
        }
        stage('Test') {
            steps {
                echo 'Test..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying..'
            }
        }
        stage('Release') {
            steps {
                echo 'Release..'
            }
        }
    }
}
