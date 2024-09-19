pipeline {
    agent any

    environment {
        JAR_FILE_PATH = 'target/*.jar'
        DESTINATION_PATH = '/Users/adrian/Documents/'
        REPO_URL = 'https://github.com/alopezp/jenkins-maven-sonar-jfrog-integration.git'
        BRANCH_NAME = 'feature/dummy-app'
    }

    stages {
        stage('Clone') {
            steps {
                script {
                    sh '''
                    git checkout ${BRANCH_NAME}
                    '''
                }
            }
        }
        stage('Clean') {
            steps {
                script {
                    dir('repo') {
                        sh 'mvn clean'
                    }
                }
            }
        }
        stage('Validate') {
            steps {
                script {
                    dir('repo') {
                        sh 'mvn validate'
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    dir('repo') {
                        sh 'mvn test'
                    }
                }
            }
        }
        stage('Install') {
            steps {
                script {
                    dir('repo') {
                        sh 'mvn install'
                    }
                }
            }
        }
        stage('Copy JAR') {
            steps {
                script {
                    sh "cp repo/${JAR_FILE_PATH} ${DESTINATION_PATH}"
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
