@Library('Jenkins-Shared-Library')
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
        stage("build"){
            steps{
                script{
                    gv.printApp()
                }
            }
        }
        stage("package") {
            steps{
                script{
                    buildJar()
                }
            }
            
        }
        stage("deploy") {
           steps{
            script{
                buildImage()
            }
           }
        }
    }
}