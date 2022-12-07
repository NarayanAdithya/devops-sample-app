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
        stage("deploy") {
            steps {
                echo "Getting Credentials"
                withCredentials([usernamePassword(credentialsId: 'dockernexus', passwordVariable: 'PWD', usernameVariable: 'USER')]){
                        echo "${USER} ${PWD} Docker Login"
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