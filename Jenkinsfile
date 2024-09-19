pipeline {
    agent any

    environment {
        JAR_FILE_PATH = 'target/*.jar'
        DESTINATION_PATH = '/Users/adrian/CursoDevOps/'
        REPO_URL = 'https://github.com/alopezp/jenkins-maven-sonar-jfrog-integration.git'
        BRANCH_NAME = 'feature/dummy-app'
    }

    stages {
       stage('Clone ') {
            steps {
                script {
                    sh 'git clone ${env.REPO_URL}'
                    dir('jenkins-maven-sonar-jfrog-integration') {
                        sh "git checkout ${env.BRANCH_NAME}"
                    }
                }
            }
        }
        stage('Clean') {
            steps {
                script {
                    sh 'mvn clean'
                }
            }
        }
        stage('Validate') {
            steps {
                script {
                    sh 'mvn validate'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
        stage('Install') {
            steps {
                script {
                    sh 'mvn install'
                }
            }
        }
        stage('Copy JAR') {
            steps {
                script {
                    sh "cp ${env.JAR_FILE_PATH} ${env.DESTINATION_PATH}"
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline ejecutado correctamente.'
        }
        always {
            echo 'Pipeline finalizado.'
        }
        failure {
            echo 'ERROR: El pipeline contiene errores.'
        }
    }
}
