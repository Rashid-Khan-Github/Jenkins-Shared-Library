#!/usr/bin/env groovy

def call() {
    echo "Building Jar file for branch $BRANCH_NAME"
    sh 'mvn clean package'
}