pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'its realhoubuuohuoyhioj World'
            }
        }
        stage('test') {
            steps {
                echo 'its realhojjoiokjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjubuuohuoyhioj World'
            }
        }
    }
}
