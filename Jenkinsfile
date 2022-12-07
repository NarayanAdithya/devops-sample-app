pipeline {
    agent any
    stages {
        stage("build") {
            steps {
                script {
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