pipeline {
    agent any

    stages {

         stage('Build') {
            steps {
                script {
                    // Compilation du projet avec Maven
                    sh 'mvn clean package'
                }
            }
        }

        stage('Unit Tests') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
            post {
                always {
                    // Archive les résultats des tests même en cas d'échec
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }

        stage('Deploy to Nexus') {
            when {
                branch 'main'  // Déploiement uniquement si on est sur la branche "main"
            }
            steps {
                script {
                        sh "mvn deploy"
                    }
                }
            }
        }

    }

    post {
        success {
            echo "Pipeline exécuté avec succès !"
        }
        failure {
            echo "Erreur lors de l'exécution du pipeline."
        }
    }
}
