def gv

pipeline {
    agent any
    tools{
        maven 'Maven-Latest'
    }
    stages {
        stage("init") {
            steps {
                script{
                gv = load "script.groovy"
                }
            }
            
        }
        stage("package") {
            steps{
                script{
                    gv.packageApp()
                }
            }
            
        }
        stage("build") {
            steps{
                script{
                    gv.buildApp()
                }
            }
            
        }
        stage("test") {
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
           steps{
            script{
                gv.deployApp()
            }
           }
        }
    }
}