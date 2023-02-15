pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'its realhoubuuohuoyhioj World'
            }
        }
        stage('Hey') {
            steps {
                echo 'its realhojjoiokjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjubuuohuoyhioj World'
            }
        }
    }
}
