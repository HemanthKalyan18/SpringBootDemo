pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git credentialsId: 'github-token',
                    url: 'https://github.com/HemanthKalyan18/SpringBootDemo.git'
                sh 'mvn clean package'
            }
        }
    }
}