pipeline {
    agent any
    tootls{
        maven '3.8.4'
    }
      stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn -version' 
                sh 'mvn clean install'
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
