pipeline {
    agent any
    environment {
        JENKINS_AUTHOR = 'ADITHYA'
    }
    stages {
        stage("build") {
            steps {
                script {
                    echo "Author Of Jenkins is ${JENKINS_AUTHOR}"
                    echo "Build"
                }
            }
        }
        stage("test") {
            steps {
                script {
                    echo "Test"
                }
            }
        }
    }
    post {
        always {
            echo "Executed Always"
        }
        success {
            echo 'Done Successfully'
        }
        failure {
            echo "Failure Epic Failure"
        
        }
    }
}