def buildApp() {
    sh "docker build -t narayanadithya/nanajanashia:jenkins1.0 ."
}

def testApp() {
    sh "mvn test"
}

def deployApp() {
    withCredentials([usernamePassword(credentialsId: 'dockerhub-adina', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "echo ${PASS} | docker login -u ${USER} --password-stdin"
        sh "docker push narayanadithya/nanajanashia:jenkins1.0"
    }
}

return this