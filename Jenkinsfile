pipeline {
    agent any
    environment {
        JENKINS_AUTHOR = 'ADITHYA'
    }
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: '')
        booleanParam(name: 'executeTest', defaultValue: true, description: '')
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
            when {
                expression {
                     params.executeTest
                }
            }
            steps {
                script {
                    echo "Test"
                }
            }
        }
        stage("deploy") {
            steps {
                echo "Getting Credentials for ${params.VERSION}"
                
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