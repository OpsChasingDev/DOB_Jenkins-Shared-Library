#!/usr/hbin/env groovy

def call() {
    echo "building the application for branch $BRANCH_NAME"
    sh 'mvn clean package'
}