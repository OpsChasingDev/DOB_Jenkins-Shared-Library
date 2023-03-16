#!/usr/hbin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'Docker Hub repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
        sh 'docker build -t opschasingdev/dockerhub:maven-app-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push opschasingdev/dockerhub:maven-app-2.0'
}