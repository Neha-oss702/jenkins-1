pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'its real World'
            }
        }
    }
}
