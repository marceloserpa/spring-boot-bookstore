pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew clean build'
            }
        }

        stage('Deploy') {
            steps {
                sh 'nohup java -jar build/libs/bookstore-0.1.0.jar'
            }
        }
    }
}





