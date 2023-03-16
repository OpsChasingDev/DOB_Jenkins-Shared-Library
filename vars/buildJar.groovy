#!/usr/hbin/env groovy

def call() {
    echo "building the application..."
    sh 'mvn clean package'
}