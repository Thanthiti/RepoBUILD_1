@Library('kde-common-lib') _

pipeline {
    agent any
    parameters {
        choice(name: 'BRANCH', defaultValue: 'dev', choices: ['dev', 'deploy','release'], description: 'Branch to build')
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
            stage('Hello from branch test') {
            steps {
                echo 'Hello from branch test'
            }
        }
    }
}
