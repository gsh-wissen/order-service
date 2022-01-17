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
                script {
                    def mvnHome = tool 'Maven 3.8.4'
                    bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=true clean package/)
                        def pom = readMavenPom file: 'pom.xml'
                        print pom.version
                        junit '**//*target/surefire-reports/TEST-*.xml'
                        archive 'target*//*.jar'
                }
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
